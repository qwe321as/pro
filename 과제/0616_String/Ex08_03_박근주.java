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
	void display() {
		System.out.println(name+"�� �ȳ��ϼ���");
	}
	
	
	
	
}

public class Ex08_03_�ڱ��� {

	public static void main(String[] args) {
		
		Person2[] p = { new Person2("kim","1234","�迬��"),
						new Person2("park","1020","�ڱ���"),
						new Person2("song","9876","���߱�")};
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("���̵� �Է�:");
			String idput = sc.next();
			if(3>idput.length()||idput.length()>8) {
				System.out.println("���̵� 3~8���� �� �Է�");
				continue;
				
				
			}
			
			System.out.print("��й�ȣ �Է�:");
			String pwput = sc.next();
			
			
				if(idput.equals(p[0].id)&&pwput.equals(p[0].pw)) {
				p[0].display();
				System.out.print("���?(y or x)");
				String next2 = sc.next();
				if(next2.equalsIgnoreCase("y")) {
					continue;
				}
				else if(next2.equalsIgnoreCase("x")) {
					System.out.println("���α׷� ����");
					break;
				}
				
				
				
			}
			else if(idput.equals(p[1].id)&&pwput.equals(p[1].pw)) {
				p[1].display();
				System.out.print("���?(y or x)");
				String next2 = sc.next();
				if(next2.equalsIgnoreCase("y")) {
					continue;
				}
				else if(next2.equalsIgnoreCase("x")) {
					System.out.println("���α׷� ����");
					break;
				}
				
			}
			else if(idput.equals(p[2].id)&&pwput.equals(p[2].pw)) {
				p[2].display();
				System.out.print("���?(y or x)");
				String next2 = sc.next();
				if(next2.equalsIgnoreCase("y")) {
					continue;
				}
				else if(next2.equalsIgnoreCase("x")) {
					System.out.println("���α׷� ����");
					break;
					
				}
				
			}
				for(int c=0; c<p.length;c++) {
					if(idput.equals(p[c].id)==false) {
						
					}
				}
			System.out.println("�ش� ���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
				
				
			//else ū Ʋ
			
			
			
			
		}while(true);
		
		
		
		//id�� 3����~8���� �Է��ؾ��մϴ�
		//�ش� ���̵� �����ϴ�
		//�����Ʋ���� �����ʴ´�
		
		//id �Է�
		//pw�Է�
		//name ���
		//���?
		
		
		
	}

}
