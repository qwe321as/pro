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

public class Ex08_03_허평강 {
	public static void main(String[] args) {

		Person2 p1 = new Person2("kim","1234","김연아");
		Person2 p2 = new Person2("park","3456","박나래");
		Person2 p3 = new Person2("song","9876","송중기");

		Person2[] p = {new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("song","9876","송중기")};
		String id;
		String pw;
		String a;
		int i;
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("id를 입력하세요.");
			id = sc.next();
			if(id.length()>2&&9>id.length()) {
			System.out.println("pw를 입력하세요.");
			pw = sc.next();

				for(i=0;i<p.length;i++) {

					if(id.equals(p[i].id)) {
						System.out.println("아이디가 일치합니다.");

						if(pw.equals(p[i].pw)) {
							System.out.println(p[i].name + "님 ~환영합니다.");
							break;
						}
						else {
							System.out.println("비밀번호가 틀립니다.");
							break;
						}
					}
					else if(i==2) {
						System.out.println("아이디가 일치하지않습니다.");
					}
					else {
						continue;
					}
				}
			}
			else {
				System.out.println("아이디를 3~8자로 입력하세요");
				continue;
			}
			System.out.println("y or n"+"계속하시겠습니까?");
			a=sc.next();
			switch(a){
			case"y":System.out.println("계속합니다.");
			continue;
			case"n":System.out.println("종료합니다.");
			break;
			}
			break;
		}while(true);

	}
}
