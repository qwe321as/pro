class Parent{
	int x=10;
	void method() {
		System.out.println("P_x:"+x);
	}
}

class Child extends Parent{
	int x=20;
	void method() {
		int x=30;
		System.out.println("x:"+x);
		System.out.println("this.x:"+this.x);
		System.out.println("super.x:"+super.x);
		
		super.method();
//		super()
//		this()
	}
}

public class Ex06_05_super {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
