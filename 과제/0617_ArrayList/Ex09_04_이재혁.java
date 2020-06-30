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
	public String toString() { //오버라이딩 부모꺼 바꿈
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

		System.out.println("과제시작");
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("ID입력:");
			String inputId = sc.next();

			System.out.print("PW입력:");
			String inputPw = sc.next();
			
			 list.add(new Person(inputId,inputPw));
//			addElement()
			
//			for(i=0;i<list();i++) {
//				if(p[i].id.equals(inputId)) {
//					ip=true;
//					if(p[i].pw.equals(inputPw)) {
//						System.out.println("로그인 완료");
//						break;
//					}
//					else {
//						System.out.println("패스워드가 틀렸습니다.");
//					}
//				}
//			}
//		
		System.out.print("계속하시겠습니까?(Y/N)");
		String re = sc.next();
		if(re.equalsIgnoreCase("y")) {
			continue;}
		else {
			break;
		}
		
		}
		while(true);
		System.out.println("프로그램을 종료합니다.");
		System.out.println("list:"+list.toString());
		
		
		//	        	[kim/1234, park/5678, choi/9999]
		//				park/5678
		//				one:park/5678
		//				kim/1234
		//				park/5678
		//				choi/9999
		//				여기부터 과제시작
		//				ID:jung
		//				PW:1212
		//				계속?y
		//				ID:won
		//				PW:9988
		//				계속?n
		//				[kim/1234, park/5678, choi/9999, jung/1212, won/9988]

		
	}//main

}//class