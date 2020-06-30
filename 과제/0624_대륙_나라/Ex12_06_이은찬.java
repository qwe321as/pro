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

	String[] ��� = {"�ƽþ�","����","������ī"};

	String[][] ���� = { {"�ѱ�","�Ϻ�","�߱�"}, //�ƽþ�
			{"����","������","������"},//����
			{"����Ʈ","���","�찣��"}//������ī
	};


	Choice ch1 = new Choice();
	Choice ch2 = new Choice();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();

	Label lb = new Label("����� ���� �����ϼ���");
	Label result = new Label("                                                                                  ");

	@SuppressWarnings("deprecation")
	Ex12_06_������(String title){
		super.setTitle(title);
		setSize(300,200);
		setVisible(true);

		p1.setBackground(Color.cyan);
		p2.setBackground(Color.gray);
		p3.setBackground(Color.GREEN);


		for(int i=0;i<���.length;i++) {
			ch1.add(���[i]+" ");
		}
		for(int i=0;i<����[0].length;i++) {
			ch2.add(����[0][i]+"     ");
		}
		result.setText("����� ������ ����� " + ch1.getSelectedItem() + ",    ����� " + ch2.getSelectedItem());
		ch1.addItemListener(this);
		ch2.addItemListener(new Result());


		p1.add(lb);
		p2.add(ch1);
		p2.add(ch2);
		p3.add(result);


		add(p1,"North"); // super�� ���� ������
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

		// Frame���� ��� �ֱ�
	}
	// ����� ���� �����ϼ��� : �󺧷� �����
	// �Ʒ��� ��
	// ���̽� �ΰ� ���� �гο� �ֱ� > �����ӿ� �ø���
	// ������ ����� ����� ���, ����

	public static void main(String[] args) {

		Frame f = new Ex12_06_������("���� ����");
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		ch2.removeAll();
		
		for(int i=0;i<���.length;i++) {
			if(ch1.getSelectedIndex()==i) {
				for(int j=0; j<����.length; j++) {
					ch2.add(����[i][j]);
				}
			}
		}
	}
	
	class Result implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			result.setText("����� ������ ����� " + ch1.getSelectedItem() + ",    ����� " + ch2.getSelectedItem());
			
		}
		
	}

}


