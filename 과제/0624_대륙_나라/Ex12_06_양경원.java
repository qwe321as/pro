import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex12_06_양경원 extends Frame implements ItemListener{
	String [] 대륙 = {"아시아","유럽","아프리카"};
	String [][] 나라 = {{"한국","일본","중국"},{"영국","스위스","프랑스"},{"이집트","콩고","우간다"}};

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();

	Label beup = new Label("대룩과 나라를 선택하세요");
	Label bedu = new Label("선택하신 대륙과 나라는");
	
	Label result = new Label("                      ");

	
	Choice ch = new Choice();
	Choice ch1 = new Choice();

	Ex12_06_양경원(String title) {
		
		super.setTitle(title);

		setSize(300,200);
		setVisible(true);
		
		ch.addItemListener(this);
		ch1.addItemListener(new non());

		p1.add(beup);
		p3.add(bedu);
		
		p2.add(ch);
		p2.add(ch1);
		
		p3.add(result);

		p1.setBackground(Color.magenta);
		p2.setBackground(Color.gray);
		p3.setBackground(Color.green);

		for(int i=0; i<대륙.length;i++) {
			ch.add(대륙[i]);
			for(int j=0; j<나라.length;j++) {
				ch1.add(나라[i][j]);
			}
		}
		add(p1,"North");
		add(p3,"South");
		add(p2,"Center");

		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						System.out.println("windowClosing");
						System.exit(0);		
					}
				}
				);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
			ch1.removeAll();
			if("아시아" == ch.getSelectedItem()) {
				for(int i=0; i<1;i++) {
					for(int j=0; j<3;j++) {
						ch1.add(나라[i][j]);		

					}	

				}

			}else if("유럽" == ch.getSelectedItem()) {
				for(int i=1; i<2;i++) {
					for(int j=0; j<3;j++) {
						ch1.add(나라[i][j]);		

					}	
				}

			}else{
				for(int i=2; i<3;i++) {
					for(int j=0; j<3;j++) {
						ch1.add(나라[i][j]);		

					}	
				}
			}
}
class non implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		result.setText(ch.getSelectedItem()+" "+ch1.getSelectedItem());
	}
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	new Ex12_06_양경원("Choise 과제");

}


}
