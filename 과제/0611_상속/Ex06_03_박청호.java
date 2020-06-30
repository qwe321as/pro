class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display()	{
		System.out.println("����̸�:" + name);
		System.out.println("����:" + age);
		
		
		
		
	}
	
}

class Student extends Person{
	int kor, eng;
	
	Student(String name, int age, int kor, int eng)	{
		super(name, age);
		this.kor = kor;
		this.eng = eng;
		
	}
	void display()	{
		super.display();
		System.out.println("�ѱ�����:" + kor);
		System.out.println("��������:" + eng);
		System.out.println();
	}
	
	
}

class Employee extends Person {
	String company, part;
	
	
	Employee(String name, int age, String company, String part)	{
		super(name, age);
		this.company = company;
		this.part = part;
		
	}
	void display()	{
		super.display();
		System.out.println();
		System.out.println("ȸ���̸�:" + company);
		System.out.println("��å:" + part);
	}
}



public class Ex06_03_��ûȣ {

	public static void main(String[] args) {
		
		Person p = new Person("ȿ��", 12);
		p.display();
		
		Student s = new Student("����", 29, 100, 100);
		s.display();
		
		Employee e = new Employee("�̽±�", 42, "�Ｚ", "������" );
		e.display();
		
		
		
		
	}

}
