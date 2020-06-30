import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private int tel;
	Card(String name, int tel){
		this.name=name;
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
}
public class Ex09_06_�輱�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();
		String name;
		int tel;
		int select;
		int i;
		boolean flag;
		
		do {
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:");
			select=sc.nextInt();
			if(select==1) {
				System.out.print("�̸��� �Է��ϼ���.");
				name=sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���.");
				tel=sc.nextInt();
				Card c = new Card(name,tel);
				list.add(c);
			}
			if(select==2) {
				System.out.println("�̸��� �Է��ϼ���:");
				name=sc.next();
				flag = false;
				for(i=0;i<list.size();i++) {
					if(name.equals(list.get(i).getName())) {
						list.remove(list.get(i));
						System.out.println("�����Ǿ����ϴ�.");
						flag = true;
					}
				
				}
				if(flag == false) {
					System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
				}
				
			}
			
			if(select==3) {
				System.out.println("�̸��� �Է��ϼ���:");
				name=sc.next();
				flag = false;
				for(i=0;i<list.size();i++) {
					if(name.equals(list.get(i).getName())) {
						System.out.println("�����Ͻ� ��ȭ��ȣ��:");
						tel=sc.nextInt();
						list.set(i, new Card(name,tel));
						System.out.println("�����Ǿ����ϴ�.");
						flag = true;
					}
				}
				if(flag == false) {
					System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�.");
				}

				//			list.set(0, name);

			}
			if(select == 4) {
				System.out.println("�̸�\t"+"��ȣ");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName()+"\t"+list.get(i).getTel());
				}

			}
			if(select==5) {
				
				break;
			}
			
		}while(true);
		
		System.out.print("���α׷��� �����մϴ�.");

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