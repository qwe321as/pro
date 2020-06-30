class Tv{
	String color; // null
	int channel; // 0
	boolean power; // false
	static String company;
	
	void channelUp() { // 정의 
		channel++;
	}
	
	void power() { // 정의 
		power = !power;
	}
	
}//Tv

/*
class Person{
	String name; // 멤버변수(field)
	int age;
	double height;
} // Person
*/
public class Ex05_02_클래스 {
	public static void main(String[] args) {

//		int a;
//		System.out.println(a);
		Tv.company = "LG";
		Tv t = new Tv();
		System.out.println(t.color);
		System.out.println(t.channel);
		System.out.println(t.power);
		System.out.println();
		
		t.color="red";
		t.channel=11;
		t.power=false;
		t.company = "LG";
		Tv.company = "LG";
		
		System.out.println(t.color);
		System.out.println(t.channel);
		System.out.println(t.power);
		System.out.println(Tv.company);
		System.out.println();
		t.channelUp();
		System.out.println(t.channel);
		t.power();
		System.out.println(t.power);
		
		
		System.out.println("===================");
		Tv t2 = new Tv();
		t2.color="blue";
		t2.channel=9;
		t2.power=true;
		
		System.out.println(t2.color);
		System.out.println(t2.channel);
		System.out.println(t2.power);
		t2.channelUp();
		System.out.println(t2.channel);
		
		System.out.println("**************");
		
		
		
		
		
		Person p = new Person();
		p.name="홍길동";
		p.age=33;
		p.height=123.4;
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.height);
	}

}






