import java.util.ArrayList;
import java.util.Scanner;

//Object -> public String toString()

class Person{
	String id;
	String pw;
	
	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String toString() { // Object�� �������ִ� toString()�� public�� ����������. public �ۼ��ؾ���.
		return id+"/"+pw;	   // Object toString()�� �������ִ°� �ּҸ�����. ��������� �ٽ� �޼��� �ۼ��ؾ���.
	}
	
}
public class Ex09_04_����� {

	public static void main(String[] args) {

//		Person p1 = new Person("kim","1234");
//		Person p2 = new Person("park","5678");
//		Person p3 = new Person("choi","9999");
		int i;
		
		Person p [] = {new Person ("kim","1234"),
					   new Person ("park","5678"),
					   new Person ("choi","9999")
					  };
		
		ArrayList<Person> list = new ArrayList<Person>(); // <> ���� ���� Ŭ���� ������ ��ü�� ����������.
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);

//		System.out.println(list.toString());
		
		
			for(i=0;i<p.length;i++) {
					list.add(p[i]);
			}
			System.out.println(list.toString()); // ������ ��ü���
			System.out.println(list.get(1)); // 1��° �濡�ִ� ������ ��¹��
			Person one = list.get(1);
			System.out.println("one:" + one.toString()); // 1��° �濡�ִ� ������ ��¹��
			
			for(i=0;i<p.length;i++) {
				System.out.println(list.get(i)); // 0��° ������ͼ� ���, 1��° ������ͼ� ���, 2��° ������ͼ� ���
			}
			
			
//			boolean flag = false;
			String inputId;
			String pw,retry;
			Scanner sc = new Scanner(System.in);
			do {
//				flag = false;
				System.out.print("id�Է�: ");
				inputId = sc.next();
				
				System.out.print("pw�Է�: ");
				pw = sc.next();
				
				list.add(new Person(inputId,pw));
				System.out.println(list);
				
				System.out.print("���?");
				retry = sc.next();
				if(retry.equals("n"))
					break;
			}while(true);
			System.out.println("���α׷��� �����մϴ�.");
			
	}

}
