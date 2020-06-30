import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

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

	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "�̸� " + name + "," + " ��ȭ��ȣ:" +tel ;
	}
}

public class Ex09_06_����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� �Է��ϼ���");
		String retry;

		ArrayList<Card> list = new ArrayList<Card>();


		while(true) {
			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			int select = sc.nextInt();
			int i; 
			boolean flag = false;

			if(select == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

			switch(select) {
			case 1 :
				System.out.println("�̸��� �Է��ϼ���");
				String name = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���");
				String tel = sc.next();
				list.add(new Card(name,tel));
				break;
			case 2 :
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.next();
				for(i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
					}
				}
				System.out.println("�����Ǿ����ϴ�.");
				break;
			case 3 : 
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.next();

				for(i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						System.out.println("�ٲٽ� ��ȭ��ȣ�� �Է��ϼ���.");
						tel = sc.next();
						list.get(i).setTel(tel);
						flag = true;
						break;
					}
				}
				if(flag == false) {
					System.out.println("�̸��� �߸��Է��Ͽ����ϴ�.");
				}
				break;
			case 4 :
				System.out.println("�̸�"+"\t"+"��ȭ��ȣ");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName()+"\t"+list.get(i).getTel());
				}

				break;
			default :
				break;
			}
		}


	}

}
