class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	void display(){
		System.out.println("name: "+name);
		System.out.println("age: "+age+"살");
		
		
	}
	
}
class Student extends Person{
	int kor,eng;
	Student(String name,int age,int kor,int eng){
		super(name, age);
		this.kor = kor;
		this.eng = eng;
		
	}
	
	

	void display(){
		System.out.println();
		super.display();
		System.out.println("kor: "+kor+"점");
		System.out.println("eng: "+eng+"점");
		System.out.println();
	}
	
}

class Employee extends Person{
	

	String company,part;
	
	

	Employee(String name,int age,String company,String part){
		super(name,age);
		this.company = company;
		this.part = part;
	}
	
	void display() {
		super.display();
		System.out.println("company: " +company);
		System.out.println("part: "+part);
	}
}

public class Ex06_03_박근주 {

	public static void main(String[] args) {
		
		Person pe = new Person("효연",12);
		Student st = new Student("윤아",29,100,100);
		Employee em = new Employee("이승기",42,"삼성","연구부");
		
		pe.display();
		st.display();
		em.display();

	}

}
