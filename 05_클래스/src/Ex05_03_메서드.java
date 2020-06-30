
public class Ex05_03_메서드 {
	
	public static void main(String[] args) { // main 메서드정의

		int a = 1+2;
		System.out.println("a="+a);
		
		a=3+4;
		System.out.println("a="+a);	
		
		add(10,20); // add 메서드 호출 , 파라미터(parameter)
		System.out.println("------");
		add(100,200); // add 메서드 호출
		System.out.println("******");
		
		int returnValue = sub(10,3,2);
		System.out.println("returnValue="+returnValue);
		
		System.out.println(sub(5,2,1));
		
		int mulvalue = mul();
		System.out.println("mulvalue="+mulvalue);
		
	} // main
	
	//매개변수
	static void add(int x,int y) { // add 메서드 정의
		int z = x + y;
		prn();
		System.out.println("z="+z);
		return;
	}
	
	static int sub(int x,int y,int z) { // sub 메서드 정의 
		int result = x-y-z;
		return result;
	}
	
	static int mul() { // mul 메서드 정의 
		return 3*4;
	}
	
	static void prn() {
		System.out.println("==========");
	}
	
}// class








