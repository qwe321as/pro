import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;

	Person2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

}

public class Ex08_03_�ڽþ� {


	public static void main(String[] args) {

		//		Person2 p1 = new Person2("kim", "1234", "�迬��");
		//		Person2 p2 = new Person2("park", "3456", "�ڳ���");
		//		Person2 p3 = new Person2("song", "9786", "���߱�");

		//		Scanner sc = new Scanner(System.in);
		//		
		//		System.out.println("���̵� �Է� �ϼ���.");
		//			String inputId = sc.next();
		//			
		//		System.out.println("��й�ȣ�� �Է� �ϼ���.");
		//			String inputIPw = sc.next();

		Scanner sc = new Scanner(System.in);

		Person2[] p = { new Person2("kim", "1234", "�迬��"),
						new Person2("park", "3456", "�ڳ���"),
						new Person2("song", "9876", "���߱�")};

		do {
			System.out.println("���̵�  �Է��ϼ���.");
			String id = sc.next();
			System.out.println("��й�ȣ �Է�.");
			String pw = sc.next();
			String yes = "y";
			

			if(id.length() < 3 || id.length() > 8  ) {
				System.out.println("Id�� �ּ� 4~8�� �Դϴ�.");	
				continue;
			}
			else if(id.equals(p[0].id) && pw.equals(p[0].pw)) {
				System.out.println("�½��ϴ�.");
				System.out.println("��� �Ͻðڽ��ϱ�? y/n");
				String y = sc.next();
				
				if(y.equals(yes)) {
					continue;
				}else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}	
				
			}
			else if(id.equals(p[1].id) && pw.equals(p[1].pw)) {
				System.out.println("�½��ϴ�.");
				System.out.println("��� �Ͻðڽ��ϱ�? y/n");
				String y = sc.next();
				
				if(y.equals(yes)) {
					continue;
				}
				else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
					}
				}
				else if(id.equals(p[2].id) && pw.equals(p[2].pw)) {
				System.out.println("�½��ϴ�.");
				System.out.println("��� �Ͻðڽ��ϱ�? y/n");
				String y = sc.next();
				if(y.equals(yes)) {
					continue;
				}
				
				else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
					}
				
			}
				else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				
			}
				sc.close();
		} while (true);
	}			
}

//id�Է�:park
//pw�Է�:3456
//�ڳ����� �ݰ����ϴ�.
//���?y
//id�Է�:pa
//id�� 3����~8���� �Է��ؾ� �մϴ�.
//id�Է�:dlsfjsldfjslf
//id�� 3����~8���� �Է��ؾ� �մϴ�.
//id�Է�:kim
//pw�Է�:9999
//����� ���� �ʽ��ϴ�.
//���?y
//id�Է�:choi
//pw�Է�:3223
//�ش� ���̵� �����ϴ�.
//���?n
//���α׷��� �����մϴ�.