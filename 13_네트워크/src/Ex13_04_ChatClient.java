import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;


public class Ex13_04_ChatClient extends JFrame implements ActionListener {
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket = null;
	Receiver serverMessage;
	JTextField clientMessage;
	JScrollPane spane;
	PrintWriter pw;
	
	public Ex13_04_ChatClient() {
		setTitle("Ŭ���̾�Ʈ ä�� â"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		serverMessage = new Receiver(); // �������� ���� �޽����� ����� ���۳�Ʈ
		serverMessage.setEditable(false); 
		
		Thread t = new Thread(serverMessage); 
		
		clientMessage = new JTextField();
		clientMessage.addActionListener(this);
		
		spane = new JScrollPane(serverMessage); 
		add(spane,BorderLayout.CENTER);
		add(clientMessage,BorderLayout.SOUTH);
		setSize(400, 200); 
		setVisible(true); 
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		t.start();
	}
	
	private void setupConnection() throws IOException {
		socket = new Socket("localhost", 9999); // Ŭ���̾�Ʈ ���� ����
		System.out.println("�����");
		
		in = new BufferedReader(new InputStreamReader(
				socket.getInputStream())); // �����κ����� �Է� ��Ʈ��
		
		out = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream())); // �������� ��� ��Ʈ��

	}
	
	public static void main(String[] args) {
		Ex13_04_ChatClient frame = new Ex13_04_ChatClient();
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
				} 
				serverMessage.append("\n" + inputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clientMessage) {
			String outputMessage = clientMessage.getText(); 
			try {
				out.write("Ŭ���̾�Ʈ>" + outputMessage+"\n"); 
				out.flush();
				
				serverMessage.append("\nŬ���̾�Ʈ>" + outputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
				clientMessage.setText(null); 
			} catch (IOException e1) {
				handleError(e1.getMessage());
			}
		}
	}
}

