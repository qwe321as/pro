import java.util.Scanner;

public class Ex08_06_���̸� {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		int[] my = new int[6];
		int i,j;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45) + 1; // 1~45
			
			for(j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45) + 1;
					j=-1;
				}
			}
		}
		System.out.println();
		
		for(i=0;i<6;i++) {
			System.out.print("����"+(i+1)+":");
			my[i] = sc.nextInt();
			
			
			for(j=0;j<i;j++) {
				if(my[i] == my[j]) {
					System.out.print("�ߺ��� �ٽ� �Է� ����"+(i+1)+":");
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
		
		
		System.out.println("���� �߻���Ų �ζ� ��ȣ");
		for(i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		System.out.println("���� �Է��� �ζ� ��ȣ");
		for(i=0;i<6;i++) {
			System.out.print(my[i]+" ");
		}
		
		for(i=0;i<6;i++) {
			for(j=0;j<6;j++) {
				if(lotto[i] == my[j]) {
					count++;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("���� ����:"+count);
//		if(count==6)
		
		switch(count) {
		case 6:System.out.println("1��");
				break;
		case 5:System.out.println("2��");
				break;
		case 4:System.out.println("3��");
				break;
		default:System.out.println("��");
				break;
		}
		
	}

}


//����1: 3
//����2: 4
//����3: 12
//����4: 4
//�ߺ��� �ٽ� ����4: 12
//�ߺ��� �ٽ� ����4: 3
//�ߺ��� �ٽ� ����4: 43
//����5: 89
//1~45������ �� �Է��ϼ���.
//����5: 22
//����6: 33
//���� �߻���Ų �ζ� ��ȣ
//2 19 32 15 43 7 
//
//���� ������ �ζ� ��ȣ
//3 4 12 43 22 33 
//
//���� ���� : 1
//��!!




