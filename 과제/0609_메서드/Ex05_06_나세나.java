class Pay {
	String name;
	int bonbong;
	static int setTax (int a) {
		if(a>=3000000) {
			return  a=a*3/100;
		}
		else if (a>=2000000) {
			return a=a*2/100;
		
		}
		else {
			return a=a*1/100;
		}
		
}
	static int silsu(int a, int b){
		return a-b;
	}

	
}
	


	//	(���� �����Լ�(�����޾ƿ���))
	//	���ݼ����ϴ� �޼��� ����� setTex(bonbong�� �ѱ��)
	//	������ 300���� �̻��̸� ������ 3 %   ->9����
	//	������ 200���� �̻��̸� ������ 2%    ->4����
	//	 200���� ���ϸ� ������ 1%         ->2����
	//	
	//	�� ���ɾ� ���() {
	//		silsu=����-����
	//	}




public class Ex05_06_������ {

	public static void main(String[] args) {

//		����
		Pay p1=new Pay();

		p1.name="����";
		p1.bonbong=2000000;

		System.out.println("name:"+p1.name);
		System.out.println("bonbong:"+p1.bonbong+"��");
		int y=Pay.setTax(p1.bonbong);
		System.out.println("Tax:"+y+"��");
		int y1=Pay.silsu(p1.bonbong, y);
		System.out.println("silsu:"+y1+"��");
		System.out.println();
		
//		�¿�
		Pay p2=new Pay();

		p2.name="�¿�";
		p2.bonbong=1000000;
		
		System.out.println("name:"+p2.name);
		System.out.println("bonbong:"+p2.bonbong+"��");
		int x=Pay.setTax(p2.bonbong);
		System.out.println("Tax:"+x+"��");
		int x1=Pay.silsu(p2.bonbong, x);
		System.out.println("silsu:"+x1+"��");
		System.out.println();
		
		
//		����
		Pay p3=new Pay();

		p3.name="����";
		p3.bonbong=3000000;
		
		System.out.println("name:"+p3.name);
		System.out.println("bonbong:"+p3.bonbong+"��");
		int z=Pay.setTax(p3.bonbong);
		System.out.println("Tax:"+z+"��");
		int z1=Pay.silsu(p3.bonbong, z);
		System.out.println("silsu:"+z1+"��");
		System.out.println();
	}
}
//	
//	������� 4�� ����ϴ� �޼���() {
//
//}
