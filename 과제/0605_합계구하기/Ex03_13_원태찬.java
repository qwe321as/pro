
public class Ex03_13_������ {

	public static void main(String[] args) {
		//		1~10=55
		//		1~20=210
		//		1~100=5050

		int i,sum=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;                      
			if(i%10==0) {                   //10�� ��� ���� ���
				System.out.println(1+"~"+i+"="+sum);
			}

		}
		sum=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==0) {
				System.out.println((i-9)+"~"+i+"="+sum);
				sum=0;                      //������ ���ܽ�Ű��							
			}
		}

	}
}




//1~10=55 (��)
//11~20=155 (��)
//21~30=255 (��)
