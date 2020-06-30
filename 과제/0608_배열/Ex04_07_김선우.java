import java.util.Scanner;

public class Ex04_07_김선우 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,stuNum,i=0,j=0,sum=0,max=0,min=0,temp;
		int[] score = null;
		double avg=0;
		while(true) {

			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.print("번호 선택>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("1.학생수 입력>>");
				stuNum=sc.nextInt();
				score=new int[stuNum];			
			}
			else if(num==2) {
				System.out.print("2.점수입력");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"번 학생 점수:");
					score[i]=sc.nextInt();
				}
			}
			else if(num==3) {
				System.out.print("3.점수목록");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println((i+1)+"번 학생 점수:"+score[i]);
				}
			}
			else if(num==4) {
				System.out.print("4.분석\n");
				//총점, 평균(소수점아래2자리),최대값,최소값
				//정렬 33,67,22,11=>11,22,33,,67
				for(i=0;i<score.length;i++) {
					sum=sum+score[i];
					avg = (double)sum/score.length;
				}
				max=score[0];
				min=score[0];
				for(i=1;i<score.length;i++) {
					if(max<score[i]) {
						max=score[i];
					}
					if(min>score[i]) {
						min=score[i];
					}
				}


				System.out.println("총점:"+sum);
				System.out.printf("평균:%.2f\n",avg);				
				System.out.println("max:"+max);
				System.out.println("min:"+min);

				for(i=0;i<score.length-1;i++) {
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
				}
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+" ");		
				}
			}


			else if(num==5) {
				System.out.print("5.종료");
				break;
			}
			else {
				System.out.println("1~5사이의 번호만 입력 가능합니다.");
			}

		}
		System.out.println("프로그램을 종료합니다.");
	}  
}



