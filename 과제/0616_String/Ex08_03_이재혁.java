import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;

	public Person2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name =name;
	}
}
public class Ex08_03_이재혁 {
	public static void main(String[] args) {


		//		Person2 p1 = new Person2("kim","1234","김연아"); 
		//		Person2 p2 = new Person2("park","3456","박나래"); 
		//		Person2 p3 = new Person2("song","9876","송중기"); 

		Person2[] p = {new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("song","9876","송중기")};
		
		Scanner sc=new Scanner(System.in);

		String Re="";
		int i;
		do {
			System.out.print("ID 입력:");
			String inputId=sc.next();
			if(inputId.length()<3 || inputId.length()>8) {
				System.out.println("ID는 3~8글자 입력해야 합니다.");
				continue;
			} 
			System.out.print("Password 입력:");
			String inputPw=sc.next();

			boolean fh=false;
			for(i=0;i<p.length;i++) {
				if(inputId.equals(p[i].id)) {
					fh=true;
					if(inputPw.equals(p[i].pw)) {
						System.out.println(p[i].name+"님 반갑습니다.");
					} else {
						System.out.println("비밀번호가 맞지 않습니다.");
					}
				} 
			}
			if(!fh) {
				System.out.println("해당 아이디가 없습니다.");
			}
			System.out.print("계속(Y/N):");
			Re=sc.next();
			if(Re.equals("y") || Re.equals("Y")) {
				continue;
			} else {
				break;
			}
		} while(true);
		System.out.println("프로그램을 종료합니다.");


	}//main

}//class

//id입력:park
//pw입력:3456
//박나래님 반갑습니다.
//계속?y
//id입력:pa
//id는 3글자~8글자 입력해야 합니다.
//id입력:dlsfjsldfjslf
//id는 3글자~8글자 입력해야 합니다.
//id입력:kim
//pw입력:9999
//비번이 맞지 않습니다.
//계속?y
//id입력:choi
//pw입력:3223
//해당 아이디가 없습니다.
//계속?n
//프로그램을 종료합니다.