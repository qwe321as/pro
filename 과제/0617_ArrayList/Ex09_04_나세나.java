import java.util.ArrayList;
//Object->public String toString()
import java.util.Scanner;

class Person{
	String id;
	String pw;
	public Person(String id, String pw) {
		super();
		this.id=id;
		this.pw=pw;
	}
	public String toString() {
		return id + "/" + pw;
	}

}

public class Ex09_04_������ {

	public static void main(String[] args) {


		//������ �����
		Person[] p= {new Person("kim", "1234"),
				new Person("park", "5678"),
				new Person("choi", "9999")};


		ArrayList<Person> list=new ArrayList<Person>();    //���� ���� Ŭ���� ��ü�� �ڷ���Ÿ������ ����� ����

		//�ݺ��� �Ἥ �߰��ϱ�
		int i;
		for(i=0;i<p.length;i++) {
			list.add(p[i]);
		}

		//		System.out.println(list.toString());
		//		System.out.println(list.get(1));
		//		Person one=list.get(1);  //Person�� ��������
		//		System.out.println("one:"+one.toString());  

		//		for(i=0;i<p.length;i++) {
		//			System.out.println(list.get(i));
		//		}
		//		

		do {
			Scanner sc=new Scanner(System.in);

			System.out.print("Id�Է�:");
			String id=sc.next();
			System.out.print("Pw�Է�:");
			String pw=sc.next();
			list.add(new Person(id, pw));

			System.out.print("���?");
			String ddd=sc.next();
			if(ddd.equals("n")) {
				System.out.println(list);
				break;
			}

		} while(true);


	}

}




//������� ��������
//ID:jung
//PW:1212
//���?y
//ID:won
//PW:9988
//���?n
//[kim/1234, park/5678, choi/9999, jung/1212, won/9988]
