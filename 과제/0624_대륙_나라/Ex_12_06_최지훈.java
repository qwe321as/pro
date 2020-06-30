import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_12_06_최지훈 extends Frame {

	String []대륙 = {"아시아","유럽","아프리카"};
	
	String [][]나라 = {{"한국","일본 ","중국"},
			         {"영국","스위스","프랑스"},	
			         {"이집트","콩고 ","우간다"}};
	Label lb = new Label("나라 선택하기");
	Label result = new Label("      ");
	Choice ch1 = new Choice();
	Choice ch2 = new Choice();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	Ex_12_06_최지훈(String title){
		
		setSize(300,200);
		setVisible(true);
		setTitle("초이스 이벤트");
		
		
		
		p1.setBackground(Color.blue);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.yellow);
		this.add(p1,"North");
		this.add(p2,"Center");
		this.add(p3,"South");
		p1.add(lb);
		lb.setBackground(Color.yellow);
		p3.add(result);
		for(int i=0;i<대륙.length;i++) {
			ch1.add(대륙[i]);
		}
		
		p2.add(ch1);
		
		
		
		Item it = new Item();
		ch1.addItemListener(it);
		ch2.addItemListener(it);
		
		
		this.addWindowListener(
				new WindowAdapter() {
					
					public void windowClosing(WindowEvent e) {
						
						System.exit(0);
					}
					public void windowActivated(WindowEvent e) {
						
					}
				}
						
						
						);
		
		
	}
	public static void main(String[] args) {
		
		Ex_12_06_최지훈 ex = new Ex_12_06_최지훈("choice 과제");
			
		
	}
class Item implements ItemListener{

	
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		if(e.getItem().equals(대륙[0])) {
//			for(int i=0;i<1;i++) {
//				for(int j=0;j<3;j++)
//				ch2.add(나라[i][j]);
//			}
			ch2.removeAll();
				ch2.add("한국");
				ch2.add("일본");
				ch2.add("중국");
				p2.add(ch2,"West");
				
		}
		 
		else if(e.getItem().equals("한국")) {
			result.setText("한국");
		}
		else if(e.getItem().equals("일본")) {
			result.setText("일본");
		}
		else if(e.getItem().equals("중국")) {
			result.setText("중국");
		}
		
		else if(e.getItem().equals(대륙[1])) {
			ch2.removeAll();
			ch2.add("영국");
			ch2.add("스위스");
			ch2.add("프랑스");
			p2.add(ch2,"West");
			
		}
		else if(e.getItem().equals("영국")) {
			result.setText("영국");
		}
		else if(e.getItem().equals("스위스")) {
			result.setText("스위스");
		}
		else if(e.getItem().equals("프랑스")) {
			result.setText("프랑스");
		}
		else if(e.getItem().equals(대륙[2])) {
			ch2.removeAll();
			ch2.add("이집트");
			ch2.add("콩고");
			ch2.add("우간다");
			p2.add(ch2,"West");
		}
		else if(e.getItem().equals("이집트")) {
			result.setText("이집트");
		}
		else if(e.getItem().equals("콩고")) {
			result.setText("콩고");
		}
		else if(e.getItem().equals("우간다")) {
			result.setText("우간다");
		}
		
	}
	
}
}
