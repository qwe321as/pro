import java.util.Scanner;

public class Ex08_06_���� {
	public static void main(String[] args) {
		int i,j,count=0;
		int[] lotto = new int[6];
		int[] my = new int[6];

		Scanner sc = new Scanner(System.in);
		lotto[0] = (int)(Math.random()*45)+1;

		for(i=1;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i=i-1;
				}
			}
		}

		for(i=0;i<my.length;i++) {
			System.out.print("����("+(i+1)+"):");
			my[i] = sc.nextInt();
			if(my[i]<1||my[i]>45) {
				System.out.println("1~45������ ���� �Է��ϼ���.");
				i=i-1;
			}
			else {
				for(j=0;j<i;j++) {
					if(my[i]==my[j]) {
						System.out.println("���� ���ڿ� �ߺ���. ���Է��ϼ���.");
						i=i-1;
					}
				}
			}
		}
		System.out.println();
		for(j=0;j<6;j++) {
			for(i=0;i<6;i++) {
				if(lotto[j]==my[i]) {
					count++;
				}
			}
		}
		System.out.println("���� �߻���Ų �ζ� ��ȣ");
		for(i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();

		System.out.println("���� ������ �ζ� ��ȣ");
		for(i=0;i<6;i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();
		System.out.println("���� ���� : "+count);
		if(count==6) System.out.println("1��!!");
		else if(count==5) System.out.println("2��!!");
		else if(count==4) System.out.println("3��!!");
		else System.out.println("��!!");
	}
}
