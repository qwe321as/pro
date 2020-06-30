import java.util.Scanner;

public class Ex04_07_김용주 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum;		
		int[] score = null;
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.학생수|2.점수입력|3.점수등록|4.분식|5.종료");
			System.out.println("-----------------------");
			System.out.println("번호 선택>>");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.println("학생수 입력>>");
				stuNum = sc.nextInt();
				
				score = new int[stuNum];			
				
			}
			else if(num==2) {
				System.out.println("2.점수입력");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;
				}
				for(int i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수:");
					score[i] = sc.nextInt();
				}
				
				
			}else if(num==3) {
				System.out.println("3.점수등록");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;
				}
				for(int i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수:"+score[i]);
					
				}
				
			}else if(num==4) {
				System.out.println("4.분식");
				
				// 총점, 평균(소수점아래 2자리), 최대값, 최소값
				//정렬33,67,22,11 => 11,22,33,67
				int sum=0;
				for(int i=0;i<score.length;i++) {
					sum+=score[i];
				}
				System.out.println("총점:"+sum);
				System.out.printf("평균:%.2f\n",(float)sum/score.length);

				int temp;
				for(int i=0;i<score.length-1;i++) {
					for(int j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp=score[i];
							score[i]=score[j];
							score[j]=temp;
						}
					}
				}
				System.out.println("최대값:"+score[score.length-1]);
				System.out.println("최소값:"+score[0]);
			}else if(num==5) {
				System.out.println("5.종료");
				break;
			}
			else {
				System.out.println("1~5사이의 번호만 입력가능합니다.");
			}

		} // while
		System.out.println("프로그램을 종료합니다.");


	}

}
