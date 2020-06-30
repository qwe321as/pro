
public class Ex03_13_정지원 {

	public static void main(String[] args) {//10의 배수 한벅씩 출력

		int sum=0;
		int i=0;
		for(i=1;i<=100;i++) {
			sum+=+i;
			if(i%10==0){
				System.out.println("1~"+i+"="+sum);
			}


			//System.out.println("1~"+(10*i)+"="+sum);
		}
		sum=0;
		i=0;
		for(i=1;i<=100;i++) {
			sum+=+i;
			if(i%10==0){
				System.out.println(i-9+"~"+i+"="+sum);

				sum=0;



			}
			}
		}
	}
