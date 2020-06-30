
public class Ex02_05_»ïÇ× {

	public static void main(String[] args) {

//		ÀÌÇ×¿¬»êÀÚ : 3+4,-,*/
//		´ÜÇ×¿¬»êÀÚ : ++,--,-,!
//		»ïÇ×(Á¶°Ç)¿¬»êÀÚ : 
//					Á¶°Ç¹® ? Âü : °ÅÁş 
		
		int a=11,b=20;
		String result;
		result = a%2==1 ? "È¦¼ö" : "Â¦¼ö";
		System.out.println("result:"+result);
		
//		if¹®
		if(a%2==0) {
			System.out.println("Â¦¼ö");
		}
		else{
			System.out.println("È¦¼ö");
		}
		
//		switch~case¹®
		switch(a%2) {
		case 0 : System.out.println("Â¦¼ö");
//		case 1 : System.out.println("È¦¼ö");
		default: System.out.println("È¦¼ö");
		}
		
	}

}








