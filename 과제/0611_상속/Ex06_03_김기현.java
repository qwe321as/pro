class Person{
	String name;
	int age;
	
	Person(String name,int age) {
		this.name=name;
		this.age=age;
	}	
	void show() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}	
}

class Student extends Person{
	int kor,eng;
	
	Student(String name,int age,int kor,int eng) {
		super(name,age);
		this.kor=kor;
		this.eng=eng;
	}
	void show() {
		System.out.println();
		super.show();
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
	}		
}

class Employee extends Person{
	String company, part;
	
	Employee(String name,int age,String company,String part) {
		super(name,age);
		this.company = company;
		this.part = part;
	}
	void show() {
		System.out.println();
		super.show();
		System.out.println("회사:"+company);
		System.out.println("부서:"+part);
	}
}

public class Ex06_03_김기현 {
	public static void main(String[] args) {

		Person p = new Person("효연",24); 
		p.show();
		
		Student s = new Student("윤아",26,89,78);
		s.show();
		
		Employee e = new Employee("태연",25,"LG","인사팀");
		e.show();
	}

}
