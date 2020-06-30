import java.util.Scanner;

public class Ex04_07_김용승 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, stuNum=0, sum=0;
		int[] score = null;
		int i, j;
		int max,min;
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("----------------------------------");
			
			System.out.print("번호선택>>");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.print("학생수 입력>>");
				stuNum = sc.nextInt();
				score = new int[stuNum];
				
			}//if~1
			else if(num==2) {
				if(score==null) {
					System.out.println(">>학생수부터 입력하세요<<");
					continue;}
				System.out.println("점수입력>>");
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수 : ");
					score[i]=sc.nextInt();
				}
				
			}//if~2
			else if(num==3) {
				if(score==null) {
					System.out.println(">>학생수부터 입력하세요<<");
					continue;
					}
				System.out.println("3.점수목록");
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"번 학생 점수 : "+score[i]+"점");
				}
				
			}//if~3
			else if(num==4) {
				if(score==null) {
					System.out.println(">>학생수부터 입력하세요<<");
					continue;
					}
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
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+"점 ");
				}
				System.out.println();
				System.out.println(stuNum+"명의 점수 총합 : "+sum+"점");
				System.out.printf("%d명의 점수 평균 : %.2f점\n",stuNum,(float)sum/stuNum);
				System.out.printf("최고 점수 : %d점 / 최저 점수 : %d점\n",max,min);
				
				
			}//if~4
			else if(num==5) {
				System.out.println("5.종료");
				break;
			}//if~5
			else System.out.println("1~5 사이의 번호만 입력가능합니다.");
		}//while
		System.out.println("프로그램을 종료합니다.");
	}

}
