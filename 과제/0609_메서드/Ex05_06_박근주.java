class Pay{
	String name;
	int bonbong;
	int tex; // 세금 계산하는 메서드
	int silsu; // 세금 뗀 실 수령액
	
	//세금설정함수(){
	//				본봉이 300만원 이상이면 세금은 3%
	//				본봉이 200만원 이상이면 세금은 2%
	//				본봉이 200만원 이하면 세금은 1%
	//}
	// 실수령액 계산(){
	// silsu = 본봉-세금
	// }
	// 멤버변수 4개 출력하는 메서드(){
	//}
	
	static int texsum(int a) {
		double pays;
		if(a>=3000000) 
		{
			 pays = a*0.03;
			 
			 
		}
		else if(a>=2000000) {
			 pays = a*0.02;
			 
		}
		else {
			 pays = a*0.01;
			 
		}
		
		
		int texresult = (int)pays;
		return texresult;
	}
	int sils(int bonbong,int tax){
		
		return bonbong-tax;
	}
	void sess(String name,int bonbong,int tex,int silsu){
		System.out.println("이름 : "+name);
		System.out.println("본봉 : "+bonbong);
		System.out.println("세금: "+tex);
		System.out.println("실수령액: "+silsu);
		System.out.println();
		
		
	}
	
	
}
public class Ex05_06_박근주 {

	public static void main(String[] args) {
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		
		p1.name = "윤아";
		p1.bonbong = 3000000;
		p2.name = "태연";
		p2.bonbong = 2000000;
		p3.name = "웬디";
		p3.bonbong = 1000000;
		
		
		p1.tex = Pay.texsum(p1.bonbong);
		p2.tex = Pay.texsum(p2.bonbong);
		p3.tex = Pay.texsum(p3.bonbong);
		p1.silsu = p1.sils(p1.bonbong,p1.tex);
		p2.silsu = p2.sils(p2.bonbong,p2.tex);
		p3.silsu = p3.sils(p3.bonbong,p3.tex);
		
		
		
		p1.sess(p1.name,p1.bonbong,p1.tex,p1.silsu);
		p2.sess(p2.name,p2.bonbong,p2.tex,p2.silsu);
		p3.sess(p3.name,p3.bonbong,p3.tex,p3.silsu);
		
		
		
		
		
		
		
	}

}
