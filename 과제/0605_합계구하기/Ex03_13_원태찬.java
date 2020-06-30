
public class Ex03_13_원태찬 {

	public static void main(String[] args) {
		//		1~10=55
		//		1~20=210
		//		1~100=5050

		int i,sum=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;                      
			if(i%10==0) {                   //10의 배수 때만 출력
				System.out.println(1+"~"+i+"="+sum);
			}

		}
		sum=0;
		for(i=1;i<=100;i++) {
			sum=sum+i;
			if(i%10==0) {
				System.out.println((i-9)+"~"+i+"="+sum);
				sum=0;                      //기존값 제외시키기							
			}
		}

	}
}




//1~10=55 (합)
//11~20=155 (합)
//21~30=255 (합)
