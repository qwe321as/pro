import java.util.Scanner;

class Person2{
	// ���� �Ǹ� private����
	String id;
	String pw;
	String name;

	Person2(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	};

}
public class Ex08_03_���� {
	public static void main(String[] args) {

		// Person2 p1 = new Person2("kim","1234","�迬��");
		// Person2 p2 = new Person2("park","3456","�ڳ���");
		// Person2 p3 = new Person2("song","9876","���߱�");

		Person2[] arrP = {new Person2("kim","1234","�迬��"),
				new Person2("park","3456","�ڳ���"),
				new Person2("song","9876","���߱�")
		};

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("ID �Է� : ");
			String inputId = sc.next();
			System.out.print("PW �Է� : ");
			String inputPw = sc.next();
			if(inputId.length()<3||inputId.length()>8) {
				System.out.println("ID�� 3~8�� �Է� ����");
				continue;
			}
			
			for(int i =0;i<arrP.length;i++) {
				if(inputId.equals(arrP[i].id)) {
					if(inputPw.equals(arrP[i].pw)) {
						System.out.println(arrP[i].name+"�� ȯ���մϴ�.");
						break;
					}
					else {
						System.out.println("PW ����ġ");
						break;
					}
				}
				else if(i==2) System.out.println("��ġ�ϴ� ID ����");
				else continue;
			}
			System.out.print("����Ͻðڽ��ϱ�?[Y/N] :");
			String gogo = sc.next();
			switch(gogo) {
			case "y" : System.out.println("����մϴ�.");continue;
			case "n" : System.out.println("���α׷��� �����մϴ�.."); break;
			}
			break;
		}while(true);
	} //main
} //class

