import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;

	public Person2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
public class Ex08_03_��뼮 {
	public static void main(String[] args) {

		Person2[] p= {new Person2("kim","1234","�迬��"),
			  	      new Person2("park","3456","�ڳ���"),
				      new Person2("song","9876","���߱�")
				     };

		String reStart;
		int i;
		boolean endFlg=true;
		do {
			Scanner sc=new Scanner(System.in);

			System.out.print("���̵� �Է�:");
			String inputId=sc.next();
			if(inputId.length()<3 || inputId.length()>8) {
				System.out.println("id�� 3~8���� �Է��ؾ� �մϴ�.");
				continue;
			} 
			System.out.print("��� �Է�:");
			String inputPw=sc.next();

			boolean sw=false;
			for(i=0;i<p.length;i++) {
				if(inputId.equals(p[i].id)) {
					sw=true;
					if(inputPw.equals(p[i].pw)) {
						System.out.println(p[i].name+"�� �ݰ����ϴ�.");
						break;
					} else {
						System.out.println("����� ���� �ʽ��ϴ�.");
					}
				} 
			}
			if(!sw) {
				System.out.println("�ش� ���̵� �����ϴ�.");
			}
			do {
				System.out.print("���(y/n)");
				reStart=sc.next();
				if(reStart.equalsIgnoreCase("y")) {
					break;
				} else if(reStart.equalsIgnoreCase("n")) {
					endFlg=false;
					sc.close();
					break;
				} else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			} while(endFlg);
		} while(endFlg);
		System.out.println("���α׷��� �����մϴ�.");
	}
}
