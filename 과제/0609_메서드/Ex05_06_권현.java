class Pay{
	String name;
	int bonbong;
	double tax;
	double silsu;

	/*
	 * //세금 설정 함수(){
	 *     본봉이 300>=세금 3% :300만원이면 90000원
	 *     본봉이 200>=세금은 2% 
	 *     본봉이 100>=세금은 1%}
	 *
	 *실수령액 계산(){
	 *    silsu= bonbong-tax
	 *
	 *멤버변수 4개 출력하는 메서드(){
	 *}
	 */

	static double tax1(int x){
		return x/100*3;
	}
	static double sil1(int x) {
		return  x-(100*3);
	}



	

}
public class Ex05_06_권현 {
	public static void main(String[] args) {

		Pay p1= new Pay();
		p1.name="윤아";
		p1.bonbong=1000000;
		p1.tax=p1.tax1(p1.bonbong);
		p1.silsu =p1.sil1(p1.bonbong);

		System.out.println("name:"+p1.name);
		System.out.println("bonbong:"+p1.bonbong);
		System.out.println("tax:"+p1.tax);
		System.out.println("silsu:"+p1.silsu);

		System.out.println("-------");

		Pay p2= new Pay();
		p2.name="태민";
		p2.bonbong=2000000;
		p2.tax = p2.tax1(p2.bonbong);
		p2.silsu =p2.sil1(p2.bonbong);

		System.out.println("name:"+p2.name);
		System.out.println("bonbong:"+p2.bonbong);
		System.out.println("tax:"+p2.tax);
		System.out.println("silsu:"+p2.silsu);

		System.out.println("-------");

		Pay p3= new Pay();
		p3.name="웬디";
		p3.bonbong=3000000;
		p3.tax = p3.tax1(p3.bonbong);
		p3.silsu =p3.sil1(p3.bonbong);

		System.out.println("name:"+p3.name);
		System.out.println("bonbong:"+p3.bonbong);
		System.out.println("tax:"+p3.tax);
		System.out.println("silsu:"+p3.silsu);

	}

}
