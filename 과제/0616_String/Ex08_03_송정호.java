import java.util.Scanner;

class Person2 {
	
	String id;
	String pw;
	String name;
	
	Person2(String id, String pw, String name){
		
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}

public class Ex08_03_송정호 {

	public static void main(String[] args) {
		
		Person2 p[] = {new Person2("kim", "1234", "김연아"),
					new Person2("park", "3456", "박나래"),
					new Person2("song", "9876", "송중기")};
		
		String inputId;
		String inputPw;
		String yorn;
		
		do {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("아이디 입력 : ");
			inputId = sc.next();
			System.out.print("비밀번호 입력 : ");
			inputPw = sc.next();
			
			for(int i = 0; i < p.length; i++) {
				
				if(inputId.equals(p[i].id)) {
					if(inputPw.equals(p[i].pw)) {
						System.out.println(p[i].name + "님 반갑습니다.");
						break;
					}
					else {
						System.out.println("비밀번호가 틀렸습니다.");
						break;
					}
				}
				else if(i == 2){
					System.out.println("일치하는 아이디가 없습니다.");
					break;
				}
			}
			
			if(inputId.length() <= 2 || inputId.length() > 8) {
				System.out.println("3~8 글자 사이를 입력하세요.");
				continue;
			}
			
			System.out.print("계속 y 종료 n : ");
			yorn = sc.next();
			
			if(yorn.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(yorn.equals("y")) {
				continue;
			}
		}while(true);
	}

}
