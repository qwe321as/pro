import java.util.Scanner;

class person1{
	String id;
	String pw;
	String name;

	public person2(String id, String pw, String name) {
		// TODO Auto-generated constructor stub
		this.id =id;
		this.pw = pw;
		this.name =name;
	}

}
public class ex08_03_인정배 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		person2 p[] = {new person2("kim","1234","김연아"),
				new person2("park","3456","박나래"),
				new person2("song","9876","송중기")};

		


		//String inputid = new String(sc.next());
do {
		System.out.println("아이디입력");
		String inputid = new String(sc.next());
		while(inputid.length()>8 || inputid.length()<3){

			System.out.println("3자에서 8자까지 치세요");
			System.out.println("계속");
			break;
		}


		System.out.println("비번입력");
		String inputPw = sc.next();
		String name ;
		int i= 0 ,s=0;
		String y ="y";

		//d=inputid.indexOf(d);
		for(i=0;i<3;i++) {
			if(p[i].id.equals(inputid) == true && p[i].pw.contentEquals(inputPw)==true){
				System.out.println(p[i].name+"님 반갑습니다");	
				System.out.println("계속");
				String yes = sc.next();
				System.out.println(yes);
				if(yes.equals("y")) {
					System.out.println("y들어옴");
					continue;
				}else {
					System.out.println("y안들어옴");
					break;	
				}
				

			}	else if (!p[i].id.equals(inputid) == false&& p[i].pw.contentEquals(inputPw)==true) {
				System.out.println(p[i].id.equals(inputid));
				System.out.println("그런아이디 없어");
				String yes = sc.next();
				System.out.println(yes);
				if(yes.equals("y")) {
					System.out.println("y들어옴");
					continue;
				}else {
					System.out.println("y안들어옴");
					break;	
				}
			
			}else	if(p[i].pw.contentEquals(inputPw)==false&&p[i].id.equals(inputid) == true){
				System.out.println(p[i].pw.contentEquals(inputPw));
				System.out.println("비번이 맞지 않습니다");System.out.println("계속");
				String yes = sc.next();
				System.out.println(yes);
				if(yes.equals("y")) {
					System.out.println("y들어옴");
					continue;
				}else {
					System.out.println("y안들어옴");
					break;	
				}
			}
		break;
		}
		String yes = sc.next();
		System.out.println(yes);
		
}while(true);

//실패
	}
}
//}

//else if(3<d<9) {

//}
//y를 치면 계속 하면 계속 나오고 id가 틀리면 아이디가 없습니다 비번이 틀리면 비번이 맞지 않습니다
//계속 에서 n을 누르면 종료합니다 id는 3글자에서 8글자 넣어야허ㅏㄴ다 





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
//	static void show(int cnt) {
//System.out.println("hi~ "+cnt);
//if(cnt == 1)
//	return;
//show(--cnt);//자기호출
//}

//		swith(inputid){
//			case p[0].id:System.out.println();
//			break;
//			case p[1].id:System.out.println();
//			break;
//			case p[2].id:System.out.println();
//			break;

//}else if(p[1].id.equals(inputid) == true && p[1].pw.contentEquals(inputPw)==true) {
//	System.out.println("박나래님 반갑습니다");			System.out.println("계속");	
//}else if(p[2].id.equals(inputid) == true && p[2].pw.contentEquals(inputPw)==true) {
//	System.out.println("송중기님 반갑습니다");				System.out.println("계속");
//	}else if(p[1].pw.contentEquals(inputPw)==false){
//		System.out.println("비번이 맞지 않습니다");System.out.println("계속");
//	}else if(p[2].pw.contentEquals(inputPw)==false){
//		System.out.println("비번이 맞지 않습니다");System.out.println("계속");
//	}else if(p equalsIgnoreCase inputid == false){
//	}else{
//		System.out.println("해당아이디가 없다.");
//	}