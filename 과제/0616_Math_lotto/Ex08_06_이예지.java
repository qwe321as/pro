import java.util.Scanner;
public class Ex08_06_�̿��� {
	public static void main(String[] args) {
		int [] lotto = new int[6];
		int [] my = new int[6];
		int count= 0;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for (int j = 0; j <i ; j++) {
				if (lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}		
		}
		System.out.println("��ȣ�� �Է��ϼ���.");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print("����"+(i+1)+": ");
			Scanner sc = new Scanner(System.in);
			my[i]=sc.nextInt();{
				for (int j = 0; j <i; j++) {
					if (my[i]==my[j]) {
						i--;
						System.out.println("�ٽ��Է��ϼ���");
						break;
					}
				}
				if (my[i]>45) {
					System.out.println("1~45������ ���� �Է°����մϴ�.");
				}
			}
		}
		for (int i = 0; i < my.length; i++) {
			for (int j = 0; j < my.length; j++) {
				if (lotto[i]==my[j]) {
					count = count+1;}
			}
		}
		System.out.print("��÷��ȣ :");
		for (int i = 0; i < my.length; i++) {
			System.out.print(+lotto[i]+" ");
		}
		System.out.println();
		System.out.print( "����ȣ :");
		for (int i = 0; i < my.length; i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();
		System.out.println("������ȣ: "+count);
		if (count ==6) {
			System.out.println("�ϵ��Դϴ�.");
		}
		else if(count ==5) {
			System.out.println("�̵��Դϴ�.");
		}
		else {
			System.out.println("���Դϴ�.");
		}
	}
}

