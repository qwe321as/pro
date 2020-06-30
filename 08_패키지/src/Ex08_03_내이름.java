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
	
}

public class Ex08_03_내이름 {
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
			System.out.print("id입력:");
			inputId = sc.next();
			if(inputId.length()<3 || inputId.length()>8) {
				System.out.println("id는 3글자~8글자로 입력해야 합니다.");
				continue;
			}
			
			System.out.print("pw입력:");
			pw = sc.next();
			
			for(i=0;i<p.length;i++) {
				if(p[i].id.equals(inputId)) {
					flag = true;
					if(p[i].pw.equals(pw)) {
						System.out.println(p[i].name+"님 반갑습니다.");
//						flag = true;
						break;
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
			
			System.out.print("계속?");
			retry = sc.next();
			if(retry.equalsIgnoreCase("n"))
				break;
			
		}while(true);
		System.out.println("프로그램을 종료합니다.");
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




