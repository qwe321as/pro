import java.util.Scanner;

class Person2{

	private String id;
	private String pw;
	private String name;

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	} 



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Person2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	void display(){
		
	}



}// Person2


public class Ex08_03_����� {

	public static void main(String[] args) {

		int i = 0;
		String y="y" , n="n";

		Scanner sc = new Scanner(System.in);

		Person2 p1 = new Person2("kim","1234","�迬��");
		Person2 p2 = new Person2("park","3456","�ڳ���");
		Person2 p3 = new Person2("song","9876","���߱�");

		Person2 [] p = {new Person2("kim","1234","�迬��"),
				new Person2("park","3456","�ڳ���"),
				new Person2("song","9876","���߱�")
		};

		do {
			System.out.print("ID �Է�: ");
			String id = sc.next();
			
			if(id.length() < 3 || id.length() > 8) {
				System.out.println("id�� 3���� ~ 8���� �Է��ؾ��մϴ�.");
				continue;
			}
			
			else if(! (id.equals(p[0].getId()) || id.equals(p[1].getId()) || id.equals(p[2].getId()))){	
				System.out.println("�ش� ���̵� �����ϴ�.");
				continue;
			}
			
			System.out.print("PW �Է�: ");
			String pw = sc.next();
			
			if(! (pw.equals(p[0].getPw()) || pw.equals(p[1].getPw()) || pw.equals(p[2].getPw()))){
				System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
				continue;
			}
			else if(id.equals(p[0].getId()) && pw.equals(p[0].getPw())) {
				
				System.out.println(p[0].getName()+"�� �ݰ����ϴ�.");
				System.out.println("���?");
				String yes = sc.next();
				if(y.equals(yes)) {
					continue;
				}
				else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}					
			}
			else if(id.equals(p[1].getId()) && pw.equals(p[1].getPw())) {
				
				System.out.println(p[1].getName()+"�� �ݰ����ϴ�.");
				System.out.println("���?");
				String yes = sc.next();
				if(y.equals(yes)) {
					continue;
				}
				else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}					
			}
			else if(id.equals(p[2].getId()) && pw.equals(p[2].getPw())) {
				
				System.out.println(p[2].getName()+"�� �ݰ����ϴ�.");
				System.out.println("���?");
				String yes = sc.next();
				if(y.equals(yes)) {
					continue;
				}
				else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}					
			}
			System.out.println("���α׷��� �����մϴ�.");
			break;

		}while(true);


	}//main

}//class

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

