import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_�蹮�� extends Frame implements ItemListener{

	String[] ��� = {"�ƽþ�","����","������ī"};



	String[][] ����  = {

			{"�ѱ�","�Ϻ�","�߱�"},
			{"����","������","������"},
			{"����Ʈ","���","�찣��"}

	};


	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Label lb1 = new Label("����� ���� �����ϼ���.");
	Label lb2 = new Label("                                                    ");
	Choice ch1 = new Choice();
	Choice ch2 = new Choice();

	Ex12_06_�蹮��(String title){
		setTitle(title);
		setSize(500,400);

		ch2.add("           ");
		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.out.println("windowClosing");
						System.exit(0);
					}




				}

				);

		
		for(int i = 0; i < ���.length; i++) {
			ch1.add(���[i]);
		}

		p1.setBackground(Color.yellow);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.cyan);

		p1.add(lb1);
		p3.add(lb2);


		p2.add(ch1);
		p2.add(ch2);


		add(p1,"North");
		add(p2,"Center");
		add(p3,"South");

		ch1.addItemListener(this);
		ch2.addItemListener(new Result());

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex12_06_�蹮��("Choice ����");



	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		
		ch2.removeAll();
		
		
		if(ch1.getSelectedItem() == "�ƽþ�") {
			for(int i = 0; i < ����.length; i++) {
				ch2.add(����[0][i]);
				
			}
		}else if(ch1.getSelectedItem() == "����") {
			for(int i = 0; i < ����.length; i++) {
				ch2.add(����[1][i]);
				
			}
		}else {
			for(int i = 0; i < ����.length; i++) {
				ch2.add(����[2][i]);
				
			}
		}
		

	}
	class Result implements ItemListener {


		@Override
		public void itemStateChanged(ItemEvent e) {

			lb2.setText("������ ����� " + ch1.getSelectedItem() + " ����� " + ch2.getSelectedItem() + " �Դϴ�.");
		}
		
	}

}



