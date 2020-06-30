import java.util.Scanner;

public class ex04_07_인정배 {
	public static void main(String[]args) {
		//
		Scanner sc = new Scanner(System.in);
		int max,min,num,i,sda,stunum=1,q,d;
		int[]score = null;

		q=0; 
		while(true){

			System.out.println("****************************************");
			System.out.println("1학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("****************************************");
			System.out.print("번호선택>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("1.학생수");
				stunum = sc.nextInt();

				score= new int[stunum];
				
			}else if (num==2) {
				System.out.println("2.점수입력");
				if(score==null) {
					System.out.println("다시시작");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.print(i+1+"번학생 점수:");
					score[i] = sc.nextInt();
				}

			}else if (num==3) {
				if(score==null) {
					System.out.print("다시시작");
					continue;
				}
				System.out.println("3.점수목록");
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"번학생 점수"+score[i] );
			
				}


			}else if (num==4) {
				System.out.println("4.분석");
				if(score==null) {
					System.out.println("다시시작");
					continue;
				}
				for(d=0;d<score.length;d++) {
					q= q+score[d];
					
				}
				System.out.println("평균:"+q/stunum);
				q=0; d=0;
				System.out.println("오름차순:");
				for(d=0;d<score.length-1;d++) {
					for(q=d+1;q<score.length;q++) {
						if(score[d]>score[q]) {
							sda=q;
							q=d;
							d=sda;
							System.out.print(score[d-1]+",");
						}
						
					}
				}
			System.out.println(1);
			System.out.println("최대값:"+score[0]);
			System.out.println("최소값:"+score[stunum-1]);

			}else if (num==5) {
				System.out.println("5.종료");
				if(score==null) {
					System.out.println("다시시작");
					continue;
				}
					break;
				}else{
					System.out.println("1~5 번사이의 번호를 입력하세요");
				}

			}


		
	}
	}
