import java.util.Scanner;

public class Ex04_07_허평강 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,stuNum,i,j,sum=0,max,min;
		int[] score = null;
		while(true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("-------------------------------------------------");
			System.out.println("번호선택>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.println("1.학생수");

				stuNum = sc.nextInt();
				score = new int[stuNum];			
			} 

			else if(num==2) {
				System.out.println("2.점수입력");	
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수 : ");
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
					System.out.println(i+1+"번 학생 점수: "+score[i]);

				}
			}

			else if(num==4) {
				System.out.println("4.분석");
				max=score[0];
				min=score[0];
				for(i=0;i<score.length;i++) {
					
					sum += score[i]; 
					if(max<score[i]) max = score[i];
					if(min>score[i]) min = score[i];


			}
			for(j=0;j<score.length-1;j++) {	
				for(i=j+1;i<score.length;i++) {
					
				
				int temp;
				if(score[j]<score[i]) {
					temp = score[j];
					score[j] = score[i];
					score[i] = temp; 
					
				}
				}
			}
				
				System.out.println("합계:"+sum);
				System.out.printf("평균:%.2f\n",(float)sum/score.length);
				System.out.println("최대값:"+max);
				System.out.println("최소값:"+min);
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+" ");
				}
				System.out.println();
			}
			else if(num==5) {
				System.out.println("5.종료");
				break;
			}
			else {
				System.out.println("1~5사이의 번호만 입력가능합니다.");
			}






		}
	}
}
