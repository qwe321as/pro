import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_�ڱ��� extends Frame {
	String[] ��� = {"�ƽþ�","����","������ī"};
	String[][] ���� ={ {"�ѱ�","�Ϻ�","�߱�"}, //0��
					  {"����","������","������"},//1��
					  {"����Ʈ","���","�찣��"}//2��
					};
	Choice ch = new Choice();
	Choice ch1 = new Choice();
	Label lb = new Label("����� ���� �����ϼ���");
	Label lb2 = new Label("                                                                    ");
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	//�� 3�� �г� 3�� ����� ���� �����ϼ���
	//���̽� 2�� ������ ����� ����� �ƽþ�,�ѱ� �Ʒ��г� 
	Ex12_06_�ڱ���(String title){
		
		super.setTitle(title);
		lb.setBackground(Color.WHITE);
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.magenta);
		p3.setBackground(Color.white);
		
		ch.addItemListener( new selectA());
		ch1.addItemListener(new selectB());
		for(int i=0;i<3;i++) {
			ch.add(���[i]);
		
		}
		for(int j=0;j<3;j++) {
			ch1.add(����[0][j]+"   ");
		}
		
		
		p1.add(lb);
		p2.add(ch);
		p2.add(ch1);
		p3.add(lb2);
		lb2.setBackground(Color.yellow);
		
		add(p1,"North");
		add(p2,"Center");
		add(p3,"South");
		
		setSize(300,200);
		setVisible(true);

		this.addWindowListener(
				new WindowAdapter() {

					public void windowClosing(WindowEvent e) {
						System.exit(0);

					}
				}
				);
		
		
		
	}
	public static void main(String[] args) {
		
		new Ex12_06_�ڱ���("Choice ����");

	}
	class selectA implements ItemListener{
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj  = e.getItem();
		ch1.removeAll();
		for(int i=0;i<���.length;i++) {
			if(obj==���[i]) {
			for(int j=0;j<����[i].length;j++) {
				ch1.add(����[i][j]);
			}
			}
			
		}
	}
		
		//System.out.print(ch.getSelectedIndex()+":"); 
		//System.out.println(ch.getSelectedItem());
		//lb2.setText(ch.getSelectedItem()); 
		
	}
	class selectB implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			lb2.setText("������ ����� �����?:"+ch.getSelectedItem()
			+" "+ch1.getSelectedItem());
			
		}
		
	}
	

}
