class Person{
	String name; // 멤버변수(field), instance 변수
	int age;
	double height;
	static String nation; // static(클래스) 변수
}

public class Ex05_01_클래스 {
	public static void main(String[] args) {
		//클래스는 사용자 정의 자료형 
		int a;
		int c,d,e;
		a=1;
		double b=2.3;
		a=3;
		a=7;
		String name;
		
//		man,woman : 참조변수
//		참조변수.멤버변수
		Person.nation="한국";
		
		Person man = new Person(); // 객체(인스턴스)생성 
		name="아이유";
		man.name="철수";
//		Person.name = "철수";
		man.age=20;
		man.height=173.8;
//		man.nation="한국";
		
		
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.height);
		System.out.println(man.nation);
		
		Person woman = new Person();
		woman.age = 30;
		woman.height = 153.7;
		woman.name = "영희";
		//woman.nation="한국";
		
		System.out.println(woman.name);
		System.out.println(woman.age);
		System.out.println(woman.height);
		System.out.println(woman.nation);
		System.out.println(Person.nation);
	}

}






