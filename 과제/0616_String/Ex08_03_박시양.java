import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;

	Person2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

}

public class Ex08_03_박시양 {


	public static void main(String[] args) {

		//		Person2 p1 = new Person2("kim", "1234", "김연아");
		//		Person2 p2 = new Person2("park", "3456", "박나래");
		//		Person2 p3 = new Person2("song", "9786", "송중기");

		//		Scanner sc = new Scanner(System.in);
		//		
		//		System.out.println("아이디를 입력 하세요.");
		//			String inputId = sc.next();
		//			
		//		System.out.println("비밀번호를 입력 하세요.");
		//			String inputIPw = sc.next();

		Scanner sc = new Scanner(System.in);

		Person2[] p = { new Person2("kim", "1234", "김연아"),
						new Person2("park", "3456", "박나래"),
						new Person2("song", "9876", "송중기")};

		do {
			System.out.println("아이디를  입력하세요.");
			String id = sc.next();
			System.out.println("비밀번호 입력.");
			String pw = sc.next();
			String yes = "y";
			

			if(id.length() < 3 || id.length() > 8  ) {
				System.out.println("Id는 최소 4~8자 입니다.");	
				continue;
			}
			else if(id.equals(p[0].id) && pw.equals(p[0].pw)) {
				System.out.println("맞습니다.");
				System.out.println("계속 하시겠습니까? y/n");
				String y = sc.next();
				
				if(y.equals(yes)) {
					continue;
				}else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}	
				
			}
			else if(id.equals(p[1].id) && pw.equals(p[1].pw)) {
				System.out.println("맞습니다.");
				System.out.println("계속 하시겠습니까? y/n");
				String y = sc.next();
				
				if(y.equals(yes)) {
					continue;
				}
				else {
					System.out.println("프로그램을 종료합니다.");
					break;
					}
				}
				else if(id.equals(p[2].id) && pw.equals(p[2].pw)) {
				System.out.println("맞습니다.");
				System.out.println("계속 하시겠습니까? y/n");
				String y = sc.next();
				if(y.equals(yes)) {
					continue;
				}
				
				else {
					System.out.println("프로그램을 종료합니다.");
					break;
					}
				
			}
				else {
				System.out.println("틀렸습니다.");
				
			}
				sc.close();
		} while (true);
	}			
}

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