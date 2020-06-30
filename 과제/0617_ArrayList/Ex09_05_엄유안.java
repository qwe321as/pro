import java.util.ArrayList;
import java.util.Scanner;

import Login.IdList;

class Login{
	String id; 
	String pw;
	public Login(String id, String pw){
		this.id=id;
		this.pw=pw;
	}
	public String toString() {
		return id+ "/"+pw;
	}
}	
class IdList{
	String idpw;
	public IdList(String idpw) {
		this.idpw=idpw;
	}
}


public class Ex09_05_엄유안 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Login[] lo = { new Login("kim","1234"), 
				new Login("park","5678"), 
				new Login("choi","9999")
		};

		ArrayList<Login> list = new ArrayList<Login>();
		int i;
		
		String id, pw, retry;
		for(i=0;i<lo.length;i++) {
			list.add(lo[i]);
		}
		System.out.println(list.toString());
		System.out.println();
		for(i=0; i<lo.length; i++) {
			System.out.println(list.get(i));
		}


		IdList[] il = { new IdList("Id"),
				new IdList("Pw")
				new IdList("retry")
		};

		for(i=0; i<il.length; i++) {
			System.out.print("Id: ");
			id = sc.next();
			System.out.print("Pw: ");
			pw = sc.next();
			System.out.print("계속?");
			retry = sc.next();
			if(retry.equalsIgnoreCase("n"))
				break;
		}
		System.out.println(list.toString());
	}	

}

