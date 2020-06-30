class pay{
	String name;
	int bonbong;
	int tex;
	int silsu;

	double setTex(int a) {
		if (a >= 3000000)
			return a*3/100;
		else if (a >= 2000000)
			return a*2/100;
		else
			return a*1/100;
	}
	int setSilsu(int a,int b) {
		return a-b;
	}
	
	void prn() {
		System.out.println("이름:"+name);
		System.out.println("본봉:"+bonbong+"원");
		System.out.println("세금:"+tex+"원");
		System.out.println("실수령액:"+silsu+"원");
	}
}
	//	세금설정함수(본봉받기){
	//		본봉이 300만원 이상이연 세금은 3% : 300만원이면 90000원
	//		본봉이 200만원 이상이연 세금은 2% 
	//		본봉이 200만원 이하이연 세금은 1% : 100만원이면 10000원
	//	}
	

	//	실수령액 계산() {
	//		silsu = 본봉 - 세금
	//	}
	//	멤버변수 4개 출력하는 메서드() {
	//		
	//	}


public class Ex05_06_이재혁 {

	public static void main(String[] args) {
pay p1 = new pay();
		p1.name = "사나";
		p1.bonbong = 2000000;
		p1.tex = (int)p1.setTex(p1.bonbong);
		p1.silsu = (int)p1.setSilsu(p1.bonbong, p1.tex);
		p1.prn();
		

		pay p2 = new pay();
		p2.name = "태연";
		p2.bonbong = 1000000;
		p2.tex = (int)p2.setTex(p2.bonbong);
		p2.silsu = (int)p2.setSilsu(p2.bonbong, p2.tex);
		p2.prn();

		pay p3 = new pay();
		p3.name = "웬디";
		p3.bonbong = 3000000;
		p3.tex = (int)p3.setTex(p3.bonbong);
		p3.silsu = (int)p3.setSilsu(p3.bonbong, p3.tex);
		p3.prn();


	}
}