import java.util.ArrayList;
import java.util.Scanner;

class card{
	private String name;
	private String tal;
	public card(String name, String tal){
		this.name = name;
		this.tal = tal;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void settal(String tal) {
		this.tal = tal;
	}
	public String gettal() {
		return tal;
	}
	public String toString(){
		return name+tal;
	}

}
public class ex09_06_������ {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<card> list = new ArrayList<card>();
		int i;
		do {
			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			int select =sc.nextInt();
			if(select == 1) {//�����߰�
				System.out.print("�̸��� �Է��Ͻÿ�:");
				String name = sc.next();
				System.out.print("��ȭ��ȣ:");
				String tal = sc.next();
				list.add(new card(name,tal));


			}if(select == 2) {//���Ի���
				System.out.println("�̸��� �Է��ϼ��� :");
				String asd = sc.next();
				for(i=0;i<list.size();i++) {
					if(asd.equals(list.get(i).getname())) {
						list.remove(list.get(i));
						System.out.println("�����Ǿ����ϴ�.");
					}

				}
				
			}if(select == 3) {
				System.out.println("�̸��� �Է��Ͻÿ�:");
				String asd = sc.next();
				for(i=0;i<list.size();i++) {
					if(asd.equals(list.get(i).getname())) {
						list.remove(list.get(i));
					}
					}
				System.out.println("�����Ͻ� ��ȭ��ȣ");
				String tal = sc.next();

				System.out.println("�����Ǿ����ϴ�");
				list.add(new card(asd,tal));



			}if(select == 4) {
					for(i=0;i<list.size();i++) {
					System.out.println("�̸�:"+list.get(i).getname()+"��ȭ��ȣ"+list.get(i).gettal());
				}
			}if(select == 5) {
				System.out.println("���α׷� ���� ");

				break;
			}











		}while(true);




		//if case ��� �������� Ȱ���ؼ� �Ұ�
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








