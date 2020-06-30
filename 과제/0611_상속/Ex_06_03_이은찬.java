class Person{
	String name;
	int age;

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	void display(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
}

class Student extends Person{
	int kor,eng;

	public Student(String name, int age, int kor, int eng) {
		super(name, age);
		this.kor = kor;
		this.eng = eng;
	}	
	
	void display() {
		super.display();
		System.out.println("kor:"+kor);
		System.out.println("eng:"+eng);
		System.out.println();
	}
}
class Employee extends Person{
	String company,part;

	public Employee(String name, int age, String company, String part) {
		super(name, age);
		this.company = company;
		this.part = part;
	}
	
	void display() {
		super.display();
		System.out.println("company:"+company);
		System.out.println("part:"+part);
		System.out.println();
	}
}

public class Ex_06_03_������ {
	public static void main(String[] args) {
		Person p = new Person("ȿ��",12);
		p.display();
		System.out.println();
		Student s = new Student("����",29,100,100);
		s.display();
		Employee e = new Employee("�̽±�",42,"�Ｚ","������");
		e.display();
	}

}
