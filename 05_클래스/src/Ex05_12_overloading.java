
public class Ex05_12_overloading {

	public static void main(String[] args) {

		Ex05_12_overloading ex = new Ex05_12_overloading();
		ex.plus(1,2,3);
		
		ex.plus(10,20);
		
		ex.plus(1.1, 2.2);
	}
	
	void plus(int a,int b,int c) { // �����ε� 
		System.out.println(a+b+c);
	}

	void plus(int a,int b) {
		System.out.println(a+b);
	}
	
	void plus(double a,double b) {
		System.out.println(a+b);
	}
}



