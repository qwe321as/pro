class Big extends Thread{
	public void run() {
		//System.out.println("big()");
		
		for(char i='A';i<='Z';i++) {
			System.out.print(i+" ");
			try {
				sleep(100); // 1000:1초 new InterruptedException() 
			}catch(InterruptedException e) {
				
			}
			
		}
		System.out.println();
	}
} // Big

class Small implements Runnable{
	public void run() {
		
		for(char i='a';i<='z';i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(100);  
			}catch(InterruptedException e) {
				
			}
			
		}
		System.out.println();
	}
}// Small

public class Ex10_01_Thread {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Big b = new Big();
		b.start();
		
		Small s = new Small();
		Thread th = new Thread(s);
		th.start();
		
		System.out.println("프로그램 끝");
	}
}




