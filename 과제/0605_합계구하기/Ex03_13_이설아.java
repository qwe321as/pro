
public class Ex03_13_�̼��� {

	public static void main(String[] args) {

		//10�ǹ���� ������ �հ踦 ����ϱ�
		
		int i;
		int sum=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==0){
				System.out.println(1+"~"+i+"="+sum);
			}  
		}
		
		
		
		System.out.println();
		
		
		sum=0;
		for(i=1; i<=100; i++) {
			sum=sum+i;
			if(i%10==0) {
				System.out.printf("%d~%d=%d\n",i-9,i,sum);
				sum=0;
			}
		}
		
		
			
			
	}//main

}//class
