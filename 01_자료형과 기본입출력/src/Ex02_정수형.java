
public class Ex02_������ {
	public static void main(String[] args) {

		System.out.println(10);

		int a,b; // ����
		//int b;

		a = 1; // �ʱ�ȭ
		b = 2;

		int c = 3;

		System.out.println('��');
		System.out.println("a");
		System.out.println(a); // 1
		System.out.println(a+10);
		System.out.println("a="+a); // ���ڿ�+����
		System.out.println("a+b="+(a+b));

		System.out.println();

		byte b1 = 10;
		byte b2 = 20;
		byte b3;  // -128~127

		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		//		System.out.println("b3="+b3);

		//b3 = b1 + b2; // b3 = 30;
		int result;
		result = b1 + b2;
		System.out.println("result=" + result);
		System.out.println("result=" + (b1+b2));

		int i1 = 1000000;
		int i2 = 2000000;
		//int i3 = i1 * i2; // 2��
		//long i3 = i1 * i2; // int*int
		long i3 = (long)i1 * i2; // long(8)*int(4)=>long(8)*long(8)
		System.out.println("i3="+i3);
	}
}







