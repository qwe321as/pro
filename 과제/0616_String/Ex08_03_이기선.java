import java.util.Scanner;

class Person2{
	String id;
	String pw;
	String name;
	public Person2(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	
	
}
public class Ex08_03_�̱⼱ {

	public static void main(String[] args) {

		Person2[] p0 = new Person2[3];
		p0[0] = new Person2("kim","1234","�迬��");
		p0[1] = new Person2("park","3456","�ڳ���");
		p0[2] = new Person2("song","5678","���߱�");
		
		Scanner sc = new Scanner(System.in);
		int count=0,len0=0,ok=-1;
		String ans = "y";
		String id="",pw="";
		
		do {
			ok=-1;
			System.out.println("Input your ID or Y/N");
			id = sc.next();
			if(id.equals("n")  || id.equals("N")) {
				ans = "N";
				System.out.println("Good Bye!");
				break;
			}
			if(id.equals("y")  || id.equals("Y")) {
				ans = "Y";
				System.out.println("Keep Going");
				continue;
			}
			if(id.length()< 3 || id.length()>8) {
				System.out.println("ID�� ���̴� 3~8�� �Դϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			for(int i0 = 0 ; i0 < p0.length ; i0++) {
				if(id.equals(p0[i0].id) ) {
					ok = i0;
					break;
				}
			}//for
			if(ok == -1) {
				System.out.println("��ġ�ϴ� ID�� �����ϴ�. �ٽ� �Է��Ͽ� �ֽʽÿ�.");
				continue;
			}
			
			System.out.println("PAAWORD�� �Է��Ͽ� �ֽʽÿ� : ");
			pw = sc.next();
			
			if(pw.equals(p0[ok].pw)) {
				System.out.println("Login�� �����߽��ϴ�.");
				continue;
			}
			else {
				System.out.println("Password�� Ʋ�Ƚ��ϴ�. ó������ �ٽ� �Է��� �ֽʽÿ�.");
				continue;
			}			
			
		}while(ans !="n" || ans !="N") ;		
		
		sc.close();
/*		
		id�Է� :
		pw�Է� :
		�ڳ����� �ݰ����ϴ�.
		��� : y or n
		id�Է½� 3~8���� �Է��ؾ� �ϴ� ��� �޼���
		id�Է� : paak
		pw�Է� : 3456
		id�Է� �÷� ǥ��(�ش� id�� �����ϴ�)
		pw�� �߸� �Է� �Ǿ����ϴ�.
		id�� pw�� �������� �ԷµǼ� login �� ���� �߽��ϴ�.
		
		*/
		
		
	}

}
