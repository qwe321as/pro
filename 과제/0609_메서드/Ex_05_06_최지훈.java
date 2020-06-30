class Pay{
	static String name;
	static int bonbong;
	static double tex;
	static int silsu;
	
	static double texresult(int bonbong) 
	 
	{
	      if(bonbong >=3000000) {
	    tex = 0.03;   
	   
	 }
	      else if(bonbong>=2000000) {
	    	  tex = 0.02;  	  
	      }
	      else {
	    	  tex = 0.01;    	  
	      }   
	   return tex; 
	}
	
	static double silsu(int bonbong, double tex) {
		int silsuresult = (int)(bonbong*(1-tex));
		return silsuresult;
	}
	
	static void out() {
		System.out.println("이름 = "+name);
		System.out.println("연봉 = "+bonbong);
		System.out.println("세금 = "+texresult(bonbong)+"%");
		System.out.println("실수령 = "+(int)silsu(bonbong,tex));
		System.out.println();
	}
	
} //Pay class

public class Ex_05_06_최지훈 {

	public static void main(String[] args) {
		
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		
		
		p1.name = "윤아";
		p1.bonbong = 3000000;
		Pay.out();
		
		p2.name = "태연";
		p2.bonbong = 2000000;
		Pay.out();
		
		p3.name = "웬디";
		p3.bonbong = 5000000;
		Pay.out();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} //메인

}//Ex_05_06_최지훈
