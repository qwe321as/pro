import java.util.Scanner;

class Ex08_06_박시양 {

	public static void main(String[] args) {
		
//		int i;
//		for(i=0; i<6; i++) {
//			
//			int num = (int) (Math.random()*44)+1; //1~45
//			System.out.println(num);
		
			
		Scanner sc = new Scanner(System.in);
		
			int lotto[] = new int[6];
			int[] my = new int[6];
			int i,j;
			int count = 0;
			
			for(i=0; i<6; i++) {
				lotto[i] = (int)(Math.random()*45)+1;     // 1~45  45-1 +1
				for(j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) { //컴퓨터가 뽑은 숫자 중복 확인
						i--;
					}
				}
		}
			
			
			System.out.println();
			System.out.println("________________________");
			for(i=0; i<lotto.length; i++) {
				System.out.print("숫자"+(i+1)+":");
				my[i]= sc.nextInt();
				if(my[i] == 0) {
					i--;
					System.out.println("반호는 0이 될 수 없습니다.");
				}else if(my[i] > 45) {
					i--;
					System.out.println("번호는 45를 초과 할 수 없습니다.");
				}else {
					for(j = 0; j < i; j++) {
						if(my[i] == my[j]) {
							i--;
							System.out.println("번호는 중복 될 수 없습니다.");
						}
						
					}
				}
			}
			System.out.println("________________________");
			System.out.println("당첨 로또 번호");
			for(i=0; i<6; i++) {
				System.out.print(my[i]+" ");
			}
			System.out.println();
			System.out.println("========================");
			
			
			System.out.println("내로또 번호");
			for(i=0; i<6; i++) {
				System.out.print(lotto[i]+" ");
			}
			
			for(i = 0; i < 6; i++) {
				for(j = 0; j < 6; j++) {
					if(my[i] == lotto[j]) {
						count++;
					}
				}
			}
			
			System.out.println();
			System.out.println("________________________");
			
			if(count == 0) {
				System.out.println("당첨 번호 0. 꽝");
			}else if(count == 1) {
				System.out.println("당첨 번호 1. 꽝");
			}else if(count == 2) {
				System.out.println("당첨 번호 2. 꽝");
			}else if(count == 3) {
				System.out.println("당첨 번호 3. 4등");
			}else if(count == 4) {
				System.out.println("당첨 번호 4. 3등");
			}else if(count == 5) {
				System.out.println("당첨 번호 5. 2등");
			}else{
				System.out.println("당첨 번호 6. 1등");
			}
			sc.close();
	}

}
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
