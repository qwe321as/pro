class Person{
	String name;
	int age;
	Person(){
		System.out.println("Person()");
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
		}
	void display() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		
	}
	
}
class Student extends Person{
	int kor,eng;
	
	public Student(String name,int age,int kor,int eng){
		super(name,age);
		this.kor=kor;
		this.eng=eng;
		
	}
	void display() {
		super.display();
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		;
	}
	
}
class Employee extends Person{
	String company,part;
	 Employee(String name,int age,String company,String part) {
		super(name,age);
		this.company=company;
		this.part=part;
	}
	void display() {
		super.display();
		System.out.println("ȸ��:"+company);
		System.out.println("Part:"+part);
	}
	
	
}
public class Ex06_03_������ {

	public static void main(String[] args) {
		Person p=new Person("������",25);
		p.display();
		System.out.println();
		Student s =new Student ("���ֿ�",20,80,70);
		s.display();
		System.out.println();
		Employee e=new Employee("���μ�",26,"������","�濵");
		e.display();

	}

}
