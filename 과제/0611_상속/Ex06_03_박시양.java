
class Person{
	String name;
	int age;
	

	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}

	void dispaly(){
		System.out.print(" �̸�:" + name + "  ����:" + age);
	
		
	}
}

class Student extends Person{
	int kor, eng;

	Student(String name, int age, int kor, int eng){
		super(name, age);
		this.kor = kor;
		this.eng = eng;
		
	}

	void display(){
		super.dispaly();
		System.out.println("��������:" + kor + " ��������:" +  eng);
		System.out.println();
	}
}
class Empolyee extends Person{
	String company, part;
	
	Empolyee(String name, int age, String company, String part){
		super(name, age);
		this.company = company;
		this.part = part;
	}

	void display(){
		super.dispaly();
		System.out.println("  ȸ��:" + company + "  �μ�:" + part);
		System.out.println();
	}
	

}
public class Ex06_03_�ڽþ� {
	public static void main(String[] args) {


		Person pe = new Person("ȿ��", 12);
		pe.dispaly();
		Student st = new Student("����", 29, 100, 100);
		st.display();
		Empolyee me = new Empolyee("�̽±�", 42, "�Ｚ", "������");
		me.display();

	}
}