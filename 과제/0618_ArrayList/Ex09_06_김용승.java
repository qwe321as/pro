import java.util.*;

class Card{
	private String name;
	private int tel;

	Card(String name, int tel){
		this.name = name;
		this.tel = tel;
	}

	String getName() {
		return name;
	}
	int getTel() {
		return tel;
	}


}

public class Ex09_06_���� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inName;
		int inTel;
		int select;
		int i;
		boolean flag;

		ArrayList<Card> list = new ArrayList<Card>();

		while(true) {

			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			System.out.print("����>>>>");
			//select = sc.nextInt();
			select = chkInt("���ڸ� �Է��ϼ���.");
			flag = false;
			switch(select) {
			case 1 :
				System.out.print("�̸��� �Է��ϼ��� : ");
				inName = sc.next();
				//inName = chkString("���ڸ� �Է��ϼ���");
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				//inTel = sc.nextInt();
				inTel = chkInt("���ڸ� �Է��ϼ���.");
				list.add(new Card(inName,inTel));
				System.out.println("�߰� �Ǿ����ϴ�.");
				break;

			case 2 : 
				System.out.print("�̸��� �Է��ϼ��� : ");
				inName = sc.next();
				for(i=0;i<list.size();i++) {
					if(inName.equals(list.get(i).getName())){
						list.remove(list.get(i));
						flag = true;
					}
				}
				if(!flag) System.out.println("�ش� �̸��� �����ϴ�.");
				else System.out.println("���� �Ǿ����ϴ�.");
				break;
			case 3 :
				System.out.print("�̸��� �Է��ϼ��� : ");
				inName = sc.next();
				for(i=0;i<list.size();i++) {
					if(inName.equals(list.get(i).getName())) {
						flag = true;
					}
				}
				if(!flag)System.out.println("�ش� �̸��� �����ϴ�.");
				else {
					System.out.print("������ ��ȭ��ȣ�� �Է��ϼ��� : ");
					//inTel = sc.nextInt();
					inTel = chkInt("���ڸ� �Է��ϼ���.");
					for(i=0;i<list.size();i++) {
						if(inName.equals(list.get(i).getName())) {
							list.set(list.indexOf(list.get(i)),new Card(inName,inTel));
						}
					}
				}
				break;
			case 4 :
				System.out.println("�̸�		��ȭ��ȣ");
				for(i=0; i<list.size();i++) {
					System.out.println(list.get(i).getName()+"		"+list.get(i).getTel());
				}
				break;
			case 5 :
				System.out.println("�����մϴ�.");
				break;
			default : System.out.println("1~5 �� �Է��ϼ���.");
			}
			if(select==5)break;
		}
	}// main
	// �����Է� �߿� ����? üũ
	/*
	static String chkString(String s) {
		Scanner sc = new Scanner(System.in);
		
	}*/
	
	// ���� �Է� �߿� ����? üũ
	static int chkInt(String s) {
		Scanner sc = new Scanner(System.in);
		int st = 0;
		boolean flag = false;
		while(!flag) {
			try {
				st = sc.nextInt();
				break;
			}
			catch(Exception e) {
				System.out.print(s);
				sc = new Scanner(System.in);
			}
		}
		return st;
	}
}//class
