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
	
}



public class Ex09_06_���̸� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Card> list = new ArrayList<Card>();
		int i;
		
		while(true) {
			System.out.println();
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.���� : "); 
			
			int select = sc.nextInt();
			String name,tel;
			boolean flag =false;
			
			switch(select) {
			case 1: // �����߰�
				System.out.print("�̸��� �Է��ϼ��� :");
				name = sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� :");
				tel = sc.next();
				Card input = new Card(name,tel);
				list.add(input);
				break;
				
			case 2:
				System.out.print("������ �̸��� �Է��ϼ��� :");
				name = sc.next();
				for(i=0;i<list.size();i++) {
					Card c = list.get(i);
					if(c.getName().equals(name)) {
						list.remove(i);
//						list.remove(list.get(i));
						flag = true;
						System.out.println("�����Ǿ����ϴ�.");
						break;
					}
				}
				if(flag == false)
					System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");
				
					break;
					
			case 3:
				System.out.print("������ �̸��� �Է��ϼ��� :");
				name = sc.next();
				
				for(i=0;i<list.size();i++) {
					Card c = list.get(i);
					if(c.getName().equals(name)) {
						System.out.print("������ ��ȭ��ȣ�� �Է��ϼ��� :");
						tel = sc.next();
						c.setTel(tel);
						
//						Card edit = new Card(name,tel);
//						list.set(i,edit);
						System.out.println("�����Ǿ����ϴ�.");
						flag = true;
						break;
					}
				}
				
				if(flag == false) {
					System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");
				}
				
					break;
			case 4: // ���Ժ���
					System.out.println("�̸�\t��ȭ��ȣ");
					for(i=0;i<list.size();i++) {
						Card c = list.get(i);
						System.out.println(c.getName()+"\t"+c.getTel());
					}
					break;		
			case 5:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
					break;
			default:
					System.out.println("1~5������ ��ȣ�� �Է°�����");
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








