
public class Ex07_06_throws {
	public static void main(String[] args) {

		try {
			//call();
			call2();
			System.out.println("�������");
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("ó���� �����߻�");
		}
	}

	static void call2() throws Exception{
		int i = 1/0; // new ArithmeticException()
	}
	
	static void call() {
		try {
			int i = 1/0;
		}catch(Exception e) {
			System.out.println("call():"+e.toString());
			throw e;
		}
		return;
	}
}


