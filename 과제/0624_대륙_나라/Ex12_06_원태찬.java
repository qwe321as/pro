import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_������ extends Frame implements ItemListener{

	String[] ���= {"�ƽþ�","����","������ī"};

	String[][] ����= {{"�ѱ�","�Ϻ�","�߱�"},
			{"����","������","������"},
			{"����Ʈ","���","�찣��"}
	};


	Choice ch=new Choice();
	Choice ch2=new Choice();
	
	Label result = new Label("                                                         ");


	Ex12_06_������(String title){
		super.setTitle(title);
		setSize(500,200);
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Label lb=new Label("����� ���� �����ϼ���");


		p1.setBackground(Color.yellow);
		p2.setBackground(Color.green);
		p3.setBackground(Color.cyan);

		p1.add(lb);
		p2.add(ch);
		p2.add(ch2);
		p3.add(result);
		

		for(int i=0;i<���.length;i++) {


			ch.add(���[i]);

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
		
		for(int i = 0; i < ���.length; i++) {
			if(ch.getSelectedIndex() == i) {
				for(int j = 0; j < ����.length; j++) {
					ch2.add(����[i][j]);
				}
			}
		}
	}
	class Ch2 implements ItemListener {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			
			result.setText("������ ����� " + ch.getSelectedItem() + " ����� " + ch2.getSelectedItem() + " �Դϴ�.");
		}
	}
	public static void main(String[] args) {

		new Ex12_06_������("Choice ����");
	


			
	}


	}

//Frame���� ��� �ֱ�
//Label�� ���ڿ� ����ֱ�
//���̽��� ��ȫ���� ����� 
//�ι�° ���̽� ��ȭ�ָ� �ؿ� �۾� ����
//������ ����� ����� �ƽþ�,�ѱ�