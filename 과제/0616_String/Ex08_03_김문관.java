import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;

	Person2(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	void show() {
		System.out.println(name + "�� �ݰ����ϴ�.");
	}
}



public class Ex08_03_�蹮�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Person2[] p = {
				new Person2("kim","1234","�迬��"),
				new Person2("park","3456","�ڳ���"),
				new Person2("song","9876","���߱�")
		};


		do {
			System.out.print("id�Է� :");
			String inputId = scan.next();
			if(inputId.length() < 3 || inputId.length() > 8) {
				System.out.println("id�� 3~8���� ���� �Դϴ�.");
				continue;
			}
			System.out.print("����Է� :");
			String inputPw = scan.next();
			
			for(int i = 0; i < p.length; i++) {
				if(p[i].id.equals(inputId)) {
					if(p[i].pw.equals(inputPw)) {
						p[i].show();
						break;
					}
					else {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						break;
					}
				
				}
				else if(i == 2) {
					System.out.println("id�� �����ϴ�");
				}else {
					continue;
				}
			}
			
			
			
			System.out.print("���?");
			String ing = scan.next();
			if(ing.equals("y") || ing.equals("Y")) {
				continue;
			}else if(ing.equals("n") || ing.equals("N")) {
				break;
			}else {
				System.out.println("y(Y) �Ǵ� n(N)�� �Է� ���� �մϴ�.");
				continue;
			}

		}while(true);
		System.out.println("�ý����� ���� �մϴ�.");
	}
}
