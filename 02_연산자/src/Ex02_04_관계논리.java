
public class Ex02_04_관계논리 {
	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		boolean c = a<=b;
		System.out.println("c:"+c);
		
		c = a==b;
		System.out.println("c:"+c);
		
		c = a!=b; 
		System.out.println("c:"+c);
		
		System.out.println();
		
		// &&  : 논리and연산자
		c = a>10 && b>10; // false && true
		System.out.println("c:"+c);

		// || : 논리or연산자
		c = a>10 || b>10; // false || true
		System.out.println("c:"+c);
		
		// !(not연산자) : T=>F   F=>T
		System.out.println("c:"+!c);
/*		
		T && T = T
		T && F = F
		F && T = F
		F && F = F
		
		T || T = T
		T || F = T
		F || T = T
		F || F = F
*/		
	}

}






