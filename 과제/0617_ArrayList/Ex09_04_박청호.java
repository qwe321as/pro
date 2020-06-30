import java.util.ArrayList;
import java.util.Scanner;
//Object -> public String toString;
class Person{
	String id;
	String pw;
	Person(String id, String pw){
		super();
		this.id = id;
		this.pw = pw;
		
	}
	 public String toString() {
		return id + "/" + pw;
	}
}

public class Ex09_04_박청호 {
	public static void main(String[] args) {
		
		
//		Person p1 = new Person("kim","1234");	//객체를 생성 후 ArrayList로 사용
//		Person p2 = new Person("park","5678");
//		Person p3 = new Person("choi","9999");
		
		ArrayList<Person> list = new ArrayList<Person>();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
		int i;
		String inputid, PW, retry;
		Person[] p = {new Person("kim","1234"),
				  	  new Person("park","5678"),
				  	  new Person("choi","9999"),
				  	 
				  
					};
		
		for(i=0;i<p.length;i++) {
			list.add(p[i]);
		}
	
		System.out.println(list.toString());
//		System.out.println(list.get(1));
		Person one = list.get(1);
		System.out.println("one" + one.toString());
		System.out.println("----------------");
		
		for(i=0;i<p.length;i++) {
			System.out.println(list.get(i));
		}
        System.out.println("-------------");
        ArrayList<Person> rr = new ArrayList<Person>();
    
//        rr.add(new Person("jung","1212"));
//        rr.add(new Person("won","9988"));
//        list.addAll(rr);
//      
        
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("ID:");
			inputid=sc.next();
			System.out.println("PW:");
			PW=sc.next();
			
			list.add(new Person(inputid , PW));
			System.out.println("계속?");
			
			retry =sc.next();
			
			if(retry.equalsIgnoreCase("n")) {
				
				System.out.println(list.toString());
				break;
			}
				
				
		}while(true);
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
	}

}
//ID: JUNG
//PW : 1212
//계속? Y
//ID : WON
//PW : 9988
//계속? N
//결과값 : [kim/1234, park/5678, choi/9999, jung/1212, won/9988]
