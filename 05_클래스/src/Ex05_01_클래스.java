class Person{
	String name; // �������(field), instance ����
	int age;
	double height;
	static String nation; // static(Ŭ����) ����
}

public class Ex05_01_Ŭ���� {
	public static void main(String[] args) {
		//Ŭ������ ����� ���� �ڷ��� 
		int a;
		int c,d,e;
		a=1;
		double b=2.3;
		a=3;
		a=7;
		String name;
		
//		man,woman : ��������
//		��������.�������
		Person.nation="�ѱ�";
		
		Person man = new Person(); // ��ü(�ν��Ͻ�)���� 
		name="������";
		man.name="ö��";
//		Person.name = "ö��";
		man.age=20;
		man.height=173.8;
//		man.nation="�ѱ�";
		
		
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.height);
		System.out.println(man.nation);
		
		Person woman = new Person();
		woman.age = 30;
		woman.height = 153.7;
		woman.name = "����";
		//woman.nation="�ѱ�";
		
		System.out.println(woman.name);
		System.out.println(woman.age);
		System.out.println(woman.height);
		System.out.println(woman.nation);
		System.out.println(Person.nation);
	}

}






