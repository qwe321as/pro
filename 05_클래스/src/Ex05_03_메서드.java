
public class Ex05_03_�޼��� {
	
	public static void main(String[] args) { // main �޼�������

		int a = 1+2;
		System.out.println("a="+a);
		
		a=3+4;
		System.out.println("a="+a);	
		
		add(10,20); // add �޼��� ȣ�� , �Ķ����(parameter)
		System.out.println("------");
		add(100,200); // add �޼��� ȣ��
		System.out.println("******");
		
		int returnValue = sub(10,3,2);
		System.out.println("returnValue="+returnValue);
		
		System.out.println(sub(5,2,1));
		
		int mulvalue = mul();
		System.out.println("mulvalue="+mulvalue);
		
	} // main
	
	//�Ű�����
	static void add(int x,int y) { // add �޼��� ����
		int z = x + y;
		prn();
		System.out.println("z="+z);
		return;
	}
	
	static int sub(int x,int y,int z) { // sub �޼��� ���� 
		int result = x-y-z;
		return result;
	}
	
	static int mul() { // mul �޼��� ���� 
		return 3*4;
	}
	
	static void prn() {
		System.out.println("==========");
	}
	
}// class








