class Calc{
	int i=1;
	static int j=2;

	int add(int a,int b) { // ����, instance �޼���(�Լ�) 
		System.out.println(i);
		System.out.println(j);
		prn1();
		prn2();
		int sum = a+b;
		return sum;
	}

	int sub(int a,int b) {
		return a-b;
	}

	static int mul(int a,int b) { // static �޼��� 
		//System.out.println(i);
		System.out.println(j);
		//		prn1();
		prn2();
		return a*b;
	}

	void prn1() {
		System.out.println("--------");
	}

	static void prn2() {
		System.out.println("********");
	}
}

public class Ex05_04_�޼��� { // ����Ŭ���� 
	public static void main(String[] args) {

		//x.y()
		Calc c = new Calc();
		int result = c.add(10,20);
		System.out.println("result:"+result);

		int subresult = c.sub(100, 30);
		System.out.println("subresult:"+subresult);

		int mulresult = Calc.mul(3, 5); // c.mul(3,5)
		System.out.println("mulresult:"+mulresult);


		int returndiv = div(10,5);
		System.out.println("returndiv:"+returndiv);

		Ex05_04_�޼��� ex = new Ex05_04_�޼���();
		System.out.println("namergi ���ϰ�:"+ex.namergi(10,5));


	}// main

	static int div(int a,int b){
		int divresult = a/b;
		return divresult;
	}

	int namergi(int a,int b) {
		int naresult = a%b;
		return naresult;

	}
}




