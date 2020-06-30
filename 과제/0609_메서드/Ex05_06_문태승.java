class pay{
	String name;
	int bonbong;
	int tex;
	int silsu;

	// 세금설정함수(본봉받기){
	//	본봉이 300만원 이상이면 세금은 3%
	//	본봉이 200만원 이상이면 세금은 2%
	//	본봉이 200만원 이하면 세금은 1%

	double setTex(int x) {
		if (x>=3000000){
			return x*0.03;
			}
		else if (x>=2000000){
			return x*0.02;
		}
		else {
			return x*0.01;
		}
	}
	//		실수령액 계산() {
	//		silsu = 본봉-세금
		int setSilsu(int x,int y) {
			return x-y;
		}
		//		멤버변수4개 출력하는 메서드() {
		void prn() {
			System.out.println("이름 : "+name);
			System.out.println("본봉 : "+bonbong);
			System.out.println("세금 : "+tex);
			System.out.println("실수령액 : "+silsu);
			System.out.println();
					
		}
	}
	


public class Ex05_06_문태승 {

	public static void main(String[] args) {
		pay p1 = new pay();
		p1.name="철수";
		p1.bonbong=1000000;
		p1.tex=(int)p1.setTex(p1.bonbong);
		p1.silsu=p1.setSilsu(p1.bonbong, p1.tex);
		p1.prn();
		
		pay p2 = new pay();
		p2.name="영희";
		p2.bonbong=2000000;
		p2.tex=(int)p2.setTex(p2.bonbong);
		p2.silsu=p2.setSilsu(p2.bonbong, p2.tex);
		p2.prn();
		
		pay p3 = new pay();
		p3.name="진수";
		p3.bonbong=3000000;
		p3.tex=(int)p3.setTex(p3.bonbong);
		p3.silsu=p3.setSilsu(p3.bonbong, p3.tex);
		p3.prn();

	}

}
