import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_12_06_������ extends Frame {

	String []��� = {"�ƽþ�","����","������ī"};
	
	String [][]���� = {{"�ѱ�","�Ϻ� ","�߱�"},
			         {"����","������","������"},	
			         {"����Ʈ","��� ","�찣��"}};
	Label lb = new Label("���� �����ϱ�");
	Label result = new Label("      ");
	Choice ch1 = new Choice();
	Choice ch2 = new Choice();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	Ex_12_06_������(String title){
		
		setSize(300,200);
		setVisible(true);
		setTitle("���̽� �̺�Ʈ");
		
		
		
		p1.setBackground(Color.blue);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.yellow);
		this.add(p1,"North");
		this.add(p2,"Center");
		this.add(p3,"South");
		p1.add(lb);
		lb.setBackground(Color.yellow);
		p3.add(result);
		for(int i=0;i<���.length;i++) {
			ch1.add(���[i]);
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
		
		Ex_12_06_������ ex = new Ex_12_06_������("choice ����");
			
		
	}
class Item implements ItemListener{

	
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		if(e.getItem().equals(���[0])) {
//			for(int i=0;i<1;i++) {
//				for(int j=0;j<3;j++)
//				ch2.add(����[i][j]);
//			}
			ch2.removeAll();
				ch2.add("�ѱ�");
				ch2.add("�Ϻ�");
				ch2.add("�߱�");
				p2.add(ch2,"West");
				
		}
		 
		else if(e.getItem().equals("�ѱ�")) {
			result.setText("�ѱ�");
		}
		else if(e.getItem().equals("�Ϻ�")) {
			result.setText("�Ϻ�");
		}
		else if(e.getItem().equals("�߱�")) {
			result.setText("�߱�");
		}
		
		else if(e.getItem().equals(���[1])) {
			ch2.removeAll();
			ch2.add("����");
			ch2.add("������");
			ch2.add("������");
			p2.add(ch2,"West");
			
		}
		else if(e.getItem().equals("����")) {
			result.setText("����");
		}
		else if(e.getItem().equals("������")) {
			result.setText("������");
		}
		else if(e.getItem().equals("������")) {
			result.setText("������");
		}
		else if(e.getItem().equals(���[2])) {
			ch2.removeAll();
			ch2.add("����Ʈ");
			ch2.add("���");
			ch2.add("�찣��");
			p2.add(ch2,"West");
		}
		else if(e.getItem().equals("����Ʈ")) {
			result.setText("����Ʈ");
		}
		else if(e.getItem().equals("���")) {
			result.setText("���");
		}
		else if(e.getItem().equals("�찣��")) {
			result.setText("�찣��");
		}
		
	}
	
}
}
