import java.util.Scanner;

class Ex08_06_�ڽþ� {

	public static void main(String[] args) {
		
//		int i;
//		for(i=0; i<6; i++) {
//			
//			int num = (int) (Math.random()*44)+1; //1~45
//			System.out.println(num);
		
			
		Scanner sc = new Scanner(System.in);
		
			int lotto[] = new int[6];
			int[] my = new int[6];
			int i,j;
			int count = 0;
			
			for(i=0; i<6; i++) {
				lotto[i] = (int)(Math.random()*45)+1;     // 1~45  45-1 +1
				for(j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) { //��ǻ�Ͱ� ���� ���� �ߺ� Ȯ��
						i--;
					}
				}
		}
			
			
			System.out.println();
			System.out.println("________________________");
			for(i=0; i<lotto.length; i++) {
				System.out.print("����"+(i+1)+":");
				my[i]= sc.nextInt();
				if(my[i] == 0) {
					i--;
					System.out.println("��ȣ�� 0�� �� �� �����ϴ�.");
				}else if(my[i] > 45) {
					i--;
					System.out.println("��ȣ�� 45�� �ʰ� �� �� �����ϴ�.");
				}else {
					for(j = 0; j < i; j++) {
						if(my[i] == my[j]) {
							i--;
							System.out.println("��ȣ�� �ߺ� �� �� �����ϴ�.");
						}
						
					}
				}
			}
			System.out.println("________________________");
			System.out.println("��÷ �ζ� ��ȣ");
			for(i=0; i<6; i++) {
				System.out.print(my[i]+" ");
			}
			System.out.println();
			System.out.println("========================");
			
			
			System.out.println("���ζ� ��ȣ");
			for(i=0; i<6; i++) {
				System.out.print(lotto[i]+" ");
			}
			
			for(i = 0; i < 6; i++) {
				for(j = 0; j < 6; j++) {
					if(my[i] == lotto[j]) {
						count++;
					}
				}
			}
			
			System.out.println();
			System.out.println("________________________");
			
			if(count == 0) {
				System.out.println("��÷ ��ȣ 0. ��");
			}else if(count == 1) {
				System.out.println("��÷ ��ȣ 1. ��");
			}else if(count == 2) {
				System.out.println("��÷ ��ȣ 2. ��");
			}else if(count == 3) {
				System.out.println("��÷ ��ȣ 3. 4��");
			}else if(count == 4) {
				System.out.println("��÷ ��ȣ 4. 3��");
			}else if(count == 5) {
				System.out.println("��÷ ��ȣ 5. 2��");
			}else{
				System.out.println("��÷ ��ȣ 6. 1��");
			}
			sc.close();
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
