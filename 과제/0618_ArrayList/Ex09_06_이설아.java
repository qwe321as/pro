import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	Card(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	String getName(){
		return name;
	}
	String getTel(){
		return tel;
	}
	public String toString() {
		return name + "/" + tel;
	}



}


public class Ex09_06_�̼��� {
	public static void main(String[] args) {
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

		ArrayList<Card> list =  new ArrayList <Card>();
		Scanner sc = new Scanner (System.in);
		int i;

		while(true) {

			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			System.out.print("��ȣ����>> ");
			int select = sc.nextInt();
			String name, tel;
			boolean flag = false;

			if(select==1) {
				System.out.print("�̸��� �Է��ϼ���: ");
				name= sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
				tel= sc.next();
				Card c = new Card(name, tel);
				list.add(c);

			}
			else if(select==2) {
				flag = false;
				System.out.print("������ �̸�: ");
				name= sc.next();
				for(i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).getName())){
						list.remove(list.get(i));
						flag =true;
						System.out.println("�����Ǿ����ϴ�.");
						break;
					}
				}
				if(flag==false)
					System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");

			}
			else if(select==3) {
				flag=false;
				System.out.print("������ �̸�: ");
				name= sc.next();
				System.out.print("������ ��ȭ��ȣ :");
				String number= sc.next();

				for(i=0; i<list.size(); i++) {

					if(name.equals(list.get(i).getName())) 
						list.set(list.indexOf(list.get(i)), new Card(name,number));
					System.out.println("�����Ǿ����ϴ�.");
					flag= true;
					break;
				}

				if(flag==false) {
					System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");
				}




			}
			else if(select==4) {
				System.out.println(list.toString());

			}
			else if(select==5) {
				break;
			}
			else {
				System.out.println("1~5�� ���ڸ� �Է��� �ּ���");
			}

		} System.out.println("���α׷��� �����մϴ�");






	}

}
