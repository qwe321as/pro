
public class Ex05_11_�̱⼱ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res=0;
		for(int i1=1; i1 < 30 ; i1++) {
			res = powered(2,i1);
			System.out.println("This is base 2, powerd "+i1+" case : "+res);
		}
		for(int i1=1; i1 < 15 ; i1++) {
			res = powered(3,i1);
			System.out.println("This is base 3, powerd "+i1+" case : "+res);
		}

	}
	static int powered(int base, int pow) {
		
		if(pow ==1) {
			return base;
		}
		
		return base*powered(base, --pow);

	}
}
