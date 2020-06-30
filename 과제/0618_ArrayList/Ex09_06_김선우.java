import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private int tel;
	Card(String name, int tel){
		this.name=name;
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
}
public class Ex09_06_김선우 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();
		String name;
		int tel;
		int select;
		int i;
		boolean flag;
		
		do {
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:");
			select=sc.nextInt();
			if(select==1) {
				System.out.print("이름을 입력하세요.");
				name=sc.next();
				System.out.print("전화번호를 입력하세요.");
				tel=sc.nextInt();
				Card c = new Card(name,tel);
				list.add(c);
			}
			if(select==2) {
				System.out.println("이름을 입력하세요:");
				name=sc.next();
				flag = false;
				for(i=0;i<list.size();i++) {
					if(name.equals(list.get(i).getName())) {
						list.remove(list.get(i));
						System.out.println("삭제되었습니다.");
						flag = true;
					}
				
				}
				if(flag == false) {
					System.out.println("일치하는 아이디가 없습니다.");
				}
				
			}
			
			if(select==3) {
				System.out.println("이름을 입력하세요:");
				name=sc.next();
				flag = false;
				for(i=0;i<list.size();i++) {
					if(name.equals(list.get(i).getName())) {
						System.out.println("수정하실 전화번호는:");
						tel=sc.nextInt();
						list.set(i, new Card(name,tel));
						System.out.println("수정되었습니다.");
						flag = true;
					}
				}
				if(flag == false) {
					System.out.println("이름을 잘못입력하셨습니다.");
				}

				//			list.set(0, name);

			}
			if(select == 4) {
				System.out.println("이름\t"+"번호");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName()+"\t"+list.get(i).getTel());
				}

			}
			if(select==5) {
				
				break;
			}
			
		}while(true);
		
		System.out.print("프로그램을 종료합니다.");

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