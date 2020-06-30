import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex12_06_���̸� extends Frame implements ItemListener{
	
	String[] ��� = {"�ƽþ�","����","������ī"};
	
	String[][] ���� = {	{"�ѱ�","�Ϻ�","�߱�"},
						{"����","������","������"},
						{"����Ʈ","���","�찣��"}
					 };
	Choice ch1;
	Choice ch2;
	Label lb2;
	Ex12_06_���̸�(String title){
		
		super.setTitle(title);
		
		Label lb1 = new Label("����� ���� �����ϼ���");
		lb1.setBackground(Color.cyan);
		
		lb2 = new Label();
		lb2.setBackground(Color.yellow);
		lb2.setAlignment(Label.CENTER);
		
		Panel p = new Panel();
		p.setBackground(Color.pink);
		
		ch1 = new Choice();
		ch2 = new Choice();
		
		p.add(ch1);
		p.add(ch2);
		
		super.add(lb1,"North");
		super.add(p,"Center");
		super.add(lb2,"South");
		
		for(int i=0;i<���.length;i++) {
			ch1.add(���[i]);
		}
		ch2.add("             ");
		
		ch1.addItemListener(this); // => new ItemEvent() ItemStateChanged() 
		ch2.addItemListener(this); // => new ItemEvent() ItemStateChanged() 
		
		setSize(300,200);
		setVisible(true);
		
		// Frame���� ��� �ֱ�
		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e){
						System.exit(0);
					}
				}
				
		);
	}
	
	public static void main(String[] args) {

		new Ex12_06_���̸�("Choice ����");
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		Object obj = e.getSource();
		String str = "������ ����� ����� : ";
		
		if(obj==ch1) {
			ch2.removeAll();
			int index = ch1.getSelectedIndex();
			for(int j=0;j<����[index].length;j++) {
				ch2.add(����[index][j]);
			}
		}
		else if(obj==ch2) {
			str += ch1.getSelectedItem()+" - ";
			str += ch2.getSelectedItem();
			lb2.setText(str);
		}
		
	}

}






