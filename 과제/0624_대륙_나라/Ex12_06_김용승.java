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

public class Ex12_06_김용승 extends Frame {

	String[] 대륙 = {"아시아","유럽","아프리카"};
	String[][] 나라 = {
			{"한국","일본","중국"},
			{"영국","스위스","프랑스"},
			{"이집트","콩고","우간다"}
	};

	Choice ch1,ch2;
	Label lb1,lb2;
	Ex12_06_김용승(String s){

		setTitle(s);
		setSize(300,200);
		setVisible(true);
		// 패널 생성 3개 
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		// 라벨1 : 대륙과 나라를 선택하세요.
		lb1 = new Label("대륙과 나라를 선택하세요.");
		lb2 = new Label("                                                                             ");
	

		ch1 = new Choice();
		ch2 = new Choice();

		// 초이스1: 배열 1 add
		for(int i=0;i<대륙.length;i++) {
			ch1.add(대륙[i]);
		}
		for(int i=0;i<나라.length;i++) {
			ch2.add(나라[0][i]);
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
			for(int i = 0;i<대륙.length;i++) {
				if(obj == 대륙[i]) {
					for(int j = 0;j<나라[i].length;j++) {
						ch2.add(나라[i][j]);
					}
				}
			}
		}
	}
	
	class selectB implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			String txt ="선택한 대륙과 나라는 "+ch1.getSelectedItem()+" "+ch2.getSelectedItem()+" 입니다.";
			lb2.setText(txt);
		}
	}

	public static void main(String[] args) {
		new Ex12_06_김용승("Choice 과제");
	}
}

