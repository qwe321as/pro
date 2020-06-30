import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	public Card(String name,String tel) {
		super();
		this.name=name;
		this.tel=tel;

	}
	public String getName(){
		return name;
	}
	public String getTel(){
		return tel;
	}
}



public class Ex09_06_문태승 {
	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList<Card>();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		int i;
		while(true) {
			flag=false;
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료"); 
			int select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("이름을 입력하세요:");
				String name = sc.next();
				System.out.println("전화번호를 입력하세요:");
				String tel = sc.next();
				Card c = new Card(name,tel);
				list.add(c);
				break;

			case 2:
				System.out.println("이름을 입력하세요:");
				name = sc.next();
				for(i=0;i<list.size();i++) {
					if(name.equals(list.get(i).getName())) {
						list.remove(i);
						flag=true;
						break;
					}
				}

				if(!flag) {
					System.out.println("이름을 잘못 입력하셨습니다.");
				}
				else {
					System.out.println("삭제되었습니다.");
				}
				break;

			case 3:
				System.out.println("이름을 입력하세요:");
				name = sc.next();

				for(i=0;i<list.size();i++) {
					if(name.equals(list.get(i).getName())) {
						System.out.println("수정하실 전화번호는:");
						tel = sc.next();
						list.set(i, new Card(name, tel));
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("일치하는 이름이 없습니다.");
				}
				else {
					System.out.println("수정되었습니다.");
				}
				break;
			case 4:
				System.out.println("이름          전화번호");
				for(i=0;i<list.size(); i++) {
					System.out.println(list.get(i).getName() + "      " + list.get(i).getTel());
				}

				break;
			case 5:	
				break;
			default:
				System.out.println("다시 선택해주세요.");
			}
			if(select==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
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
