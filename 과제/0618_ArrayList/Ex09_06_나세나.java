import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	Card(String name, String tel){
		this.name=name;
		this.tel=tel;
	}

	public String toString() {
		return name+"    "+tel;
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


}


public class Ex09_06_������ {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Card> list=new ArrayList<Card>();

		String name, tel, del, revname, revtel;
		int i, select;


		while(true) {
			System.out.println();
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.���� :");
			select = sc.nextInt();
			boolean flag=false;


			switch(select) {
			case 1 :
				System.out.print("�̸��� �Է��ϼ���:");
				name=sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
				tel=sc.next();

				list.add(new Card(name, tel));

				//				System.out.println(list.toString());


				continue;


			case 2:
				flag=false;
				System.out.print("�̸��� �Է��ϼ���:");
				del=sc.next();

				for(i=0;i<list.size();i++) {

					if(list.get(i).getName().equals(del)) {

						list.remove(i);
						System.out.println("�����Ǿ����ϴ�");
						flag=true;
						continue;
					}
				}
				if(flag==false) {
					System.out.println("�̸��� �߸� �Է��߽��ϴ� ");
					continue;
				}

				//				System.out.println(list.toString());


				continue;

			case 3:
				while(true) {
					flag=false;
					System.out.print("�̸��� �Է��ϼ���:");
					name=sc.next();

					for(i=0;i<list.size();i++) {
						if(list.get(i).getName().equals(name)) {
							System.out.print("������ ��ȭ��ȣ�� �Է��ϼ���:");
							revtel=sc.next();
							list.set(i, new Card(name, revtel));
							flag=true;
							break;
						}


					}
					if(flag==false) {
						System.out.println("�̸��� �߸� �Է��߽��ϴ� ");
						break;
					}
					System.out.println("�����Ǿ����ϴ�");
					break;


				}

				continue;
			case 4: 
				System.out.println("�̸�         ��ȭ��ȣ");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i).toString());
				}

				continue;
			case 5:System.out.println("���α׷��� �����մϴ�");
			break;

			}//switch
			break;
		}



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