import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	public Card(String name, String tel) {
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
		return name + "/" + tel;
	}


}
public class Ex09_06_김문관 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		ArrayList<Card> list = new ArrayList<Card>();

		while(true) {
			System.out.println("1.명함추가|2.명함삭제|3.명함수정|4.명함보기|5.종료");
			System.out.print("번호>>>");
			int select = scan.nextInt();


			if(select == 5) {
				System.out.println();
				break;
			}

			switch(select){

			case 1:
				System.out.print("이름을 입력하세요 :");
				String inputName = scan.next();
				System.out.print("전화번호를 입력하세요 :");
				String inputTel = scan.next();

				list.add(new Card(inputName, inputTel));

				break;
			
			case 2:
				System.out.print("삭제할 이름을 입력 하세요 :");
				String delName = scan.next();
				flag = false;
				for(int i = 0; i < list.size(); i++) {
					if(delName.equals(list.get(i).getName())) {
						list.remove(list.get(i));
						flag = true;
						break;
					}
				}

				if(flag == false) {
					System.out.println("입력하신 이름이 없습니다.");
				}else {
					System.out.println("삭제 되셨습니다.");
				}
				break;

			case 3:
				System.out.println("번호를 수정 할 이름을 입력하세요 : ");
				String setN = scan.next();
				System.out.println("변경 시키고 싶은 번호를 입력하세요.");
				String setT = scan.next();
				flag = false;
				for(int i = 0; i < list.size(); i++) {
					if(setN.equals(list.get(i).getName())) {
						list.get(i).setTel(setT);
						flag = true;
					}
				}
				
				if(flag == false) {
					System.out.println("입력한 이름이 없습니다.");
				}else {
					System.out.println("수정 되셨습니다.");
				}
				
				break;

			case 4:
				System.out.println("이름\t" + "전화번호");
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName()+"\t"+list.get(i).getTel());
				}
				
				break;

			default : 
				System.out.println("잘못 입력 하셨습니다. 다시 입력 하세요.");

			}


		}//while 

		System.out.println("시스템을 종료 합니다.");

	}

}
