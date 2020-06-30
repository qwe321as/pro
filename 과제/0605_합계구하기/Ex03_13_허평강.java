
public class Ex03_13_«„∆Ú∞≠ {
	public static void main(String[] args) {
		
    int a,sum1=0;
		for(a=1; a<=100; a++) {
			sum1 = sum1 + a;
			if(a%10==0) {
				System.out.println("1~"+a+"="+sum1);
				
				
			
		}
			
			}
			
		System.out.println();
		
		int b;
		for(a=0;a<=9;a++) {
			sum1=0;
			for(b=1;b<=10;b++) {
				sum1= sum1 + b +(a*10);
			}
			System.out.println((a*10+1)+"~"+(a+1)*10+"="+sum1);
			
			
			}
		System.out.println();
		
		
		sum1=0;
		for(a=1;a<=100;a++) {
			sum1=sum1 + a;
			if(a%10==0) {
				System.out.println(a-9+"~"+a+"="+sum1);
				sum1 = 0;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 1~10=55 1~20=210 1~30=465 1~40=820 1~50=1275 1~60=1830 1~70=2485 1~80=3240
		 * 1~90=4095 1~100=5050
		 * 
		 * 1~10=55 
		 * 11~20=155 
		 * 21~30=255 
		 * 31~40=355 
		 * 41~50=455 
		 * 51~60=555 
		 * 61~70=655 
		 * 71~80=755
		 * 81~90=855 
		 * 91~100=955
		 */
  
		
		
	}
}
