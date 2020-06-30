import java.util.ArrayList;
import java.util.Scanner;

class Card {
	private String name;
	private String tel;

	Card(String name, String tel) {
		this.name = name;
		this.tel = tel;

	}

//	void setName() {
//		this.name = name;
//	}
	String getName() {
		return name;
	}

	String getTel() {
		return tel;
	}
	
	void setName(String name) {
		this.name =name;
	}
	void setTel(String tel) {
		this.tel = tel;
	}
	public String toString() {
		return name + "/" + tel;
	}
}

public class Ex09_06_�濬�� {
	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<Card>();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			String name;
			String tel;
			int i;
			int select = sc.nextInt();
			boolean flag, flag2;

			switch (select) {
			case 1:
				System.out.println("�̸��� �Է��ϼ���1");
				name = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���");
				tel = sc.next();
				Card c = new Card(name, tel);
				list.add(c);
				System.out.println(list);
				continue;
			case 2:

				flag = false;
				System.out.println("�̸��� �Է��ϼ���2");
				name = sc.next();
				for (i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						list.remove(i);
						System.out.println("�����Ǿ����ϴ�.");
						flag = true;
					}
				}
				if (flag == false) {
					System.out.println("�߸��Է��ϼ̾��ϴ�.");
				}
				continue;
			case 3:
				flag2 = false;
				System.out.println("�̸��� �Է��ϼ���3");
				name = sc.next();

				for (i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						System.out.println("�����Ͻ� ��ȭ��ȣ��?");
						tel = sc.next();
						list.get(i).setTel(tel);
						System.out.println("�����Ǿ����ϴ�.");
						flag2 = true;
					}
				}
				if (flag2 == false) {
					System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�. ");
					
				}
				continue;
			case 4:
				System.out.println("���̵� " + "��ȭ��ȣ ");
				for (i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				continue;
			case 5:
				System.out.println("�ý��� �����մϴ�.");
				System.exit(0);

			}
		} while (true);
	}

}

//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:1
//�̸��� �Է��ϼ��� : kim
//��ȭ��ȣ�� �Է��ϼ��� : 1234
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:1
//�̸��� �Է��ϼ��� : park
//��ȭ��ȣ�� �Է��ϼ��� : 3333
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//park		3333
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:3
//�̸��� �Է��ϼ��� : park
//�����Ͻ� ��ȭ��ȣ�� : 7777
//�����Ǿ����ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//park		7777
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:3
//�̸��� �Է��ϼ��� : choi
//�̸��� �߸��Է��ϼ̽��ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:2
//�̸��� �Է��ϼ��� : park
//�����Ǿ����ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:2
//�̸��� �Է��ϼ��� : hong
//�̸��� �߸��Է��ϼ̽��ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:5
//���α׷��� �����մϴ�.