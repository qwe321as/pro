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
	void display(){ // �������̵� 
		//System.out.println(name+","+age+","+kor+","+eng);
		super.display();
		System.out.println(kor+","+eng);
	} 
	//				"����",30,80,90
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
	void display() { // �������̵�
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
public class Ex06_03_���̸� {
	public static void main(String[] args) {
		Person p = new Person("����",20);
		Student s = new Student("����",30,80,90);
		Employee e = new Employee("�±�",40,"�߾�","������");
		Teacher t = new Teacher("�¿�",50,"�ѱ���","��Ȱ������","����");
		
		p.display();
		System.out.println();
		s.display();
		System.out.println();
		e.display();
		System.out.println();
		t.display();
	}

}

 


