import java.util.Scanner;

public class Ex04_07_김기현 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum,i,j, temp;
		int sum=0,max,min=0;
		int[] score = null; //주소 표기값으로 
		
		while(true) {
					
			System.out.println("----------------------------------");		
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");	
			System.out.println("----------------------------------");
			System.out.print("번호선택>>");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.print("학생수 입력>>");
				stuNum = sc.nextInt();
				
				score = new int [stuNum];								
			}
			else if(num==2) {
				System.out.println("2.점수입력");	
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요");
					continue; // for문 = 증감식으로 , while문 = 조건식으로
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수:");
					score[i] = sc.nextInt();	
				}				
			}
			else if(num==3) {
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요");
					continue;
				}	
				System.out.println("3.점수목록");
				for(i=0;i<score.length;i++) {
				System.out.println(i+1+"번 학생 점수:"+score[i]);
				}
			}
			
			else if(num==4) {			
				System.out.println("4.분석");
				//총점, 평균(소수2자리), 최대 , 최소
				//정렬
				for(i=0;i<score.length;i++) {
					sum = sum + score[i];					
				}
				System.out.println("총점:"+sum);
				System.out.println("---------------");
				double avg = sum / (double)score.length;
				
				System.out.printf("평균:%.2f\n",avg);
				
				System.out.println("---------------");
				
				max = score[0];
				min = score[0];
				for(i=1;i<score.length;i++) {
					if(max < score[i]) {
						max = score[i];
					}
					if(min > score[i]) {
						min = score[i];
					}
				}
				
				System.out.println("최대:"+max);
				System.out.println("최소:"+min);
				
				System.out.println("---------------");
				
				
								
				for(i=0;i<score.length;i++) {
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
				}
				System.out.print("정렬:");
				for(i=0;i<score.length;i++)	{
					System.out.print(score[i] + " ");
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
			
			
		} //while 종료

		System.out.println("프로그램을 종료합니다.");	
	
		
		

	}

}
