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
}
public class Ex09_06_허용석 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();
		
		String inName, inTel;
		boolean flg;

		while(true) {
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:");
			int select= sc.nextInt();
			flg=false;
			switch(select) {
			case 1:
				System.out.print("이름을 입력하세요:");
				inName=sc.next();
				System.out.print("전화번호를 입력하세요:");
				inTel=sc.next();
				list.add(new Card(inName, inTel));
				System.out.println("추가되었습니다");
				break;
			case 2:
				System.out.print("이름을 입력하세요:");
				inName=sc.next();
				for(int i=0;i<list.size();i++) {
					if(inName.equals(list.get(i).getName())) {
						list.remove(i);
						System.out.println("삭제되었습니다");
						flg=true;
						break;
					}
				}
				display(flg);
				break;
			case 3:
				System.out.print("이름을 입력하세요:");
				inName=sc.next();
				for(int i=0;i<list.size();i++) {
					if(inName.equals(list.get(i).getName())) {
						System.out.print("전화번호를 입력하세요:");
						inTel=sc.next();
						list.set(i, new Card(inName, inTel));
						System.out.println("수정되었습니다");
						flg=true;
						break;
					} 
				}
				display(flg);
				break;
			case 4:
				System.out.println("이름		전화번호");
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName()+"\t\t"+list.get(i).getTel());
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);  //프로그램 종료
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
				break;
			}
		}
	}
	static void display(boolean flg) {
		if(! flg)
			System.out.println("이름을 잘못입력하셨습니다.");
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








