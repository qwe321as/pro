import java.util.Scanner;

public class Ex04_07_정주원 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num,stuNum,i,max,min,temp,j;
		int sum=0;
		
		int[]score=null;//아무것도 아닌 값
		while(true) {
			
			System.out.println("----------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("----------");
			System.out.println("번호선택>>");
			num=sc.nextInt();
			if(num==1) {
				System.out.print("1.학생수");
				stuNum =sc.nextInt();
				
				score= new int[stuNum];
			}
			else if(num==2) {
				System.out.println("2.점수입력");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;//컨티뉴 만나면 while은 조건식(true)으로 감,for문은 증감식
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"번 학생 점수");
				score[i]=sc.nextInt();
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
			else if(num==4) {
				System.out.println("4.분석");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;
				}
				
				
				
				int[]score= {11,22,67,33};
				for(i=0;i<score.length;i++) {
					
					System.out.print(score[i]+" ");
				}
				
				for(i=0;i<score.length-1;i++) {
					for(j=i+1;j<score.length;j++) {
						if (score[i]>score[j]) {
							temp=score[j];
							score[j]=score[i];
							score[i]=temp;
						}
					}
				}
				System.out.println();
				for(i=0;i<score.length;i++) {
					
					System.out.print(score[i]+" ");
				}
				
				
				
				
				
				
				
				
				for(i=0;i<score.length;i++ ) {
					System.out.print(score[i]+" ");}
					sum=sum+score[i];
				
					System.out.println();
					System.out.println("총점:"+sum);
					System.out.printf("평균:%.2f",(float)sum/score.length);
				
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
					System.out.println();
				System.out.println("최대값:"+max);
				System.out.println("최소값:"+min);
				
				
				
				
				
				
				
				
						//총점,평균(소수점 아래 두 자리),최대값,최소값
				//정렬 33,44,66,22=>22,33,44,66
			}
			else if(num==5) {
				System.out.println("5.종료");
				break;
			}
			else{
				System.out.println("1~5 사이의 번호만 입력 가능합니다.");
			}
		}
		
	
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
	}

}
