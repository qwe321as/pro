class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}

class Student extends Person{
	int kor, eng;
	
	public Student(String name, int age, int kor, int eng) {
		super(name, age);
		this.kor = kor;
		this.eng = eng;
	}

	void display() {
		super.display();
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
	}
}

class Employee extends Person{
	String company, part;

	
	public Employee(String name, int age, String company, String part) {
		super(name, age);
		this.company = company;
		this.part = part;
	}

	void display() {
		super.display();
		System.out.println("회사:"+company);
		System.out.println("부서:"+part);
	}
	
}
public class Ex06_03_허용석 {
	public static void main(String[] args) {
		Person p=new Person("효연",12);
		
		Student s=new Student("윤아",29,100,100);
		
		Employee e=new Employee("이승기",42,"삼성","연구부");
		
		p.display();
		System.out.println();
		s.display();
		System.out.println();
		e.display();
	}

}
