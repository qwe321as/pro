import java.util.Scanner;

class Person2{
	private String id,pw,name;

	public Person2(String id, String pw, String name){
		this.setId(id);
		this.setPw(pw);
		this.setName(name);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Ex08_03_양경원 {

	public static void main(String[] args) {

		Person2 p [] = {new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("son","9876","송중기")};

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("id 입력하세욧");
			String Id = sc.next();
			
			String y = "y";
			String n = "n";
			
			if(Id.length() < 3 || Id.length() > 8) {
				System.out.println("3글자~8글자 입력해야 합니다.");

			}else if(!(Id.equals(p[0].getId()) || Id.equals(p[1].getId()) || Id.equals(p[2].getId()))) {
				System.out.println("아디가아니앗");
				System.out.println("계속 할거냐? y/n");

				String nt = sc.next();
				if(n.equals(nt)) {
					System.out.println("프로그램 종료");
					break;
				}

			}else {
				System.out.println("pw 입력하세욧");
				String Pw = sc.next();
				if(!(Pw.equals(p[0].getPw()) || Pw.equals(p[1].getPw()) || Pw.equals(p[2].getPw()))){
					System.out.println("비밀번호가 아니앗");
					System.out.println("계속 할거냐? y/n");

					String yes = sc.next();

					if(y.equals(yes)==true) {
						continue;
					}else {
						System.out.println("프로그램 종료");
						break;
					}
				}
				if(Id.equals(p[0].getId()) && Pw.equals(p[0].getPw())) {
					System.out.println(p[0].getName() +" 님 반갑습니다.");
					System.out.println("계속 할거냐? y/n");

					String yes = sc.next();

					if(y.equals(yes)==true) {
						continue;
					}else {
						System.out.println("프로그램 종료");
						break;
					}
				}else if(Id.equals(p[1].getId()) && Pw.equals(p[1].getPw())) {
					System.out.println(p[1].getName() +" 님 반갑습니다.");
					System.out.println("계속 할거냐? y/n");

					String yes = sc.next();

					if(y.equals(yes) == true) {
						continue;
					}else {
						System.out.println("프로그램 종료");
						break;
					}
				}else if(Id.equals(p[2].getId()) && Pw.equals(p[2].getPw())) {
					System.out.println(p[2].getName() +" 님 반갑습니다.");
					System.out.println("계속 할거냐? y/n");

					String yes = sc.next();

					if(y.equals(yes)==true) {
						continue;
					}else {
						System.out.println("프로그램 종료");
						break;
					}
				}
			}

		} while (true);

	}

}
