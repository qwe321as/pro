import java.util.Scanner;

public class Ex_04_07_정지원 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,stuNum,i;//2번째 단어 첫번째를 대문자를 이용함
		int[] score=null;//아무것도아닌 값을 넣어줌
		int max,min,j,temp;
		int sum=0;
		while(true) {


			System.out.println("----------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수목록|4.분석|5.종료");
			System.out.println("----------------------------");
			System.out.println("번호선택>>");
			num =sc.nextInt();
			if(num==1) {
				System.out.print("1.학생수 입력");
				stuNum=sc.nextInt();
				score=new int[stuNum];





			}
			else if(num==2) {
				System.out.println("2.점수입력");
				if(score==null) {
					System.out.println("1번 학생수 부터 입력하세요.");
					continue;//while 식에서는 조건식으로 간다.
				}
				for(i=0;i<score.length;i++) {
					System.out.println(i+1+"번 학생 점수:");
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
				//평균(소수점아래 2자리),최대값,최소값
				//정렬 33,67,22,11=>11,22,33,67
				max=score[0];
				for(i=1;i<score.length;i++) {
					if(max< score[i]) {
						max=score[i];
					}

				}
				min=score[0];
				for(i=1;i<score.length;i++) {
					if(min>score[i]) {
						min=score[i];
					}
				}
				System.out.println("max:"+max);
				System.out.println("min:"+min);


				for(i=0;i<score.length;i++) {
					System.out.println(score[i]+" ");
					sum=sum+score[i];
				}


				System.out.println();
				System.out.println("총점:"+sum);
				System.out.printf("평균:%.2f", (float)sum/score.length);


				System.out.println();
				int arr[]= {33,67,22,11};
				for(i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
				for(i=0;i<4;i++) {
					for(j=i+1;j<5;j++) {
						if(arr[i]>arr[j]) {
							temp = arr[j];
							arr[j]=arr[i];
							arr[i]=temp;
						}

					}


				}
				System.out.println();
				for(i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
			}

				else if(num==5) {
					System.out.println("5.종료");
					break;}
				else {
					System.out.println("1~5사이의 번호만 입력가능합니다.");
				}



			}
			System.out.println("프로그램을 종료합니다.");


		}
	
}



