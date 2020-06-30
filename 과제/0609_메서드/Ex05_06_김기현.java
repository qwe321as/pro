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
		System.out.println("이름:"+name);
		System.out.println("본봉:"+bonbong);
		System.out.println("세금:"+tex);
		System.out.println("실수:"+silsu);
	}
		
}



public class Ex05_06_김기현 {

	public static void main(String[] args) {
		 
		Pay p1 =new Pay(); 
		p1.name="윤아";
		p1.bonbong=2000000;
		p1.tex = (int) p1.texset(p1.bonbong);
		p1.silsu = (int) p1.silsuresult(p1.bonbong,p1.tex);
		Pay.subPay();
		
		Pay p2 =new Pay(); 
		p2.name="태연";
		p2.bonbong=3000000;
		p2.tex = (int) p2.texset(p2.bonbong);
		p2.silsu = (int) p2.silsuresult(p2.bonbong,p2.tex);
		Pay.subPay();			
		
		Pay p3 =new Pay(); 
		p3.name="웬디";
		p3.bonbong=1000000;
		p3.tex = (int) p3.texset(p3.bonbong);
		p3.silsu = (int) p3.silsuresult(p3.bonbong,p3.tex);
		Pay.subPay();				
		
//		System.out.println("이름:"+p1.name);
//		System.out.println("본봉:"+p1.bonbong);
//		System.out.println("세금:"+p1.tex);
//		System.out.println("실수:"+p1.silsu);
//		System.out.println("---------------");
//		System.out.println("이름:"+p2.name);
//		System.out.println("본봉:"+p2.bonbong);
//		System.out.println("세금:"+p2.tex);
//		System.out.println("실수:"+p2.silsu);		
//		System.out.println("---------------");
//		System.out.println("이름:"+p3.name);
//		System.out.println("본봉:"+p3.bonbong);
//		System.out.println("세금:"+p3.tex);
//		System.out.println("실수:"+p3.silsu);
		

		
		
		
	} // main

} //김기현 class
