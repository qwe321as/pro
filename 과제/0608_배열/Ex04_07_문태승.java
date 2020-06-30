import java.util.Scanner;

public class Ex04_07_문태승 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum = 0,i,sum,max,min;
		double avg = 0;
		int[] score = null;
		while(true) {

			System.out.println("----------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("----------------------");
			System.out.println("번호 선택>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("1.학생수 입력>>");
				stuNum = sc.nextInt();

				score = new int[stuNum];

			}
			else if(num==2) {
				System.out.println("2.점수입력");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;  // for문 => 증감식  while문 => 조건식으로 이동
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
					continue;  // for문 => 증감식  while문 => 조건식으로 이동(10번째줄)
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"번 학생 점수:"+score[i]);
					continue;
				}
			}
			else if(num==4) {
				System.out.println("4.분석");
			
			// 총점,평균(소수점아래 2자리),최대값,최소값	
			// 정렬33,67,22,11 => 11,22,33,67	
				sum=0;
				max = score[0];
				min = score[0];
				for(i=0;i<score.length;i++) {
					sum=sum+score[i];
					avg=(double)sum/stuNum;
						if(max < score[i]) {
							max = score[i];
						}
						if(min > score[i]) {
							min = score[i];
						}
				}
				System.out.println("총점:"+sum);
				System.out.printf("평균: %.2f\n1",avg);
				System.out.println("최대값:"+max);
				System.out.println("최대값:"+min);
				
			}
			else if(num==5) {
				System.out.println("5.종료");
				break;
			}
			else {
				System.out.println("1~5사이의 번호만 입력해주세요.");
			}

		} //while

		System.out.println("프로그램을 종료합니다.");




	}

}
