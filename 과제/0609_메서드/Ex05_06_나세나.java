class Pay {
	String name;
	int bonbong;
	static int setTax (int a) {
		if(a>=3000000) {
			return  a=a*3/100;
		}
		else if (a>=2000000) {
			return a=a*2/100;
		
		}
		else {
			return a=a*1/100;
		}
		
}
	static int silsu(int a, int b){
		return a-b;
	}

	
}
	


	//	(세금 설정함수(본봉받아오기))
	//	세금설정하는 메서드 만들기 setTex(bonbong을 넘기기)
	//	본봉이 300만원 이상이면 세금은 3 %   ->9만원
	//	본봉이 200만원 이상이면 세금은 2%    ->4만원
	//	 200만원 이하면 세금은 1%         ->2만원
	//	
	//	실 수령액 계산() {
	//		silsu=본봉-세금
	//	}




public class Ex05_06_나세나 {

	public static void main(String[] args) {

//		윤아
		Pay p1=new Pay();

		p1.name="윤아";
		p1.bonbong=2000000;

		System.out.println("name:"+p1.name);
		System.out.println("bonbong:"+p1.bonbong+"원");
		int y=Pay.setTax(p1.bonbong);
		System.out.println("Tax:"+y+"원");
		int y1=Pay.silsu(p1.bonbong, y);
		System.out.println("silsu:"+y1+"원");
		System.out.println();
		
//		태연
		Pay p2=new Pay();

		p2.name="태연";
		p2.bonbong=1000000;
		
		System.out.println("name:"+p2.name);
		System.out.println("bonbong:"+p2.bonbong+"원");
		int x=Pay.setTax(p2.bonbong);
		System.out.println("Tax:"+x+"원");
		int x1=Pay.silsu(p2.bonbong, x);
		System.out.println("silsu:"+x1+"원");
		System.out.println();
		
		
//		웬디
		Pay p3=new Pay();

		p3.name="웬디";
		p3.bonbong=3000000;
		
		System.out.println("name:"+p3.name);
		System.out.println("bonbong:"+p3.bonbong+"원");
		int z=Pay.setTax(p3.bonbong);
		System.out.println("Tax:"+z+"원");
		int z1=Pay.silsu(p3.bonbong, z);
		System.out.println("silsu:"+z1+"원");
		System.out.println();
	}
}
//	
//	멤버변수 4개 출력하는 메서드() {
//
//}
