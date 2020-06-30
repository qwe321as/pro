public class Ex03_13_이기선 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1=0,i2=0,i3=0,sum1=0,sum2=0;
		
		for(i1=1;i1<=10 ; i1++) {
			sum1=0;
			for(i2=1; i2<=i1*10; i2++) {
				sum1=sum1+i2;				
			}
			System.out.println("This case : 1 ~ "+(i2-1)+"="+sum1);
		}
		System.out.println("First case end.");
		System.out.println();
		System.out.println();
		
		sum1=0;
		for(i1=1;i1<=100 ; i1++) {
			sum1=sum1+i1;
			if(i1%10==0) {
			System.out.println("This case : 1 ~ "+(i1)+"="+sum1);
			}
		}
		System.out.println("First-1 case end.");
		System.out.println();
		System.out.println();
		
		for(i1=0;i1<=9 ; i1++) {
			sum1=0;
			for(i2=(i1*10)+1; i2<=(i1*10+10); i2++) {
				sum1=sum1+i2;				
			}
			System.out.println("This case : "+(i1*10+1)+"~"+(i2-1)+"="+sum1);
		}
		System.out.println("Second case end.");
		System.out.println();
		System.out.println();
		
		i1=0;
		while(i1 <=9) {
			sum1=0;
			i2=i1*10+1;
			while(i2 <=(i1*10+10)) {
				sum1=sum1+i2;
				i2++;
			}
			System.out.println("This case : "+(i1*10+1)+"~"+(i2-1)+"="+sum1);
			i1++;
		}
		System.out.println("Third case end.");
		System.out.println();
		System.out.println();
		
		sum1=0;
		for(i1=1;i1<=100 ; i1++) {
			sum1=sum1+i1;
			if(i1 % 10 == 0) {
				System.out.println("This case : "+(i1-9)+"~"+(i1)+"="+sum1);
				sum1=0;
			}
		}
		System.out.println("Forth case end.");
		System.out.println();
		System.out.println();

		sum1=0;
		i1=1;
		while(i1<=100) {
			sum1=sum1+i1;
			if(i1 % 10 == 0) {
				System.out.println("This case : "+(i1-9)+"~"+(i1)+"="+sum1);
				sum1=0;
			}
			i1++;
			
		}
		System.out.println("Fifth case end.");
		System.out.println();
		System.out.println();
	}

}
