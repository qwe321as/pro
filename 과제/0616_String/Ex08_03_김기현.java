import java.util.Scanner;

class Person2{ 
	
	String id;
	String pw;	
	String name;

	Person2(String id,String pw,String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	
}



public class Ex08_03_����� {
	public static void main(String[] args) {
		//id pw �Է¹޾Ƽ� ��ġ�ϸ� name�� �ݰ����ϴ� (for)  ����Ͻðڽ��ϱ�? ����̸��� �ʽ��ϴ� ���? �ش���̵� �����ϴ� ���? n ���α׷��� �����մϴ�
//		do while
		
		Scanner sc = new Scanner(System.in);
		
		Person2 p1 = new Person2("kim","1234","�迬��");
		Person2 p2 = new Person2("park","3456","�ڳ���");
		Person2 p3 = new Person2("song","9876","���߱�");
		
		Person2 [] arr = {new Person2("kim","1234","�迬��"),
						  new Person2("park","3456","�ڳ���"),
						  new Person2("song","9876","���߱�")
						 };
		
		
		do {			
			System.out.print("id:");
		    String inputId = sc.next();
			System.out.print("pw:");
			String inputPw = sc.next();
				
				if(inputId.length()<3 || inputId.length()>8) {
						
						System.out.println("ID�� 3~8���� �Է��ϼ���");				
						continue;
					}
				
				
				for(int i=0;i<arr.length;i++) {
					if(arr[i].id.equals(inputId)) {
							if(arr[i].pw.equals(inputPw)) {
						System.out.println(arr[i].name+"�� �ݰ�����");
						break;
							}
							else {
								System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
								break;
							}
					
					}
					else if(i==2) {
						System.out.println("�ش� ���̵� �����ϴ�");  // ����  
					}	
					
					else
						continue;	  // ����
	
			}			
				
			
				System.out.println("����Ͻðڽ��ϱ�?(Y/N)");
			
			String Next = sc.next();
			switch(Next) {
			case "Y" : System.out.println("���"); continue;
			case "N" : System.out.println("���α׷��� �����մϴ�"); break;
			default : System.out.println("�߸��� �Է��Դϴ�");break;
			}
			
			
		} while(true);	

	}

}
