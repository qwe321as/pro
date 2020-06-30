class Pay{
	String name;
	int bonbong;
	int tax;//10000원
	int silsu;//99만원


	/*세금설절함수(){
		본봉이 300만원 이상이면 세금은 3%:300만원이면  9만원
		본봉이 200만원 이상이면 세금은 2%:4만원
		본봉이 200만원 이하면 세금은 1%:100만원이면 만원

	}
	실수령액 계산() {
		silsu=본봉-세금
	}
	멤버변수 4개 출려하는 메서드() {

	}
	 */
	int sub(int a,int b) {
		return a-b;

	}

	static int tax(int a,int b) {
		int tax=a/b;
		return tax;
	}
}
public class Ex05_06_정지원 {

	public static void main(String[] args) {








		Pay p1=new Pay();
		Pay p2=new Pay();
		Pay p3=new Pay();


		p1.name="윤아";
		p1.bonbong=3000000;
		System.out.println(p1.name);
		System.out.println(p1.bonbong);

		int subResult=p1.sub(3000000,9);
		System.out.println("silsu="+subResult);


		p2.name="태연";
		p2.bonbong=2000000;
		System.out.println(p2.name);
		System.out.println(p2.bonbong);

		int subResult2=p2.sub(2000000,4);
		System.out.println("silsu="+subResult2);

		p3.name="웬디";
		p3.bonbong=1000000;
		System.out.println(p3.name);
		System.out.println(p3.bonbong);

		int subResult3=p3.sub(1000000,1);
		System.out.println("silsu="+subResult3);


	
	
	
	
	
	
	
	
	
	
	}
}



