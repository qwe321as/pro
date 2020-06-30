class Pay{
	String name;
	int bonbong;
	int tex;
	int silsu;	

	double tax(int a) {
		if(a>=3000000) 
			return a*0.03;
		else if(a>=2000000) 
			return a*0.02;
		else 
			return a*0.01;					
	}

	int silsuyo(int x, int y) {	
		return x-y;
	}

	void ppp(String a, int b, int c, int d) {
		System.out.println("이름:"+a);
		System.out.println("월급:"+b+"원");
		System.out.println("세금:"+c+"원");
		System.out.println("실금:"+d+"원");


	}

}
public class Ex05_06_김용주 {

	public static void main(String[] args) {

		Pay p1 = new Pay();
		String name = p1.name = "윤아";
		int bonbong = p1.bonbong = 2000000;
		int texes = (int)p1.tax(p1.bonbong);
		int	silsues = (int)p1.silsuyo(bonbong, texes);
		p1.ppp(name, bonbong, texes, silsues);
		System.out.println();

		Pay p2 = new Pay();
		String name2 = p2.name = "태식";
		int bonbong2 = p2.bonbong = 1000000;
		int texes2 = (int)p2.tax(p2.bonbong);
		int	silsues2 = (int)p2.silsuyo(bonbong2, texes2);
		p2.ppp(name2, bonbong2, texes2, silsues2);
		System.out.println();

		Pay p3 = new Pay();
		String name3 = p3.name = "웬디";
		int bonbong3 = p3.bonbong = 300000;
		int texes3 = (int)p3.tax(p3.bonbong);
		int	silsues3 = (int)p3.silsuyo(bonbong3, texes3);	
		p3.ppp(name3, bonbong3, texes3, silsues3);


	}







}
