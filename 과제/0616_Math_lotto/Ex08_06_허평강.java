import java.util.Scanner;

public class Ex08_06_���� {
	public static void main(String[] args) {

		//1~45

		int[] lotto  = new int[6];
		int[] my = new int[6];
		int i;
		int j;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		for(i=0;i<6;i++) {
			lotto[i] =(int)(Math.random()*45) +1;
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					lotto[i]=(int)(Math.random()*45);
					j=-1;
				}
			}
		}
		System.out.println();
		for(i=0;i<lotto.length;i++) {
			System.out.print("����"+(i+1)+":");
			my[i] = sc.nextInt();
		
			for(j=0;j<i;j++) {
				if(my[i]==my[j]) {
					System.out.println("�ߺ��� �ٽ� �Է�"+(i+1)+":");
					my[i] = sc.nextInt();
					j=-1;
				}
			}
			if(my[i]<1 || my[i]>45) {
				System.out.println("1~45������ �� �Է��ϼ���");
				i--;
				continue;
			}
		}
		
		
		
		
		
		System.out.println("���� �߻���Ų �ζǹ�ȣ");
		for(i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		System.out.println("�����Է��� �ζ� ��ȣ");
		for(i=0;i<lotto.length;i++)
		{
			System.out.print(my[i]+" ");
		}
		
		for(i=0;i<6;i++) {
			for(j=0;j<6;j++) {
				if(lotto[i] == my[j]) {
					count++;
				}
					
			}
		}
		System.out.println("��������:"+count);
		
		switch(count) {
		case 6:System.out.println("1��"); 
		break;
		case 5:System.out.println("2��");
		break;
		case 4:System.out.println("3��");
		break;
		case 3:System.out.println("��");
		break;
		}
	}
}
