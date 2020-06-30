
public class Ex03_13_╠Х©Каж {

	public static void main(String[] args) {
		
		int i,sum=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==0) {
				System.out.println(1+"~"+i+"="+sum);
			}
		}
		System.out.println();
		
		sum=0;
		 for(i=1;i<=100;i++) {
			 sum=sum+i;
				if(i%10==0) {
					System.out.println(i-9+"~"+i+"="+sum);
					sum=0;
				}
		  
		  }
		 

	}

}
/*
1~10=55
1~20=210
1~30=465
1~40=820
1~50=1275
1~60=1830
1~70=2485
1~80=3240
1~90=4095
1~100=5050

1~10=55
11~20=155
21~30=255
31~40=355
41~50=455
51~60=555
61~70=655
71~80=755
81~90=855
91~100=955
*/

