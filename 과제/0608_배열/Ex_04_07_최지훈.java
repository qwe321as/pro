import java.util.Scanner;

public class Ex_04_07_최지훈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i,j,num,sum=0,avar=0,max,min,temp=0;
		int[] score=null;

		while(true) {
			System.out.println("--------------------------");
			System.out.println("1.학생수 ㅣ 2.점수입력 ㅣ 3.점수목록 ㅣ 4.분석 ㅣ 5.종료");
			System.out.println("--------------------------");
			System.out.println("번호입력");
			num = sc.nextInt();

			if(num==1) {
				System.out.println("1.학생수  입력 : ");
				int stuNum = sc.nextInt();
				score = new int[stuNum];


			}
			else if(num==2) {
				System.out.println("2.점수입력");
				if(score==null) {
					System.out.println("1번부터 입력해주세요.");
					continue;
				}

				for(i=0;i<score.length;i++) { 
					System.out.println(i+1+"번 학생 점수");
					score[i] = sc.nextInt();
				}

			}

			else if(num==3) {
				System.out.println("3.점수목록");
				if(score==null) {
					System.out.println("1번부터 입력해주세요.");
					continue;
				}
				for(i=0;i<score.length;i++) { 

					System.out.println(i+1+"번방 학생 점수"+score[i]+" ");

				}
			}

			else if(num==4) {
				System.out.println("4.분석");
				System.out.println("***********");
				if(score==null) {
					System.out.println("1번부터 입력해주세요.");
					continue;
				}

				for(i=0;i<score.length;i++) { 

					sum = sum +score[i];

				}
				System.out.println("총점 :"+sum);
				System.out.println("***********");

				avar = sum/score.length;
				System.out.println("평균 :"+avar);
				System.out.println("***********");		

				max = score[0];
				min = score[0];
				for(i=1;i<score.length;i++) {
					if (max<score[i]) {
						max = score[i];
					}
					if (min>score[i]) {
						min=score[i+1];
					}

				}


				System.out.println("최대값 :"+max);
				System.out.println("***********");
				System.out.println("최소값 :"+min);
				System.out.println("***********");

				for(i=0;i<score.length; i++) {
					for(j=i+1;j<5;j++){

						{
							if(score[i]>=score[j]) {
								temp = score[j];
								score[j] = score[i];
								score[i] =temp;		

							}

						}
					}
				}
				for(i=0;i<score.length; i++) 
				{System.out.print(score[i]+" ");

				}

			}



			else if(num==5) {
				System.out.println("5.종료");
				break;
			}

			else {
				System.out.println("1~5까지 넣어주세요");
			}








		} System.out.println("프로그램 종료 합니다.");






































	}

}
