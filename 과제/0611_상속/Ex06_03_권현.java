class Person{
	String name;
	int age;

	Person(String name, int age){
		this.name =name;
		this.age = age;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
}

class Student extends Person {
	int kor;
	int eng;
	Student(String name, int age, int kor, int eng){
		super(name, age);
		this.name =name;
		this.age = age;
		this.kor= kor;
		this.eng= eng;
	}
	void display() {
		super.display();
		System.out.println(kor);
		System.out.println(eng);
	}
}

class Employee extends Person {
	String company;
	String part;
	Employee(String name, int age, String company, String part){
		super(name,age);
		this.name =name;
		this.age = age;
		this.company=company;
		this.part=part;
	}
	void display() {
		super.display();
		System.out.println(company);
		System.out.println(part);

	}

}

public class Ex06_03_���� {
	public static void main(String[] args) {

		Person p = new Person("ȿ��",12);
		p.display();
		Student s = new Student("����",29,100,100);
		s.display();
		Employee e = new Employee("�̽±�",42,"�Ｚ","������");
		e.display();




	}//main

}//class
