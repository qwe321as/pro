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

public class Ex08_03_���̸� {
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
			System.out.print("id�Է�:");
			inputId = sc.next();
			if(inputId.length()<3 || inputId.length()>8) {
				System.out.println("id�� 3����~8���ڷ� �Է��ؾ� �մϴ�.");
				continue;
			}
			
			System.out.print("pw�Է�:");
			pw = sc.next();
			
			for(i=0;i<p.length;i++) {
				if(p[i].id.equals(inputId)) {
					flag = true;
					if(p[i].pw.equals(pw)) {
						System.out.println(p[i].name+"�� �ݰ����ϴ�.");
//						flag = true;
						break;
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
			
			System.out.print("���?");
			retry = sc.next();
			if(retry.equalsIgnoreCase("n"))
				break;
			
		}while(true);
		System.out.println("���α׷��� �����մϴ�.");
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




