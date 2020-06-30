import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String id;
	String pw;
	
	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
		
	public String toString() {
		return id+"/"+pw;
	}

	
}
public class Ex09_04_김용주 {

	public static void main(String[] args) {
//		Person p1 = new Person("kim","1234");
//		Person p2 = new Person("park","5678");
//		Person p3 = new Person("choi","9999");
		Person[] p = {new Person("kim","1234"),
				new Person("park","5678"),
				new Person("choi","9999")
		};
		
		
		ArrayList<Person> list = new ArrayList<Person>();
//		list.add();
//		list.add(p2);
//		list.add(new Person("choi","9999"));
		int i;
		
		for(i=0;i<p.length;i++) {
			list.add(p[i]);
		}		
		
		Person one = list.get(1);				
			
			
		for(i=0;i<p.length;i++) {
			System.out.println(list.get(i));
		}
		do {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID:");
		String a=sc.next();
		System.out.print("pw:");
		String b=sc.next();
		
		System.out.print("계속?");
		String retry = sc.next();
		if(retry.equalsIgnoreCase("y")) {
			for(i=0;i<1;i++) {
//				System.out.println("one:"+one.toString());				
				list.add(new Person(a,b));
				list.toString();
			}
			
		}else{
			for(i=0;i<1;i++) {
			System.out.println(list.add(new Person(a,b)));
			System.out.println(list.toString());
//			System.out.println(list.get(3));
			}
			break;
		}
		
		}while(true);
		
//		[kim/1234, park/5678, choi/9999]
//		park/5678
//		one:park/5678
//		kim/1234
//		park/5678
//		choi/9999
//		여기부터 과제시작
//		ID:jung
//		PW:1212
//		계속?y
//		ID:won
//		PW:9988
//		계속?n
//		[kim/1234, park/5678, choi/9999, jung/1212, won/9988]
	}

}
