import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	Card(String name, String tel){
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




public class Ex09_06_��ûȣ {

	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList<Card>();

		//System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
		//Card c = new Card(name, tel);

		Scanner sc = new Scanner(System.in);
		int num,i;
		String inputname, inputtel;
		boolean flag = false;



		while(true) {System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
		System.out.println("�����Է�:");
		num = sc.nextInt();

		switch(num) {									
		case 1 : 
			System.out.print("�̸��� �Է��ϼ���:");	
			inputname = sc.next();
			System.out.println("��ȭ��ȣ�� �Է��ϼ���:");
			inputtel = sc.next();
			Card input =new Card(inputname, inputtel);
			list.add(input);
			break;
		case 2 : 
			System.out.println("������ �̸��� �Է��ϼ���:");
			inputname = sc.next();
			for(i=0;i<list.size();i++) {
				Card c = list.get(i);
				if(c.getName().equals(inputname)) {
					list.remove(i);
					flag = true;
					System.out.println("���� �Ǿ����ϴ�.");
					break;
					}
			}
			if(flag = false) {
				System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");
			}
			

			break;
		case 3 : 
			System.out.print("�̸��� �Է��ϼ���:");	
			inputname = sc.next();
			
			for(i=0;i<list.size();i++) {
				Card c = list.get(i);
				
			if(c.getName().equals(inputname)) {
				System.out.println("������ ��ȭ��ȣ�� �Է��ϼ���:");
				inputtel = sc.next();
				c.setTel(inputtel);
				
//				Card edit = new Card(inputname, inputtel);
//				list.set(i,edit);
				System.out.println("�����Ǿ����ϴ�.");
				flag =true;
				break;
				}
			
			}
			if(flag == false) {
				System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");
			}
			
		break;
		case 4 : System.out.println("�̸�\t��ȭ��ȣ");
		for(i=0;i<list.size();i++) {
			Card c = list.get(i);
			System.out.println(c.getName() + "\t" + c.getTel());
		}
		break;

		case 5 : 
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default : 
			System.out.println("1~5������ ��ȣ�� �Է°�����.");

		}




		//System.out.println(select);

		}
	}	//switch) {
	//		System.out.println("�̸��� �Է�");
	//		String title = sc.next();
	//		System.out.println("����:");sa
	
	//		String singer = sc.next();
	//		System.out.println("����");
	//		int price = sc.nextInt();
}	


//switch ���̽���




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