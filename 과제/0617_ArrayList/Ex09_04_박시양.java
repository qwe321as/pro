import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String id;
	String pw;

	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String toString() { // <--���� �ȸ���� �θ𿡰� �������� toString(�ּҰ����)
		return id + "/" + pw; //
	}


}
public class Ex09_04_�ڽþ� {

	public static void main(String[] args) {

		//		Person p1 = new Person("kim", "1234");
		//		Person p2 = new Person("park", "5678");
		//		Person p3 = new Person("choi", "9999");
		//		
		//		ArrayList<Person> list = new ArrayList<Person>();
		//		list.add(p1);
		//		list.add(p2);
		//		list.add(new Person("choi","9999"));
		//		System.out.println(list.toString()); // Person��  toString ����(���� toString������ ���ξȸ���� �ּҰ� ����)


		Person[] p = { new Person("kim", "1234"),
				new Person("park", "5678"),
				new Person("choi", "9999"),
		};

		ArrayList<Person> list = new ArrayList<Person>();

		int i;
		for(i=0; i<p.length; i++) {
			list.add(p[i]);
		}

		System.out.println(list.toString());
		Person one = list.get(1);
		System.out.println("one:" + one.toString());//<--����
		System.out.println(list.get(1));//<--����
		System.out.println("=============================");



		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("���̵� �Է�: ");
			String id2 = sc.next();

			System.out.print("��й�ȣ �Է�:");
			String pw2 = sc.next();

			list.add(new Person(id2,pw2));


			System.out.print("���?(y/n)");
			String ing = sc.next();

			if(ing.equalsIgnoreCase("y")) {
				continue;
			}else if(ing.equalsIgnoreCase("n")){
				System.out.println(list);
				System.out.println("�����մϴ�.");
				break;

			}else {
				System.out.println("y�Ǵ� n�� �Է� ���ּ���");
			}

		}while(true);
	}

}

//ID:jung
//PW:1212
//���?y
//ID:won
//PW:9988
//���?n
//[kim/1234, park/5678, choi/9999, jung/1212, won/9988]






