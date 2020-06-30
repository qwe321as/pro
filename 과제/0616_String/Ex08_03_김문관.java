import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;

	Person2(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	void show() {
		System.out.println(name + "님 반갑습니다.");
	}
}



public class Ex08_03_김문관 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Person2[] p = {
				new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("song","9876","송중기")
		};


		do {
			System.out.print("id입력 :");
			String inputId = scan.next();
			if(inputId.length() < 3 || inputId.length() > 8) {
				System.out.println("id는 3~8글자 사이 입니다.");
				continue;
			}
			System.out.print("비번입력 :");
			String inputPw = scan.next();
			
			for(int i = 0; i < p.length; i++) {
				if(p[i].id.equals(inputId)) {
					if(p[i].pw.equals(inputPw)) {
						p[i].show();
						break;
					}
					else {
						System.out.println("비밀번호가 틀렸습니다.");
						break;
					}
				
				}
				else if(i == 2) {
					System.out.println("id가 없습니다");
				}else {
					continue;
				}
			}
			
			
			
			System.out.print("계속?");
			String ing = scan.next();
			if(ing.equals("y") || ing.equals("Y")) {
				continue;
			}else if(ing.equals("n") || ing.equals("N")) {
				break;
			}else {
				System.out.println("y(Y) 또는 n(N)만 입력 가능 합니다.");
				continue;
			}

		}while(true);
		System.out.println("시스템을 종료 합니다.");
	}
}
