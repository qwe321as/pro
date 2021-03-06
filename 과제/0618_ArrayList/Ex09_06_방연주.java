import java.util.ArrayList;
import java.util.Scanner;

class Card {
	private String name;
	private String tel;

	Card(String name, String tel) {
		this.name = name;
		this.tel = tel;

	}

//	void setName() {
//		this.name = name;
//	}
	String getName() {
		return name;
	}

	String getTel() {
		return tel;
	}
	
	void setName(String name) {
		this.name =name;
	}
	void setTel(String tel) {
		this.tel = tel;
	}
	public String toString() {
		return name + "/" + tel;
	}
}

public class Ex09_06_방연주 {
	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<Card>();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			String name;
			String tel;
			int i;
			int select = sc.nextInt();
			boolean flag, flag2;

			switch (select) {
			case 1:
				System.out.println("이름을 입력하세요1");
				name = sc.next();
				System.out.println("전화번호를 입력하세요");
				tel = sc.next();
				Card c = new Card(name, tel);
				list.add(c);
				System.out.println(list);
				continue;
			case 2:

				flag = false;
				System.out.println("이름을 입력하세요2");
				name = sc.next();
				for (i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						list.remove(i);
						System.out.println("삭제되었습니다.");
						flag = true;
					}
				}
				if (flag == false) {
					System.out.println("잘못입력하셨씁니다.");
				}
				continue;
			case 3:
				flag2 = false;
				System.out.println("이름을 입력하세요3");
				name = sc.next();

				for (i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						System.out.println("수정하실 전화번호는?");
						tel = sc.next();
						list.get(i).setTel(tel);
						System.out.println("수정되었습니다.");
						flag2 = true;
					}
				}
				if (flag2 == false) {
					System.out.println("이름을 잘못입력하셨습니다. ");
					
				}
				continue;
			case 4:
				System.out.println("아이디 " + "전화번호 ");
				for (i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				continue;
			case 5:
				System.out.println("시스템 종료합니다.");
				System.exit(0);

			}
		} while (true);
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