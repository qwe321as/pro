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

public class Ex06_03_±ÇÇö {
	public static void main(String[] args) {

		Person p = new Person("È¿¿¬",12);
		p.display();
		Student s = new Student("À±¾Æ",29,100,100);
		s.display();
		Employee e = new Employee("ÀÌ½Â±â",42,"»ï¼º","¿¬±¸ºÎ");
		e.display();




	}//main

}//class
