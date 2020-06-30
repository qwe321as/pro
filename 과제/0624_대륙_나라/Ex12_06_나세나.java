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

public class Ex12_06_������ extends Frame implements ItemListener {

	Choice ch1, ch2;

	//
	Label lb1=new Label("����� ���� �����ϼ���");
	Label result=new Label("                                                                             ");
 
	String[] a= {"�ƽþ�", "����", "������ī"};

	String[][] b={ {"�ѱ�", "�Ϻ�", "�߱�"},
			{"����", "������","������"},
			{"����Ʈ", "���","�찣��"}
	};
	Ex12_06_������(String title){

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
						System.out.println("�ý����� �����մϴ�");
						System.exit(0);
					}
				}

				);



		//Frame  ������ �ֱ�

	}
	public static void main(String[] args) {

		Ex12_06_������ title=new Ex12_06_������("Choice ����");
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
			result.setText("������ ����� "+ch1.getSelectedItem()+", ����� "+ch2.getSelectedItem()+"�Դϴ�");
			
		}



	}




}
