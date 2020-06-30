import java.util.ArrayList;
import java.util.Scanner;
//object - > public String toString()
class person1{
	
	String sid;
	String spw;
	
	public person1(String sid, String spw) {
		// TODO Auto-generated constructor stub
		this.sid = sid;
		this.spw = spw;
		
	}
	public String toString() {
		return sid+"/"+spw;
		//부모를 가진  objectsms publicdmf rkwlrh dlTEk
	}
}
class person{
	String id;
	String pw;
	
	
	public person(String id, String pw) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.pw = pw;

	}
	public String toString() {
		return id+"/"+pw;
		//부모를 가진  objectsms publicdmf rkwlrh dlTEk
	}
}
public class ex09_04_인정배 {
	public static void main(String[]args) {
		//		person p1 = new person("kim","1234");
		//		person p2 = new person("park","5678");
		//		person p3 = new person("choi","9999");
		person [] p = {new person("kim","1234")
				, new person("park","5678")
			,new person("choi","9999")	};
				ArrayList<person> sd = new ArrayList<person>();

//				sd.add(p);
//				sd.add(p2);
//				sd.add(p3);
//				System.out.println(sd.toString());
			int i ;
		for(i=0;i<p.length;i++) {
			sd.add(p[i]);
			System.out.println(sd.get(i)+"\n");
				
			}
		System.out.println("와"+sd.toString());	
		System.out.println("와"+sd.get(1));
		
		Scanner sc = new Scanner (System.in);
	boolean flag = false;
	
	String sid = null,spw = null,retry;

	ArrayList<person1> sda = new ArrayList<person1>();
		do {
		
		
			
		
		System.out.print("idghfh:");
		sid  = sc.next();
		System.out.print("pwgfhgf:");
		spw  = sc.next();
			
		person1 asdf= new person1(sid,spw);
		sda.add(asdf);
		System.out.print("계속?");
		retry = sc.next();
		if(retry.equalsIgnoreCase("n")) {
		
		System.out.println(sda.toString());
		break;
		
		
		}
		
		
		
	}while(true);

		}

		}



//[kim/1234, park/5678, choi/9999]
//		park/5678
//		one:park/5678
//		kim/1234
//		park/5678
//		choi/9999
//		ID:jung
//		PW:1212
//		계속?y
//		ID:won
//		PW:9988
//		계속?n
//		[kim/1234, park/5678, choi/9999, jung/1212, won/9988]

	


