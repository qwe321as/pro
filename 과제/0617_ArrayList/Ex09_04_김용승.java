// ������ ��ü�� toString�� ����. -> �����ε� ������.
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
public class Ex09_04_���� {
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
			System.out.print("ID �Է�:");
			inputId = sc.next();
			System.out.print("PW �Է�:");
			inputPw = sc.next();
			list.add(new Person(inputId,inputPw));
			do {
				System.out.print("���?");
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
					System.out.println("[y(Y)/n(N)]�� �Է����ּ���.");
				}
			}
			while(true);
			if(flag) continue;
			else break;
		}
		while(true);

	}

}



