class Pay {
	String name;
	int bonbong;
	int tax;
	int silsu;
	
	double setTax(int a) {
		if(a>=3000000) return a*0.03;
		else if(a>=2000000) return a*0.02;
		else return a*0.01;
	}
	
	int setSilsu(int a,int b) {
		return a-b;
	}
	//멤버 변수 출력 
	void prnAll(String a, int b, int c, int d) {
		System.out.println("이름:"+a);
		System.out.println("본봉:"+b+"원");
		System.out.println("세금:"+c+"원");
		System.out.println("실수령액:"+d+"원");
	}
}

public class Ex05_06_김용승 {
	public static void main(String[] args) {
		
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		
		p1.name = "영수";
		p1.bonbong = 2000000;
		
		p2.name = "국수";
		p2.bonbong = 1000000;
		
		p3.name = "소수";
		p3.bonbong = 3000000;
		
		
		p1.tax = (int)p1.setTax(p1.bonbong);
		p1.silsu = p1.setSilsu(p1.bonbong, p1.tax);
		
		p2.tax = (int)p2.setTax(p2.bonbong);
		p2.silsu = p2.setSilsu(p2.bonbong, p2.tax);
		
		p3.tax = (int)p3.setTax(p3.bonbong);
		p3.silsu = p3.setSilsu(p3.bonbong, p3.tax);
		
		p1.prnAll(p1.name, p1.bonbong, p1.tax, p1.silsu);
		System.out.println("----------------------");
		p2.prnAll(p2.name, p2.bonbong, p2.tax, p2.silsu);
		System.out.println("----------------------");
		p3.prnAll(p3.name, p3.bonbong, p3.tax, p3.silsu);
		System.out.println("----------------------");
		
	}
}


