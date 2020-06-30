import java.util.Scanner;

public class Ex04_07_양경원 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int score[] = null;
		int N,stu,num,tmp;
		int sum = 0;
		int i,j=0;
		int max=0;
		int min=0;

		
		while(true) {
			num = sc.nextInt();
			if(num == 1) {
				System.out.println("학생수입력 : ");
				
				stu = sc.nextInt();
				score = new int[stu];
				
			}else if(num == 2) {
				System.out.println("점수입력 : ");
				if(score == null) {
					System.out.println("1번 학생수 부터 입력하시오");
					continue;
				}
				for(i=0; i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수 : ");
					score[i] = sc.nextInt();	
				}
			}else if(num == 3) {
				System.out.println("점수목록");
				if(score == null) {
					System.out.println("1번 학생수 부터 입력하시오");
					continue;
				}
				for(i=0; i<score.length;i++) {
					System.out.println(i+1+"번 학생 점수 : "+score[i]);
				}
				
			}
			else if(num == 4) {
				System.out.println("분석");
				//총점,평균,최대값,최소값, 정렬
				for(i=0; i<score.length;i++) {
					sum += score[i];
				}
				
				max = score[0];
				min = score[0];
				for(i = 1; i<score.length;i++) {
					if(max<score[i]) {
						max = score[i];
					}
					if(min>score[i]){
						min = score[i];
					}
				}
				int sumf = sum/score.length;
				System.out.println("총점 : " +sum);
				System.out.printf("평균 : %.2f\n" ,(float)sumf);
				System.out.println("최대값 : " +max);
				System.out.println("최솟값 : " +min);
				
				for(i = 0; i<score.length-1 ; i++) {
					for(j = i+1 ; j<score.length ; j++) {
						if(score[i] > score[j]) {
							
							tmp = score[j];
							score[j]= score[i];
							score[i] = tmp;
							
						}
					}
				}
				for(i=0; i<score.length;i++) {
					System.out.print(score[i]);
				}
			}
			else if(num == 5) {
				System.out.println("마지막");
				break;
			}
			else {
				System.out.println("다른번호 입력");
			}
			
		}
		System.out.println("종료");

	}

}
