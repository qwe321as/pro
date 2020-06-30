import java.util.Scanner;

class Person2 {
	String id;
	String pw;
	String name;

	public Person2(String id, String pw, String name) {
		this.id= id;
		this.pw=pw;
		this.name=name;
	}

}//Person class

public class Ex08_03_���� {
	public static void main(String[] args) {
		int isIdOK = 0;
		int isPwOK = 0;
		String inputId;
		String inputPw;
		String RealuserID="";
		int i;

		Person2[] p = {new Person2("kim","1234","�迬��"),
				       new Person2("park","3456","�ڳ���"),
				       new Person2("song","9876","���߱�")
		              };

		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.print("id�Է�:");
			inputId = sc.next();

			//id���� ����
			if(inputId.length()<3 || inputId.length()>8){
				System.out.println("id�� 3����~8���� �Է��ؾ� �մϴ�.");
				continue;
			}
			else{
				System.out.print("pw�Է�:");
				inputPw = sc.next();
			}


			//id��pw�� ��ġ�Ҷ�, ��ġ���Ҷ�
			for (i=0;i<p.length;i++) {

				if (p[i].id.equals(inputId) && p[i].pw.equals(inputPw)) {
					isIdOK=1;
					isPwOK=1;
					RealuserID = p[i].name;
					break;
				}
				else if(p[i].id.equals(inputId) && !p[i].pw.equals(inputPw)==false){
					isIdOK=1;
					isPwOK=0;
					break;
				}
				else {
					isIdOK=0;
				}
			}

			if (isIdOK==1 && isPwOK==1) {
				System.out.println(RealuserID+"�� �ݰ����ϴ�.");
			}
			else if(isIdOK==1 && isPwOK==0) {
				System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
			}
			else {
				System.out.println("�ش� ���̵� �����ϴ�");
				
			}

			//���?  y-->id�Է�//n-->"���α׷��� �����մϴ�."
			System.out.print("���?");
			String s = sc.next();
			if(s.equalsIgnoreCase("y")) {
				continue;
			}
			else if(s.equalsIgnoreCase("n")) {
				break;
			}
			else {
				System.out.println("�߸�� �Է��Դϴ�.");
				break;
			}

		}//while
		System.out.println("���α׷��� �����մϴ�.");


	}//main

}//class




//id�Է�:park
//pw�Է�:3456
//�ڳ����� �ݰ����ϴ�.
//���?:y

//(id�� ����üũ..)
//id�Է�:pa
//id�� 3����~8���� �Է��ؾ� �մϴ�.
//id�Է�:dlsfjsldfjslf
//id�� 3����~8���� �Է��ؾ� �մϴ�.


//id�Է�:kim
//pw�Է�:9999
//����� ���� �ʽ��ϴ�.
//���?:y
//id�Է�:choi
//pw�Է�:3223
//�ش� ���̵� �����ϴ�.
//���?:n
//���α׷��� �����մϴ�.


