import java.util.ArrayList;
import java.util.Scanner;
//object->public String toString()
class Person{
	String id;
	String pw;
	Person(	String id,String pw){
		super();
		this.id=id;
		this.pw=pw;
	}
	public String toString() {
		return id+"/"+pw;
	}
}

public class Ex09_04_정주원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//		Person p1 = new Person ("kim","0201");
		//		Person p2 = new Person ("park","0205");
		//		Person p3 = new Person ("lee","0606");

		Person[]p =  {new Person ("kim","0201"),
					  new Person("park","0205"),
					  new Person("lee","0606")};

			ArrayList<Person> list = new ArrayList<Person>();
			
			
			//		list.add(p1);
			//		list.add(p2);
			//		list.add(p3);
			
			int i;
			String retry;
			boolean g=false;
			
			for(i=0;i<p.length;i++) {
				list.add(p[i]);
			}

			System.out.println(list.toString());
			System.out.println(list.get(1));
			Person one = list.get(1);//자료형 get 에 마우스 대보기
			System.out.println("one:"+one.toString());
			
			for(i=0;i<p.length;i++) {
				System.out.println(i+":"+list.get(i));
			}
			
			
			do {
				g=false;
			System.out.println("ID:");
			String id =sc.next();
			System.out.println("PW:");
			String pw =sc.next();
			
			list.add(new Person(id,pw));
			
			
			
			System.out.println("계속?");
			retry=sc.next();
			if(retry.equalsIgnoreCase("n"))
				break;
		
				
		
			}while(true);
			
			
			System.out.println(list.toString());
			
//			ID:jung
//			PW:1212
//			계속?y
//			ID:won
//			PW:9988
//			계속?n
//			[kim/1234, park/5678, choi/9999, jung/1212, won/9988]


	}

}
