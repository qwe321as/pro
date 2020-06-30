import java.util.Scanner;

class Person2{
	
	String id;
	String pw;
	String name;
	
	Person2(String id,String pw,String name){
		this.id=id;
		this.pw=pw;
		this.name=name;
	}
	
	
}

public class Ex_08_03_이은찬 {
	public static void main(String[] args) {
		
		Person2[] p = {new Person2("kim","1234","김연아"),
		               new Person2("park","3456","박나래"),
		               new Person2("song","9876","송중기")
		            };
		
//		System.out.println(p[0].id);
//		System.out.println(p[1].id);
//		System.out.println(p[2].id);
		
		Scanner sc = new Scanner(System.in);
		String inputId,pw,retry;
		boolean flag = false;
		
		int i;
		do {
			flag = false;
			System.out.print("id를 입력하세요:");
			inputId = sc.next();
			if(inputId.length()<3 || inputId.length()>3) {
				System.out.println("id는 3글자~8글자로 입력해야 합니다.");
				continue; // while의 조건으로 돌아감(맨 밑 조건)
			}
			
			System.out.print("비밀번호를 입력하세요:");
			pw = sc.next();
			
			for(i=0;i<p.length;i++) {
				if(p[i].id.equals(inputId)) {
					flag = true;
					if(p[i].pw.equals(pw)) {
						System.out.println(p[i].name+"님 반갑습니다.");
//						flag = true;
						break; // if문이 아닌 반복문(for)을 빠져나감
					
					}
					else {
						System.out.println("비번이 맞지 않습니다.");
//						flag = true;
					}
				}
//				else {
//					System.out.println("해당 아이디가 없습니다.");
//				}
			}//for
			
			if(flag == false) {
				System.out.println("해당 아이디가 없습니다.");
			}
			System.out.print("계속 하려면y");
			retry = sc.next();
			if(retry.equalsIgnoreCase("n"))
				break;
			
				
			
		}while(true);
		System.out.println("프로그램을 종료합니다.");
		

	}// main

}
// id,pw 입력 박나래님 반갑습니다. 계속하려면y, 아니면 no, 비번이 맞지 않습니다. 해당 아이디가 없습니다. 계속n, 프로그램을 종료합니다.
// id를 두글자 넣었더니 id는 3글자~8글자 사이로 입력해야 합니다. id 다시 입력, do while 문