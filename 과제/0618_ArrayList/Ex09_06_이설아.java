import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	Card(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	String getName(){
		return name;
	}
	String getTel(){
		return tel;
	}
	public String toString() {
		return name + "/" + tel;
	}



}


public class Ex09_06_이설아 {
	public static void main(String[] args) {
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

		ArrayList<Card> list =  new ArrayList <Card>();
		Scanner sc = new Scanner (System.in);
		int i;

		while(true) {

			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			System.out.print("번호선택>> ");
			int select = sc.nextInt();
			String name, tel;
			boolean flag = false;

			if(select==1) {
				System.out.print("이름을 입력하세요: ");
				name= sc.next();
				System.out.print("전화번호를 입력하세요: ");
				tel= sc.next();
				Card c = new Card(name, tel);
				list.add(c);

			}
			else if(select==2) {
				flag = false;
				System.out.print("삭제할 이름: ");
				name= sc.next();
				for(i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).getName())){
						list.remove(list.get(i));
						flag =true;
						System.out.println("삭제되었습니다.");
						break;
					}
				}
				if(flag==false)
					System.out.println("이름을 잘못 입력하셨습니다.");

			}
			else if(select==3) {
				flag=false;
				System.out.print("수정할 이름: ");
				name= sc.next();
				System.out.print("수정할 전화번호 :");
				String number= sc.next();

				for(i=0; i<list.size(); i++) {

					if(name.equals(list.get(i).getName())) 
						list.set(list.indexOf(list.get(i)), new Card(name,number));
					System.out.println("수정되었습니다.");
					flag= true;
					break;
				}

				if(flag==false) {
					System.out.println("이름을 잘못 입력하셨습니다.");
				}




			}
			else if(select==4) {
				System.out.println(list.toString());

			}
			else if(select==5) {
				break;
			}
			else {
				System.out.println("1~5번 숫자만 입력해 주세요");
			}

		} System.out.println("프로그램을 종료합니다");






	}

}
