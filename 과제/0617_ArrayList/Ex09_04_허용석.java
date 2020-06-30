import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String id;
	String pw;
	
	public Person(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String toString() {
		return id+"/"+pw;
	}
	
}
public class Ex09_04_허용석 {
	public static void main(String[] args) {
		
		String inputId,inputPw;
		ArrayList<Person> al=new ArrayList<Person>();
		
		String reStart;
		int i=0;
		boolean endFlg=true;
		do {
			Scanner sc=new Scanner(System.in);

			System.out.print("아이디 입력:");
			inputId=sc.next();
			if(inputId.length()<3 || inputId.length()>8) {
				System.out.println("id는 3~8글자 입력해야 합니다.");
				continue;
			} 
			System.out.print("비번 입력:");
			inputPw=sc.next();
			
			Person p= new Person(inputId, inputPw);
			al.add(p);

			do {
				System.out.print("계속(y/n)");
				reStart=sc.next();
				if(reStart.equalsIgnoreCase("y")) {
					break;
				} else if(reStart.equalsIgnoreCase("n")) {
					endFlg=false;
					sc.close();
					break;
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} while(endFlg);
		} while(endFlg);
		System.out.println("프로그램을 종료합니다.");
		System.out.println(al.toString());
	}

}
//ID:jung
//PW:1212
//계속?y
//ID:won
//PW:9988
//계속?