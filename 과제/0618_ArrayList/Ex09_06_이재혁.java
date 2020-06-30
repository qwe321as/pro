import java.util.ArrayList;
import java.util.Scanner;
class Card{
	private String name;
	private String tel;

	public Card(String name, String tel) {
		super();
		this.name=name;
		this.tel=tel;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String toString() {
		return name+"     "+tel+"\n";
	}
}
public class Ex09_06_이재혁 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();

		do { 
			System.out.println();
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료\n  선택해주세요.>>>");
			int select = sc.nextInt();
			System.out.println();

			switch(select) { 
			case 1:
				System.out.print("이름을 입력하세요. :");
				String inputName = sc.next();
				System.out.print("전화번호를 입력하세요 :");
				String inputTel = sc.next();
				list.add(new Card(inputName, inputTel));				
				continue;

			case 2:
				System.out.print("이름을 입력하세요. :");
				String inputName2 = sc.next();
				boolean Name = false;
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(inputName2)) {
						Name = true;
						list.remove(i);
						System.out.println(inputName2+" 이(가) 삭제되었습니다.");

					}
				}
				if(!Name) {
					System.out.println("해당 이름의 정보가 없습니다.");
				}
				continue;
			case 3:
				System.out.print("이름을 입력하세요. :");
				String inputName3 = sc.next();
				boolean Name1 = false;
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(inputName3)) {
						Name1 = true;
						System.out.print("수정하실 전화번호를 입력하세요.:");
						String inputTel2 = sc.next();
						list.get(i).setTel(inputTel2);
						System.out.println(inputName3+"의(에) 전화번호가 변경되었습니다.");

					}
				}
				if(!Name1) {
					System.out.println("해당 이름의 정보가 없습니다.");
				}
				continue;
			case 4:
				System.out.print("이름"+"            "+"전화번호\n");
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName()+"     "+list.get(i).getTel());}
				continue;
			case 5 :
				break;

			}//switch
			break;

		}while(true);
		System.out.println("프로그램을 종료합니다.");





	}//main

}//class

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
