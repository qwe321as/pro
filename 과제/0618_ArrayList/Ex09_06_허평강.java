import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private int tel;


	Card(String name,int tel){
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


	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}







}
public class Ex09_06_허평강 {
	public static void main(String[] args) {


		ArrayList<Card> list  = new ArrayList<Card>(); 
		boolean flag=false;
		int i;
		int tel;
		String name;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			System.out.print("번호를 입력하세요 :");
			int select = sc.nextInt();

			switch(select) {
			case 1 : System.out.println("이름을 입력하세요");
			name = sc.next();
			System.out.println("전화번호를 입력하세요");
			tel = sc.nextInt();
			list.add(new Card (name,tel));
			break;
			case 2 :System.out.println("삭제할 명함을 입력하세요");
			name = sc.next();
			for(i=0;i<list.size();i++) {
				if(name.equals(list.get(i).getName())) {
					list.remove(list.get(i));
					flag = true;
					break;
				}
				else {
					System.out.println("삭제할 명함이 없습니다.");
				}
			}break;
			case 3 :System.out.println("수정할 명함을 입력하세요");
			name = sc.next();
			flag = false;
			for(i=0;i<list.size();i++) {
				if(name.equals(list.get(i).getName())) {
					flag = true;
					System.out.println("수정하실 전화번호 입력하세요");
					int setT = sc.nextInt();
					list.get(i).setTel(setT);
				}
			}	
			
			if(flag==false) {
				System.out.println("해당이름이 없습니다.");
			}
			break;
			case 4 : System.out.println("이름		전화번호");
			for(i=0;i<list.size();i++) {
				System.out.println(list.get(i).getName()+"		 "+list.get(i).getTel());
			}break;

			case 5 : System.out.println("종료합니다");
			break;
			default : System.out.println("1~5사이의 수 아닙니다.");
			}if(select==5) {
				break;
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
	}
}
