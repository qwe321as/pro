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

public class Ex09_04_��ûȣ {
	public static void main(String[] args) {
		
		
//		Person p1 = new Person("kim","1234");	//��ü�� ���� �� ArrayList�� ���
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
			System.out.println("���?");
			
			retry =sc.next();
			
			if(retry.equalsIgnoreCase("n")) {
				
				System.out.println(list.toString());
				break;
			}
				
				
		}while(true);
		System.out.println("���α׷� ����");
		
		
		
		
		
		
		
	}

}
//ID: JUNG
//PW : 1212
//���? Y
//ID : WON
//PW : 9988
//���? N
//����� : [kim/1234, park/5678, choi/9999, jung/1212, won/9988]
