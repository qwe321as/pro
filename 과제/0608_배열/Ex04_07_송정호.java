import java.util.Scanner;

public class Ex04_07_송정호 {

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
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 목록 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("번호 선택 : ");
			num = sc.nextInt();
			
			if(num == 1) {
				
				System.out.print("학생 수 입력 : ");
				stuNum = sc.nextInt();
				
				score = new int[stuNum];
			}
			else if(num == 2) {
							
				if(score == null) {
					System.out.println("** 학생 수를 입력 하세요. **");
					continue;
				}
				
				System.out.println("점수 입력 ");
				
				for(int i = 0; i < score.length; i++) {
					
					System.out.print((i + 1) + "번 학생 점수 입력 : ");
					score[i] = sc.nextInt();
				}
			}
			else if(num == 3) {
				
				if(score == null) {
					System.out.println("** 점수를 입력 하세요. **");
					continue;
				}
				
				System.out.println("점수 목록 ");
				
				for(int i = 0; i < score.length; i++) {
					
					System.out.println((i + 1) + "번 학생 점수 = " + score[i]);
				}
				
				System.out.println();
			}
			else if(num == 4) {
				
				if(score == null) {
					System.out.println("** 점수를 입력 하세요. **");
					continue;
				}
				
				System.out.println("분석");
				
				for(int i = 0; i < score.length; i++) {
					
					sum += score[i];
				}
				
				System.out.println("점수 합계 : " + sum);
				
				avg = (double)sum / stuNum;
				System.out.printf("점수 평균 : %.2f\n", avg);
				
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
				
				System.out.println("최댓값 : " + max);
				System.out.println("최솟값 : " + min);
				
				for(int i = 0; i < score.length - 1; i++) {
					
					for(int j = i + 1; j < score.length; j++) {
						
						if(score[i] > score[j]) {
							
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
				}
				
				System.out.print("점수 정렬 : ");
				for(int i = 0; i < score.length; i++) {
					
					System.out.print(score[i] + " ");
				}
				System.out.println();
				
			}
			else if(num == 5) {
				
				System.out.println("5.종료");
				break;
			}
			else {
				
				System.out.println("1 ~ 5 사이의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램을 종료 합니다.");
	}
}