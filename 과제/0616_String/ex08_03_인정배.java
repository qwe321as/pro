import java.util.Scanner;

class person1{
	String id;
	String pw;
	String name;

	public person2(String id, String pw, String name) {
		// TODO Auto-generated constructor stub
		this.id =id;
		this.pw = pw;
		this.name =name;
	}

}
public class ex08_03_������ {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		person2 p[] = {new person2("kim","1234","�迬��"),
				new person2("park","3456","�ڳ���"),
				new person2("song","9876","���߱�")};

		


		//String inputid = new String(sc.next());
do {
		System.out.println("���̵��Է�");
		String inputid = new String(sc.next());
		while(inputid.length()>8 || inputid.length()<3){

			System.out.println("3�ڿ��� 8�ڱ��� ġ����");
			System.out.println("���");
			break;
		}


		System.out.println("����Է�");
		String inputPw = sc.next();
		String name ;
		int i= 0 ,s=0;
		String y ="y";

		//d=inputid.indexOf(d);
		for(i=0;i<3;i++) {
			if(p[i].id.equals(inputid) == true && p[i].pw.contentEquals(inputPw)==true){
				System.out.println(p[i].name+"�� �ݰ����ϴ�");	
				System.out.println("���");
				String yes = sc.next();
				System.out.println(yes);
				if(yes.equals("y")) {
					System.out.println("y����");
					continue;
				}else {
					System.out.println("y�ȵ���");
					break;	
				}
				

			}	else if (!p[i].id.equals(inputid) == false&& p[i].pw.contentEquals(inputPw)==true) {
				System.out.println(p[i].id.equals(inputid));
				System.out.println("�׷����̵� ����");
				String yes = sc.next();
				System.out.println(yes);
				if(yes.equals("y")) {
					System.out.println("y����");
					continue;
				}else {
					System.out.println("y�ȵ���");
					break;	
				}
			
			}else	if(p[i].pw.contentEquals(inputPw)==false&&p[i].id.equals(inputid) == true){
				System.out.println(p[i].pw.contentEquals(inputPw));
				System.out.println("����� ���� �ʽ��ϴ�");System.out.println("���");
				String yes = sc.next();
				System.out.println(yes);
				if(yes.equals("y")) {
					System.out.println("y����");
					continue;
				}else {
					System.out.println("y�ȵ���");
					break;	
				}
			}
		break;
		}
		String yes = sc.next();
		System.out.println(yes);
		
}while(true);

//����
	}
}
//}

//else if(3<d<9) {

//}
//y�� ġ�� ��� �ϸ� ��� ������ id�� Ʋ���� ���̵� �����ϴ� ����� Ʋ���� ����� ���� �ʽ��ϴ�
//��� ���� n�� ������ �����մϴ� id�� 3���ڿ��� 8���� �־���㤿���� 





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
//	static void show(int cnt) {
//System.out.println("hi~ "+cnt);
//if(cnt == 1)
//	return;
//show(--cnt);//�ڱ�ȣ��
//}

//		swith(inputid){
//			case p[0].id:System.out.println();
//			break;
//			case p[1].id:System.out.println();
//			break;
//			case p[2].id:System.out.println();
//			break;

//}else if(p[1].id.equals(inputid) == true && p[1].pw.contentEquals(inputPw)==true) {
//	System.out.println("�ڳ����� �ݰ����ϴ�");			System.out.println("���");	
//}else if(p[2].id.equals(inputid) == true && p[2].pw.contentEquals(inputPw)==true) {
//	System.out.println("���߱�� �ݰ����ϴ�");				System.out.println("���");
//	}else if(p[1].pw.contentEquals(inputPw)==false){
//		System.out.println("����� ���� �ʽ��ϴ�");System.out.println("���");
//	}else if(p[2].pw.contentEquals(inputPw)==false){
//		System.out.println("����� ���� �ʽ��ϴ�");System.out.println("���");
//	}else if(p equalsIgnoreCase inputid == false){
//	}else{
//		System.out.println("�ش���̵� ����.");
//	}