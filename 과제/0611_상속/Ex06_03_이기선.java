class Person {
	String name;
	int age;
	Person() {
		this.name="Person : Kim";
		this.age = 100;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Person Name : "+this.name);
		System.out.println("Person  Age : "+this.age);
	}
}
class Student extends Person{
	int kor;
	int eng;
	
	public Student(String name,int age, int kor, int eng) {
		super(name,age);
//		this.name = name;
//		this.age=age;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	void display() {
		System.out.println("This is Student Class");
		System.out.println("Student Name : "+this.name);
		System.out.println("Student Age : "+this.age);
		System.out.println("Student Korean : "+this.kor);
		System.out.println("Student English : "+this.eng);
	}
	
}
class Employee extends Person{
	String company;
	String part;
	
	public Employee(String name, int age, String company, String part) {
		super();
		this.name =name;
		this.age = age;
		this.company = company;
		this.part = part;
	}
	@Override
	void display() {
		System.out.println("This is Employee Class");
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Age : "+this.age);
		System.out.println("Employee Company : "+this.company);
		System.out.println("Employee Part : "+this.part);
	}
	
	
	
}
public class Ex06_03_이기선 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person pe = new Person("효연",12);
		Student s1 = new Student("학생",100,90,80);
		Employee e1 = new Employee("장미",200,"HS","작업부");
		
		pe.display();
		System.out.println("=================================================================");
		s1.display();
		System.out.println("=================================================================");
		e1.display();
		System.out.println("=================================================================");
		

	}

}
