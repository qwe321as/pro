
public class Ex05_10_¿Á±Õ»£√‚ {
	public static void main(String[] args) {

//		4! = 4*3*2*1 = 24
//		4! = 4 * 3!(6)
//		3! = 3 * 2!(2)
//		2! = 2 * 1!(1)
		
		System.out.println("4 factorial:"+fact(4)); 
	}
	static int fact(int n) {
		if(n==1)
			return 1;
		else
			return n * fact(n-1);
	}
	
}












