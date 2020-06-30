class Pay{
	String name;
	int bonbong;
	int tax;
	int silsu;
	
	//세금 출력
	double setTax(int x) {
		if(x >= 3000000) {
			return x * 0.03;
		}
		else if(x >= 2000000) {
			return x * 0.02;
		}
		else return x * 0.01;
	}
	
	int setSilsu(int x,int y) {
		return x - y;
	}
	
	//멤버 변수 출력 
	void memberPrint(String x, int y, int z, int k) {
		System.out.println("이름 : " + x);
		System.out.println("급여 : " + y + "원");
		System.out.println("tax : " + z + "원");
		System.out.println("실급여 : " + k +"원");
		pr1();
	}
	
	void pr1() {
		System.out.println("**********************************");
		
	}
}

public class Ex05_06_김문관 {
	public static void main(String[] args) {
		
		Pay p1 = new Pay();
		p1.name = "김문관";
		p1.bonbong = 2000000;
		
		Pay p2 = new Pay();
		p2.name = "유영수";
		p2.bonbong = 4000000;
		
		Pay p3 = new Pay();
		p3.name = "엄동훈";
		p3.bonbong = 1000000;
		
		
		p1.tax = (int)p1.setTax(p1.bonbong);
		p1.silsu = p1.setSilsu(p1.bonbong, p1.tax);
		
		p2.tax = (int)p2.setTax(p2.bonbong);
		p2.silsu = p2.setSilsu(p2.bonbong, p2.tax);
		
		p3.tax = (int)p3.setTax(p3.bonbong);
		p3.silsu = p3.setSilsu(p3.bonbong, p3.tax);
		
		
		//김문관 급여
		p1.memberPrint(p1.name, p1.bonbong, p1.tax, p1.silsu);
		System.out.println();
		//유영수 급여
		p2.memberPrint(p2.name, p2.bonbong, p2.tax, p2.silsu);
		System.out.println();
		//엄동훈 급여
		p3.memberPrint(p3.name, p3.bonbong, p3.tax, p3.silsu);
		System.out.println();
		
	}
}
