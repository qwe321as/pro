import java.util.Scanner;

public class Ex08_06_�̱⼱ {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		int[] myNum = new int[6];
		int myCase = 0, lottoCase = 0, myPoz =0;
		int i1 = 0, inum=0;
		int baseNum = 1, maxNum = 45;
		int myCount=0;

		Scanner sc = new Scanner(System.in);
		myCase = 0;
		do {
			System.out.println("�ζǹ�ȣ "+(myCase+1)+" �Է� :");
			
			try {
				myNum[myCase] = sc.nextInt();
			} catch (Exception e) {
				System.out.println("1 ~ 45 ������ ���ڸ� �Է��� �ּ���. �����Է� ����1000");
				e.printStackTrace();
				continue;
			}
			
			if((myNum[myCase] >= 1) && (myNum[myCase] <=45)) {
				System.out.println("���ڼ��� ����");
			}
			else {
				System.out.println("1 ~ 45 ������ ���ڸ� �Է��� �ּ���. �ζǼ��ڹ��� ����2000");
				continue;
			}
			
			if(myCase > 0 ) {
				for(i1 = 0 ; i1 < myCase ; i1++) {
					if(myNum[i1] == myNum[myCase]) {
						myNum[myCase]=0;
						System.out.println("������ ���ڸ� �־����ϴ�. 1~ 45 ������ �ٸ� ���ڸ� �־��ּ���");
						break;
					}					
				}//for
				if(i1 == myCase) {  // ������ ���ڰ� �ƴѰ�� ����
					myCase++;
					continue;
				}
			} 
			else {
				myCase++;
				continue;
			}
		} while (myCase < 6);

		sc.close();
		
		// lotto ��ȣ ���� ����
		lottoCase = 0;
		maxNum = 45;
		baseNum=1;
		do {
			lotto[lottoCase] = (int) ( Math.random()*(maxNum - baseNum)) + baseNum ; 
			
			if(lottoCase > 0 ) {
//				System.out.println("lottoCase  "+lottoCase);
				for(i1 = 0 ; i1 < lottoCase ; i1++)	 { 
					if(lotto[i1] ==  lotto[lottoCase]) {
						System.out.println("Duplicate number : "+lotto[lottoCase]+","+lotto[i1]);
						break;
					}
				} 
				if(i1 == lottoCase) {
					lottoCase++;
					continue;
				}
				
			} //if(lottoCase > 0 )
			else {
				lottoCase++;
			}
		} while(lottoCase < 6) ;

		System.out.println("My   Num  1 : "+myNum[0]);
		System.out.println("My   Num  2 : "+myNum[1]);
		System.out.println("My   Num  3 : "+myNum[2]);
		System.out.println("My   Num  4 : "+myNum[3]);
		System.out.println("My   Num  5 : "+myNum[4]);
		System.out.println("My   Num  6 : "+myNum[5]);
		System.out.println();
		System.out.println("Lotto Num 1 : " + lotto[0]);
		System.out.println("Lotto Num 2 : " + lotto[1]);
		System.out.println("Lotto Num 3 : " + lotto[2]);
		System.out.println("Lotto Num 4 : " + lotto[3]);
		System.out.println("Lotto Num 5 : " + lotto[4]);
		System.out.println("Lotto Num 6 : " + lotto[5]);
		
		myCount = 0;
		for(int i2 =0 ; i2 < 6 ; i2++) {
			for(int i3 = 0 ; i3 < 6 ; i3++) {
				if(myNum[i2]==lotto[i3]) {
					myCount++;
					System.out.println("Correct Number : " + myNum[i2]);
				}
			}
		}// for
		
		System.out.println("My Correct Number Count : "+myCount);

	}

//	public static int[] mySort(int[] iNum) {
//
//		int[] iRes = null;
//		int fixNum = 0, flowNum = 0;
//
//		return iRes;
//	}

}
