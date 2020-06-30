import java.util.Scanner;

public class EX04_07_이은찬{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num,stuNum,i,sum=0,max,min;
		
		
		
		int[] score = null; // score 선언, null = 아무것도 없음을 뜻하는 단어이므로 문자가 아니다 따라서 ""금지
		while(true) {
			
	
		System.out.println("------------------------------------");
		System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
		System.out.println("------------------------------------");
		System.out.print("번호 선택>>");
		num = sc.nextInt();
		
		if(num==1) {
			System.out.print("학생수 입력>>");
			stuNum = sc.nextInt();
			
			score = new int[stuNum]; //선언한 score에 값을 지정하는 것이며 score 앞에 int 선언시 에러 발생 따라서 변수만 작성
			
		}
		else if(num==2) {
			System.out.println("2.점수입력");
			if(score==null) {
				System.out.println("1번 학생수 부터 입력해주세요.");
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
				System.out.println("1번 학생수 부터 입력해주세요.");
				continue;
			}
			for(i=0;i<score.length;i++) {
			System.out.println(i+1+"번 학생 점수:"+score[i]);
			}
		}
		else if(num==4) {
			System.out.println("4.분석");
			if(score==null) {
				System.out.println("1번 학생수 부터 입력해주세요.");
				continue;
			}
				
				for(i=0;i<score.length;i++) {
					sum += score[i];
				}
					System.out.println("총점:"+sum);
					
					double avg = (double)sum/3;
					System.out.printf("평균:%.2f",avg);
			
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
					 
			        int temp;
					for(i=0;i<score.length-1;i++) {
						for(int j=i+1;j<score.length;j++) {
							if(score[i]>score[j]) {
								temp=score[i];
								score[i]=score[j];
								score[j]=temp;
							}
						}
					}
			        System.out.println("최대점수:" +max);
			        System.out.println("최소점수:" +min);
			        
				// 총점, 평균 (소수점아래 2자리), 최대값, 최소값
				// 정렬 33,67,22,11 => 11,22,33,67
			
		}
		else if(num==5) {
			System.out.println("5.종료");
			break;
		}
		else {
			System.out.println("1~5 사이의 번호만 입력 가능합니다.");
		}
	}//while
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
