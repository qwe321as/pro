import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	public Card(String name, String tel) {
		super();
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
	@Override
	public String toString() {
		return "Card [name=" + name + ", tel=" + tel + "]";
	}
	
	
}
public class Ex09_06_����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Card c = null;
		int i;
		int select ;
		String putName;
		String putTel;
		String deleteName;
		ArrayList<Card> list = new ArrayList<Card>();
		boolean flag = false;

		while(true) {

			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.���� ");
			select = sc.nextInt();

			if(select==1) { 
				while(true) {

					System.out.print("�̸��� �Է��ϼ��� : ");
					String name = sc.next();
					System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
					String tel = sc.next();

					c = new Card (name ,tel);
					list.add(c);

					System.out.println("continue?(y or n)");
					String retry = sc.next();
					if(retry.equalsIgnoreCase("n")) 
						break;
				}//while
				continue;
			}//if

			else if(select==4) { 
				System.out.println(" �̸�" + "    ��ȭ��ȣ" + list.toString());
				System.out.println();

			}

			else if(select==3) { 
				flag = false; 
				System.out.println("��ȭ��ȣ�� �ٲ� �̸��� �Է��ϼ���");
				putName = sc.next();
				for(i=0;i<list.size();i++) {
					if(putName.equalsIgnoreCase(list.get(i).getName())) {
						flag = true;
						System.out.println("�����Ͻ�"+ putName +"�� ��ȭ��ȣ�� : ");
						putTel = sc.next();
						list.set(i,new Card(putName,putTel));
					}
				}
				if(flag==false) {
					System.out.println("�̸��� �������� �ʽ��ϴ�.");
				}
			}
			else if(select==2) {
				flag = false; 
				System.out.println("������ �̸��� �Է��ϼ���");
				deleteName = sc.next();
				for(i=0;i<list.size();i++) {
					if(deleteName.equalsIgnoreCase(list.get(i).getName())) {
						flag = true; 
						System.out.println(deleteName + "�� ������ �����Ǿ����ϴ�.");
						list.remove(list.get(i));
					}

				}
				if(flag == false) {
					System.out.println("�̸��� �������� �ʽ��ϴ�.");
				}
			}

			else if(select==5) {
				break;
			}
		}//while
		System.out.println("���α׷��� �����մϴ�.");



	}//main

}//public class









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

