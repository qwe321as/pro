class Pay{
	String name;
	int bonbong;
	int tex;
	int silsu;
	double settex(int x) {
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
	////		세금설정함수(){
	//		본봉이 300만원 이상이면 세금은 3% 300만원이면 90000원
	//		본봉이 200만원 이상이면 세금은 2% 200만원이면 40000원
	//		본봉이 200만원 이하이면 세금은 1% 100만원이면 10000원
	int setsilsu(int x,int y) {
		return x-y;
	}
	void output(String x,int y,int z,int k) {
		System.out.println(x); // name
		System.out.println(y); // bonbong
		System.out.println(z); // tex
		System.out.println(k); // silsu
		}
	}

	//	실수령액 계산() {
	//		silsu=본봉-세금

	//	멤버변수 4개 출력하는 메서드() {
	//		여기서 출력
	//	}

public class Ex05_06_원태찬 {

	public static void main(String[] args) {
		Pay p1=new Pay();
		p1.name="윤아";
		p1.bonbong=2000000;
		
		p1.tex=(int)p1.settex(p1.bonbong);
		p1.silsu=p1.setsilsu(p1.bonbong, p1.tex);
		p1.output(p1.name,p1.bonbong,p1.tex,p1.silsu);
		
	    Pay p2=new Pay();
		p2.name="태연";
		p2.bonbong=1000000;
		
		p2.tex=(int)p2.settex(p2.bonbong);
		p2.silsu=p2.setsilsu(p2.bonbong, p2.tex);
		p2.output(p2.name,p2.bonbong,p2.tex,p2.silsu);
		
		Pay p3=new Pay();
		p3.name="웬디";
		p3.bonbong=3000000;
		
		p3.tex=(int)p3.settex(p3.bonbong);
		p3.silsu=p3.setsilsu(p3.bonbong, p3.tex);
		p3.output(p3.name,p3.bonbong,p3.tex,p3.silsu);
	}

}
