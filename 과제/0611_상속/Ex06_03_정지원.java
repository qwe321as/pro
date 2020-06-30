class Person{
	String name;
	int age;
	Person(){
		System.out.println("Person()");
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
		}
	void display() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		
	}
	
}
class Student extends Person{
	int kor,eng;
	
	public Student(String name,int age,int kor,int eng){
		super(name,age);
		this.kor=kor;
		this.eng=eng;
		
	}
	void display() {
		super.display();
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		;
	}
	
}
class Employee extends Person{
	String company,part;
	 Employee(String name,int age,String company,String part) {
		super(name,age);
		this.company=company;
		this.part=part;
	}
	void display() {
		super.display();
		System.out.println("회사:"+company);
		System.out.println("Part:"+part);
	}
	
	
}
public class Ex06_03_정지원 {

	public static void main(String[] args) {
		Person p=new Person("정지수",25);
		p.display();
		System.out.println();
		Student s =new Student ("정주원",20,80,70);
		s.display();
		System.out.println();
		Employee e=new Employee("정민수",26,"정가네","경영");
		e.display();

	}

}
