class Person3{
	private String name; 
	private int age;
	private double height;
	
//	������ : 
//	Ŭ������ �̸��� ���� �޼���
//	���� Ÿ���� ����.
//	��ü�� ����� �ڵ����� ȣ��Ǵ� �޼���
//  �������� ������ default �����ڰ� �ڵ����� �����ȴ�.
	
	Person3( ){ // ������(Constructor)
		System.out.println("Person3() ������");
		name = "����";
		age = 20;
		height = 162.7;
	}
//	Person3( ){
//		
//	}
	Person3(String name, int age, double height){ // ������ �����ε�
		System.out.println("Person3(String n, int a, double h) ������");
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	int getAge(){
		return age;
	}
	double getHeight(){
		return height;
	}
	
	void display() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("Ű:"+height);
		System.out.println();
	}
	
	String show(){
		return "�̸�:"+name + " ����:"+age + " Ű:"+height;
	}
}

public class Ex05_16_������ {
	public static void main(String[] args) {

		Person3 p1 = new Person3();
		//p1.name="������";
		p1.setName("������");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getHeight());
		System.out.println();
		
		Person3 p2 = new Person3("����",50,147.2);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getHeight());
		
		System.out.println("================");
		
		p1.display();
		p2.display();
		
		System.out.println("***********");
		
		System.out.println(p1.show());
		System.out.println(p2.show());
	}

}










