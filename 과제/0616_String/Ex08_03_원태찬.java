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
	void display() {
		System.out.println(name+"�� �ݰ����ϴ�.");
	}
}


public class Ex08_03_������ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person2[] p= {
				new Person2("kim","1234","�迬��"),
				new Person2("park","3456","�ڳ���"),
				new Person2("song","9876","���߱�")
		};

		do {
			System.out.print("id�Է�:");
			String inputid=sc.next();
			if(inputid.length()<3 || inputid.length()>8) { //string�� length
				System.out.println("id�� 3~8���� ���� �Դϴ�.");
				continue;
			}
			System.out.print("pw�Է�:");
			String inputpw=sc.next();

			int i;
			for(i=0;i<p.length;i++) { //�迭�� for�� ��Ʈ+�迭�� length
				if(p[i].id.equals(inputid)) { //***��ü�迭+�����ڿ��� equals
					if(p[i].pw.equals(inputpw)) {

						p[i].display();   //��ü�迭�� ��� �޼���(���) ����� �� ����! �Ϲݹ迭�� �ٸ�!
						break;
					}
					else{
						System.out.println("����� ���� �ʽ��ϴ�.");
						continue;
					}
					
				}
			
			
			
				else if(i==2){
					System.out.println("�ش� ���̵� �����ϴ�.");
					continue;
				}else {
					continue;
				}
				}
				
			


				
			
			




			System.out.println("���?");
			String j=sc.next();
			String y=null;
			if(j.equals("y")) { //***���ڿ� equals
				continue;
			}
			else {
				break;
			}

		}while(true);
		System.out.println("���α׷��� �����մϴ�.");


	}//main

}//class

////id�Է�:park
////pw�Է�:3456
////�ڳ����� �ݰ����ϴ�.
////���?y
////id�Է�:pa
////id�� 3����~8���� �Է��ؾ� �մϴ�.
////id�Է�:dlsfjsldfjslf
////id�� 3����~8���� �Է��ؾ� �մϴ�.
////id�Է�:kim
////pw�Է�:9999
////����� ���� �ʽ��ϴ�.
////���?y
////id�Է�:choi
////pw�Է�:3223
////�ش� ���̵� �����ϴ�.
////���?n
////���α׷��� �����մϴ�.

