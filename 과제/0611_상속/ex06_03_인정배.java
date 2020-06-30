class person{
	String name;
	int age;
	person(String name , int age ){
		this.name = name;
		this.age = age;
	}
	void display(){
		System.out.println("이름"+name);
		System.out.println("나이"+age);
	}
}
class student extends person{
	int kor, eng ;//국어 영어
	
 student(String name, int age, int kor, int eng) {
		
		super(name,age);
		this.kor=kor;
		this.kor = eng;
	}
 void display() {
	 super.display();
		System.out.println("국어:"+kor);
		System.out.println("수학:"+eng);
	}
	
	
}
class Employee extends person{
	String company , part;// 회사이름 부서
 Employee(String name, int age, String company, String part) {
		
		super(name,age);
		this.company=company;
		this.part = part;
	}
 void display() {
	 super.display();
		System.out.println("회사이름:"+company);
		System.out.println("회사부서:"+part);
	}
	
		
}
public class ex06_03_인정배 {
	public static void main(String[]args) {
		
		int c; double d;
		person s = new person("이시우",19);
		student a =new student("김유나",13,90,80);
		Employee b= new Employee("최용준",11,"마룡사","마케팅");
		a.display();
		b.display();
		s.display();
	}
	
	
	
	
}
