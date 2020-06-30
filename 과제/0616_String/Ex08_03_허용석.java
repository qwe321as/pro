import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;

	public Person2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
public class Ex08_03_허용석 {
	public static void main(String[] args) {

		Person2[] p= {new Person2("kim","1234","김연아"),
			  	      new Person2("park","3456","박나래"),
				      new Person2("song","9876","송중기")
				     };

		String reStart;
		int i;
		boolean endFlg=true;
		do {
			Scanner sc=new Scanner(System.in);

			System.out.print("아이디 입력:");
			String inputId=sc.next();
			if(inputId.length()<3 || inputId.length()>8) {
				System.out.println("id는 3~8글자 입력해야 합니다.");
				continue;
			} 
			System.out.print("비번 입력:");
			String inputPw=sc.next();

			boolean sw=false;
			for(i=0;i<p.length;i++) {
				if(inputId.equals(p[i].id)) {
					sw=true;
					if(inputPw.equals(p[i].pw)) {
						System.out.println(p[i].name+"님 반갑습니다.");
						break;
					} else {
						System.out.println("비번이 맞지 않습니다.");
					}
				} 
			}
			if(!sw) {
				System.out.println("해당 아이디가 없습니다.");
			}
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
	}
}
