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

public class Ex09_06_�ڽþ�{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		String tel;
		int i;
		int input = 0;

		ArrayList<Card> list = new ArrayList<Card>();
		System.out.println("���� �����");

		do {
			System.out.println("(��ȣ����)");
			System.out.println("1.����� , 2.����, 3.���, 4.����, 5.����");
			input = sc.nextInt();

			if(input > 5) {
				System.out.println("�߸� �������ϴ�. (�ٽ� �Է�)");
			}

			if(input == 5) {
				System.out.println("����");
				break;
			}

			if(input == 1) {
				System.out.println("�̸� �Է�");
				name = sc.next();
				System.out.println("��ȭ��ȣ �Է�");
				tel = sc.next();
				Card c  = new Card(name, tel);
				list.add(c);
				System.out.println(c);
			}

			if(input == 2) {
				System.out.println("�̸� �Է�");
				name = sc.next();

				for(i=0; i<list.size(); i++) {
					if(!name.equals(list)) {
						System.out.println("�̸��� �����ϴ�.(�ٽ��Է�)");
					}

					if(list.get(i).getName().equals(name)) {
						System.out.println("���� �� ��ȭ��ȣ �Է�");	

						tel = sc.next();
						list.get(i).setTel(tel);
						System.out.println("��ȭ ��ȣ�� ���� �Ǿ����ϴ�.");
					}
				}
			}

			if(input == 3) {
				System.out.println("[���]\n" + list);
			}
			if(input == 4) {
				System.out.println("�̸��Է�");
				name = sc.next();

				for(i=0; i<list.size(); i++) {

					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println("���� �Ǿ����ϴ�.");
						continue;
					}

					if(!name.equals(list)) {
						System.out.println("�̸��� �����ϴ�.(�ٽ��Է�)");
					}
				}
			}

		}while(true);

	}//main
}//class






