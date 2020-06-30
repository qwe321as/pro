class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("이름: "+name+" 나이 :"+age);
	}
}
class Student extends Person{
	int kor,eng;
	Student(String name, int age, int kor, int eng){
		super(name,age);
		this.eng=eng;
		this.kor=kor;
	}
	void display() {
		System.out.println();
		super.display();
		System.out.println("국어점수 : "+kor+" 영어점수: "+eng);
		System.out.println();
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
		System.out.println("회사 : "+company+" 부서: "+part);
	}
}
public class Ex06_03_이예지 {

	public static void main(String[] args) {
		Person pe= new Person("효연",22);
		Student st = new Student("윤아", 27, 100, 88);
		Employee em = new Employee("이승기", 29, "카카오", "연애부");
		pe.display();
		st.display();
		em.display();
	}

}
