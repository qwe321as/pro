import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	Card(String name, String tel){
		this.name=name;
		this.tel=tel;
	}

	public String toString() {
		return name+"    "+tel;
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


public class Ex09_06_나세나 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Card> list=new ArrayList<Card>();

		String name, tel, del, revname, revtel;
		int i, select;


		while(true) {
			System.out.println();
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료 :");
			select = sc.nextInt();
			boolean flag=false;


			switch(select) {
			case 1 :
				System.out.print("이름을 입력하세요:");
				name=sc.next();
				System.out.print("전화번호를 입력하세요:");
				tel=sc.next();

				list.add(new Card(name, tel));

				//				System.out.println(list.toString());


				continue;


			case 2:
				flag=false;
				System.out.print("이름을 입력하세요:");
				del=sc.next();

				for(i=0;i<list.size();i++) {

					if(list.get(i).getName().equals(del)) {

						list.remove(i);
						System.out.println("삭제되었습니다");
						flag=true;
						continue;
					}
				}
				if(flag==false) {
					System.out.println("이름을 잘못 입력했습니다 ");
					continue;
				}

				//				System.out.println(list.toString());


				continue;

			case 3:
				while(true) {
					flag=false;
					System.out.print("이름을 입력하세요:");
					name=sc.next();

					for(i=0;i<list.size();i++) {
						if(list.get(i).getName().equals(name)) {
							System.out.print("수정할 전화번호를 입력하세요:");
							revtel=sc.next();
							list.set(i, new Card(name, revtel));
							flag=true;
							break;
						}


					}
					if(flag==false) {
						System.out.println("이름을 잘못 입력했습니다 ");
						break;
					}
					System.out.println("수정되었습니다");
					break;


				}

				continue;
			case 4: 
				System.out.println("이름         전화번호");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i).toString());
				}

				continue;
			case 5:System.out.println("프로그램을 종료합니다");
			break;

			}//switch
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