import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;
	
	Person2(String id,String pw,String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
		
	}
	void display() {
		System.out.println(name+"님 안녕하세요");
	}
	
	
	
	
}

public class Ex08_03_박근주 {

	public static void main(String[] args) {
		
		Person2[] p = { new Person2("kim","1234","김연아"),
						new Person2("park","1020","박근주"),
						new Person2("song","9876","송중기")};
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("아이디 입력:");
			String idput = sc.next();
			if(3>idput.length()||idput.length()>8) {
				System.out.println("아이디가 3~8글자 안 입력");
				continue;
				
				
			}
			
			System.out.print("비밀번호 입력:");
			String pwput = sc.next();
			
			
				if(idput.equals(p[0].id)&&pwput.equals(p[0].pw)) {
				p[0].display();
				System.out.print("계속?(y or x)");
				String next2 = sc.next();
				if(next2.equalsIgnoreCase("y")) {
					continue;
				}
				else if(next2.equalsIgnoreCase("x")) {
					System.out.println("프로그램 종료");
					break;
				}
				
				
				
			}
			else if(idput.equals(p[1].id)&&pwput.equals(p[1].pw)) {
				p[1].display();
				System.out.print("계속?(y or x)");
				String next2 = sc.next();
				if(next2.equalsIgnoreCase("y")) {
					continue;
				}
				else if(next2.equalsIgnoreCase("x")) {
					System.out.println("프로그램 종료");
					break;
				}
				
			}
			else if(idput.equals(p[2].id)&&pwput.equals(p[2].pw)) {
				p[2].display();
				System.out.print("계속?(y or x)");
				String next2 = sc.next();
				if(next2.equalsIgnoreCase("y")) {
					continue;
				}
				else if(next2.equalsIgnoreCase("x")) {
					System.out.println("프로그램 종료");
					break;
					
				}
				
			}
				for(int c=0; c<p.length;c++) {
					if(idput.equals(p[c].id)==false) {
						
					}
				}
			System.out.println("해당 아이디 또는 비밀번호가 틀립니다.");
				
				
			//else 큰 틀
			
			
			
			
		}while(true);
		
		
		
		//id는 3글자~8글자 입력해야합니다
		//해당 아이디가 없습니다
		//비번이틀리면 맞지않는다
		
		//id 입력
		//pw입력
		//name 출력
		//계속?
		
		
		
	}

}
