class Parent{
	int x = 2;
	void display() {
		System.out.println("P_x:"+x);
	}
}

class Child extends Parent{
	void display() {
		System.out.println("C_x:"+x*x);
	}
}

class Car2{
	void drive() {
		System.out.println("ºÎ¸ªºÎ¸ª");
	}
}

//class Car3 extends Car2{
//	void drive() {
//		System.out.println("ÄçÄç");
//	}
//}

public class Ex07_02_ÀÍ¸í {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.display();
		c.display();
		c.display();
		
		Child c2 = new Child();
		c2.x=5;
		c2.display();
		
		new Parent() {
			void display() {
				System.out.println(x*x*x);
			}// display()
		}.display();
		
		Parent p = new Parent();
		p.display();
		
		System.out.println();
		
		
		new Car2() {
			void drive() {
				System.out.println("ÄçÄç");
			}
		}.drive();
	}

}






