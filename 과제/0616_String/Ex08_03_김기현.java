import java.util.Scanner;

class Person2{ 
	
	String id;
	String pw;	
	String name;

	Person2(String id,String pw,String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	
}



public class Ex08_03_김기현 {
	public static void main(String[] args) {
		//id pw 입력받아서 일치하면 name님 반갑습니다 (for)  계속하시겠습니까? 비번이맞지 않습니다 계속? 해당아이디가 없습니다 계속? n 프로그램을 종료합니다
//		do while
		
		Scanner sc = new Scanner(System.in);
		
		Person2 p1 = new Person2("kim","1234","김연아");
		Person2 p2 = new Person2("park","3456","박나래");
		Person2 p3 = new Person2("song","9876","송중기");
		
		Person2 [] arr = {new Person2("kim","1234","김연아"),
						  new Person2("park","3456","박나래"),
						  new Person2("song","9876","송중기")
						 };
		
		
		do {			
			System.out.print("id:");
		    String inputId = sc.next();
			System.out.print("pw:");
			String inputPw = sc.next();
				
				if(inputId.length()<3 || inputId.length()>8) {
						
						System.out.println("ID는 3~8글자 입력하세요");				
						continue;
					}
				
				
				for(int i=0;i<arr.length;i++) {
					if(arr[i].id.equals(inputId)) {
							if(arr[i].pw.equals(inputPw)) {
						System.out.println(arr[i].name+"님 반가워요");
						break;
							}
							else {
								System.out.println("비밀번호가 맞지 않습니다.");
								break;
							}
					
					}
					else if(i==2) {
						System.out.println("해당 아이디가 없습니다");  // 참고  
					}	
					
					else
						continue;	  // 참고
	
			}			
				
			
				System.out.println("계속하시겠습니까?(Y/N)");
			
			String Next = sc.next();
			switch(Next) {
			case "Y" : System.out.println("계속"); continue;
			case "N" : System.out.println("프로그램을 종료합니다"); break;
			default : System.out.println("잘못된 입력입니다");break;
			}
			
			
		} while(true);	

	}

}
