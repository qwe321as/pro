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


public class Ex06_07_다형성 {
	public static void main(String[] args) {

		double a = (double)1;//(double) 생략가능 
		int b = (int)3.2; // (int) 생략 불가능  
		
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		c = (Car)fe; // (Car) 생략 가능 ,업캐스팅(자식타입->부모타입)=>자동
		System.out.println(c.door);
//		System.out.println(c.wheel);
		System.out.println(c.color);
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		
		c.drive(); //  FEdrive
		fe.drive();
		
		if(c instanceof FireEngine) {
			System.out.println("다운 캐스팅 가능");
		}
		else {
			System.out.println("다운 캐스팅 불가능");
		}
		
		fe2 = (FireEngine)c; // (FireEngine)생략 불가능 
		//다운 캐스팅(부모타입->자식타입)
		
		fe2.water();
		fe2.drive();
	}
}










