import java.awt.*;
import java.awt.event.*;

public class Ex12_06_구지연 extends Frame implements ActionListener, ItemListener {


	String[] 대륙 = {"아시아","유럽","아프리카"};

	String[][] 나라 = { {"한국","일본","중국"}, //대륙[0]
			{"영국","스위스","프랑스"}, //대륙[1]
			{"이집트","콩고","우간다"} //대륙[2]
	};

	Label lb = new Label("대륙과 나라를 선택하세요");
	Label lb2 = new Label("선택한 대륙과 나라는"+"입니다.");
	Button b1,b2;
	Choice ch1 = new Choice();
	Choice ch2 = new Choice();

	Ex12_06_구지연(String title){

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

		for(int i=0; i<대륙.length;i++) {
			ch1.add(대륙[i]);
		}

		ch1.addItemListener(this);
		ch2.addItemListener(this);





		//frame 종료 기능 넣기
		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
				);
	}//매서드끝


	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		int i, j;
		if(obj == ch1) {
			ch2.removeAll();
			for(j=0;j<3;j++) {
				ch2.add(나라[ch1.getSelectedIndex()][j]);
			}
		}

		else if(obj == ch2) {
			lb2.setText("선택한 대륙과 나라는"+ ch1.getSelectedItem()+","+ch2.getSelectedItem()+"입니다.");
		}

	}



	
	public void actionPerformed(ActionEvent e) {

	}






	public static void main(String[] args) {

		new Ex12_06_구지연("Choice 과제");

	}
}

