import java.util.Scanner;

class Person2 {
	
	String id;
	String pw;
	String name;
	
	Person2(String id, String pw, String name){
		
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}

public class Ex08_03_����ȣ {

	public static void main(String[] args) {
		
		Person2 p[] = {new Person2("kim", "1234", "�迬��"),
					new Person2("park", "3456", "�ڳ���"),
					new Person2("song", "9876", "���߱�")};
		
		String inputId;
		String inputPw;
		String yorn;
		
		do {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���̵� �Է� : ");
			inputId = sc.next();
			System.out.print("��й�ȣ �Է� : ");
			inputPw = sc.next();
			
			for(int i = 0; i < p.length; i++) {
				
				if(inputId.equals(p[i].id)) {
					if(inputPw.equals(p[i].pw)) {
						System.out.println(p[i].name + "�� �ݰ����ϴ�.");
						break;
					}
					else {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						break;
					}
				}
				else if(i == 2){
					System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
					break;
				}
			}
			
			if(inputId.length() <= 2 || inputId.length() > 8) {
				System.out.println("3~8 ���� ���̸� �Է��ϼ���.");
				continue;
			}
			
			System.out.print("��� y ���� n : ");
			yorn = sc.next();
			
			if(yorn.equals("n")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if(yorn.equals("y")) {
				continue;
			}
		}while(true);
	}

}
