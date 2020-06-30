class Person{  
	private String name;  
	private int age;  
	void display() {
		System.out.println(name+","+age);
	} 
	//	Person(){
	//		
	//	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
} 
class Student extends Person{  
	//	String name;  
	//	int age;  
	int kor, eng;  
	void display(){ // 오버라이딩 
		//System.out.println(name+","+age+","+kor+","+eng);
		super.display();
		System.out.println(kor+","+eng);
	} 
	//				"슬기",30,80,90
	Student(String name,int age,int kor,int eng){
		super(name,age);
		//		this.name = name;
		//		this.age = age;
		this.kor = kor;
		this.eng = eng;
	}
} 
class Employee extends Person{  
	//	String name;  
	//	int age;  
	String company, part;  

	Employee(String name,int age,String company,String part){
		super(name,age);
//		this.name = name;
//		this.age = age;
		this.company = company;
		this.part = part;
	}
	void display() { // 오버라이딩
		super.display();
		System.out.println(company+","+part);
	}
} 
class Teacher extends Employee{
//	private String name;  
//	private int age;  
//	private String company;
//	private String part;2
	private String subject;
	
	Teacher(String name,int age,String company,String part,String subject){
		super(name,age,company,part);
//		this.name = name;
//		this.age = age;
//		this.company = company;
//		this.part = part;
		this.subject = subject;
	}
	
	void display() {
		super.display();
		System.out.println(subject);
	}
}
public class Ex06_03_내이름 {
	public static void main(String[] args) {
		Person p = new Person("윤아",20);
		Student s = new Student("슬기",30,80,90);
		Employee e = new Employee("승기",40,"중앙","연구부");
		Teacher t = new Teacher("태연",50,"한국고","생활지도부","음악");
		
		p.display();
		System.out.println();
		s.display();
		System.out.println();
		e.display();
		System.out.println();
		t.display();
	}

}

 


