import java.util.Scanner;

public class Ex04_07_엄유안 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum,i, v, temp, sum=0, max=0, min=0;
		int[] score = null;

		while(true) {


			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.print("번호 선택>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("학생수 입력>>");
				stuNum = sc.nextInt();

				score = new int[stuNum];

			}
			else if(num==2) {
				System.out.println("2.점수입력");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요");
					continue; 
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수:");
					score[i] = sc.nextInt();
				}

			}
			else if(num==3) {
				System.out.println("3.점수목록");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요");
					continue; 
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"번 학생 점수:"+score[i]);
				}
			}
			else if(num==4) {
				System.out.println("4.분석");

				// 총점, 평균(소수점아래 2자리),최대값, 최소값
				// 정렬 33,67,22,11 => 11,22,33,67
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요");
					continue; }

				for(i=0;i<score.length; i++) {
					sum=sum+score[i];
				}
				System.out.println("sum: "+sum);
				System.out.printf("avg: %.2f\n", (double)sum/score.length);

				for(i=0; i<score.length; i++) {
					max=score[0];
					min=score[0];
					if(max<score[i]) {max=score[i];}
					if(min>score[i]) {min=score[i];}
				}
				System.out.println("max: " +max);
				System.out.println("min: " +min);
				
				for(i=0; i<score.length; i++) {
					for(v=i+1; v<score.length-1; i++)
					if(score[i]>score[v]) {
						temp=score[i];
						score[v]=temp;
						score[i]=score[v];		
					}
					
				}//정렬for바깥문
				for(i=0;i<score.length;i++) {
					System.out.print(score[i] +" ");
				System.out.println();
				}
				
			} //else if4 바깥문
			
			else if(num==5) {
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


