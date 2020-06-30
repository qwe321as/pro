class Pay{
	String name;
	int bonbong;
	int tax;
	int silsu;

//	세금계산 메서드
//		본봉이 300만원 이상이면 세금은 3%
//		본봉이 200만원 이상이면 세금은 2%
//		본봉이 100만원 이상이면 세금은 1%
//	            본봉이 100만원 이하면 세금은 없음
	void tax() {
		if(bonbong>=3000000) {
			tax=bonbong*3/100;
		} else if(bonbong>=2000000) {
			tax=bonbong*2/100;
		} else if(bonbong>=1000000) {
			tax=bonbong*1/100;
		}
	}

	// 실수령액 계산 메서드
	void silsu() {
		silsu=bonbong - tax;
	}

	// 멤버변수 4개 출력하는 메서드
	void prn() {
		tax();
		silsu();
		System.out.println("이     름:"+name);
		System.out.println("본     봉:"+bonbong);
		System.out.println("세     금:"+tax);
		System.out.println("실수령액:"+silsu);
	}
}

public class Ex05_06_허용석 {
	public static void main(String[] args) {
		
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		Pay p4 = new Pay();
		
		p1.name="윤아";
		p1.bonbong=1000000;
		p2.name="길동";
		p2.bonbong=2000000;
		p3.name="정수";
		p3.bonbong=3000000;
		p4.name="태연";
		p4.bonbong=900000;
		
		p1.prn();
		p2.prn();
		p3.prn();
		p4.prn();
	}

}
