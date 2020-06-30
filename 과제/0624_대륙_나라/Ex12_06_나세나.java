import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_나세나 extends Frame implements ItemListener {

	Choice ch1, ch2;

	//
	Label lb1=new Label("대륙과 나라를 선택하세요");
	Label result=new Label("                                                                             ");
 
	String[] a= {"아시아", "유럽", "아프리카"};

	String[][] b={ {"한국", "일본", "중국"},
			{"영국", "스위스","프랑스"},
			{"이집트", "콩고","우간다"}
	};
	Ex12_06_나세나(String title){

		setTitle(title);
		setSize(500,300);

		setVisible(true);


		ch1=new Choice();
		ch2=new Choice();

		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();

		p1.setBackground(Color.orange);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.yellow);

		super.add(p1, BorderLayout.NORTH);
		super.add(p2, BorderLayout.CENTER);
		super.add(p3, BorderLayout.SOUTH);

		p1.add(lb1);
		p2.add(ch1);
		p2.add(ch2);
		p3.add(result);


		for(int i=0; i<a.length;i++) {
			ch1.add(a[i]);
		}
		ch2.add("                ");

		ch1.addItemListener(this);
		ch2.addItemListener(this);




		this.addWindowListener(
				new WindowAdapter() {
					public void	windowClosing(WindowEvent e) {
						System.out.println("시스템을 종료합니다");
						System.exit(0);
					}
				}

				);



		//Frame  종료기능 넣기

	}
	public static void main(String[] args) {

		Ex12_06_나세나 title=new Ex12_06_나세나("Choice 과제");
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj=e.getSource();

		if(obj==ch1) {
			ch2.removeAll();
			for(int j=0; j<b.length;j++) {
				ch2.add(b[ch1.getSelectedIndex()][j]);
			}
		}else if(obj==ch2) {
			result.setText("선택한 대륙은 "+ch1.getSelectedItem()+", 나라는 "+ch2.getSelectedItem()+"입니다");
			
		}



	}




}
