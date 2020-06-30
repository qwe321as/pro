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
public class Ex09_06_�蹮�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		ArrayList<Card> list = new ArrayList<Card>();

		while(true) {
			System.out.println("1.�����߰�|2.���Ի���|3.���Լ���|4.���Ժ���|5.����");
			System.out.print("��ȣ>>>");
			int select = scan.nextInt();


			if(select == 5) {
				System.out.println();
				break;
			}

			switch(select){

			case 1:
				System.out.print("�̸��� �Է��ϼ��� :");
				String inputName = scan.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� :");
				String inputTel = scan.next();

				list.add(new Card(inputName, inputTel));

				break;
			
			case 2:
				System.out.print("������ �̸��� �Է� �ϼ��� :");
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
					System.out.println("�Է��Ͻ� �̸��� �����ϴ�.");
				}else {
					System.out.println("���� �Ǽ̽��ϴ�.");
				}
				break;

			case 3:
				System.out.println("��ȣ�� ���� �� �̸��� �Է��ϼ��� : ");
				String setN = scan.next();
				System.out.println("���� ��Ű�� ���� ��ȣ�� �Է��ϼ���.");
				String setT = scan.next();
				flag = false;
				for(int i = 0; i < list.size(); i++) {
					if(setN.equals(list.get(i).getName())) {
						list.get(i).setTel(setT);
						flag = true;
					}
				}
				
				if(flag == false) {
					System.out.println("�Է��� �̸��� �����ϴ�.");
				}else {
					System.out.println("���� �Ǽ̽��ϴ�.");
				}
				
				break;

			case 4:
				System.out.println("�̸�\t" + "��ȭ��ȣ");
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName()+"\t"+list.get(i).getTel());
				}
				
				break;

			default : 
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է� �ϼ���.");

			}


		}//while 

		System.out.println("�ý����� ���� �մϴ�.");

	}

}
