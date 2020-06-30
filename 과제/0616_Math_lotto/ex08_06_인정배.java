import java.util.Scanner;

public class ex08_06_인정배 {
	public static void main(String[]args) {
		
		//1~45
		int i;
		int [] lotto = new int [6];
		int [] my = new int [6];
		int num =	(int)(Math.random()*6)+1;//math안에 넣어야 하는이유는 int가 math.ramdom만 적용해ㅓㅅ
		System.out.print(num+" ");
		for(i=0;i<6;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			System.out.print(lotto[i]+" ");
		
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int s=0;
		for(i=0;i<6;i++) {
			System.out.println("숫자"+(i+1)+":");
			my[i] = sc.nextInt();
			s+= my[i];
			
			if(my[i]==s) { 
				s=0;
				System.out.println("똑같은수 치지마" +my[i]);
				continue;
			}
				else if(my[i]>45) {
				System.out.println("1~45인 수까지만");
			}
			
			
		}
			
			
		}
	
	}


//실패


//숫자1: 3
//숫자2: 4
//숫자3: 12
//숫자4: 4
//중복됨 다시 숫자4: 12
//중복됨 다시 숫자4: 3
//중복됨 다시 숫자4: 43
//숫자5: 89
//1~45사이의 수 입력하세요.
//숫자5: 22
//숫자6: 33
//컴이 발생시킨 로또 번호
//2 19 32 15 43 7 
//
//내가 선택한 로또 번호
//3 4 12 43 22 33 
//
//맞은 갯수 : 1
//꽝!!




