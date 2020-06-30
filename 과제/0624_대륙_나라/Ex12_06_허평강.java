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

	String[][] ���� = { {"�ѱ�","�Ϻ�","�߱�"},
			{"����","������","������"},
			{"����Ʈ","���","�찣��"}
	};

	Choice c1,c2;
	Label la1,la2;
	Ex12_06_����(String title){
		super.setTitle(title);
		setSize(300,200);
		setVisible(true);

		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();

		 la1 = new Label("����� ���� �����ϼ���");
		 la2 = new Label();

		c1 = new Choice();
		c2 = new Choice();

		for(int i=0;i<���.length;i++) {
			c1.add(���[i]);
		}
		for(int i=0;i<����.length;i++) {
			c2.add(����[0][i]);
		}

		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		this.add(p3,BorderLayout.SOUTH);

		p1.setBackground(Color.CYAN);
		p2.setBackground(Color.darkGray);
		p3.setBackground(Color.ORANGE);

		p1.add(la1);
		p2.add(c1);
		p2.add(c2);
		p3.add(la2)	;	

		c1.addItemListener(new Select1());
		c2.addItemListener(new Select2());

	}

	class Select1 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			Object obj = e.getItem();//�ƽþ�,����,������ī = ch1�� �� item
			System.out.println(e.getItem()); 
			c2.removeAll();

			for(int j=0;j<3;j++) {
				if(obj== ���[j]) {
					for(int i=0;i<3;i++) {
						c2.add(����[j][i]);
					}
				}
			}
		} 

	}

	class Select2 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {

			la2.setText("������ ����� �����"+c1.getSelectedItem()+"  "+c2.getSelectedItem());
		}

	}

	public static void main(String[] args) {


		Ex12_06_���� h = new Ex12_06_����("Choice ����");



	}
}