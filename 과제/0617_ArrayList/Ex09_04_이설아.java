import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String id;
	String pw;

	Person(String id, String pw ){
		super();
		this.id =id;
		this.pw =pw;
	}
	public String toString() {                      //<4> Person�� ���� ���ο����� toString()�� ����
		return id+"/" +pw;
	}

}
public class Ex09_04_�̼��� {
	public static void main(String[] args) {


		ArrayList<Person> list = new ArrayList<Person>(); 

		Person[] p = {new Person("kim","1234"), 
				new Person("park","5678"), 
				new Person("choi","9999")};
		int i;
		for(i=0; i<p.length; i++) {
			list.add(p[i]);
		}

		//�Է��� id,pw Person��ü�� ���� ArrayList�� �߰�
		//���?n ������ �׵��� �߰��Ȱ͵� ���

		Scanner sc = new Scanner (System.in);
		do {
			System.out.print("id�Է�: ");
			String inputId = sc.next();
			System.out.print("pw�Է�: ");
			String inputPw = sc.next();
			list.add(new Person(inputId ,inputPw ));
			
			System.out.print("���?");
			String retry = sc.next();

			if (retry.equalsIgnoreCase("n")) 
				break;

		}while(true);
		System.out.println("�ý��� ����");
			System.out.println(list);
		

	}

}
