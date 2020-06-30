import java.util.*;

class Card{
	private String name;
	private String tel;

	public Card(String name, String tel){
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String toString() {
		return "\n" +   name + "    " + tel ;
	}


}//class Card

public class Ex09_06_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Card c = null;
		int i;
		int num ;
		String putName;
		String putTel;
		String deleteName;
		ArrayList<Card> list = new ArrayList<Card>();
		boolean flag = false;

		while(true) {

			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.���� ");
			num = sc.nextInt();

			if(num==1) { 
				while(true) {

					System.out.print("�̸��� �Է��ϼ��� : ");
					String name = sc.next();
					System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
					String tel = sc.next();

					c = new Card (name ,tel);
					list.add(c);

					System.out.println("continue?(yes or no)");
					String retry = sc.next();
					if(retry.equalsIgnoreCase("no")) 
						break;
				}//while
				continue;
			}//if

			else if(num==4) { 
				System.out.println("�̸�" +"\t"+"��ȭ��ȣ");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName() + "\t" + list.get(i).getTel());
				}

			}

			else if(num==3) { 
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
			else if(num==2) {
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

			else if(num==5) {
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








