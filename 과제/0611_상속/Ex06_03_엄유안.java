class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
	}
}
class Student extends Person{
	int kor, eng;
	Student(String name, int age, int kor, int eng){
		super(name,age);
		this.kor=kor;
		this.eng=eng;
	}
	void display() {
		super.display();
		System.out.println("�ѱ���(�𱹾�): "+kor);
		System.out.println("����: "+eng);
	}
}
class Employee extends Person{
	String company, part;
	Employee(String name, int age, String company, String part){
		super(name,age);
		this.company=company;
		this.part=part;
	}
	void display() {
		super.display();
		System.out.println("ȸ��"+company);
		System.out.println("�μ�"+part);
	}
}

public class Ex06_03_������ {
	public static void main(String[] args) {
		Person a = new Person("ȿ��", 12);
		a.display();
		System.out.println("========================");
		Student b = new Student("����", 29, 100, 100);
		b.display();
		System.out.println("========================");
		Employee c = new Employee("�̽±�", 42, "�Ｚ", "������");
		c.display();
	}
}
