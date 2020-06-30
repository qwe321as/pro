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
	
	public String toString() {				// 오버라이딩 부모가 public이면 자식도 public
		return id + "-" + pw;
	}
}

public class Ex09_04_송정호 {

	public static void main(String[] args) {
		
//		Person p1 = new Person("kim", "1234");
//		Person p2 = new Person("park", "5678");
//		Person p3 = new Person("choi", "9999");
		Person p[] = {new Person("kim", "1234"), new Person("park", "5678"), new Person("choi", "9999")};
		
		ArrayList<Person> list = new ArrayList<Person>();		// 객체타입에 따라 메서드가 달라진다.
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
			
			System.out.print("계속 ? ");
			yorn = sc.next();
			if(yorn.equalsIgnoreCase("n")) {
				System.out.println(list.toString());
				System.out.println("프로그램 종료");
				break;
			}
		}while(true);
	}

}
