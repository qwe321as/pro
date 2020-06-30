import java.util.Scanner;

public class Ex04_07_권현 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum,i,j,sum=0;
		int[] score = null;  //null:아무것도 없음(초기화)
		int max, min;
		int temp;

		while(true) {

			System.out.println("--------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("--------------------------");
			System.out.print("번호 선택>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("학생수입력>>");
				stuNum = sc.nextInt();
				score = new int[stuNum];
			}

			else if(num==2) {
				System.out.println("2.점수입력");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;//for문=> 조건식 //while=> 증감식
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수:");
					score[i] =sc.nextInt();
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


			//총점,평균(소수점아래 2자리),최대값,최소값
			//정렬33,67,22,11=>11,22,33,67	

			else if(num==4) {
				System.out.println("4.분석");

				//총점
				for(i=0;i<score.length;i++) {
					sum=sum+score[i];
				}
				System.out.println("총점:"+sum);



				//평균
				System.out.printf("평균은 %.2f",(double)sum/score.length);//score.length(학생수)


				//최대최소
				max = score[0];
				min = score[0];
				for(i=0;i<score.length;i++) {
					if(max<score[i]) {
						max = score[i];
					}
					if(min>score[i]) {
						min = score[i];
					}
				}
				System.out.println();
				System.out.println("max:"+max);
				System.out.println("min:"+min);



				//정렬
				for (i=0;i<score.length-1;i++) {
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]);{
							temp=score[j];
							score[j]=score[i];
							score[i]=temp;
						}
					}
				}

				for (i=0;i<score.length;i++) {
					System.out.print(score[i]+" ");
				}
			}
			//총점,평균(소수점아래 2자리),최대값,최소값
			//정렬33,67,22,11=>11,22,33,67	



			else if(num==5) {
				System.out.println("5.종료");
				break;
			}

			else {
				System.out.println("15사이의 번호만 입력 가능합니다.");
			}

		}//while
		System.out.println("프로그램을 종료합니다.");

	}//main

}//class
