import java.util.Scanner;

class Person2{
	
	String id;
	String pw;
	String name;
	
	Person2(String id,String pw,String name){
		this.id=id;
		this.pw=pw;
		this.name=name;
	}
	
	
}

public class Ex_08_03_������ {
	public static void main(String[] args) {
		
		Person2[] p = {new Person2("kim","1234","�迬��"),
		               new Person2("park","3456","�ڳ���"),
		               new Person2("song","9876","���߱�")
		            };
		
//		System.out.println(p[0].id);
//		System.out.println(p[1].id);
//		System.out.println(p[2].id);
		
		Scanner sc = new Scanner(System.in);
		String inputId,pw,retry;
		boolean flag = false;
		
		int i;
		do {
			flag = false;
			System.out.print("id�� �Է��ϼ���:");
			inputId = sc.next();
			if(inputId.length()<3 || inputId.length()>3) {
				System.out.println("id�� 3����~8���ڷ� �Է��ؾ� �մϴ�.");
				continue; // while�� �������� ���ư�(�� �� ����)
			}
			
			System.out.print("��й�ȣ�� �Է��ϼ���:");
			pw = sc.next();
			
			for(i=0;i<p.length;i++) {
				if(p[i].id.equals(inputId)) {
					flag = true;
					if(p[i].pw.equals(pw)) {
						System.out.println(p[i].name+"�� �ݰ����ϴ�.");
//						flag = true;
						break; // if���� �ƴ� �ݺ���(for)�� ��������
					
					}
					else {
						System.out.println("����� ���� �ʽ��ϴ�.");
//						flag = true;
					}
				}
//				else {
//					System.out.println("�ش� ���̵� �����ϴ�.");
//				}
			}//for
			
			if(flag == false) {
				System.out.println("�ش� ���̵� �����ϴ�.");
			}
			System.out.print("��� �Ϸ���y");
			retry = sc.next();
			if(retry.equalsIgnoreCase("n"))
				break;
			
				
			
		}while(true);
		System.out.println("���α׷��� �����մϴ�.");
		

	}// main

}
// id,pw �Է� �ڳ����� �ݰ����ϴ�. ����Ϸ���y, �ƴϸ� no, ����� ���� �ʽ��ϴ�. �ش� ���̵� �����ϴ�. ���n, ���α׷��� �����մϴ�.
// id�� �α��� �־����� id�� 3����~8���� ���̷� �Է��ؾ� �մϴ�. id �ٽ� �Է�, do while ��