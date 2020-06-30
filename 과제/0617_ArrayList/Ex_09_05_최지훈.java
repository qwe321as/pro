import java.util.ArrayList;
import java.util.Scanner;

class Person2{
	String id;
	String pw;
	
	Person2(String id,String pw){
		this.id=id;
		this.pw=pw;
	}
	public String toString() { 
       
		return id+"/"+pw;
}
}
public class Ex_09_05_최지훈 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Person2> list = new ArrayList<Person2>();
		do {
			
			
			System.out.print("아이디를 입력하세요");
			String inputid = sc.next();
			System.out.println("패스워드를 입력하세요");
			String inputpw = sc.next();
			
			
			
			Person2[] p = {new Person2(inputid,inputpw)};
			
			for(int i=0;i<p.length;i++) {
			list.add(p[i]);
			}
			
		
		System.out.println("끝내려면 n / 계속하려면 y");
		String end = sc.next();
		if(end.equals("y")) {
			continue;
		}
		else if(end.equals("n")) {
			
			break;
		}
		
		}while(true);
		System.out.println("지금까지 입력받은 아이디와 패스워드는 "+list);
		
	
	}//main

}
