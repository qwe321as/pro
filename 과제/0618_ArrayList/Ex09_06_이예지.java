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
	Card(String name,String tel){
		this.name = name;
		this.tel = tel;
	}
	public String toString() {
		return "Card [name=" + name + ", tel=" + tel + "]";
	}

}
public class Ex09_06_�̿��� {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Card> ca =new ArrayList<Card>();
		int f=0;
		while (true) {
			System.out.println("1. �����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("�̸��� �Է��ϼ���: ");
				String n = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���: ");
				String num =sc.next();
				ca.add(new Card(n,num));
				break;
			case 2:

				System.out.print("�̸��� �Է��ϼ���: ");
				String fn = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���: ");
				String fnum =sc.next();
				ca.remove(new Card(fn,fnum));
				break;
			case 3:
				System.out.print("�̸��� �Է��ϼ���: ");
				String cn = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���: ");
				String cnum =sc.next();
				System.out.print("�̸��� �Է��ϼ���: ");
				String c1n = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���: ");
				String c1num =sc.next();
				if(ca.contains(cn))
					if (ca.contains(cnum)) {
						int ad= ca.indexOf(cn);
						System.out.println(ad);
						int ac= ca.indexOf(cnum);		
						for(int i=0;i<ca.size();i++) {
							if(c1n.equals(ca.get(i).getName())) {
								ca.set(ca.indexOf(ca.get(i)),new Card(cn,cnum));
							}
						}
						//		ca.set(ad, c1n);
						//		ca.set(ac, c1num);
					}
				//				ca.set(new Card(fn,fnum));
				//				ca.set(index, fn)

				//				if () {
				//					
				//				}
				break;
			case 4:
				System.out.println(ca.toString());
				break;
			case 5:
				System.out.println("�����մϴ�.");
				f=1;
				break;

			default: 
				System.out.println("1-5�� ���ڸ��Է��ϼ���.");
			}
			if(f==1) {
				break;
			}

		}
	}
}
