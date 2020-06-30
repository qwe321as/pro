//import java.lang.*;
public class Ex07_04_NullError {
	public static void main(String[] args) {

		int a;
		try {
			String str="apple";
			System.out.println(str.length());
			//new NullPointerException();
			//NullPointerException e = new NullPointerException();
			a=3/0; // new ArithmeticException()
			System.out.println("a:"+a);

			int[] arr = {1,2,3};
			System.out.println(arr[3]); //  new ArrayIndexOutOfBoundsException()

			System.out.println("try안");

		}catch(NullPointerException e1) {
			System.out.println("null로 초기화된 변수 사용 불가");
			System.out.println(e1.toString());
			System.out.println(e1.getMessage());

		}catch(ArithmeticException e2) {
			System.out.println("0으로 나눔");
			System.out.println(e2.toString());
			System.out.println(e2.getMessage());

		}catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("3번방은 없음");
			
		}catch(Exception e) {
			System.out.println(e.toString());	
			
		}finally {
			System.out.println("finally 구문 실행");
		}

		System.out.println("예외처리");

	}

}
