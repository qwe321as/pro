class DaemonTest extends Thread {
	public void run() {
		while(true) {
			try {
				sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(Ex10_03_Daemon.autoSave == true) {
				autoSave();
			}
		} // while
		
	} // run
	
	public void autoSave() {
		System.out.println("�۾� ȭ���� �ڵ� ����Ǿ����ϴ�.");
	}
}
public class Ex10_03_Daemon {
	
	static boolean autoSave = false; // true
	
	public static void main(String[] args) {
		
		DaemonTest t = new DaemonTest();
		t.setDaemon(true);
		t.start();
		
		for(int i=1;i<=20;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
			
		} // for
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}














