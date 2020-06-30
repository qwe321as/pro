import java.util.Scanner;

class Person2{
	// 여유 되면 private으로
	String id;
	String pw;
	String name;

	Person2(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	};

}
public class Ex08_03_김용승 {
	public static void main(String[] args) {

		// Person2 p1 = new Person2("kim","1234","김연아");
		// Person2 p2 = new Person2("park","3456","박나래");
		// Person2 p3 = new Person2("song","9876","송중기");

		Person2[] arrP = {new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("song","9876","송중기")
		};

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("ID 입력 : ");
			String inputId = sc.next();
			System.out.print("PW 입력 : ");
			String inputPw = sc.next();
			if(inputId.length()<3||inputId.length()>8) {
				System.out.println("ID는 3~8자 입력 가능");
				continue;
			}
			
			for(int i =0;i<arrP.length;i++) {
				if(inputId.equals(arrP[i].id)) {
					if(inputPw.equals(arrP[i].pw)) {
						System.out.println(arrP[i].name+"님 환영합니다.");
						break;
					}
					else {
						System.out.println("PW 불일치");
						break;
					}
				}
				else if(i==2) System.out.println("일치하는 ID 없음");
				else continue;
			}
			System.out.print("계속하시겠습니까?[Y/N] :");
			String gogo = sc.next();
			switch(gogo) {
			case "y" : System.out.println("계속합니다.");continue;
			case "n" : System.out.println("프로그램을 종료합니다.."); break;
			}
			break;
		}while(true);
	} //main
} //class

