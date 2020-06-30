
class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		}
}

class Student extends Person{
	int kor;
	int eng;
	Student(String name, int age, int kor, int eng){
		super(name,age);
		this.kor=kor;
		this.eng=eng;
	}
	
	void display() {
		super.display();
		System.out.println("��������:"+kor);
		System.out.println("��������:"+eng);
		System.out.println();
	}
}

class Employee extends Person{
	String company;
	String part;
	Employee(String name, int age, String company, String part){
		super(name,age);
		this.company=company;
		this.part=part;
	}
	
	void display() {
		super.display();
		System.out.println("ȸ��:"+company);
		System.out.println("�μ�:"+part);
		System.out.println();
	}
}

public class Ex06_03_���½� {

	public static void main(String[] args) {
		
		 Person pe = new Person("ȿ��",12);
		 Student st = new Student("����",29,100,100);
		 Employee em = new Employee("�̽±�",42,"�Ｚ","������"); 
		 pe.display();
		 st.display();
		 em.display();
		 

		
	}

}
