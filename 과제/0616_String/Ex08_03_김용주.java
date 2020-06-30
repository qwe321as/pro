import java.util.Scanner;

class Person2{

	private String id;
	private String pw;
	private String name;

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	} 



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Person2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	void display(){
		
	}



}// Person2


public class Ex08_03_김용주 {

	public static void main(String[] args) {

		int i = 0;
		String y="y" , n="n";

		Scanner sc = new Scanner(System.in);

		Person2 p1 = new Person2("kim","1234","김연아");
		Person2 p2 = new Person2("park","3456","박나래");
		Person2 p3 = new Person2("song","9876","송중기");

		Person2 [] p = {new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("song","9876","송중기")
		};

		do {
			System.out.print("ID 입력: ");
			String id = sc.next();
			
			if(id.length() < 3 || id.length() > 8) {
				System.out.println("id는 3글자 ~ 8글자 입력해야합니다.");
				continue;
			}
			
			else if(! (id.equals(p[0].getId()) || id.equals(p[1].getId()) || id.equals(p[2].getId()))){	
				System.out.println("해당 아이디가 없습니다.");
				continue;
			}
			
			System.out.print("PW 입력: ");
			String pw = sc.next();
			
			if(! (pw.equals(p[0].getPw()) || pw.equals(p[1].getPw()) || pw.equals(p[2].getPw()))){
				System.out.println("비밀번호가 맞지 않습니다.");
				continue;
			}
			else if(id.equals(p[0].getId()) && pw.equals(p[0].getPw())) {
				
				System.out.println(p[0].getName()+"님 반갑습니다.");
				System.out.println("계속?");
				String yes = sc.next();
				if(y.equals(yes)) {
					continue;
				}
				else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}					
			}
			else if(id.equals(p[1].getId()) && pw.equals(p[1].getPw())) {
				
				System.out.println(p[1].getName()+"님 반갑습니다.");
				System.out.println("계속?");
				String yes = sc.next();
				if(y.equals(yes)) {
					continue;
				}
				else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}					
			}
			else if(id.equals(p[2].getId()) && pw.equals(p[2].getPw())) {
				
				System.out.println(p[2].getName()+"님 반갑습니다.");
				System.out.println("계속?");
				String yes = sc.next();
				if(y.equals(yes)) {
					continue;
				}
				else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}					
			}
			System.out.println("프로그램을 종료합니다.");
			break;

		}while(true);


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

