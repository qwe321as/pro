class Var{
	static int a; // static ����(class ����)
	int b; // instance ����
	
	void increment() {
		int c=0; // ��������
		a++; b++; c++;
		System.out.println("static����:"+a);
		System.out.println("instance����:"+b);
		System.out.println("��������:"+c);
		System.out.println();		
	}
}

public class Ex05_08_���� {
	public static void main(String[] args) {
		
		System.out.println("��ü1 ����");
		Var v1 = new Var(); 
		v1.increment();
		v1.increment();
		
		System.out.println("��ü2 ����");
		Var v2 = new Var(); 
		v2.increment();
		v2.increment();
		
		System.out.println("��ü3 ����");
		Var v3 = new Var(); 
		v3.increment();
		v3.increment();
	}

}

