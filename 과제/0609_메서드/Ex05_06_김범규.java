class Pay{
	String name;
	int bonbong;
	int tex; // 0
	int silsu; // 0
	double setTex(int a) { 
		if(a>=3000000) {
			return a * 0.03;
		}
		else if(a>=2000000) {
			return a * 0.02;
		}
		else{
			return a * 0.01;
		}
		
	}
	
	int setSilsu(int a, int b) {
		return a-b;
	} 
	
	void member(String a, int b, int c, int d) {
		System.out.println("이름: " + a);
		System.out.println("본봉: " + b +"원");
		System.out.println("세금: " + c +"원");
		System.out.println("실수령: "+ d +"원");
	}
	
	
}


public class Ex05_06_김범규 {

	public static void main(String[] args) {
		
//		한사람의 급여정보에는 이름(name), 본봉(bonbong) , 세금(tax), 실수령액(silsu)
//		본봉이 300만원 이상이면 세금은 3% : 300만원이면 90000원
//		200만원 이상이면 세금은 2% : 200만원이면 40000원
//		200만원 이하면 세금은 1% : 100만원이면 10000원
//		세금설정함수(본봉 받기)
//      실수령액 계산(){ 본봉 - 세금 }
//		멤버변수 4개 출력하는 메서드(){ 
		
		
		
		Pay	p1 = new Pay(); 
		p1.name = "윤아";
		p1.bonbong= 2000000;
		p1.tex = (int) p1.setTex(p1.bonbong);
		p1.silsu = p1.setSilsu(p1.bonbong, p1.tex);
		p1.member(p1.name, p1.bonbong, p1.tex, p1.silsu);
		System.out.println();
		
		
		Pay p2 = new Pay();
		p2.name = "태연";
		p2.bonbong = 1000000;
		p2.tex = (int) p2.setTex(p2.bonbong);
		p2.silsu = p2.setSilsu(p2.bonbong, p2.tex);
		p2.member(p2.name, p2.bonbong, p2.tex, p2.silsu);
		System.out.println();
		
		Pay p3 = new Pay();
		p3.name = "웬디";
		p3.bonbong = 3000000;
		p3.tex = (int)p3.setTex(p3.bonbong);
		p3.silsu = p3.setSilsu(p3.bonbong, p3.tex);
		p3.member(p3.name, p3.bonbong, p3.tex, p3.silsu);
		
		
		
	} // main

} // class
