
public class Ex04_02_1����_�ִ��ּ� {
	public static void main(String[] args) {

		int[] score = {79,88,91,33,100,55,95};
		int i,sum=0,max, min;
//		int a=79,b=88,c=91;
//		sum=sum+a;
//		sum=sum+b;
		
		for(i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
			sum += score[i]; //sum = sum+score[i];
		}
		System.out.println();
		System.out.println("sum:"+sum);
		System.out.println("���:"+sum/score.length);
		
		//int[] score = {79,88,91,33,100,55,95};
		max = score[0];
		min = score[0];
		for(i=1;i<score.length;i++) {
			
			if(max < score[i]) {
				max = score[i];
			}
			
			if(min > score[i]) {
				min = score[i];
			}
			
		} // for
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
}












