
public class Ex03_07_����for {
	public static void main(String[] args) {

		int i,j;
		
		for(i=1;i<=3;i++) {
			
			for(j=5;j<=7;j++) {
				
				System.out.println(i +","+ j);
				
			} // ����for��
			
			System.out.println("-------");
			
		} // �ٱ���for��
		
		System.out.println("**********");
/*		
		2*1=2
		2*2=4
		2*9=18
		-------
		3*1=3
		3*9=29
		-------
		9*1=9
		9*9=81
		-------
		**********
*/
		for(i=2;i<=9;i++) {
			System.out.println(i+"��");
			for(j=1;j<=9;j++) {
				System.out.println(i +"*"+ j +"="+i*j);
			}
			System.out.println("-------");
		}
		System.out.println("******");
		
		
	}

}





