
public class Ex03_03_switch_case {
	public static void main(String[] args) {

		int i=1;
		switch(i) {
			case 1 : System.out.println("1�Դϴ�.");
					break;
			case 2 : System.out.println("2�Դϴ�."); 
					break;
			case 3 : System.out.println("3�Դϴ�.");
					break;
			default : System.out.println("1~3������ �� �ƴմϴ�.");
					
		}
		System.out.println("switch~case ������..");
		
		
		if(i==1) {
			System.out.println("1�Դϴ�.");
		}
		else if(i==2) {
			System.out.println("2�Դϴ�."); 
		}
		else if(i==3) {
			System.out.println("3�Դϴ�."); 
		}
		else {
			System.out.println("1~3������ �� �ƴմϴ�.");
		}
	}

}


