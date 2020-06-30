import java.util.ArrayList;
import java.util.Scanner;



class Card{
	private String name;
	private String number;
	Card(String name,String number){
		this.name=name;
		this.number=number;
	}

	public String toString() {
		return "Card [name=" + name + ", number=" + number + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}



public class Ex09_06_원태찬 {
	public static void main(String[] args) {
		ArrayList<Card> list=new ArrayList<Card>();
		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:");
			int f=sc.nextInt();
			int i,sw=0;
			switch(f) {
			case 1:
				System.out.print("이름을 입력하세요:");
				String a=sc.next();
				System.out.print("전화번호를 입력하세요:");
				String b=sc.next();
				list.add(new Card(a,b));
				break;
			case 2:System.out.print("이름을 입력하세요:");
			String e=sc.next();
			sw=0;
			for(i=0;i<list.size();i++) {
				if(e.equals(list.get(i).getName())) {
					list.remove(list.get(i));
					System.out.println("삭제되었습니다.");
					sw=1;
				}}
			if(sw==0) {
				System.out.println("이름을 잘못입력하셨습니다.");
			}
			break;
			case 3:
				System.out.print("이름을 입력하세요:");
				String c=sc.next();
				sw=0;
				for(i=0;i<list.size();i++) {
					if(c.equals(list.get(i).getName())) {
						sw=1;
						System.out.print("수정하실 전화번호는:");
						String d=sc.next();
						list.set(i,new Card(c,d));
						System.out.println("수정되었습니다.");
					}}



				if(sw==0) {
					System.out.println("이름을 잘못입력하셨습니다.");
				}
				break;

			case 4:
				for(i=0;i<list.size();i++) {
					System.out.println("이름:"+list.get(i).getName()+"\t전화번호"+list.get(i).getNumber());
				}
				break;
			case 5:System.out.println("프로그램을 종료합니다.");
			break;

			
			}if(f==5) {
				break;
			}
		}while(true);
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

