import java.util.Scanner;

public class Ex04_07_원태찬 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);                           //한 번만
		int num,stuNum,i=0,sum=0,max=0,min=0,j,temp;
		double avg=0;
		int[] score = null;                                //배열 초기값,null은 아무것도 없다는 뜻
		while(true) {
			
		System.out.println("----------------------------------");
		System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
		System.out.println("----------------------------------");
		System.out.print("번호 선택>>");
		num=sc.nextInt();                           //while+입력문(sc.nextInt()) -> 입력문 반복, 끝내려면 break
		
		if(num==1) {
			System.out.print("학생수 입력>>");
			stuNum=sc.nextInt();
			score=new int[stuNum];                  //입력문(sc.nextInt())후 배열 -> 배열 입력
		}
		else if(num==2) {
			System.out.println("2.점수입력");
			if(score==null) {
				System.out.println("1번 학생수 부터 입력하세요");
				continue;                             //continue는 내려가지 못하게 함. 그리고 위에 반복문 조건식으로 감.
			}
			for(i=0;i<score.length;i++) {             //여기서 score는 num==1에서의 괄호에서만 int로 사용가능. 따라서 전체로 int선언이 좋음.  
			System.out.print(i+1+"번 학생 점수:");
				score[i]=sc.nextInt();
			}
		}
		else if(num==3) {
			System.out.println("3.점수목록");
			if(score==null) {
				System.out.println("1번 학생수 부터 입력하세요");
			continue;}
			for(i=0;i<score.length;i++) {
				System.out.println(i+1+"번 학생 점수:"+score[i]);
			}
		}
		else if(num==4) {
			System.out.println("4.분석");
			for(i=0;i<score.length;i++) {
			sum=sum+score[i];
			avg=(double)sum/score.length;
			}
			max=score[0];
			min=score[0];
			for(i=1;i<=score.length-1;i++) {
			if(max<score[i]) {
				max=score[i];
			}
			if(min>score[i]) {
				min=score[i];
			}
			}
			
			
				System.out.printf("sum:%d avg:%.2f max:%d min:%d",sum,avg,max,min);
				for(i=0;i<=score.length-2;i++) {              //ex: score.length-2 3
					for(j=i+1;j<=score.length-1;j++) {        //ex: score.length-1 4
						if(score[i]>score[j]) {
							temp=score[i];
							score[i]=score[j];
							score[j]=temp;
						}
					}
				} System.out.println();
				for(j=0;j<=score.length-1;j++) {              //ex: score.length=5
				System.out.print(score[j]+" ");
				}
 	}
		
	
		
		else if(num==5) {
			System.out.println("5.종료");
			break;
		}
		else {
			System.out.println("1~5사이의 번호만 입력가능합니다.");
		}
		
		
		}//while
		System.out.println("프로그램을 종료합니다.");
	}

}
