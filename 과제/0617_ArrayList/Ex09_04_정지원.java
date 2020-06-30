import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String id;
	String pw;
	public Person(String id, String pw) {
		super();
		this.id=id;
		this.pw=pw;
	}
	public String toString() {
		return id+"/"+pw;
	}


}
public class Ex09_04_정지원 {

	public static void main(String[] args) {
		//		Person p1 = new Person("kim","0201");
		//		Person p2 = new Person("park","0205");
		//		Person p3 = new Person("lee","0802");
		Person[] p= {new Person("kim","0201"),
				new Person("park","0205"),
				new Person("lee","0802")

		};//배열


		ArrayList<Person> list= new ArrayList<Person>();//내가 만든 클래스형태의 객체도 넣을 수 있다.
		//		list.add(p1);
		//		list.add(p2);
		//		list.add(p3);
		//list.add(new Person("fghfgh","12354"))
		int i;
		for(i=0;i<p.length;i++) {
			list.add(p[i]);

		}

		System.out.println(list.toString());
//		System.out.println(list.get(1));
		Person one=list.get(1);
		System.out.println("one:"+one);
		
		for(i=0;i<p.length;i++) {
			System.out.println(list.get(i));//다 가지고 오고싶을 때

		}
		
		
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		String inputId,pw,retry;
		boolean flag=false;
		
		
		do {
			flag=false;
			System.out.println("ID:");
			inputId=sc.next();
			
			System.out.println("PW:");
			pw=sc.next();
			list.add(new Person(inputId, pw));
			
		
			System.out.println("계속?");
			retry=sc.next();
			if(retry.equalsIgnoreCase("n"))
				break;
		
		
		}while(true);
		
		
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		






	}

}
