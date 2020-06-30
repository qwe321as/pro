import java.util.ArrayList;
import java.util.Scanner;
class Card{
	private String name;
	private String tel;

	public Card(String name, String tel) {
		super();
		this.name=name;
		this.tel=tel;
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
		return name+"     "+tel+"\n";
	}
}
public class Ex09_06_������ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();

		do { 
			System.out.println();
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����\n  �������ּ���.>>>");
			int select = sc.nextInt();
			System.out.println();

			switch(select) { 
			case 1:
				System.out.print("�̸��� �Է��ϼ���. :");
				String inputName = sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� :");
				String inputTel = sc.next();
				list.add(new Card(inputName, inputTel));				
				continue;

			case 2:
				System.out.print("�̸��� �Է��ϼ���. :");
				String inputName2 = sc.next();
				boolean Name = false;
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(inputName2)) {
						Name = true;
						list.remove(i);
						System.out.println(inputName2+" ��(��) �����Ǿ����ϴ�.");

					}
				}
				if(!Name) {
					System.out.println("�ش� �̸��� ������ �����ϴ�.");
				}
				continue;
			case 3:
				System.out.print("�̸��� �Է��ϼ���. :");
				String inputName3 = sc.next();
				boolean Name1 = false;
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(inputName3)) {
						Name1 = true;
						System.out.print("�����Ͻ� ��ȭ��ȣ�� �Է��ϼ���.:");
						String inputTel2 = sc.next();
						list.get(i).setTel(inputTel2);
						System.out.println(inputName3+"��(��) ��ȭ��ȣ�� ����Ǿ����ϴ�.");

					}
				}
				if(!Name1) {
					System.out.println("�ش� �̸��� ������ �����ϴ�.");
				}
				continue;
			case 4:
				System.out.print("�̸�"+"            "+"��ȭ��ȣ\n");
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName()+"     "+list.get(i).getTel());}
				continue;
			case 5 :
				break;

			}//switch
			break;

		}while(true);
		System.out.println("���α׷��� �����մϴ�.");





	}//main

}//class

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
