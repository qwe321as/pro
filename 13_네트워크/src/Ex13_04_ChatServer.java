import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Ex13_04_ChatServer extends JFrame implements ActionListener {
	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	JTextField serverMessage;
	JScrollPane spane;
	Receiver clientMessage;
	
	
	public Ex13_04_ChatServer() {
		setTitle("���� ä�� â"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		clientMessage = new Receiver(); 
						// Ŭ���̾�Ʈ���� ���� �޽����� ����� ������Ʈ
		clientMessage.setEditable(false); 
		
		Thread t = new Thread(clientMessage); 
		
		serverMessage = new JTextField();
		serverMessage.addActionListener(this);
		spane = new JScrollPane(clientMessage); 
		
		add(spane,BorderLayout.CENTER);
		add(serverMessage,BorderLayout.SOUTH);
		setSize(400, 200);
		setVisible(true);
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
			e.printStackTrace();
		}
		t.start();
	}
	
	private void setupConnection() throws IOException {
		listener = new ServerSocket(9999); // ���� ���� ����
		socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
		System.out.println("�����");
		in = new BufferedReader(new InputStreamReader(
				socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
		
		out = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream())); // Ŭ���̾�Ʈ���� ��� ��Ʈ��
	}
	
	public static void main(String[] args) {
		Ex13_04_ChatServer frame = new Ex13_04_ChatServer();
	}

	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1); 
	}
	
	private class Receiver extends JTextArea implements Runnable {
		@Override
		public void run() { 
			String inputMessage=null;
			while (true) {
				try {
					inputMessage = in.readLine(); 
				} catch (IOException e) {
					handleError(e.getMessage());
					e.printStackTrace();
				}
				clientMessage.append("\n" + inputMessage);
				int pos = clientMessage.getText().length();
				clientMessage.setCaretPosition(pos); 
				
			}
		}
	} 

	@Override
	public void actionPerformed(ActionEvent e) { 
		if (e.getSource() == serverMessage) { 
			String outputMessage = serverMessage.getText(); 
			try {
				out.write("����>" + outputMessage+"\n"); // Ŭ���̾�Ʈ�� ���ڿ� ����
				out.flush();
				clientMessage.append("\n����>" + outputMessage); 
				int pos = clientMessage.getText().length();
				clientMessage.setCaretPosition(pos); 
								// caret �������� ���� ���������� �̵�
				serverMessage.setText(null); 
			} catch (IOException e1) {
				handleError(e1.getMessage());
				e1.printStackTrace();
			} 
		}
	}
}



