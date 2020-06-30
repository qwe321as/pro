import java.util.Scanner;

public class Ex04_07_김문관 {

	public static void main(String[] args) {
		//		총점, 평균(소수점아래 2자리), 최대값,최소값,정렬
		Scanner scan = new Scanner(System.in);
		int num,stuNum,sum,max,min,temp;
		sum = 0;
		int[] score = null;
		double avg = 0;


		while(true) {

			System.out.println("======================");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("======================");
			System.out.print("번호 선택>>");

			num = scan.nextInt();

			if(num == 1) {
				System.out.print("학생수 입력 :");
				stuNum = scan.nextInt();

				score = new int[stuNum];

			}else if(num == 2) {
				System.out.println("접수입력 :");
				if(score == null) {
					System.out.println("1번 항목 학생수를 먼저 입력하세요");
				}else {
					for(int i = 0; i < score.length; i++) {
						System.out.print(i + 1 + "학생 점수 :");
						score[i] = scan.nextInt();
						if(score[i] > 100) {
							System.out.println("점수는 100점을 넘을 수 없습니다. 넘는 값은 0점 처리. 다시 입력.");
							score[i] = 0;
							break;
						}
					}
				}
			}else if(num == 3) {
				System.out.println("점수목록 :");
				if(score == null) {
					System.out.println("1번 항목 학생수를 먼저 입력하세요");
				}else {
					for(int i = 0; i < score.length; i++) {
						System.out.println(i + 1 + "학생 점수 :" +score[i]);
					}
				}

			}else if(num == 4) {
				System.out.println("4.분석");
				if(score == null) {
					System.out.println("1번 항목 학생수를 먼저 입력하세요");
				}else {


					max = score[0];
					min = score[0];


					for(int i = 0; i < score.length; i++) {
						sum += score[i];
						avg = (double)sum / score.length;

						if(max < score[i]) {
							max = score[i];
						}
						if(min > score[i]) {
							min = score[i];
						}

					}
					System.out.printf("평균 : %.2f\n" ,avg);
					System.out.println("합계 :" + sum);
					System.out.println("최대점수 :" + max);
					System.out.println("최소점수 :" + min);


					for(int i = 0; i < score.length; i++) {
						for(int j = i+1; j < score.length; j++) {
							if(score[i] > score[j]) {
								temp = score[j];
								score[j] = score[i];
								score[i] = temp;
							}

						}
						
						System.out.print(score[i] + " ");

					}
					System.out.println();
				}
			}else if(num == 5) {
				System.out.println("5.종료");
				break;
			}else {
				System.out.println("1~5사이의 번호만 입력 가능");
			}
		}

		System.out.println("프로그램을 종료 합니다.");

	}

}
