import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

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

	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "이름 " + name + "," + " 전화번호:" +tel ;
	}
}

public class Ex09_06_김범규 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요");
		String retry;

		ArrayList<Card> list = new ArrayList<Card>();


		while(true) {
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			int select = sc.nextInt();
			int i; 
			boolean flag = false;

			if(select == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			switch(select) {
			case 1 :
				System.out.println("이름을 입력하세요");
				String name = sc.next();
				System.out.println("전화번호를 입력하세요");
				String tel = sc.next();
				list.add(new Card(name,tel));
				break;
			case 2 :
				System.out.println("이름을 입력하세요");
				name = sc.next();
				for(i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
					}
				}
				System.out.println("삭제되었습니다.");
				break;
			case 3 : 
				System.out.println("이름을 입력하세요");
				name = sc.next();

				for(i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						System.out.println("바꾸실 전화번호를 입력하세요.");
						tel = sc.next();
						list.get(i).setTel(tel);
						flag = true;
						break;
					}
				}
				if(flag == false) {
					System.out.println("이름을 잘못입력하였습니다.");
				}
				break;
			case 4 :
				System.out.println("이름"+"\t"+"전화번호");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName()+"\t"+list.get(i).getTel());
				}

				break;
			default :
				break;
			}
		}


	}

}
