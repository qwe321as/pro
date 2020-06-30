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
	public String toString() { // Object가 가지고있는 toString()은 public을 가지고있음. public 작성해야함.
		return id+"/"+pw;	   // Object toString()이 가지고있는건 주소리턴임. 쓰기싫으면 다시 메서드 작성해야함.
	}
	
}
public class Ex09_04_김범규 {

	public static void main(String[] args) {

//		Person p1 = new Person("kim","1234");
//		Person p2 = new Person("park","5678");
//		Person p3 = new Person("choi","9999");
		int i;
		
		Person p [] = {new Person ("kim","1234"),
					   new Person ("park","5678"),
					   new Person ("choi","9999")
					  };
		
		ArrayList<Person> list = new ArrayList<Person>(); // <> 내가 만든 클래스 형태의 객체도 넣을수있음.
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);

//		System.out.println(list.toString());
		
		
			for(i=0;i<p.length;i++) {
					list.add(p[i]);
			}
			System.out.println(list.toString()); // 데이터 전체출력
			System.out.println(list.get(1)); // 1번째 방에있는 데이터 출력방법
			Person one = list.get(1);
			System.out.println("one:" + one.toString()); // 1번째 방에있는 데이터 출력방법
			
			for(i=0;i<p.length;i++) {
				System.out.println(list.get(i)); // 0번째 가지고와서 출력, 1번째 가지고와서 출력, 2번째 가지고와서 출력
			}
			
			
//			boolean flag = false;
			String inputId;
			String pw,retry;
			Scanner sc = new Scanner(System.in);
			do {
//				flag = false;
				System.out.print("id입력: ");
				inputId = sc.next();
				
				System.out.print("pw입력: ");
				pw = sc.next();
				
				list.add(new Person(inputId,pw));
				System.out.println(list);
				
				System.out.print("계속?");
				retry = sc.next();
				if(retry.equals("n"))
					break;
			}while(true);
			System.out.println("프로그램을 종료합니다.");
			
	}

}
