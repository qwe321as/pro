import java.awt.*;
import java.awt.event.*;

public class Ex12_06_������ extends Frame implements ActionListener, ItemListener {


	String[] ��� = {"�ƽþ�","����","������ī"};

	String[][] ���� = { {"�ѱ�","�Ϻ�","�߱�"}, //���[0]
			{"����","������","������"}, //���[1]
			{"����Ʈ","���","�찣��"} //���[2]
	};

	Label lb = new Label("����� ���� �����ϼ���");
	Label lb2 = new Label("������ ����� �����"+"�Դϴ�.");
	Button b1,b2;
	Choice ch1 = new Choice();
	Choice ch2 = new Choice();

	Ex12_06_������(String title){

		setTitle(title);
		setSize(400,200);
		setVisible(true);

		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();

		p1.setBackground(Color.pink);
		p2.setBackground(Color.lightGray);
		p3.setBackground(Color.green);
		lb.setBackground(Color.orange);
		lb2.setBackground(Color.orange);

		//		b1 = new Button();
		//		b2 = new Button();

		add(p1,"North");
		add(p2,"Center");
		add(p3,"South");
		p2.add(ch1);
		p2.add(ch2);
		p1.add(lb);
		p3.add(lb2);

		for(int i=0; i<���.length;i++) {
			ch1.add(���[i]);
		}

		ch1.addItemListener(this);
		ch2.addItemListener(this);





		//frame ���� ��� �ֱ�
		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
				);
	}//�ż��峡


	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		int i, j;
		if(obj == ch1) {
			ch2.removeAll();
			for(j=0;j<3;j++) {
				ch2.add(����[ch1.getSelectedIndex()][j]);
			}
		}

		else if(obj == ch2) {
			lb2.setText("������ ����� �����"+ ch1.getSelectedItem()+","+ch2.getSelectedItem()+"�Դϴ�.");
		}

	}



	
	public void actionPerformed(ActionEvent e) {

	}






	public static void main(String[] args) {

		new Ex12_06_������("Choice ����");

	}
}

