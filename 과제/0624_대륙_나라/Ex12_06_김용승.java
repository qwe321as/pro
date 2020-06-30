import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_���� extends Frame {

	String[] ��� = {"�ƽþ�","����","������ī"};
	String[][] ���� = {
			{"�ѱ�","�Ϻ�","�߱�"},
			{"����","������","������"},
			{"����Ʈ","���","�찣��"}
	};

	Choice ch1,ch2;
	Label lb1,lb2;
	Ex12_06_����(String s){

		setTitle(s);
		setSize(300,200);
		setVisible(true);
		// �г� ���� 3�� 
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		// ��1 : ����� ���� �����ϼ���.
		lb1 = new Label("����� ���� �����ϼ���.");
		lb2 = new Label("                                                                             ");
	

		ch1 = new Choice();
		ch2 = new Choice();

		// ���̽�1: �迭 1 add
		for(int i=0;i<���.length;i++) {
			ch1.add(���[i]);
		}
		for(int i=0;i<����.length;i++) {
			ch2.add(����[0][i]);
		}

		p1.setBackground(Color.yellow);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.green);

		add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		this.add(p3,BorderLayout.SOUTH);

		p1.add(lb1);
		p2.add(ch1);
		p2.add(ch2);
		p3.add(lb2);

		//frame exit
		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
				);
		
		
		ch1.addItemListener(new selectA());
		ch2.addItemListener(new selectB());

	}
	class selectA implements ItemListener{
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object obj = e.getItem();
			ch2.removeAll();
			for(int i = 0;i<���.length;i++) {
				if(obj == ���[i]) {
					for(int j = 0;j<����[i].length;j++) {
						ch2.add(����[i][j]);
					}
				}
			}
		}
	}
	
	class selectB implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			String txt ="������ ����� ����� "+ch1.getSelectedItem()+" "+ch2.getSelectedItem()+" �Դϴ�.";
			lb2.setText(txt);
		}
	}

	public static void main(String[] args) {
		new Ex12_06_����("Choice ����");
	}
}

