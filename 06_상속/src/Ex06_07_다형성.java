class Car{
	String color="white";
	int door=4;
	
	void drive() {
		System.out.println("Cardrive");
	}
	void stop() {
		System.out.println("stop");
	}
} // Car

class FireEngine extends Car{
	int door=6;
	int wheel=10;
	void drive() { 
		System.out.println("FEdrive");
	}
	void water() {
		System.out.println("water!");
	}
}//FireEngine


public class Ex06_07_������ {
	public static void main(String[] args) {

		double a = (double)1;//(double) �������� 
		int b = (int)3.2; // (int) ���� �Ұ���  
		
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		c = (Car)fe; // (Car) ���� ���� ,��ĳ����(�ڽ�Ÿ��->�θ�Ÿ��)=>�ڵ�
		System.out.println(c.door);
//		System.out.println(c.wheel);
		System.out.println(c.color);
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		
		c.drive(); //  FEdrive
		fe.drive();
		
		if(c instanceof FireEngine) {
			System.out.println("�ٿ� ĳ���� ����");
		}
		else {
			System.out.println("�ٿ� ĳ���� �Ұ���");
		}
		
		fe2 = (FireEngine)c; // (FireEngine)���� �Ұ��� 
		//�ٿ� ĳ����(�θ�Ÿ��->�ڽ�Ÿ��)
		
		fe2.water();
		fe2.drive();
	}
}










