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

			System.out.println("try��");

		}catch(NullPointerException e1) {
			System.out.println("null�� �ʱ�ȭ�� ���� ��� �Ұ�");
			System.out.println(e1.toString());
			System.out.println(e1.getMessage());

		}catch(ArithmeticException e2) {
			System.out.println("0���� ����");
			System.out.println(e2.toString());
			System.out.println(e2.getMessage());

		}catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("3������ ����");
			
		}catch(Exception e) {
			System.out.println(e.toString());	
			
		}finally {
			System.out.println("finally ���� ����");
		}

		System.out.println("����ó��");

	}

}
