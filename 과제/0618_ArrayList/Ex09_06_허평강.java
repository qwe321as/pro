import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private int tel;


	Card(String name,int tel){
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


	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}







}
public class Ex09_06_���� {
	public static void main(String[] args) {


		ArrayList<Card> list  = new ArrayList<Card>(); 
		boolean flag=false;
		int i;
		int tel;
		String name;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			System.out.print("��ȣ�� �Է��ϼ��� :");
			int select = sc.nextInt();

			switch(select) {
			case 1 : System.out.println("�̸��� �Է��ϼ���");
			name = sc.next();
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			tel = sc.nextInt();
			list.add(new Card (name,tel));
			break;
			case 2 :System.out.println("������ ������ �Է��ϼ���");
			name = sc.next();
			for(i=0;i<list.size();i++) {
				if(name.equals(list.get(i).getName())) {
					list.remove(list.get(i));
					flag = true;
					break;
				}
				else {
					System.out.println("������ ������ �����ϴ�.");
				}
			}break;
			case 3 :System.out.println("������ ������ �Է��ϼ���");
			name = sc.next();
			flag = false;
			for(i=0;i<list.size();i++) {
				if(name.equals(list.get(i).getName())) {
					flag = true;
					System.out.println("�����Ͻ� ��ȭ��ȣ �Է��ϼ���");
					int setT = sc.nextInt();
					list.get(i).setTel(setT);
				}
			}	
			
			if(flag==false) {
				System.out.println("�ش��̸��� �����ϴ�.");
			}
			break;
			case 4 : System.out.println("�̸�		��ȭ��ȣ");
			for(i=0;i<list.size();i++) {
				System.out.println(list.get(i).getName()+"		 "+list.get(i).getTel());
			}break;

			case 5 : System.out.println("�����մϴ�");
			break;
			default : System.out.println("1~5������ �� �ƴմϴ�.");
			}if(select==5) {
				break;
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
	}
}
