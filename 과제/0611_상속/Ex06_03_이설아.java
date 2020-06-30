class Person{
	String name;
	int age;

	Person(String name, int age ){
		this.name= name;
		this.age =age;

	}

	void display() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}//p
}

class Student extends Person{
	int kor, eng;
	Student(String name, int age , int kor, int eng ){
		super(name, age);
		this.kor = kor;
		this.eng =eng;
	}
	void display() {
		super.display();
		System.out.println("��������:"+kor);
		System.out.println("��������:"+eng);
	}

}//s

class Employee extends Person{
	String company, part;
	Employee(String name, int age, String company, String part ){
		super(name, age);
		this.company = company;
		this.part = part;
	}
	void display() {
		super.display();
		System.out.println("�ٹ�ȸ��:"+company);
		System.out.println("�ٹ��μ�:"+part);
	}

}//e



public class Ex06_03_�̼��� {
	public static void main(String[] args) {

		Person pe = new Person("ȿ��",22);
		Student st = new Student("����",29, 100, 100);
		Employee em = new Employee("�̽±�", 42, "�Ｚ", "������");	

		//���
		pe.display();
		System.out.println();
		st.display();
		System.out.println();
		em.display();



	}

}
