import javax.swing.JOptionPane;

public class Ex10_02_Thread {
	public static void main(String[] args) {

		NumberPrint np = new NumberPrint();
		np.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��� ���� "+input+"�Դϴ�.");

		System.out.println("main ��");
		
	}
}

class NumberPrint extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {

			}
		}
	}
}













