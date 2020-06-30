import java.util.Scanner;

public class Ex04_07_구지연 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int i, num, stuNum, sum=0, max, min, j, temp;
		int[]score = null; //null: "아무것도 없다"라는 뜻. int 는 그냥 0을 쓰면 되지만, int[]는 주소이기 떄문에  null을 써야함. "null"아님 주의!
		
		
		
		while(true) {
			System.out.println("----------------");
			System.out.println("1.학생수| 2.점수입력 | 3.점수목록| 4.분석 |5.종료");
			System.out.println("----------------");
			System.out.print("번호선택>>");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.print("학생수 입력>>");
				stuNum = sc.nextInt();
				score = new int[stuNum];   //방을 만든거임
			}
			else if(num==2 ) {
				System.out.print("점수입력>>");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue; //밑으로 못내려가게
					}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번 학생 점수:");
					score[i] = sc.nextInt();  //score를 위에 중괄호에서 선언하면 여기서 인식을 못함 -> 맨위에 int[] score; 를 다시 써야함
				}
			}
			else if(num==3) {
				System.out.println("점수목록");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"번 학생 점수: "+score[i]);
//					score[i] = sc.nextInt();
				}
			}
			else if(num==4) {
				System.out.println("분석");
				for(i=0;i<score.length;i++) {
					sum=sum+score[i];
				}
				System.out.println("총점:"+ sum);
				
				System.out.printf("%d/%d=%.2f",sum,score.length,(double)sum/score.length);
				
				max=score[0];
				for(i=1;i<score.length;i++) {
					if(max<score[i]) {
						max=score[i];
					}
				}
				System.out.println();
				System.out.println("최대값 :" + max);
				
				min=score[0];
				for(i=1;i<score.length;i++) {
					if(min>score[i]) {
						min = score[i];
					}
				}
				System.out.println("최소값:" +min);
				
				for(i=0;i<score.length;i++){
					for(j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[j];
							score[j] =score[i]; 
							score[i] = temp;
						}
						
					}
				}
				for(i=0;i<score.length;i++) {
					System.out.print(score[i] + " ");
				}
				
				
				
				//총점,평균(소수점아래 2자리), 최대값, 최소값
				//정렬도 하기
			}
			else if(num==5) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("1~5사이의 번호만 입력 가능합니다.");
			}
		
		
		}
			System.out.println("프로그램을 종료합니다.");  //break; 만나서 여기로 옴
		
		
		
		
		
		
		
		
		
	}

}
