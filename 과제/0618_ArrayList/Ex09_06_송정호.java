import java.util.ArrayList;
import java.util.Scanner;

class Card {
	
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

	public String getTel() {
		return tel;
	}
}

public class Ex09_06_����ȣ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Card> list = new ArrayList<Card>();
		
		String name, tel;
		boolean check;
		
		while(true) {
			
			check = false;
			
			System.out.println("1.�����߰�  2.���Ի���  3.���Լ���  4.���Ժ���  5.����");
			System.out.print("���� : ");
			int select = sc.nextInt();
			
			switch(select) {
			
			case 1:
				System.out.println("<���� �߰�>");
				System.out.print("�� �� : ");
				name = sc.next();
				System.out.print("��ȭ ��ȣ : ");
				tel = sc.next();
				
				list.add(new Card(name, tel));
				System.out.println("�߰� �Ϸ�!");
				
				break;
				
			case 2:
				System.out.println("<���� ����>");
				System.out.print("�� �� : ");
				name = sc.next();
				
				for(int i = 0; i < list.size(); i++) {
					if(name.equals(list.get(i).getName())) {
						list.remove(i);
						check = true;
						break;
					}
				}
				
				if(!check) {
					System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
				}
				else {	
					System.out.println("���� �Ϸ�!");
				}
				
				break;
				
			case 3:
				System.out.println("<���� ����>");
				System.out.print("�� �� : ");
				name = sc.next();
				
				for(int i = 0; i < list.size(); i++) {
					if(name.equals(list.get(i).getName())) {
						System.out.print("�����Ͻ� ��ȭ��ȣ : ");
						tel = sc.next();
						list.set(i, new Card(name, tel));
						check = true;
						break;
					}
				}
				
				if(!check) {
					System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
				}
				else {					
					System.out.println("���� �Ϸ�!");
				}
				
				break;
				
			case 4:
				System.out.println("<���� ����>");
				System.out.println("�̸�     ��ȭ��ȣ");
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName() + "  " + list.get(i).getTel());
				}
				
				break;
				
			case 5:
				System.out.println("<���α׷� ����>");
				
				break;
				
			default :
				System.out.println("�ٽ� �������ּ���.");
			}
			
			if(select == 5) {
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