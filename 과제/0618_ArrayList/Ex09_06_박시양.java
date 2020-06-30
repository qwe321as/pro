import java.util.ArrayList;
import java.util.Scanner;


class Card{
	private String name;
	private String tel;

	Card(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	public Card(int i) {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String toString() {
		return name +" - "+tel;
	}
}

public class Ex09_06_박시양{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		String tel;
		int i;
		int input = 0;

		ArrayList<Card> list = new ArrayList<Card>();
		System.out.println("명함 만들기");

		do {
			System.out.println("(번호선택)");
			System.out.println("1.만들기 , 2.변경, 3.목록, 4.삭제, 5.종료");
			input = sc.nextInt();

			if(input > 5) {
				System.out.println("잘못 눌렀습니다. (다시 입력)");
			}

			if(input == 5) {
				System.out.println("종료");
				break;
			}

			if(input == 1) {
				System.out.println("이름 입력");
				name = sc.next();
				System.out.println("전화번호 입력");
				tel = sc.next();
				Card c  = new Card(name, tel);
				list.add(c);
				System.out.println(c);
			}

			if(input == 2) {
				System.out.println("이름 입력");
				name = sc.next();

				for(i=0; i<list.size(); i++) {
					if(!name.equals(list)) {
						System.out.println("이름이 없습니다.(다시입력)");
					}

					if(list.get(i).getName().equals(name)) {
						System.out.println("변경 할 전화번호 입력");	

						tel = sc.next();
						list.get(i).setTel(tel);
						System.out.println("전화 번호가 변경 되었습니다.");
					}
				}
			}

			if(input == 3) {
				System.out.println("[목록]\n" + list);
			}
			if(input == 4) {
				System.out.println("이름입력");
				name = sc.next();

				for(i=0; i<list.size(); i++) {

					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println("삭제 되었습니다.");
						continue;
					}

					if(!name.equals(list)) {
						System.out.println("이름이 없습니다.(다시입력)");
					}
				}
			}

		}while(true);

	}//main
}//class






