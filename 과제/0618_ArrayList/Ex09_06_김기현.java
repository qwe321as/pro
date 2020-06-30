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
	String getName() {
		return name;
	}
	String getTel() {
		return tel;
	}
	
//	public String toString() {
//		return name+"        "+tel;
//	}
	
	
}
public class Ex09_06_����� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Card> c = new ArrayList<Card>();
		
		String name,tel;
		boolean f = false;
		
		while(true) {
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:");
		int select = sc.nextInt();
		
		 
			switch(select) {
		
			case 1 :	
					System.out.print("�̸��Է�:");
					name = sc.next();
					System.out.print("��ȣ�Է�:");
					tel = sc.next();
					c.add(new Card(name,tel));
					continue;
			
			case 2 :
				
				System.out.print("�̸��Է�:");
				name = sc.next();
				f=false;
				for(int i=0;i<c.size();i++) {
					if(c.get(i).getName().equals(name)) {
						c.remove(c.get(i));
						f = true;
						break;
					}
					
				}
				if(f==false) {
					System.out.println("�߸��� �̸��Դϴ�.");
					continue;
				}
			System.out.println("�����Ǿ����ϴ�.");
			continue;
			
		
			case 3 :
			System.out.print("�̸� �Է�:");
			name = sc.next();
			f=false;
			
			for(int i=0;i<c.size();i++) {
				if(c.get(i).getName().equals(name)) {
					System.out.print("������ ��ȣ��:");
					tel = sc.next();
					c.remove(c.get(i));
					c.add(i,new Card(name,tel));
					System.out.println("�����Ϸ�");
					f=true;
					break;
				}
			}				
			if(f==false)
				System.out.println("�̸��� �����ϴ�.");
			continue;
			
		
			case 4 :	
				System.out.println("�̸�\t"+"��ȣ");
			for(int i=0;i<c.size();i++) {
			System.out.print(c.get(i).getName()+"\t"+c.get(i).getTel()+"\n");
			}
			continue;
		
		
			case 5 :
			
				break;
		
		
			default :
		 	System.out.println("1~5���� ��ȣ�� �Է��ϼ���");
		
		 	continue;

			}
		
			
			
			System.out.println("���α׷��� �����մϴ�.");
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
