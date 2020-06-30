import java.util.Scanner;

public class Ex04_07_김범규 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num,stuNum,i,total = 0,j,max,min,temp;
		int[] score = null; // 아무것도 아닌값을 넣어주겠다. 배열에는 null
		while(true) {
			

			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.println("번호 선택>>");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.print("학생수 입력>>");
				stuNum = sc.nextInt();
				score = new int[stuNum];
			}
			
			else if(num==2) {
				System.out.print("2. 점수입력\n");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue; // while에서는 조건식 for문에서는 증감식.
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수: ");
					score[i] = sc.nextInt(); 
				}
			}
			
			else if(num==3) {
				System.out.println("3. 점수목록");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수:" +score[i]+"점 ");	
				}
			}
			//총점, 평균(소수점아래 2자리), 최대값, 최소값 
			//정렬 33,67,22,11 => 11,22,33,67
			else if(num==4) {
				System.out.println("4. 분석");
				for(i=0;i<score.length;i++) {
					total += score[i];				
				}
				
				max = score[0];
				min = score[0];
				for(i=1;i<score.length;i++) {
					if(max < score[i]){
						max = score[i];
					}
					else if(min > score[i]) {
						min = score[i];
					}
				}
				System.out.println("총점: "+total);
				System.out.printf("평균: %.2f\n",(double)total/score.length);
				System.out.println("최대값: "+max);
				System.out.println("최소값: "+min);
				
				
				for(i=0;i<score.length-1;i++) {
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
					System.out.println();
				}
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+" ");
				}
				
			}
			
			else if(num==5) {
				System.out.println("5. 종료");
				break;
			}
			else {
				System.out.println("1~5사이의 번호만 입력가능합니다.");
			}
		}//while
		System.out.println("프로그램을 종료합니다.");




	}//main

}//class
