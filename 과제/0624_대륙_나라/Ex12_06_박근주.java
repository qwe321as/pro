import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_박근주 extends Frame {
	String[] 대륙 = {"아시아","유럽","아프리카"};
	String[][] 나라 ={ {"한국","일본","중국"}, //0행
					  {"영국","스위스","프랑스"},//1행
					  {"이집트","콩고","우간다"}//2행
					};
	Choice ch = new Choice();
	Choice ch1 = new Choice();
	Label lb = new Label("대륙과 나라를 선택하세요");
	Label lb2 = new Label("                                                                    ");
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	//라벨 3개 패널 3개 대륙과 나라를 선택하세요
	//초이스 2개 선택한 대륙과 나라는 아시아,한국 아래패널 
	Ex12_06_박근주(String title){
		
		super.setTitle(title);
		lb.setBackground(Color.WHITE);
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.magenta);
		p3.setBackground(Color.white);
		
		ch.addItemListener( new selectA());
		ch1.addItemListener(new selectB());
		for(int i=0;i<3;i++) {
			ch.add(대륙[i]);
		
		}
		for(int j=0;j<3;j++) {
			ch1.add(나라[0][j]+"   ");
		}
		
		
		p1.add(lb);
		p2.add(ch);
		p2.add(ch1);
		p3.add(lb2);
		lb2.setBackground(Color.yellow);
		
		add(p1,"North");
		add(p2,"Center");
		add(p3,"South");
		
		setSize(300,200);
		setVisible(true);

		this.addWindowListener(
				new WindowAdapter() {

					public void windowClosing(WindowEvent e) {
						System.exit(0);

					}
				}
				);
		
		
		
	}
	public static void main(String[] args) {
		
		new Ex12_06_박근주("Choice 과제");

	}
	class selectA implements ItemListener{
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj  = e.getItem();
		ch1.removeAll();
		for(int i=0;i<대륙.length;i++) {
			if(obj==대륙[i]) {
			for(int j=0;j<나라[i].length;j++) {
				ch1.add(나라[i][j]);
			}
			}
			
		}
	}
		
		//System.out.print(ch.getSelectedIndex()+":"); 
		//System.out.println(ch.getSelectedItem());
		//lb2.setText(ch.getSelectedItem()); 
		
	}
	class selectB implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			lb2.setText("선택한 대륙과 나라는?:"+ch.getSelectedItem()
			+" "+ch1.getSelectedItem());
			
		}
		
	}
	

}
