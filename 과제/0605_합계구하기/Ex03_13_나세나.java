
public class Ex03_13_������ {

	public static void main(String[] args) {

		//1~10, 1~100���� �� ���ϱ�
		int i=1, sum1=0;

		System.out.println("1~10... 1~100 �� ���ϱ�");
		System.out.println();
		
		

			for(i=1;i<=100;i++) {

				sum1=sum1+i;


				if(i%10==0) {
					System.out.println("1"+"~"+i+"="+sum1);
				}



			

		}
		System.out.println();
		System.out.println();
		System.out.println("1~10... 91~100 �� ���ϱ�");
		System.out.println();


		// 1~11, 91~100���� �ձ��ϱ�
		sum1=0;
		for(i=1; i<=100; i++) {
			sum1=sum1+i;

			if(i%10==0) {
				System.out.println((i-9)+"~"+i+"="+sum1);
				sum1=0;
			}

		} 








	}
}