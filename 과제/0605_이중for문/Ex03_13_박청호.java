
public class Ex03_13_¹ÚÃ»È£ {

	public static void main(String[] args) {

		int i;
		int sum = 0;
		for(i=1; i<=100; i++)	{
			sum = sum+ i;
			if(i%10 == 0)
				System.out.println("1~" + i + "=" + sum);
		}		
		System.out.println("--------------");


		sum = 0;
		int start = 0;
		for(i=1; i<=100; i++)	{
			sum = sum+ i;

			if(i%10 == 1)	{
				start = i;
			}


			if(i%10 == 0) {

				System.out.println(start + "~" + i + "=" + sum);
				sum = 0;
				continue;
			}
		}	

	}

}
