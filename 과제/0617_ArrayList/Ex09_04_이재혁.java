import java.util.ArrayList;
import java.util.Scanner;
//Object -> String, toSring()
class Person{
	String id;
	String pw;
	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;		
	}
	public String toString() { //�������̵� �θ� �ٲ�
		return id+"/"+pw;
	}

}
public class Ex09_04_ArrayList {
	public static void main(String[] args) {

//				Person p1 = new Person("kim","1234");
//				Person p2 = new Person("park","5678");
//				Person p3 = new Person("choi","9999");

		Person[] p = {new Person("kim","1234"),
				new Person("park","5678"),
				new Person("choi","9999")};
	
		ArrayList<Person> list = new ArrayList<Person>();
//				list.add(p1);
//				list.add(p2);
//				list.add(new Person("choi","9999"));
		int i;
		for(i = 0;i<p.length;i++) {
			list.add(p[i]);

		}

		System.out.println("list:"+list.toString());
				System.out.println(list.get(1));
		Person one = list.get(1);
		System.out.println("one:"+one.toString());

		for(i = 0;i<p.length;i++) {
			System.out.println(list.get(i));
		}

		System.out.println("��������");
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("ID�Է�:");
			String inputId = sc.next();

			System.out.print("PW�Է�:");
			String inputPw = sc.next();
			
			 list.add(new Person(inputId,inputPw));
//			addElement()
			
//			for(i=0;i<list();i++) {
//				if(p[i].id.equals(inputId)) {
//					ip=true;
//					if(p[i].pw.equals(inputPw)) {
//						System.out.println("�α��� �Ϸ�");
//						break;
//					}
//					else {
//						System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");
//					}
//				}
//			}
//		
		System.out.print("����Ͻðڽ��ϱ�?(Y/N)");
		String re = sc.next();
		if(re.equalsIgnoreCase("y")) {
			continue;}
		else {
			break;
		}
		
		}
		while(true);
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("list:"+list.toString());
		
		
		//	        	[kim/1234, park/5678, choi/9999]
		//				park/5678
		//				one:park/5678
		//				kim/1234
		//				park/5678
		//				choi/9999
		//				������� ��������
		//				ID:jung
		//				PW:1212
		//				���?y
		//				ID:won
		//				PW:9988
		//				���?n
		//				[kim/1234, park/5678, choi/9999, jung/1212, won/9988]

		
	}//main

}//class