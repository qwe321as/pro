import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_����� extends Frame implements ItemListener{

	String[] ��� = {"�ƽþ�", "����","������ī"};

	String[][] ���� = { {"�ѱ�","�Ϻ�","�߱�"},
			{"����","������","������"},
			{"����Ʈ","���","�찣��"}
	};

	Choice ch = new Choice();
	Choice ch1 = new Choice();

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();

	Label lb = new Label("����� ���� �����ϼ���");
	Label result = new Label("            ");

	int i,j;

	//Label �Ķ���
	//���̽�2���� ��ȫ�� �гο��ٰ� �ø� 

	Ex12_06_�����(String title){
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

		for(i=0;i<���.length;i++) {
			ch.add(���[i]);
		}




		this.addWindowListener(	
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
				); // Frame �����ɳֱ�


	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		ch1.removeAll();
		if(ch.getSelectedItem() == "�ƽþ�") {
			for(i=0;i<����.length;i++) {
				ch1.add(����[0][i]);

			}
		}
		else if(ch.getSelectedItem() == "����") {
			for(i=0;i<����.length;i++) {
				ch1.add(����[1][i]);

			}
		}
		else {
			for(i=0;i<����.length;i++) {
				ch1.add(����[2][i]);

			}
		}

	}

class C implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		result.setText("������ �̸��� ������ "+ch.getSelectedItem()+" "+ch1.getSelectedItem());
		
	}
	
}
	public static void main(String[] args) {

		Ex12_06_����� f = new Ex12_06_�����("Choice ����");

	}

}
