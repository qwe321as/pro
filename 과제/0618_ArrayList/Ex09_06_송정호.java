import java.util.ArrayList;
import java.util.Scanner;

class Card {
	
	private String name;
	private String tel;
	
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class Ex09_06_송정호 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Card> list = new ArrayList<Card>();
		
		String name, tel;
		boolean check;
		
		while(true) {
			
			check = false;
			
			System.out.println("1.명함추가  2.명함삭제  3.명함수정  4.명함보기  5.종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			switch(select) {
			
			case 1:
				System.out.println("<명함 추가>");
				System.out.print("이 름 : ");
				name = sc.next();
				System.out.print("전화 번호 : ");
				tel = sc.next();
				
				list.add(new Card(name, tel));
				System.out.println("추가 완료!");
				
				break;
				
			case 2:
				System.out.println("<명함 삭제>");
				System.out.print("이 름 : ");
				name = sc.next();
				
				for(int i = 0; i < list.size(); i++) {
					if(name.equals(list.get(i).getName())) {
						list.remove(i);
						check = true;
						break;
					}
				}
				
				if(!check) {
					System.out.println("일치하는 이름이 없습니다.");
				}
				else {	
					System.out.println("삭제 완료!");
				}
				
				break;
				
			case 3:
				System.out.println("<명함 수정>");
				System.out.print("이 름 : ");
				name = sc.next();
				
				for(int i = 0; i < list.size(); i++) {
					if(name.equals(list.get(i).getName())) {
						System.out.print("수정하실 전화번호 : ");
						tel = sc.next();
						list.set(i, new Card(name, tel));
						check = true;
						break;
					}
				}
				
				if(!check) {
					System.out.println("일치하는 이름이 없습니다.");
				}
				else {					
					System.out.println("수정 완료!");
				}
				
				break;
				
			case 4:
				System.out.println("<명함 보기>");
				System.out.println("이름     전화번호");
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName() + "  " + list.get(i).getTel());
				}
				
				break;
				
			case 5:
				System.out.println("<프로그램 종료>");
				
				break;
				
			default :
				System.out.println("다시 선택해주세요.");
			}
			
			if(select == 5) {
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