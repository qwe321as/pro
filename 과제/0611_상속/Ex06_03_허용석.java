class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
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
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
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
		System.out.println("ȸ��:"+company);
		System.out.println("�μ�:"+part);
	}
	
}
public class Ex06_03_��뼮 {
	public static void main(String[] args) {
		Person p=new Person("ȿ��",12);
		
		Student s=new Student("����",29,100,100);
		
		Employee e=new Employee("�̽±�",42,"�Ｚ","������");
		
		p.display();
		System.out.println();
		s.display();
		System.out.println();
		e.display();
	}

}
