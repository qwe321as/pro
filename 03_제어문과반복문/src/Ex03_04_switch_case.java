import java.util.Scanner;

public class Ex03_04_switch_case {
	public static void main(String[] args) {

		// ���ڿ� �Է��ؼ� fruit������ �ֱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸�:");
		String fruit = sc.next();
		System.out.println("fruit:"+fruit);
		
		switch(fruit) {
			case "apple" : System.out.println("���");
							break;
			case "grape" : System.out.println("����");
							break;
			case "melon" : System.out.println("�޷�");
							break;
			default : System.out.println("�׹��� ����");
						
		} // switch
		
	} // main
} // class






