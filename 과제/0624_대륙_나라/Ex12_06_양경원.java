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

public class Ex12_06_���� extends Frame implements ItemListener{
	String [] ��� = {"�ƽþ�","����","������ī"};
	String [][] ���� = {{"�ѱ�","�Ϻ�","�߱�"},{"����","������","������"},{"����Ʈ","���","�찣��"}};

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();

	Label beup = new Label("���� ���� �����ϼ���");
	Label bedu = new Label("�����Ͻ� ����� �����");
	
	Label result = new Label("                      ");

	
	Choice ch = new Choice();
	Choice ch1 = new Choice();

	Ex12_06_����(String title) {
		
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

		for(int i=0; i<���.length;i++) {
			ch.add(���[i]);
			for(int j=0; j<����.length;j++) {
				ch1.add(����[i][j]);
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
			if("�ƽþ�" == ch.getSelectedItem()) {
				for(int i=0; i<1;i++) {
					for(int j=0; j<3;j++) {
						ch1.add(����[i][j]);		

					}	

				}

			}else if("����" == ch.getSelectedItem()) {
				for(int i=1; i<2;i++) {
					for(int j=0; j<3;j++) {
						ch1.add(����[i][j]);		

					}	
				}

			}else{
				for(int i=2; i<3;i++) {
					for(int j=0; j<3;j++) {
						ch1.add(����[i][j]);		

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
	new Ex12_06_����("Choise ����");

}


}
