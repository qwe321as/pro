
public class Ex03_05_for {
	public static void main(String[] args) {
		/*
		for(초기식;조건식;증감식) {
			반복할문장1;
			반복할문장2;
		}
		 */		
		int i;

		for(i=1; i<=5  ;i=i+1 ) {
			System.out.println("apple"+i);
		}
		// 조건 만족안하면(조건이 거짓이 되면)for문 밖으로 빠져나온다.
		System.out.println("for문 밖"+i);

		for(i=1;i<=10;i=i+3) {
			System.out.println("grape"+i);
		}

		System.out.println();

		for(i=5;i>=1;i--) {
			System.out.println("orange"+i);
			System.out.println("하하하");
		}
		
		System.out.println("orange for문 밖"+i);

		System.out.println();
		
//		1~10 합 구하기
		int sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("sum:"+sum);
		
		sum=0;
		sum=sum+1; // 1
		sum=sum+2; // 3
		sum=sum+3; // 6
		sum=sum+4; // 10
		sum=sum+5; // 15
		sum=sum+6; // 21
		sum=sum+7; // 28
		sum=sum+8; // 36
		sum=sum+9; // 45
		sum=sum+10; // 55
		
		System.out.println("sum2:"+sum);
		
		sum=0;
		for(i=1;i<=10;i++) {
			sum=sum+i;
		}
		
		System.out.println("sum3:"+sum);
		
		//1~10수중 짝수의 합과 홀수의 합
		int sum1=0,sum2=0,sum3=0;
		//sum1:1~10합
		//sum2:1~10수중 짝수의 합
		
		for(i=1;i<=10;i++) {
			sum1 = sum1 + i;
			if(i%2==0) {
				System.out.println(i);
				sum2 = sum2 + i;
			}
			else {
				sum3 = sum3 + i;
			}
		}
		System.out.println("sum1:"+sum1);
		System.out.println("sum2(짝수):"+sum2);
		System.out.println("sum3(홀수):"+sum3);
	}

}







