import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	Card(String name, String tel){
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






}




public class Ex09_06_박청호 {

	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList<Card>();

		//System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
		//Card c = new Card(name, tel);

		Scanner sc = new Scanner(System.in);
		int num,i;
		String inputname, inputtel;
		boolean flag = false;



		while(true) {System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
		System.out.println("숫자입력:");
		num = sc.nextInt();

		switch(num) {									
		case 1 : 
			System.out.print("이름을 입력하세요:");	
			inputname = sc.next();
			System.out.println("전화번호를 입력하세요:");
			inputtel = sc.next();
			Card input =new Card(inputname, inputtel);
			list.add(input);
			break;
		case 2 : 
			System.out.println("삭제할 이름을 입력하세요:");
			inputname = sc.next();
			for(i=0;i<list.size();i++) {
				Card c = list.get(i);
				if(c.getName().equals(inputname)) {
					list.remove(i);
					flag = true;
					System.out.println("삭제 되었습니다.");
					break;
					}
			}
			if(flag = false) {
				System.out.println("이름을 잘못 입력하셨습니다.");
			}
			

			break;
		case 3 : 
			System.out.print("이름을 입력하세요:");	
			inputname = sc.next();
			
			for(i=0;i<list.size();i++) {
				Card c = list.get(i);
				
			if(c.getName().equals(inputname)) {
				System.out.println("수정할 전화번호를 입력하세요:");
				inputtel = sc.next();
				c.setTel(inputtel);
				
//				Card edit = new Card(inputname, inputtel);
//				list.set(i,edit);
				System.out.println("수정되었습니다.");
				flag =true;
				break;
				}
			
			}
			if(flag == false) {
				System.out.println("이름을 잘못 입력하셨습니다.");
			}
			
		break;
		case 4 : System.out.println("이름\t전화번호");
		for(i=0;i<list.size();i++) {
			Card c = list.get(i);
			System.out.println(c.getName() + "\t" + c.getTel());
		}
		break;

		case 5 : 
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default : 
			System.out.println("1~5사이의 번호만 입력가능함.");

		}




		//System.out.println(select);

		}
	}	//switch) {
	//		System.out.println("이름을 입력");
	//		String title = sc.next();
	//		System.out.println("가수:");sa
	
	//		String singer = sc.next();
	//		System.out.println("가격");
	//		int price = sc.nextInt();
}	


//switch 케이스문




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