
public class Ex05_07_배열넘기기 {
	public static void main(String[] args) {

		int a=1;
		double b=2.3;
		sub(a,b);

		int[] src = {3,4,5};
		int i;
		for(i=0;i<src.length;i++) {
			System.out.println(src[i]);
		}
		arr(src[0],src[1],src[2]);
		arr2(src); 
		for(i=0;i<src.length;i++) {
			System.out.println(src[i]);
		}
	}
	
	static void arr2(int[] des) {
		System.out.println("---arr2---");
		int i;
		for(i=0;i<des.length;i++) {
			System.out.println(des[i]);
		}
		des[1]=10;
		System.out.println("----------");
	}
	
	
	
	static void arr(int a,int b,int c) {
		System.out.println(a+","+b+","+c);
	}
	
	
	
	
	static void sub(int x, double y) {
		System.out.println(x+","+y);
	}

}



