import java.util.Scanner;

public class Ex04_07_����ȣ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int stuNum = 0;
		int score[] = null;
		int sum = 0;
		double avg = 0;
		int max, min, temp;
		
		while(true) {
			
			System.out.println("-----------------------------------------");
			System.out.println("1.�л� �� | 2.���� �Է� | 3.���� ��� | 4.�м� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("��ȣ ���� : ");
			num = sc.nextInt();
			
			if(num == 1) {
				
				System.out.print("�л� �� �Է� : ");
				stuNum = sc.nextInt();
				
				score = new int[stuNum];
			}
			else if(num == 2) {
							
				if(score == null) {
					System.out.println("** �л� ���� �Է� �ϼ���. **");
					continue;
				}
				
				System.out.println("���� �Է� ");
				
				for(int i = 0; i < score.length; i++) {
					
					System.out.print((i + 1) + "�� �л� ���� �Է� : ");
					score[i] = sc.nextInt();
				}
			}
			else if(num == 3) {
				
				if(score == null) {
					System.out.println("** ������ �Է� �ϼ���. **");
					continue;
				}
				
				System.out.println("���� ��� ");
				
				for(int i = 0; i < score.length; i++) {
					
					System.out.println((i + 1) + "�� �л� ���� = " + score[i]);
				}
				
				System.out.println();
			}
			else if(num == 4) {
				
				if(score == null) {
					System.out.println("** ������ �Է� �ϼ���. **");
					continue;
				}
				
				System.out.println("�м�");
				
				for(int i = 0; i < score.length; i++) {
					
					sum += score[i];
				}
				
				System.out.println("���� �հ� : " + sum);
				
				avg = (double)sum / stuNum;
				System.out.printf("���� ��� : %.2f\n", avg);
				
				max = score[0];
				min = score[0];
				for(int i = 0; i < score.length; i++) {
					
					if(max < score[i]) {
						
						max = score[i]; 
					}
					
					if(min > score[i]) {
						
						min = score[i];
					}
				}
				
				System.out.println("�ִ� : " + max);
				System.out.println("�ּڰ� : " + min);
				
				for(int i = 0; i < score.length - 1; i++) {
					
					for(int j = i + 1; j < score.length; j++) {
						
						if(score[i] > score[j]) {
							
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
				}
				
				System.out.print("���� ���� : ");
				for(int i = 0; i < score.length; i++) {
					
					System.out.print(score[i] + " ");
				}
				System.out.println();
				
			}
			else if(num == 5) {
				
				System.out.println("5.����");
				break;
			}
			else {
				
				System.out.println("1 ~ 5 ������ ���ڸ� �Է��ϼ���.");
			}
		}
		System.out.println("���α׷��� ���� �մϴ�.");
	}
}