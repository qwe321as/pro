import java.util.Scanner;

public class Ex04_07_이설아 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int num, stuNum, i,j, max, min, temp;
		int sum=0;
		int[] score = null;  //아무것도 아닌 값을 넣어주겠다. 초기값 없다고 에러가 뜨면~ 초기값을 넣어주는 것
		
		while(true) {

			System.out.println("---------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("---------------------------------------");
			System.out.print("번호선택>>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("학생수 입력>>");
				stuNum = sc.nextInt();
				score = new int [stuNum];  //입력한 숫자만큼 방이 만들어짐
			}
			else if(num==2) {
				System.out.println("점수 입력>>");
				if(score==null) {     //score 값에 아직도  null 이 있다면
					System.out.println("1번 학생수부터 입력하세요"); //score값을 들고오라~
					continue;                                 //아래 for문을 안만나게 해야지
				}
				for(i=0; i<score.length ; i++) {
					System.out.print(i+1+"번 학생 점수: ");
					score[i]=sc.nextInt();
				}//for
			}
			else if(num==3) {
				System.out.println("점수목록>>");
			    if(score==null) {
			    	System.out.println("1번 학생수부터 입력하세요");
			    	continue;
			    }
				for(i=0;i<score.length;i++) {
					System.out.printf("%d번 학생 점수: %d\n",i+1,score[i]);
				}
			}
			else if(num==4) {
				System.out.println("4.분석");
				//총점, 평균(소수점2), 최대값, 최소값
				//정렬; 오름차순
				
				for(i=0;i<score.length;i++) {
					sum= sum+ score[i];
				}
				System.out.println("총점:" + sum);
				System.out.printf("평균:%.2f\n",(double)sum/score.length);
				
				max= score[0];
				min= score[0];
				for(i=0;i<score.length;i++) {
					
					if(max<score[i]) {
						max=score[i];
					}//if
					if(min>score[i]) {
						min=score[i];
					}//if
					
				}//for
				System.out.println("최대값:"+max);
				System.out.println("최소값:"+min);
				
				for(i=0;i<score.length-1;i++) {
					for(j=i+1;j<=score.length-1;j++) {
						if(score[i] > score[j]) {
							temp=score[j];
							score[j]=score[i];
							score[i]=temp;
						}//if
						
					}//ifor
				}//ofor
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+" ");
				}
				System.out.println();
				
				
			}//elseif
			else if(num==5) {
				System.out.println("5.종료");
				break;
			}
			else {
				System.out.println("1~5사이의 번호만 입력이 가능합니다.");
			}
		}//break만나면 while밖 
		System.out.println("프로그램을 종료합니다.");



	}//main

}
