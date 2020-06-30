import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	Card(String name,String tel){
		this.name = name;
		this.tel = tel;
	}
	public String toString() {

		return name +"		"+ tel;
	}
	public String getname() {
		return name;
	}
	public String gettel() {
		return tel;
	}

}
public class Ex09_06_�ڱ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();
		int i;
		do {
			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			int select = sc.nextInt();

			if(select==1) {
				System.out.print("�̸��� �Է��ϼ��� :");
				String name = sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� :");
				String tel = sc.next();
				list.add(new Card(name,tel));

			}	
			else if(select==2) {
				boolean flag= false;
				System.out.print("�̸��� �Է��ϼ���:");
				String name = sc.next();
				for(i=0;i<list.size();i++) {
					if(list.get(i).getname().equals(name)) {
						list.remove(i);
						System.out.println("�����Ǿ����ϴ�.");
						flag=true;
						break;
					}
				}
				if(flag==false) {
					System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");
					
				}

			}
			
			else if(select==3) {
				boolean flag = false;
				System.out.print("�����Ͻ� �̸��� �Է��ϼ���:");
				String name1 = sc.next();
				for(i=0;i<list.size();i++) {	
					
					if(list.get(i).getname().equals(name1)) {
						System.out.print("�����Ͻ� ��ȭ��ȣ�� �Է��ϼ���");
						String tel = sc.next();
						System.out.println("�����Ͻ� ��ȭ��ȣ��?"+tel);
						
						list.set(i,new Card(name1,tel));
						
						System.out.println("�����Ǿ����ϴ�.");
						flag = true;
						break;
						
					}//if

				}//for
				if(flag==false){
					System.out.println("�̸��� �߸� �Է��Ͽ����ϴ�.");
					
				}
				}

			
			else if(select==4) {
				System.out.println("�̸�		��ȭ��ȣ");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}

			}
			else if(select==5) {
				System.out.println("���α׷� ����");
				break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");

			}
		}while(true);




	}//main

}
