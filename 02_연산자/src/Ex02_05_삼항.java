
public class Ex02_05_���� {

	public static void main(String[] args) {

//		���׿����� : 3+4,-,*/
//		���׿����� : ++,--,-,!
//		����(����)������ : 
//					���ǹ� ? �� : ���� 
		
		int a=11,b=20;
		String result;
		result = a%2==1 ? "Ȧ��" : "¦��";
		System.out.println("result:"+result);
		
//		if��
		if(a%2==0) {
			System.out.println("¦��");
		}
		else{
			System.out.println("Ȧ��");
		}
		
//		switch~case��
		switch(a%2) {
		case 0 : System.out.println("¦��");
//		case 1 : System.out.println("Ȧ��");
		default: System.out.println("Ȧ��");
		}
		
	}

}








