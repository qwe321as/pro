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


public class Ex08_03_��ûȣ {
	public static void main(String[] args) {
		
		Person2[] p= {
				new Person2("kim","1234","�迬��"),
				new Person2("park","3456","�ڳ���"),
				new Person2("song","9876","���߱�")
					};
		
//		System.out.println(p[0].id);
//		System.out.println(p[1].id);
//		System.out.println(p[2].id);
		
		Scanner sc=new Scanner(System.in);
		String inputid, pw, retry;
		boolean flag = false;
		int i;
		do {
			flag = false;
			System.out.print("id�Է�:");
			inputid=sc.next();
			if(inputid.length()<3 || inputid.length()>8) { //string�� length
				System.out.println("id�� 3~8���� ���� �Դϴ�.");
				continue;
			}
			System.out.print("pw�Է�:");
			pw=sc.next();

			
			for(i=0;i<p.length;i++) { //�迭�� for�� ��Ʈ+�迭�� length
				if(p[i].id.equals(inputid)) { //***��ü�迭+�����ڿ��� equals
					if(p[i].pw.equals(pw)) {

						p[i].display();   //��ü�迭�� ��� �޼���(���) ����� �� ����! �Ϲݹ迭�� �ٸ�!
						flag = true;
						break;   //for���� ���� �����°�.
					}
					else{
						System.out.println("����� ���� �ʽ��ϴ�.");
						flag = true;
					}
					
				}
		
			}
			if(flag == false) {
				System.out.println("�ش� ���̵� �����ϴ�.");
				
			}
		
			System.out.println("���?");
			retry =sc.next();
			
			if(retry.equalsIgnoreCase("n"))  //***���ڿ� equals
				break;
			
			

		}while(true);
		System.out.println("���α׷��� �����մϴ�.");


	}//main

}//class
