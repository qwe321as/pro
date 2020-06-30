// 생성한 객체에 toString이 없음. -> 오버로딩 시켜줌.
import java.util.*;

class Person{
	String id;
	String pw;

	Person(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	public String toString(){
		return "("+id+","+pw+")";
	}
}
public class Ex09_04_김용승 {
	public static void main(String[] args) {

		int i;
		String inputId;
		String inputPw;
		String retry;
		boolean flag;

		Person p1 = new Person("kim","1234");
		Person p2 = new Person("park","5678");
		Person p3 = new Person("choi","9999");

		ArrayList<Person> list = new ArrayList<Person>();

		Person[] p= {new Person("kim","1234"),new Person("park","5678"),
				new Person("choi","9999")
		};

		for(i=0;i<p.length;i++) {
			list.add(p[i]);
		}

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("ID 입력:");
			inputId = sc.next();
			System.out.print("PW 입력:");
			inputPw = sc.next();
			list.add(new Person(inputId,inputPw));
			do {
				System.out.print("계속?");
				sc = new Scanner(System.in);
				retry = sc.next();
				if(retry.equalsIgnoreCase("y")) {
					flag = true;
					break;
				}
				else if(retry.equalsIgnoreCase("n")) {
					System.out.println(list);
					flag = false;
					break;
				}
				else {
					System.out.println("[y(Y)/n(N)]을 입력해주세요.");
				}
			}
			while(true);
			if(flag) continue;
			else break;
		}
		while(true);

	}

}



