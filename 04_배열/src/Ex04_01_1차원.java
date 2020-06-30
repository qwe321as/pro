
public class Ex04_01_1차원 {
	public static void main(String[] args) {

		int a=1, b=2, c=3;
		a=11;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int[] arr1 = {1,2,3}; // 방법1
		int i;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
//		System.out.println(arr1[3]); // new ArrayIndexOutofBoundsException();
		arr1[0]=11;
//		arr1[3]=33;
		
		
		System.out.println("방의 갯수(length):"+arr1.length);
		System.out.println(arr1);
		
		for(i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		
		int[] arr2 = new int[]{1,2,3,4,5}; // 방법2
		arr2[2]=33;
		//arr2[5]=100;
		for(i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		int[] arr3 = new int[10]; // 방법3
		arr3[3]=3;
		arr3[4]=4;
//		arr3[10]=10;
		for(i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		// 확장for문
		for( int temp : arr3  ) { // : 콜론
			System.out.println("temp:"+temp);
		}
		
		double[] d1 = {1.1, 2.2, 3.3}; // 초기화
		double[] d2 = new double[] {1.1,2.2,3.3};
		double[] d3 = new double[10];
		d3[0]=1;
		d3[1]=2.2;
		d3[2]=3.3;
		
		for(i=0;i<d3.length;i++) {
			System.out.print(d3[i]+" ");
		}
		System.out.println();
		
		for(double d  : d3) {
			System.out.print(d+" ");
		}
		
	}

}










