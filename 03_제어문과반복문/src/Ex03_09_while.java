
public class Ex03_09_while {
	public static void main(String[] args) {

		int i;
		for(i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		
		System.out.println();
	/*	
		while(���ǽ�) {
			�ݺ��ҹ���;
		}
	*/
		i=6;
		while(i<=5) {
			System.out.println("while"+i);
			i++;
		}
		System.out.println("while��"+i);
		
		System.out.println();
	/*	
		do {
			�ݺ��ҹ���;
		}while(����);
	*/
		i=6;
		do {
			System.out.println("do~while"+i);
			i++;
		}while(i<=5);
		
		System.out.println("do~while��"+i);
	}

}









