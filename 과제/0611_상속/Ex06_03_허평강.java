class Person{
String name;
int age;

void display() {
	System.out.println("이름:"+name);
	System.out.println("나이:"+age);
	
}
	
	Person (String name,int age){
		this.name = name;
		this.age = age;
	}

	


}
class Student extends Person{
	
	int kor;
	int eng;
	
	Student(String name,int age,int kor,int eng){
		super(name,age);
		this.kor = kor;
		this.eng = eng;
	}
	
	void display() {
		super.display();
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		
	}
	
	
}
class Employee extends Person{
	
	String company;
	String part;
	
	
	Employee(String name,int age,String company,String part){
		super(name,age);
		this.company = company;
		this.part = part;
		
	}
	
void display() {
	super.display();
	System.out.println("회사:" + company);
	System.out.println("부서:" + part);
		
	}
	
}


public class Ex06_03_허평강 {
	public static void main(String[] args) {
		
		
		
	Person p = new Person("효연",12);
	p.display();
	System.out.println();
	Student s = new Student("윤아",29,100,100);
	
	s.display();
	System.out.println();
	Employee e = new Employee("이승기",42,"삼성","연구부");
		
	e.display();	
		
		
	
}
}
