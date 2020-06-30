
class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
	void display() {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student extends Person {
	
	int kor, eng;
	
	Student(String name, int age, int kor, int eng) {
		super(name, age);
		
		this.kor = kor;
		this.eng = eng;
	}
	
	void display() {
		
		super.display();
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println();
	}
}

class Employee extends Person {
	
	String company, part;
	
	Employee(String name, int age, String company, String part) {
		super(name, age);
		
		this.company = company;
		this.part = part;
	}
	
	void display() {
		
		super.display();
		System.out.println("회사 : " + company);
		System.out.println("부서 : " + part);
		System.out.println();
	}
}

public class Ex06_03_송정호 {

	public static void main(String[] args) {
		
		Person pe = new Person("효연", 12);
		Student st = new Student("윤아", 29, 100, 100);
		Employee em = new Employee("이승기", 42, "삼성", "연구부");
		
		pe.display();
		System.out.println();
		st.display();
		em.display();
	}

}
