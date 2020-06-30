class Person{
	String name;
	int age;

	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("=============================");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);

	}
}

class Student extends Person{
	int kor, eng;

	Student(String name, int age, int kor, int eng){
		super(name, age);
		this.kor=kor;
		this.eng=eng;
	}
	void display() {
		super.display();
		System.out.println("국어점수:"+kor+"점");
		System.out.println("영어점수:"+eng+"점");

	}
}
class Employee extends Person{
	String company, part;
	Employee(String name, int age, String company, String part){
		super(name, age);
		this.company=company;
		this.part=part;
	}
	void display(){
		super.display();
		System.out.println("회사:"+company);
		System.out.println("부서:"+part);

	}

}
public class Ex06_03_나세나 {

	public static void main(String[] args) {

		Person pe =new Person("효연", 12);
		Student st=new Student("윤아",29,100,100);
		Employee em=new Employee("이승기",42,"삼성","연구부");

		pe.display();
		st.display();
		em.display();

		System.out.println("=============================");
	}

}
