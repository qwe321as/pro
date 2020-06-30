import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex12_07_Add extends JFrame{
	Ex12_07_Add(String title){
		super(title);
		//setsize(400,300);
		
		
		Container contentPane = getContentPane();
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.cyan);
		
		contentPane.add(p1,BorderLayout.CENTER);
		contentPane.add(p2,"South");
		
		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		
		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));
		p1.add(text3);
		
		JButton b1 = new JButton("Ȯ��");
		JButton b2 = new JButton("���");
		
		OkButton ok = new OkButton(text1,text2,text3);
		CancelButton cancel = new CancelButton(text1,text2,text3);
		b1.addActionListener(ok);
		b2.addActionListener(cancel);
		
		p2.add(b1);
		p2.add(b2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex12_07_Add("���� ���α׷�");
	}

}// Ex12_07_Add


class OkButton implements ActionListener{
	JTextField text1;
	JTextField text2;
	JTextField text3;
	
	OkButton(JTextField text1,JTextField text2,JTextField text3){
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Ȯ�� ��ư Ŭ��");
		int num1 = Integer.parseInt(text1.getText());
		int num2 = Integer.parseInt(text2.getText());
		System.out.println(num1+num2); // 33
		int sum = num1+num2;
		text3.setText(String.valueOf(sum));
		//Integer.parseInt("12")=>12
		//String.valueOf(12)=>"12"	
	}
	
}

class CancelButton implements ActionListener{
	JTextField text1;
	JTextField text2;
	JTextField text3;
	
	CancelButton(JTextField text1,JTextField text2,JTextField text3){
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��� ��ư Ŭ��");
		text1.setText("");
		text2.setText("");
		text3.setText("");
	}
	
}













