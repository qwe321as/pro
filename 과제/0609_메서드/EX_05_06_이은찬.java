class Pay{
	String name;
	int bonbong;
	int tax;
	int silsu;

	/*	세금설정함수(본봉 받기){
		본봉이 300만원 이상이면 세금은 3%
		본봉이 200만원 이상이면 세금은 2%
		본봉이200만원 이하면 세금은 1% 
	}

	실수령액 계산() {
		silsu = 본봉-세금
	}
	멤버변수 4개 출력하는 메서드() {

	}*/

	double setTax(int x) {

		if(x>=3000000) {
			return x*0.03;
		}
		else if(x>=2000000) {
			return x*0.02;
		}
		else{
			return x*0.01;
		}	

	}

	int setSilsu(int x,int y) {
		return x-y;
	}

	void total(String name,int bonbong,int tax,int silsu){
		System.out.println("이름:"+ name);
		System.out.println("급여:"+ bonbong);
		System.out.println("세금:"+ tax);
		System.out.println("실수령액:"+ silsu);
		System.out.println("--------");
	}

}
public class EX_05_06_이은찬 {
	public static void main(String[] args) {


		Pay p1 = new Pay();
		p1.name="윤하";
		p1.bonbong=2000000;
		p1.tax=(int)p1.setTax(p1.bonbong);
		p1.silsu= p1.setSilsu(p1.bonbong,p1.tax);

		Pay p2 = new Pay();
		p2.name="태연";
		p2.bonbong=5000000;
		p2.tax=(int)p2.setTax(p2.bonbong);
		p2.silsu= p2.setSilsu(p2.bonbong,p2.tax);

		Pay p3 = new Pay();
		p3.name="웬디";
		p3.bonbong=1000000;
		p3.tax=(int)p3.setTax(p3.bonbong);
		p3.silsu= p3.setSilsu(p3.bonbong,p3.tax);

		p1.total(p1.name, p1.bonbong, p1.tax, p1.silsu);
		p2.total(p2.name, p2.bonbong, p2.tax, p2.silsu);
		p3.total(p3.name, p3.bonbong, p3.tax, p3.silsu);

	}

}
