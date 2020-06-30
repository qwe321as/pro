import java.util.ArrayList;
import java.util.Scanner;

class card{
	private String name;
	private String tal;
	public card(String name, String tal){
		this.name = name;
		this.tal = tal;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void settal(String tal) {
		this.tal = tal;
	}
	public String gettal() {
		return tal;
	}
	public String toString(){
		return name+tal;
	}

}
public class ex09_06_인정배 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<card> list = new ArrayList<card>();
		int i;
		do {
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			int select =sc.nextInt();
			if(select == 1) {//명함추가
				System.out.print("이름을 입력하시오:");
				String name = sc.next();
				System.out.print("전화번호:");
				String tal = sc.next();
				list.add(new card(name,tal));


			}if(select == 2) {//명함삭제
				System.out.println("이름을 입력하세요 :");
				String asd = sc.next();
				for(i=0;i<list.size();i++) {
					if(asd.equals(list.get(i).getname())) {
						list.remove(list.get(i));
						System.out.println("삭제되었습니다.");
					}

				}
				
			}if(select == 3) {
				System.out.println("이름을 입력하시오:");
				String asd = sc.next();
				for(i=0;i<list.size();i++) {
					if(asd.equals(list.get(i).getname())) {
						list.remove(list.get(i));
					}
					}
				System.out.println("수정하실 전화번호");
				String tal = sc.next();

				System.out.println("수정되었습니다");
				list.add(new card(asd,tal));



			}if(select == 4) {
					for(i=0;i<list.size();i++) {
					System.out.println("이름:"+list.get(i).getname()+"전화번호"+list.get(i).gettal());
				}
			}if(select == 5) {
				System.out.println("프로그렘 종료 ");

				break;
			}











		}while(true);




		//if case 등등 여러가지 활용해서 할것
	}



}
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
//이름을 입력하세요 : kim
//전화번호를 입력하세요 : 1234
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
//이름을 입력하세요 : park
//전화번호를 입력하세요 : 3333
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//park		3333
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
//이름을 입력하세요 : park
//수정하실 전화번호는 : 7777
//수정되었습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//park		7777
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
//이름을 입력하세요 : choi
//이름을 잘못입력하셨습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
//이름을 입력하세요 : park
//삭제되었습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
//이름을 입력하세요 : hong
//이름을 잘못입력하셨습니다.
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
//이름		전화번호
//kim		1234
//
//1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:5
//프로그램을 종료합니다.








