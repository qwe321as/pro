import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_이은찬 extends Frame implements ItemListener{

	String[] 대륙 = {"아시아","유럽","아프리카"};

	String[][] 나라 = { {"한국","일본","중국"}, //아시아
			{"영국","스위스","프랑스"},//유렵
			{"이집트","콩고","우간다"}//아프리카
	};


	Choice ch1 = new Choice();
	Choice ch2 = new Choice();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();

	Label lb = new Label("대륙과 나라를 선택하세요");
	Label result = new Label("                                                                                  ");

	@SuppressWarnings("deprecation")
	Ex12_06_이은찬(String title){
		super.setTitle(title);
		setSize(300,200);
		setVisible(true);

		p1.setBackground(Color.cyan);
		p2.setBackground(Color.gray);
		p3.setBackground(Color.GREEN);


		for(int i=0;i<대륙.length;i++) {
			ch1.add(대륙[i]+" ");
		}
		for(int i=0;i<나라[0].length;i++) {
			ch2.add(나라[0][i]+"     ");
		}
		result.setText("당신이 선택한 대륙은 " + ch1.getSelectedItem() + ",    나라는 " + ch2.getSelectedItem());
		ch1.addItemListener(this);
		ch2.addItemListener(new Result());


		p1.add(lb);
		p2.add(ch1);
		p2.add(ch2);
		p3.add(result);


		add(p1,"North"); // super은 생략 가능함
		add(p2,"Center");
		add(p3,"South");

		this.addWindowListener(
				new WindowAdapter() {

					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}

					public void windowActivated(WindowEvent e) {
						//					System.out.println("windowActivated");
					}
				}	
				);

		// Frame종료 기능 넣기
	}
	// 대륙과 나라를 선택하세요 : 라벨로 만들기
	// 아래도 라벨
	// 초이스 두개 만들어서 패널에 넣기 > 프레임에 올리기
	// 선택한 대륙과 나라는 대륙, 나라

	public static void main(String[] args) {

		Frame f = new Ex12_06_이은찬("세계 공부");
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		ch2.removeAll();
		
		for(int i=0;i<대륙.length;i++) {
			if(ch1.getSelectedIndex()==i) {
				for(int j=0; j<나라.length; j++) {
					ch2.add(나라[i][j]);
				}
			}
		}
	}
	
	class Result implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			result.setText("당신이 선택한 대륙은 " + ch1.getSelectedItem() + ",    나라는 " + ch2.getSelectedItem());
			
		}
		
	}

}


