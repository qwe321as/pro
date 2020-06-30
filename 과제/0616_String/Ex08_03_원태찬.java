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
	void display() {
		System.out.println(name+"님 반갑습니다.");
	}
}


public class Ex08_03_원태찬 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person2[] p= {
				new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("song","9876","송중기")
		};

		do {
			System.out.print("id입력:");
			String inputid=sc.next();
			if(inputid.length()<3 || inputid.length()>8) { //string과 length
				System.out.println("id는 3~8글자 사이 입니다.");
				continue;
			}
			System.out.print("pw입력:");
			String inputpw=sc.next();

			int i;
			for(i=0;i<p.length;i++) { //배열과 for문 세트+배열과 length
				if(p[i].id.equals(inputid)) { //***객체배열+생성자와의 equals
					if(p[i].pw.equals(inputpw)) {

						p[i].display();   //객체배열의 경우 메서드(출력) 사용할 때 주의! 일반배열과 다름!
						break;
					}
					else{
						System.out.println("비번이 맞지 않습니다.");
						continue;
					}
					
				}
			
			
			
				else if(i==2){
					System.out.println("해당 아이디가 없습니다.");
					continue;
				}else {
					continue;
				}
				}
				
			


				
			
			




			System.out.println("계속?");
			String j=sc.next();
			String y=null;
			if(j.equals("y")) { //***문자와 equals
				continue;
			}
			else {
				break;
			}

		}while(true);
		System.out.println("프로그램을 종료합니다.");


	}//main

}//class

////id입력:park
////pw입력:3456
////박나래님 반갑습니다.
////계속?y
////id입력:pa
////id는 3글자~8글자 입력해야 합니다.
////id입력:dlsfjsldfjslf
////id는 3글자~8글자 입력해야 합니다.
////id입력:kim
////pw입력:9999
////비번이 맞지 않습니다.
////계속?y
////id입력:choi
////pw입력:3223
////해당 아이디가 없습니다.
////계속?n
////프로그램을 종료합니다.

