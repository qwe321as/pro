import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;

	Person2(String id,String pw,String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}	



}

public class Ex08_03_���� {
	public static void main(String[] args) {

		Person2 p1 = new Person2("kim","1234","�迬��");
		Person2 p2 = new Person2("park","3456","�ڳ���");
		Person2 p3 = new Person2("song","9876","���߱�");

		Person2[] p = {new Person2("kim","1234","�迬��"),
				new Person2("park","3456","�ڳ���"),
				new Person2("song","9876","���߱�")};
		String id;
		String pw;
		String a;
		int i;
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("id�� �Է��ϼ���.");
			id = sc.next();
			if(id.length()>2&&9>id.length()) {
			System.out.println("pw�� �Է��ϼ���.");
			pw = sc.next();

				for(i=0;i<p.length;i++) {

					if(id.equals(p[i].id)) {
						System.out.println("���̵� ��ġ�մϴ�.");

						if(pw.equals(p[i].pw)) {
							System.out.println(p[i].name + "�� ~ȯ���մϴ�.");
							break;
						}
						else {
							System.out.println("��й�ȣ�� Ʋ���ϴ�.");
							break;
						}
					}
					else if(i==2) {
						System.out.println("���̵� ��ġ�����ʽ��ϴ�.");
					}
					else {
						continue;
					}
				}
			}
			else {
				System.out.println("���̵� 3~8�ڷ� �Է��ϼ���");
				continue;
			}
			System.out.println("y or n"+"����Ͻðڽ��ϱ�?");
			a=sc.next();
			switch(a){
			case"y":System.out.println("����մϴ�.");
			continue;
			case"n":System.out.println("�����մϴ�.");
			break;
			}
			break;
		}while(true);

	}
}
