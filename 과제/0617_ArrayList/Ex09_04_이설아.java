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
	public String toString() {                      //<4> Person은 이제 새로운기능의 toString()이 생김
		return id+"/" +pw;
	}

}
public class Ex09_04_이설아 {
	public static void main(String[] args) {


		ArrayList<Person> list = new ArrayList<Person>(); 

		Person[] p = {new Person("kim","1234"), 
				new Person("park","5678"), 
				new Person("choi","9999")};
		int i;
		for(i=0; i<p.length; i++) {
			list.add(p[i]);
		}

		//입력한 id,pw Person객체를 만들어서 ArrayList에 추가
		//계속?n 누르면 그동안 추가된것들 출력

		Scanner sc = new Scanner (System.in);
		do {
			System.out.print("id입력: ");
			String inputId = sc.next();
			System.out.print("pw입력: ");
			String inputPw = sc.next();
			list.add(new Person(inputId ,inputPw ));
			
			System.out.print("계속?");
			String retry = sc.next();

			if (retry.equalsIgnoreCase("n")) 
				break;

		}while(true);
		System.out.println("시스템 종료");
			System.out.println(list);
		

	}

}
