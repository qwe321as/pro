import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

class JTableSub extends JFrame{
	String[] jtitle = {"사번","성명","부서"};
	
	Object[][] data = {
						{new Integer(1),"차승원","인사부"},
						{2,"유해진","총무부"},
						{3,"손호준","연구부"}
						};
	
	JTableSub(String title){
		super.setTitle(title);
		Container contentPane = getContentPane();
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTable table = new JTable(data,jtitle);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		
		JScrollPane js = new JScrollPane(table,v,h);
		
		contentPane.add(js,BorderLayout.CENTER);

		setVisible(true);
		
	}
}

public class Ex12_09_JTable {

	public static void main(String[] args) {
		JTableSub t = new JTableSub("JTable");
		
	}

}
