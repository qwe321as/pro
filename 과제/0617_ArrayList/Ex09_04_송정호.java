import java.util.ArrayList;
import java.util.Scanner;

class Person {
	
	String id;
	String pw;
	
	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public String toString() {				// �������̵� �θ� public�̸� �ڽĵ� public
		return id + "-" + pw;
	}
}

public class Ex09_04_����ȣ {

	public static void main(String[] args) {
		
//		Person p1 = new Person("kim", "1234");
//		Person p2 = new Person("park", "5678");
//		Person p3 = new Person("choi", "9999");
		Person p[] = {new Person("kim", "1234"), new Person("park", "5678"), new Person("choi", "9999")};
		
		ArrayList<Person> list = new ArrayList<Person>();		// ��üŸ�Կ� ���� �޼��尡 �޶�����.
//		list.add(p1);
//		list.add(p2);
//		list.add(new Person("choi", "9999"));
		
		for(int i = 0; i < p.length; i++) {
			list.add(p[i]);
		}
		
		System.out.println(list.toString());
//		System.out.println(list.get(1));
//		Person one = list.get(1);
//		System.out.println(one.toString());
		
		for(int i = 0; i < p.length; i++) {
			System.out.println(list.get(i));
		}
		
		Scanner sc = new Scanner(System.in);
		
		String inputId, inputPw, yorn;
		
		do {
			
			System.out.print("ID : ");
			inputId = sc.next();
			System.out.print("PW : ");
			inputPw = sc.next();
			
			list.add(new Person(inputId, inputPw));
			
			System.out.print("��� ? ");
			yorn = sc.next();
			if(yorn.equalsIgnoreCase("n")) {
				System.out.println(list.toString());
				System.out.println("���α׷� ����");
				break;
			}
		}while(true);
	}

}
