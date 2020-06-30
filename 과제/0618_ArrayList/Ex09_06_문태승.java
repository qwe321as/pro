import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	public Card(String name,String tel) {
		super();
		this.name=name;
		this.tel=tel;

	}
	public String getName(){
		return name;
	}
	public String getTel(){
		return tel;
	}
}



public class Ex09_06_���½� {
	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList<Card>();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		int i;
		while(true) {
			flag=false;
			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����"); 
			int select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("�̸��� �Է��ϼ���:");
				String name = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���:");
				String tel = sc.next();
				Card c = new Card(name,tel);
				list.add(c);
				break;

			case 2:
				System.out.println("�̸��� �Է��ϼ���:");
				name = sc.next();
				for(i=0;i<list.size();i++) {
					if(name.equals(list.get(i).getName())) {
						list.remove(i);
						flag=true;
						break;
					}
				}

				if(!flag) {
					System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");
				}
				else {
					System.out.println("�����Ǿ����ϴ�.");
				}
				break;

			case 3:
				System.out.println("�̸��� �Է��ϼ���:");
				name = sc.next();

				for(i=0;i<list.size();i++) {
					if(name.equals(list.get(i).getName())) {
						System.out.println("�����Ͻ� ��ȭ��ȣ��:");
						tel = sc.next();
						list.set(i, new Card(name, tel));
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
				}
				else {
					System.out.println("�����Ǿ����ϴ�.");
				}
				break;
			case 4:
				System.out.println("�̸�          ��ȭ��ȣ");
				for(i=0;i<list.size(); i++) {
					System.out.println(list.get(i).getName() + "      " + list.get(i).getTel());
				}

				break;
			case 5:	
				break;
			default:
				System.out.println("�ٽ� �������ּ���.");
			}
			if(select==5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
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
