
public class Ex04_�Ǽ��� {
	public static void main(String[] args) {
		
		float f1 = 1.234f;
		
		double d1 = 1.234;
		double d2 = 1.234f;
		
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		
		float f2 = 123;
		System.out.println("f2="+f2);
		
		//int i1 = 123.4f;
		int i1 = (int)123.4f; 
		System.out.println("i1=" + i1);
		
		double d3 = .789E3;  
		System.out.println("d3="+d3);
		
		d3 = .789E-3;  
		System.out.println("d3="+d3);
		
		System.out.println();
		
		int a = 100;
		char b = 'A';
		float c = 123.456f;
		String d = "������";
		
		/* ���Ĺ���
		 * ����:%d
		 * char:%c
		 * String:%s
		 * �Ǽ�:%f
		 */
		System.out.printf("a="+a);
		System.out.println();
		System.out.printf("a=%d�Դϴ�.\n",a);
		System.out.printf("a=%5d�Դϴ�.\n",a);
		System.out.printf("b=%c�Դϴ�.\n",b);
		System.out.printf("b=%d�Դϴ�.\n",(int)b);
		System.out.printf("c=%f�Դϴ�.\n",c);
		System.out.printf("c=%.2f�Դϴ�.\n",c);
		System.out.printf("c=%8.2f�Դϴ�.\n",c);
		System.out.printf("d=%s�Դϴ�.\n",d);
		
	}
}








