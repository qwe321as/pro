import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;
	public Person2(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	
	
}
public class Ex08_03_이기선 {

	public static void main(String[] args) {

		Person2[] p0 = new Person2[3];
		p0[0] = new Person2("kim","1234","김연아");
		p0[1] = new Person2("park","3456","박나래");
		p0[2] = new Person2("song","5678","송중기");
		
		Scanner sc = new Scanner(System.in);
		int count=0,len0=0,ok=-1;
		String ans = "y";
		String id="",pw="";
		
		do {
			ok=-1;
			System.out.println("Input your ID or Y/N");
			id = sc.next();
			if(id.equals("n")  || id.equals("N")) {
				ans = "N";
				System.out.println("Good Bye!");
				break;
			}
			if(id.equals("y")  || id.equals("Y")) {
				ans = "Y";
				System.out.println("Keep Going");
				continue;
			}
			if(id.length()< 3 || id.length()>8) {
				System.out.println("ID의 길이는 3~8자 입니다. 다시 입력해 주세요.");
				continue;
			}
			for(int i0 = 0 ; i0 < p0.length ; i0++) {
				if(id.equals(p0[i0].id) ) {
					ok = i0;
					break;
				}
			}//for
			if(ok == -1) {
				System.out.println("일치하는 ID가 없습니다. 다시 입력하여 주십시요.");
				continue;
			}
			
			System.out.println("PAAWORD를 입력하여 주십시요 : ");
			pw = sc.next();
			
			if(pw.equals(p0[ok].pw)) {
				System.out.println("Login에 성공했습니다.");
				continue;
			}
			else {
				System.out.println("Password가 틀렸습니다. 처음부터 다시 입력해 주십시요.");
				continue;
			}			
			
		}while(ans !="n" || ans !="N") ;		
		
		sc.close();
/*		
		id입력 :
		pw입력 :
		박나래님 반갑습니다.
		계속 : y or n
		id입력시 3~8글자 입력해야 하는 경고 메세지
		id입력 : paak
		pw입력 : 3456
		id입력 올류 표시(해당 id는 없습니다)
		pw가 잘못 입력 되었습니다.
		id와 pw가 정상으로 입력되서 login 이 성공 했습니다.
		
		*/
		
		
	}

}
