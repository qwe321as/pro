import java.util.Scanner;

public class Ex08_06_��뼮 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] lotto=new int[6];
		int[] my=new int[6];
		int i, j, count=0;
		
		for(i=0;i<lotto.length;i++) {
			System.out.print("����"+(i+1)+":");
			my[i]=sc.nextInt();
			if(my[i]<1 || my[i]>45) {
				System.out.println("1~45������ �� �Է��ϼ���");
				i--;
				continue;
			}
			for(j=0;j<i;j++) {
				if(my[i]==my[j]) {
					System.out.print("�ߺ��� �ٽ�");
					i--;
					break;
				}
			}
		}
		System.out.println("���� ������ �ζ� ��ȣ");
		for(i=0;i<lotto.length;i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();
		
//		1~45  45-1+1=
		for(i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("���� �߻���Ų �ζ� ��ȣ");
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
				
		for(i=0;i<lotto.length;i++) {
			for(j=0;j<lotto.length;j++) {
				if(lotto[i]==my[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println();
		System.out.println("���� ����:"+count);
		
		switch(count) {
			case 4: System.out.println("3��");
				break;
			case 5: System.out.println("2��");
				break;
			case 6: System.out.println("1��");
				break;
			default: System.out.println("��!!");
		}
	}
}
