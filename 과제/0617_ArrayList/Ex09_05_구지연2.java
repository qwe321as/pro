import java.util.ArrayList;
import java.util.Scanner;
class Member1{
	String id;
	String pw;
	
	Member1(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	public String toString() {
		return id +"," + pw;
	}
	
}
public class Ex09_05_구지연2 {
	public static void main(String[] args) {
		
		
		 Member1 [] m = { new Member1("kim","1234"),
						new Member1("park","5678"),
						new Member1("choi","9999"),
						new Member1("jung","1212"),
						new Member1("won","9988")
					};
		 

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Member1> list = new ArrayList<Member1>();
		int i;
		
		for(i=0;i<m.length;i++) {
			list.add(m[i]);
		}
		
		
		do {
			System.out.print("ID: ");
			String inputId = sc.next();
				
	
					System.out.print("PW: ");
					String inputPw = sc.next();

				
			System.out.println("계속?(y/n) ");
			String retry = sc.next();
				if(retry.equalsIgnoreCase("n"))
					break;
		
		}while(true);
		
		System.out.println(list);
		
	}
}
//ID:jung
//PW:1212
//계속?y
//ID:won
//PW:9988
//계속?n
//[kim/1234, park/5678, choi/9999, jung/1212, won/9988]


