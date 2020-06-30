import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_김범규 extends Frame implements ItemListener{

	String[] 대륙 = {"아시아", "유럽","아프리카"};

	String[][] 나라 = { {"한국","일본","중국"},
			{"영국","스위스","프랑스"},
			{"이집트","콩고","우간다"}
	};

	Choice ch = new Choice();
	Choice ch1 = new Choice();

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();

	Label lb = new Label("대륙과 나라를 선택하세요");
	Label result = new Label("            ");

	int i,j;

	//Label 파란색
	//초이스2개는 분홍색 패널에다가 올림 

	Ex12_06_김범규(String title){
		super.setTitle(title);
		setSize(400,300);
		setVisible(true);

		p1.setBackground(Color.red);
		p2.setBackground(Color.black);
		p3.setBackground(Color.yellow);


		ch.addItemListener(this);
		ch1.addItemListener(new C());

		p1.add(lb);
		p2.add(ch);
		p2.add(ch1);
		p3.add(result);

		add(p1,"North");
		add(p2,"Center");
		add(p3,"South");

		for(i=0;i<대륙.length;i++) {
			ch.add(대륙[i]);
		}




		this.addWindowListener(	
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
				); // Frame 종료기능넣기


	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		ch1.removeAll();
		if(ch.getSelectedItem() == "아시아") {
			for(i=0;i<나라.length;i++) {
				ch1.add(나라[0][i]);

			}
		}
		else if(ch.getSelectedItem() == "유럽") {
			for(i=0;i<나라.length;i++) {
				ch1.add(나라[1][i]);

			}
		}
		else {
			for(i=0;i<나라.length;i++) {
				ch1.add(나라[2][i]);

			}
		}

	}

class C implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		result.setText("선택한 이름의 국가는 "+ch.getSelectedItem()+" "+ch1.getSelectedItem());
		
	}
	
}
	public static void main(String[] args) {

		Ex12_06_김범규 f = new Ex12_06_김범규("Choice 과제");

	}

}
