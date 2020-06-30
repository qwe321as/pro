
public class Ex03_13_╧╝еб╫б {

	public static void main(String[] args) {

		int i,sum;
		sum=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==0) {
				System.out.println("1~"+i+"="+sum);
				continue;
			}
		}
		System.out.println();
		
		sum=0;
		int s=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==1) {
				s = i;
			}
			if(i%10==0) {
				System.out.println(s+"~"+i+"="+sum);
				sum=0;
				continue;
			}
				
	}

	}
}