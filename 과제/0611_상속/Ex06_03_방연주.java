class Person {
	String name;
	int age;

	void display() {
		System.out.println(name);
		System.out.println(age);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

class Student extends Person {
	int kor, eng;

	void display() {
		super.display();
		System.out.println(kor);
		System.out.println(eng);
	}

	Student(String name, int age, int kor, int eng) {
		super(name, age);
		this.kor = kor;
		this.eng = eng;

	}
}

class Employee extends Person {
	String company;
	String part;

	void display() {
		super.display();
		System.out.println(company);
		System.out.println(part);

	}

	Employee(String name, int age, String company,String part) {
		super(name, age);
		this.company = company;
		this.part = part;
	}

}

public class Ex06_03_�濬�� {
	public static void main(String[] args) {
		Person pe = new Person("ȿ��", 12);
		pe.display();
		Student st = new Student("����", 29, 100, 100);
		st.display();
		Employee em = new Employee("�̽±�", 42, "�Ｚ", "������");
		em.display();
	}
}
