class person{
	String name;
	int age;
	person(String name , int age ){
		this.name = name;
		this.age = age;
	}
	void display(){
		System.out.println("�̸�"+name);
		System.out.println("����"+age);
	}
}
class student extends person{
	int kor, eng ;//���� ����
	
 student(String name, int age, int kor, int eng) {
		
		super(name,age);
		this.kor=kor;
		this.kor = eng;
	}
 void display() {
	 super.display();
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
	}
	
	
}
class Employee extends person{
	String company , part;// ȸ���̸� �μ�
 Employee(String name, int age, String company, String part) {
		
		super(name,age);
		this.company=company;
		this.part = part;
	}
 void display() {
	 super.display();
		System.out.println("ȸ���̸�:"+company);
		System.out.println("ȸ��μ�:"+part);
	}
	
		
}
public class ex06_03_������ {
	public static void main(String[]args) {
		
		int c; double d;
		person s = new person("�̽ÿ�",19);
		student a =new student("������",13,90,80);
		Employee b= new Employee("�ֿ���",11,"�����","������");
		a.display();
		b.display();
		s.display();
	}
	
	
	
	
}
