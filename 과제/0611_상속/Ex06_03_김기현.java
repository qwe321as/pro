class Person{
	String name;
	int age;
	
	Person(String name,int age) {
		this.name=name;
		this.age=age;
	}	
	void show() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
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
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
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
		System.out.println("ȸ��:"+company);
		System.out.println("�μ�:"+part);
	}
}

public class Ex06_03_����� {
	public static void main(String[] args) {

		Person p = new Person("ȿ��",24); 
		p.show();
		
		Student s = new Student("����",26,89,78);
		s.show();
		
		Employee e = new Employee("�¿�",25,"LG","�λ���");
		e.show();
	}

}
