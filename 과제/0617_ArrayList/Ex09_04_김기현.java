import java.util.ArrayList;
import java.util.Scanner;
// Object -> public String toString
class Person {
	String id;
	String pw;
	
		Person(String id,String pw) {
			this.id = id;
			this.pw = pw;			
		}	
		public String toString() { //부모 접근제어자가 public이기 때문에
			return id+"/"+pw;
		}
}

public class Ex09_04_김기현 {
	public static void main(String[] args) {
	
//		Person p1 = new Person("kim","1234");
//		Person p2 = new Person("park","5678");
//		Person p3 = new Person("choi","9999");
		Scanner sc = new Scanner(System.in);
		Person[] p = { new Person("kim","1234"), 
					   new Person("park","5678"),
					   new Person("choi","9999") 
					 };
			
		
		
		ArrayList<Person> list = new ArrayList<Person>(); //내가 만든 클래스 객체도 넣을 수 있다.
		
		
//		list.add(p1);
//		list.add(p2);
//		list.add(new Person("choi","9999"));
		int i;
		String ID,PW,ne;
		for(i=0;i<p.length;i++) {
			list.add(p[i]);
		}
		
		System.out.println(list.toString()); // person의 toString은 id,pw를 리턴하기 때문에 문자열이 출력된다
		 System.out.println(list.get(1));
		Person one = list.get(1);
		System.out.println("one:"+one.toString()); // one은 참조변수
		System.out.println();
		
		for(i=0;i<p.length;i++) {
			System.out.println(list.get(i));
		}
				
		do{
			
				System.out.print("ID:");
				ID = sc.next();
			
				System.out.print("PW:");
				PW = sc.next();
				
				Person[] p2 =  {new Person (ID, PW)};
				
//				list.add(ID+","+PW);
				for(i=0;i<p2.length;i++) {
					list.add(p2[i]);
//					System.out.println(p2[i]);
				}
	

			System.out.print("계속?");
			ne = sc.next();
			if(ne.equalsIgnoreCase("n")) 
				break;
		
		}while(true);
		
		System.out.println("종료");
		
		System.out.println();
		
		
		System.out.println(list.toString());
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
