
public class Ex03_05_for {
	public static void main(String[] args) {
		/*
		for(�ʱ��;���ǽ�;������) {
			�ݺ��ҹ���1;
			�ݺ��ҹ���2;
		}
		 */		
		int i;

		for(i=1; i<=5  ;i=i+1 ) {
			System.out.println("apple"+i);
		}
		// ���� �������ϸ�(������ ������ �Ǹ�)for�� ������ �������´�.
		System.out.println("for�� ��"+i);

		for(i=1;i<=10;i=i+3) {
			System.out.println("grape"+i);
		}

		System.out.println();

		for(i=5;i>=1;i--) {
			System.out.println("orange"+i);
			System.out.println("������");
		}
		
		System.out.println("orange for�� ��"+i);

		System.out.println();
		
//		1~10 �� ���ϱ�
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
		
		//1~10���� ¦���� �հ� Ȧ���� ��
		int sum1=0,sum2=0,sum3=0;
		//sum1:1~10��
		//sum2:1~10���� ¦���� ��
		
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
		System.out.println("sum2(¦��):"+sum2);
		System.out.println("sum3(Ȧ��):"+sum3);
	}

}







