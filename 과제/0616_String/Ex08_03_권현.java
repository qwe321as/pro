import java.util.Scanner;

class Person2 {
	String id;
	String pw;
	String name;

	public Person2(String id, String pw, String name) {
		this.id= id;
		this.pw=pw;
		this.name=name;
	}

}//Person class

public class Ex08_03_권현 {
	public static void main(String[] args) {
		int isIdOK = 0;
		int isPwOK = 0;
		String inputId;
		String inputPw;
		String RealuserID="";
		int i;

		Person2[] p = {new Person2("kim","1234","김연아"),
				       new Person2("park","3456","박나래"),
				       new Person2("song","9876","송중기")
		              };

		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.print("id입력:");
			inputId = sc.next();

			//id갯수 설정
			if(inputId.length()<3 || inputId.length()>8){
				System.out.println("id는 3글자~8글자 입력해야 합니다.");
				continue;
			}
			else{
				System.out.print("pw입력:");
				inputPw = sc.next();
			}


			//id와pw가 일치할때, 일치안할때
			for (i=0;i<p.length;i++) {

				if (p[i].id.equals(inputId) && p[i].pw.equals(inputPw)) {
					isIdOK=1;
					isPwOK=1;
					RealuserID = p[i].name;
					break;
				}
				else if(p[i].id.equals(inputId) && !p[i].pw.equals(inputPw)==false){
					isIdOK=1;
					isPwOK=0;
					break;
				}
				else {
					isIdOK=0;
				}
			}

			if (isIdOK==1 && isPwOK==1) {
				System.out.println(RealuserID+"님 반갑습니다.");
			}
			else if(isIdOK==1 && isPwOK==0) {
				System.out.println("비밀번호가 맞지 않습니다.");
			}
			else {
				System.out.println("해당 아이디가 없습니다");
				
			}

			//계속?  y-->id입력//n-->"프로그램을 종료합니다."
			System.out.print("계속?");
			String s = sc.next();
			if(s.equalsIgnoreCase("y")) {
				continue;
			}
			else if(s.equalsIgnoreCase("n")) {
				break;
			}
			else {
				System.out.println("잘목된 입력입니다.");
				break;
			}

		}//while
		System.out.println("프로그램을 종료합니다.");


	}//main

}//class




//id입력:park
//pw입력:3456
//박나래님 반갑습니다.
//계속?:y

//(id만 갯수체크..)
//id입력:pa
//id는 3글자~8글자 입력해야 합니다.
//id입력:dlsfjsldfjslf
//id는 3글자~8글자 입력해야 합니다.


//id입력:kim
//pw입력:9999
//비번이 맞지 않습니다.
//계속?:y
//id입력:choi
//pw입력:3223
//해당 아이디가 없습니다.
//계속?:n
//프로그램을 종료합니다.


