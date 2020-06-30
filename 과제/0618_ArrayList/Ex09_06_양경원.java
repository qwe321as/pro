import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	public Card(String name,String tel) {
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
	public String toString() {
		return name+"\t"+ tel;
	}
}

public class Ex09_06_양경원 {

	public static void main(String[] args) {
		ArrayList<Card> arr = new ArrayList<Card>();

		String name;
		do {

			System.out.println("1.명함추가  2.명함삭제  3.명함수정  4.명함보기  5.종료");

			Scanner sc = new Scanner(System.in);

			int select = sc.nextInt();
			if(select == 5) {
				System.out.println("시스템을 종료합니다");
				break;
			}
			switch (select) {
			case 1:

				System.out.print("이름을 입력하세요");
				name = sc.next();
				System.out.print("전화번호를 입력하세요");
				String num = sc.next();

				arr.add(new Card(name,num));

				//System.out.println(arr);
				break;
			case 2:

				System.out.print("이름을 입력하세요");
				name = sc.next();
				for(int i=0; i<arr.size();i++) {
					if(name.equals(arr.get(i).getName())) {
						arr.remove(arr.get(i));
					}
				}

				System.out.println("삭제되었습니다.");
				break;
			case 3:

				boolean flag = false;
				System.out.print("이름을 입력하세요");
				name = sc.next();
				for(int i=0; i<arr.size();i++) {
					if(arr.get(i).getName().equals(name)) {
						System.out.print("바꾸실 전화번호를 입력하세요. :");
						String tel = sc.next();
						arr.get(i).setTel(tel);
						System.out.println("변경되었습니다.");
						flag=true;
						break;
					}
				}
				if(flag == false) {
					System.out.println("이름을 잘못 입력하였습니다.");

				}
				break;
			case 4:
				System.out.println("이름"+"\t"+"전화번호");
				for(int i=0;i<arr.size();i++) {
					System.out.println(arr.get(i).getName()+"\t"+arr.get(i).getTel());
				}
				break;
			default:
				break;
			}
		}while(true);
	}
}
