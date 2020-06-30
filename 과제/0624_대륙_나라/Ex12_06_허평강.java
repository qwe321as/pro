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

public class Ex12_06_허평강 extends Frame {

	String[] 대륙 = {"아시아","유럽","아프리카"};

	String[][] 나라 = { {"한국","일본","중국"},
			{"영국","스위스","프랑스"},
			{"이집트","콩고","우간다"}
	};

	Choice c1,c2;
	Label la1,la2;
	Ex12_06_허평강(String title){
		super.setTitle(title);
		setSize(300,200);
		setVisible(true);

		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();

		 la1 = new Label("대륙과 나라를 선택하세요");
		 la2 = new Label();

		c1 = new Choice();
		c2 = new Choice();

		for(int i=0;i<대륙.length;i++) {
			c1.add(대륙[i]);
		}
		for(int i=0;i<나라.length;i++) {
			c2.add(나라[0][i]);
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
			Object obj = e.getItem();//아시아,유럽,아프리카 = ch1의 값 item
			System.out.println(e.getItem()); 
			c2.removeAll();

			for(int j=0;j<3;j++) {
				if(obj== 대륙[j]) {
					for(int i=0;i<3;i++) {
						c2.add(나라[j][i]);
					}
				}
			}
		} 

	}

	class Select2 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {

			la2.setText("선택한 대륙과 나라는"+c1.getSelectedItem()+"  "+c2.getSelectedItem());
		}

	}

	public static void main(String[] args) {


		Ex12_06_허평강 h = new Ex12_06_허평강("Choice 과제");



	}
}