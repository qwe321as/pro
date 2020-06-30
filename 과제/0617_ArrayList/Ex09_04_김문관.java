import java.util.ArrayList;
import java.util.Scanner;

class Person{

	String id;
	String pw;

	public Person(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String toString() {
		return id + "/" + pw;
	}


}
public class Ex09_04_�蹮�� {

	public static void main(String[] args) {

		//		Person p1 = new Person("kim", "1234");
		//		Person p2 = new Person("park", "5678");
		//		Person p3 = new Person("choi", "9999");
		ArrayList<Person> list = new ArrayList<Person>();
		Person[] arr = {
				new Person("kim", "1234"),
				new Person("park", "5678"),
				new Person("choi", "9999")
		};

		for(int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		System.out.println(list);

		//System.out.println(list.get(1));
		Person one = list.get(1);
		System.out.println("one :" + one);

		for(int i = 0; i < arr.length; i++) {
			System.out.println(list.get(i));
		}

		//		list.add(p1);
		//		list.add(p2);
		//		list.add(p3);

		//		System.out.println(list); // �θ��� toString �ּҸ� �˷��ֱ� ������, �ڽ��� Ŭ�������� ������ �Ͽ� ����ؾ��� (�������̵�)

		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("ID �Է�:");
			String inputId = scan.next();
			
			System.out.print("PW �Է�:");
			String inputPw = scan.next();
			
			list.add(new Person(inputId,inputPw));
			
			System.out.print("���?");
			
			String ing = scan.next();
			
			if(ing.equalsIgnoreCase("y")) {
				continue;
			}
			else if(ing.equalsIgnoreCase("n")) {
				System.out.println(list);
				break;
			}else {
				System.out.println("y �Ǵ� n�� �Է� �ϼ���.");
			}
		}
		while(true);

	}

}
