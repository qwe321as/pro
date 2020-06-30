class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("�̸�: "+name+" ���� :"+age);
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
		System.out.println("�������� : "+kor+" ��������: "+eng);
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
		System.out.println("ȸ�� : "+company+" �μ�: "+part);
	}
}
public class Ex06_03_�̿��� {

	public static void main(String[] args) {
		Person pe= new Person("ȿ��",22);
		Student st = new Student("����", 27, 100, 88);
		Employee em = new Employee("�̽±�", 29, "īī��", "���ֺ�");
		pe.display();
		st.display();
		em.display();
	}

}
