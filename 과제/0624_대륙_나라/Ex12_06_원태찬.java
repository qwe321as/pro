import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_원태찬 extends Frame implements ItemListener{

	String[] 대륙= {"아시아","유럽","아프리카"};

	String[][] 나라= {{"한국","일본","중국"},
			{"영국","스위스","프랑스"},
			{"이집트","콩고","우간다"}
	};


	Choice ch=new Choice();
	Choice ch2=new Choice();
	
	Label result = new Label("                                                         ");


	Ex12_06_원태찬(String title){
		super.setTitle(title);
		setSize(500,200);
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Label lb=new Label("대륙과 나라를 선택하세요");


		p1.setBackground(Color.yellow);
		p2.setBackground(Color.green);
		p3.setBackground(Color.cyan);

		p1.add(lb);
		p2.add(ch);
		p2.add(ch2);
		p3.add(result);
		

		for(int i=0;i<대륙.length;i++) {


			ch.add(대륙[i]);

		}
		ch.addItemListener(this);
		ch2.addItemListener(new Ch2());



		add(p1,"North");
		add(p2,"Center");
		add(p3,"South");




		

		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
				);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		ch2.removeAll();
		ch2.setSize(ch.getSize());
		
		for(int i = 0; i < 대륙.length; i++) {
			if(ch.getSelectedIndex() == i) {
				for(int j = 0; j < 나라.length; j++) {
					ch2.add(나라[i][j]);
				}
			}
		}
	}
	class Ch2 implements ItemListener {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			
			result.setText("선택한 나라는 " + ch.getSelectedItem() + " 대륙의 " + ch2.getSelectedItem() + " 입니다.");
		}
	}
	public static void main(String[] args) {

		new Ex12_06_원태찬("Choice 과제");
	


			
	}


	}

//Frame종료 기능 넣기
//Label로 글자와 색깔넣기
//초이스를 분홍색에 만들기 
//두번째 초이스 변화주면 밑에 글씨 저장
//선택한 대륙과 나라는 아시아,한국