import java.util.ArrayList;
import java.util.Scanner;

class Card{
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
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Card [name=" + name + ", tel=" + tel + "]";
	}
	
	
}
public class Ex09_06_김용주 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Card c = null;
		int i;
		int select ;
		String putName;
		String putTel;
		String deleteName;
		ArrayList<Card> list = new ArrayList<Card>();
		boolean flag = false;

		while(true) {

			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료 ");
			select = sc.nextInt();

			if(select==1) { 
				while(true) {

					System.out.print("이름을 입력하세요 : ");
					String name = sc.next();
					System.out.print("전화번호를 입력하세요 : ");
					String tel = sc.next();

					c = new Card (name ,tel);
					list.add(c);

					System.out.println("continue?(y or n)");
					String retry = sc.next();
					if(retry.equalsIgnoreCase("n")) 
						break;
				}//while
				continue;
			}//if

			else if(select==4) { 
				System.out.println(" 이름" + "    전화번호" + list.toString());
				System.out.println();

			}

			else if(select==3) { 
				flag = false; 
				System.out.println("전화번호를 바꿀 이름을 입력하세요");
				putName = sc.next();
				for(i=0;i<list.size();i++) {
					if(putName.equalsIgnoreCase(list.get(i).getName())) {
						flag = true;
						System.out.println("수정하실"+ putName +"의 전화번호는 : ");
						putTel = sc.next();
						list.set(i,new Card(putName,putTel));
					}
				}
				if(flag==false) {
					System.out.println("이름이 존재하지 않습니다.");
				}
			}
			else if(select==2) {
				flag = false; 
				System.out.println("삭제할 이름을 입력하세요");
				deleteName = sc.next();
				for(i=0;i<list.size();i++) {
					if(deleteName.equalsIgnoreCase(list.get(i).getName())) {
						flag = true; 
						System.out.println(deleteName + "의 정보가 삭제되었습니다.");
						list.remove(list.get(i));
					}

				}
				if(flag == false) {
					System.out.println("이름이 존재하지 않습니다.");
				}
			}

			else if(select==5) {
				break;
			}
		}//while
		System.out.println("프로그램을 종료합니다.");



	}//main

}//public class









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

