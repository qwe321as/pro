import java.util.ArrayList;
import java.util.Scanner;

class Person_c{
	String id;
	String pw;

	public Person_c(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String toString() {
		return id+"/"+pw;
	}

}
public class Ex09_04_양경원 {

	public static void main(String[] args) {

		//		Person_b p1 = new Person_b("kim","1234");
		//		Person_b p2 = new Person_b("park","5678");
		//		Person_b p3 = new Person_b("choi","9999");
		Person_b p1[]= {new Person_b("kim","1234"),
				new Person_b("park","5678"),
				new Person_b("choi","9999")};

		ArrayList<Person_b> list = new ArrayList<Person_b>();
		for(int i=0; i<p1.length;i++) {
			list.add(p1[i]);
		}

		System.out.println(list);


		Scanner sc = new Scanner(System.in);
		
		String id, pw, yn;
		do {

			System.out.print("ID : ");
			id = sc.next();
			System.out.print("PW : ");
			pw = sc.next();

			list.add(new Person_b(id, pw));
			System.out.println(list);
			System.out.print("계속 ? ");
			
			yn = sc.next();
			if(yn.equalsIgnoreCase("n")) {
				System.out.println(list.toString());
				System.out.println("프로그램 종료");
				break;
			}
		}while(true);

		//		list.add(p1);// -> true
		//		list.add(p2);
		//		list.add(new Person_b("choi","9999"));

		//		System.out.println(list.get(0).id+","+list.get(0).pw);
		//		System.out.println(list.get(0).pw);
		//		System.out.println(list.toString());
		//		System.out.println(list.get(1));
		//		Person_b one = list.get(1);
		//		System.out.println("one: "+ one);
		//		System.out.println("one: "+ one.toString());
		//		System.out.println(list.get(1));

		//		for(int i=0; i<p1.length;i++) {
		//			System.out.println(list.get(i));
		//		}






	}

}



