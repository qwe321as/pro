import java.util.ArrayList;
import java.util.Scanner;
//object -> public String toString()
class Person{
	String id;
	String pw;
	public Person(String id,String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public	String toString() { // 
		return id+"/"+pw;
	}
}

public class Ex09_04_문태승 {
	public static void main(String[] args) {

		//		Person p1 = new Person("kim","1234");
		//		Person p2 = new Person("park","5678");
		//		Person p3 = new Person("choi","9999");

		Person[] p = {new Person("kim","1234"),
				new Person("park","5678"),
				new Person("choi","9999")

		};

		ArrayList<Person> list = new ArrayList<Person>();
		//		list.add(p1);
		//		list.add(p2);
		//		list.add(p3);
		int i;
		for(i=0;i<p.length;i++) {
			list.add(p[i]);
		}

		System.out.println(list.toString());
		System.out.println(list.get(1));
		Person one = list.get(1);
		System.out.println("one:"+one.toString()); 

		for(i=0;i<p.length;i++) {				
			System.out.println(list.get(i));	
		}			

		Scanner sc = new Scanner(System.in);
		String inputId;
		String inputPw;
		do {
			System.out.print("ID:");
			inputId = sc.next();
			System.out.print("pw:");
			inputPw = sc.next();
			
			list.add(new Person(inputId, inputPw));
			
			System.out.println("계속?");
			String yn = sc.next();
			
			if(yn.equals("n")) {
				System.out.println(list.toString());
				System.out.println("종료합니다.");
				break;
			}
		}
		while(true);
	
	}

}



//[kim/1234, park/5678, choi/9999]
//park/5678
//one:park/5678
//kim/1234
//park/5678
//choi/9999
//여기부터 과제시작
//ID:jung
//PW:1212
//계속?y
//ID:won
//PW:9988
//계속?n
//[kim/1234, park/5678, choi/9999, jung/1212, won/9988]




