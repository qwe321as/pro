class Pay{
	String name;
	int bonbong; //200만원/100/300
	int tax; 
	int silsu;
	int sub(int a,int b) {
		return a-b;
	}
}
	/*세금설정 함수(본봉 받기){ => tax
		본봉이 300만원 이상이면 세금은 3%:9만원
		본봉이 200만원 이상이면 세금은 2% 4
		본봉이 200만원 이하이면 세금은 1%:10000원
	}
	실 수령액 계산() {
		silsu = 본봉-세금
	}

	멤버변수 4개 출력하는 메서드(){

	}
	 */


public class Ex05_06_정주원 {

	public static void main(String[] args) {

		Pay p1= new Pay();
		//int sumResult=Pay.sum(num1 , num2);

		Pay p2= new Pay();


		Pay p3= new Pay();


		p1.name="윤아";
		p1.bonbong=3000000;

		System.out.println(p1.name);
		System.out.println(p1.bonbong);
		
		int tax1= 90000;
		System.out.printf("tax:"+tax1);

		System.out.println();
		p2.name="태연";
		p2.bonbong=2000000;
		int tax2= 40000;
		System.out.printf("tax:"+tax2);

		System.out.println(p2.name);
		System.out.println(p2.bonbong);

		p3.name="웬디";
		p3.bonbong=1000000;

		System.out.println(p3.name);
		System.out.println(p3.bonbong);
		
		int tax3= 10000;
		System.out.printf("tax:"+tax3);



		int silsu=c.sub(p3.bonbong, tax1);
		System.out.println("silsu:"+silsu);








	
	
	}
}
















