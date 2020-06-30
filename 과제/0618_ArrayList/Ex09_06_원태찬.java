import java.util.ArrayList;
import java.util.Scanner;



class Card{
	private String name;
	private String number;
	Card(String name,String number){
		this.name=name;
		this.number=number;
	}

	public String toString() {
		return "Card [name=" + name + ", number=" + number + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}



public class Ex09_06_������ {
	public static void main(String[] args) {
		ArrayList<Card> list=new ArrayList<Card>();
		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:");
			int f=sc.nextInt();
			int i,sw=0;
			switch(f) {
			case 1:
				System.out.print("�̸��� �Է��ϼ���:");
				String a=sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
				String b=sc.next();
				list.add(new Card(a,b));
				break;
			case 2:System.out.print("�̸��� �Է��ϼ���:");
			String e=sc.next();
			sw=0;
			for(i=0;i<list.size();i++) {
				if(e.equals(list.get(i).getName())) {
					list.remove(list.get(i));
					System.out.println("�����Ǿ����ϴ�.");
					sw=1;
				}}
			if(sw==0) {
				System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�.");
			}
			break;
			case 3:
				System.out.print("�̸��� �Է��ϼ���:");
				String c=sc.next();
				sw=0;
				for(i=0;i<list.size();i++) {
					if(c.equals(list.get(i).getName())) {
						sw=1;
						System.out.print("�����Ͻ� ��ȭ��ȣ��:");
						String d=sc.next();
						list.set(i,new Card(c,d));
						System.out.println("�����Ǿ����ϴ�.");
					}}



				if(sw==0) {
					System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�.");
				}
				break;

			case 4:
				for(i=0;i<list.size();i++) {
					System.out.println("�̸�:"+list.get(i).getName()+"\t��ȭ��ȣ"+list.get(i).getNumber());
				}
				break;
			case 5:System.out.println("���α׷��� �����մϴ�.");
			break;

			
			}if(f==5) {
				break;
			}
		}while(true);
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

