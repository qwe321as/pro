class Pay{
	static String name;
	static int bonbong;
	static int tex;
	static int silsu;	
	
	 double texset(int x) {
		
		if(x>=3000000) {
			 return x*0.03;
		}
		else if(x>=2000000) {
			return x*0.02;
		}
		else {
			return x*0.01;
		}	
}
	
	 int silsuresult(int x,int y) {
		 return x-y;
	}		
	


	static void subPay()  {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+bonbong);
		System.out.println("����:"+tex);
		System.out.println("�Ǽ�:"+silsu);
	}
		
}



public class Ex05_06_����� {

	public static void main(String[] args) {
		 
		Pay p1 =new Pay(); 
		p1.name="����";
		p1.bonbong=2000000;
		p1.tex = (int) p1.texset(p1.bonbong);
		p1.silsu = (int) p1.silsuresult(p1.bonbong,p1.tex);
		Pay.subPay();
		
		Pay p2 =new Pay(); 
		p2.name="�¿�";
		p2.bonbong=3000000;
		p2.tex = (int) p2.texset(p2.bonbong);
		p2.silsu = (int) p2.silsuresult(p2.bonbong,p2.tex);
		Pay.subPay();			
		
		Pay p3 =new Pay(); 
		p3.name="����";
		p3.bonbong=1000000;
		p3.tex = (int) p3.texset(p3.bonbong);
		p3.silsu = (int) p3.silsuresult(p3.bonbong,p3.tex);
		Pay.subPay();				
		
//		System.out.println("�̸�:"+p1.name);
//		System.out.println("����:"+p1.bonbong);
//		System.out.println("����:"+p1.tex);
//		System.out.println("�Ǽ�:"+p1.silsu);
//		System.out.println("---------------");
//		System.out.println("�̸�:"+p2.name);
//		System.out.println("����:"+p2.bonbong);
//		System.out.println("����:"+p2.tex);
//		System.out.println("�Ǽ�:"+p2.silsu);		
//		System.out.println("---------------");
//		System.out.println("�̸�:"+p3.name);
//		System.out.println("����:"+p3.bonbong);
//		System.out.println("����:"+p3.tex);
//		System.out.println("�Ǽ�:"+p3.silsu);
		

		
		
		
	} // main

} //����� class
