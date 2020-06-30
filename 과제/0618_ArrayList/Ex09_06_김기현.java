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
	String getName() {
		return name;
	}
	String getTel() {
		return tel;
	}
	
//	public String toString() {
//		return name+"        "+tel;
//	}
	
	
}
public class Ex09_06_김기현 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Card> c = new ArrayList<Card>();
		
		String name,tel;
		boolean f = false;
		
		while(true) {
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:");
		int select = sc.nextInt();
		
		 
			switch(select) {
		
			case 1 :	
					System.out.print("이름입력:");
					name = sc.next();
					System.out.print("번호입력:");
					tel = sc.next();
					c.add(new Card(name,tel));
					continue;
			
			case 2 :
				
				System.out.print("이름입력:");
				name = sc.next();
				f=false;
				for(int i=0;i<c.size();i++) {
					if(c.get(i).getName().equals(name)) {
						c.remove(c.get(i));
						f = true;
						break;
					}
					
				}
				if(f==false) {
					System.out.println("잘못된 이름입니다.");
					continue;
				}
			System.out.println("삭제되었습니다.");
			continue;
			
		
			case 3 :
			System.out.print("이름 입력:");
			name = sc.next();
			f=false;
			
			for(int i=0;i<c.size();i++) {
				if(c.get(i).getName().equals(name)) {
					System.out.print("수정할 번호는:");
					tel = sc.next();
					c.remove(c.get(i));
					c.add(i,new Card(name,tel));
					System.out.println("수정완료");
					f=true;
					break;
				}
			}				
			if(f==false)
				System.out.println("이름이 없습니다.");
			continue;
			
		
			case 4 :	
				System.out.println("이름\t"+"번호");
			for(int i=0;i<c.size();i++) {
			System.out.print(c.get(i).getName()+"\t"+c.get(i).getTel()+"\n");
			}
			continue;
		
		
			case 5 :
			
				break;
		
		
			default :
		 	System.out.println("1~5사이 번호를 입력하세여");
		
		 	continue;

			}
		
			
			
			System.out.println("프로그램을 종료합니다.");
			break;
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
