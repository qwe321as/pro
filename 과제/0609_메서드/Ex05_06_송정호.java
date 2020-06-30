
class Pay {
	
	String name;
	int bonbong;
	int tex;
	int silsu;
	
	double setTex(int x) {
		
		if(x >= 3000000) {
			return x * 0.03;
		}
		else if(x >= 2000000) {
			return x * 0.02;
		}
		else {
			return x * 0.01;
		}
	}
	
	int setSilsu(int x, int y) {
		
		return x - y;
	}
	
	void prn() {
		System.out.println("--------------");
		System.out.println("이름 : " + name);
		System.out.println("월급 : " + bonbong);
		System.out.println("세금 : " + tex);
		System.out.println("실수령액 : " + silsu);
		System.out.println("--------------");
	}
}

public class Ex05_06_송정호 {

	public static void main(String[] args) {
		
		Pay p1 = new Pay();
		
		p1.name = "윤아";
		p1.bonbong = 2000000;
		p1.tex = (int)p1.setTex(p1.bonbong);
		p1.silsu = p1.setSilsu(p1.bonbong, p1.tex);
		p1.prn();
		
		Pay p2 = new Pay();
		
		p2.name = "태연";
		p2.bonbong = 1000000;
		p2.tex = (int)p2.setTex(p2.bonbong);
		p2.silsu = p2.setSilsu(p2.bonbong, p2.tex);
		p2.prn();
		
		Pay p3 = new Pay();
		
		p3.name = "웬디";
		p3.bonbong = 3000000;
		p3.tex = (int)p3.setTex(p3.bonbong);
		p3.silsu = p3.setSilsu(p3.bonbong, p3.tex);
		p3.prn();
	}

}
