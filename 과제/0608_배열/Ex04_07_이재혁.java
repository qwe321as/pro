import java.util.Scanner;

import java.util.Scanner;

public class Ex04_07_이재혁 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, stuNum, i, t, j, sum=0, temp;
		int[] score = null; //unll 아무것도 아닌 값
		while(true) {

			System.out.println("----------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("----------------------------------");
			System.out.print("번호입력>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("학생수 입력>>");
				stuNum = sc.nextInt();

				score = new int[stuNum];
			}
			else if(num==2) {
				System.out.println("2.점수입력");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue; // for문에서는 증감식, 와일에선 조건식으로 간다
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수:");
					score[i] = sc.nextInt();
				}
			}
			else if(num==3) {
				System.out.println("3.점수목록");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"번 학생 점수:"+score[i]);
				}
			}
			else if(num==4) {
				System.out.println("4.분석");
				if(score==null){
					System.out.println("1번 학생수 부터 입력하세요.");	
					continue; 
				}
				//총점, 평균(소수점아래 2자리),최대값,최소값
				//정렬 오름차순
				//				======
				for (i = 0; i < score.length; i++) {
					sum+=score[i];					
					System.out.println("총점: "+sum);
					System.out.printf("평균은: %.2f\n",(double)sum/score.length);
					int max = score[0];
					int min = score[0];
					for(i=1;i<score.length;i++) {
						if(max < score[i]) 
							max = score[i];
						if(min > score[i]) 
							min = score[i];
					}
					System.out.println("최대값:"+max);
					System.out.println("최소값:"+min);
					
					for(i = 0; i < score.length; i++) {
						for(j = i+1; j< score.length; j++) {
							if(score[i]>score[j]) {
								temp = score[j];
								score[j]=score[i];
								score[i]=temp;
							}
						}
					}
					
					System.out.print("점수 정렬:");
					for(i=0;i<score.length;i++) {
						System.out.print(score[i]+" ");
					}
					System.out.println();

				}
			}//else if4

			else if(num==5) {
				System.out.println("5.종료");
				break;
			}
			else {
				System.out.println("1~5사이의 번호만 입력가능합니다.");
			}

		}//while

		System.out.println("프로그램을 종료합니다.");









	}//main
}//class
	



