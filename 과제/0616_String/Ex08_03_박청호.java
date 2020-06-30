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


public class Ex08_03_박청호 {
	public static void main(String[] args) {
		
		Person2[] p= {
				new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("song","9876","송중기")
					};
		
//		System.out.println(p[0].id);
//		System.out.println(p[1].id);
//		System.out.println(p[2].id);
		
		Scanner sc=new Scanner(System.in);
		String inputid, pw, retry;
		boolean flag = false;
		int i;
		do {
			flag = false;
			System.out.print("id입력:");
			inputid=sc.next();
			if(inputid.length()<3 || inputid.length()>8) { //string과 length
				System.out.println("id는 3~8글자 사이 입니다.");
				continue;
			}
			System.out.print("pw입력:");
			pw=sc.next();

			
			for(i=0;i<p.length;i++) { //배열과 for문 세트+배열과 length
				if(p[i].id.equals(inputid)) { //***객체배열+생성자와의 equals
					if(p[i].pw.equals(pw)) {

						p[i].display();   //객체배열의 경우 메서드(출력) 사용할 때 주의! 일반배열과 다름!
						flag = true;
						break;   //for문을 빠져 나가는것.
					}
					else{
						System.out.println("비번이 맞지 않습니다.");
						flag = true;
					}
					
				}
		
			}
			if(flag == false) {
				System.out.println("해당 아이디가 없습니다.");
				
			}
		
			System.out.println("계속?");
			retry =sc.next();
			
			if(retry.equalsIgnoreCase("n"))  //***문자와 equals
				break;
			
			

		}while(true);
		System.out.println("프로그램을 종료합니다.");


	}//main

}//class
