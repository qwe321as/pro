class Person3{
	private String name; 
	private int age;
	private double height;
	
//	생성자 : 
//	클래스와 이름이 같은 메서드
//	리턴 타입이 없다.
//	객체를 만들면 자동으로 호출되는 메서드
//  정의하지 않으면 default 생성자가 자동으로 생성된다.
	
	Person3( ){ // 생성자(Constructor)
		System.out.println("Person3() 생성자");
		name = "슬기";
		age = 20;
		height = 162.7;
	}
//	Person3( ){
//		
//	}
	Person3(String name, int age, double height){ // 생성자 오버로딩
		System.out.println("Person3(String n, int a, double h) 생성자");
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	int getAge(){
		return age;
	}
	double getHeight(){
		return height;
	}
	
	void display() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("키:"+height);
		System.out.println();
	}
	
	String show(){
		return "이름:"+name + " 나이:"+age + " 키:"+height;
	}
}

public class Ex05_16_생성자 {
	public static void main(String[] args) {

		Person3 p1 = new Person3();
		//p1.name="아이유";
		p1.setName("아이유");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getHeight());
		System.out.println();
		
		Person3 p2 = new Person3("웬디",50,147.2);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getHeight());
		
		System.out.println("================");
		
		p1.display();
		p2.display();
		
		System.out.println("***********");
		
		System.out.println(p1.show());
		System.out.println(p2.show());
	}

}










