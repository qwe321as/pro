
public class Ex04_06_Á¤·Ä {
	public static void main(String[] args) {

		
		
		
		int a=10, b=20, temp;
		System.out.println(a+","+b);
		temp = b;
		b = a;
		a = temp;
		
		System.out.println(a+","+b);
		
		int[] arr = {8,3,5,2,9};
		int i,j;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
//		01
//		02
//		03
//		04
//		
//		12
//		13
//		14
//		
//		23
//		24
//		
//		34
		//int[] arr = {8,3,5,2,9};
		//3,8,5,2,9
		//2,8,5,3,9
		for(i=0;i<arr.length-1;i++) { // i=0
			for(j=i+1;j<arr.length;j++) { // j=1,2,3,4
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println();
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}





















