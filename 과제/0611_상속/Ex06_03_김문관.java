class Person{
	String name;
	int age;
	
	Person(){
		
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
	
}

class Student extends Person{
	int kor,eng;
	
	
	Student(String name, int age, int kor, int eng){
		super(name,age);
		this.kor = kor;
		this.eng = eng;
	}
	
	void show() {
		super.show();
		System.out.println("�������� :" + kor);
		System.out.println("�������� :" + eng);
	}
	
}

class Employee extends Person{
	String company, part;
	
	Employee(String name, int age, String company, String part){
		super(name,age);
		this.company = company;
		this.part = part;
	}
	
	void show() {
		super.show();
		System.out.println("ȸ��� :" + company);
		System.out.println("�μ��� :" + part);
	}
	
	
}



public class Ex06_03_�蹮�� {

	public static void main(String[] args) {
		
		Person pe = new Person("�蹮��",30);
		pe.show();
		System.out.println("=========================");
		
		Student st = new Student("�ּ�",38,50,90);
		st.show();
		System.out.println("=========================");
		
		Employee em = new Employee("��ȿ��",42,"�߾��������簳�߿�","������");
		em.show();
		System.out.println("=========================");

	}

}
