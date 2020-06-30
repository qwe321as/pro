import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	Card(String name,String tel){
		this.name = name;
		this.tel = tel;
	}
	public String toString() {

		return name +"		"+ tel;
	}
	public String getname() {
		return name;
	}
	public String gettel() {
		return tel;
	}

}
public class Ex09_06_박근주 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();
		int i;
		do {
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			int select = sc.nextInt();

			if(select==1) {
				System.out.print("이름을 입력하세요 :");
				String name = sc.next();
				System.out.print("전화번호를 입력하세요 :");
				String tel = sc.next();
				list.add(new Card(name,tel));

			}	
			else if(select==2) {
				boolean flag= false;
				System.out.print("이름을 입력하세요:");
				String name = sc.next();
				for(i=0;i<list.size();i++) {
					if(list.get(i).getname().equals(name)) {
						list.remove(i);
						System.out.println("삭제되었습니다.");
						flag=true;
						break;
					}
				}
				if(flag==false) {
					System.out.println("이름을 잘못 입력하셨습니다.");
					
				}

			}
			
			else if(select==3) {
				boolean flag = false;
				System.out.print("수정하실 이름을 입력하세요:");
				String name1 = sc.next();
				for(i=0;i<list.size();i++) {	
					
					if(list.get(i).getname().equals(name1)) {
						System.out.print("수정하실 전화번호를 입력하세요");
						String tel = sc.next();
						System.out.println("수정하실 전화번호는?"+tel);
						
						list.set(i,new Card(name1,tel));
						
						System.out.println("수정되었습니다.");
						flag = true;
						break;
						
					}//if

				}//for
				if(flag==false){
					System.out.println("이름을 잘못 입력하였습니다.");
					
				}
				}

			
			else if(select==4) {
				System.out.println("이름		전화번호");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}

			}
			else if(select==5) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");

			}
		}while(true);




	}//main

}
