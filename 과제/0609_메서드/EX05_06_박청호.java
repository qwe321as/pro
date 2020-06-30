class Pay{
	String name;
	int bonbong;
	int tax;
	int silsu;


	/*	
	void setTax(int x)	{


		if(x>3000000)	{
			tax = (int)(x * 0.03);	//(int)90000.0 =>90000
		}
		else if(x>2000000)	{
			tax = (int)(x * 0.03);
		}
		else {
			tax = (int)(x * 0.03);
		}
	}
	 */	
	void setTax() {


		if(bonbong>3000000)	{
			tax = (int)(bonbong * 0.03);	//(int)90000.0 =>90000
		}
		else if(bonbong>2000000)	{
			tax = (int)(bonbong * 0.03);
		}
		else {
			tax = (int)(bonbong * 0.03);
		}
		//return;
	}

	void setSilsu()	{
		silsu = bonbong - tax;
	}





	void display() {	//정의
		System.out.println("이름: " + name);
		System.out.println("본봉: " + bonbong);
		System.out.println("세금: " + tax);
		System.out.println("실수령: "+ silsu);
		System.out.println();
	}

	/*
	 세금설정함수(본봉받기){
	 본봉이 300만원 이상이면 세금은 3% : 300만원이면 90000원
	 본봉이 200만원 이상이면 세금은 2%
	 본봉이 200만원 이하면 세금은 1% : 100만원이면 10000원
	실수령액 계산()	{
		silsu = 본봉 - 세금

	멤버변수 4개 출력하는 메서드	{

	}


	 */


}

public class EX05_06_박청호 {

	public static void main(String[] args) {

		Pay	p1 = new Pay(); 	//객체 생성
		p1.name = "윤아";
		p1.bonbong= 1000000;
		//p1.setTax = (int) p1.setTax(p1.bonbong);	//호출
		p1.setTax();
		p1.setSilsu();

		System.out.println();


		Pay p2 = new Pay();
		p2.name = "태연";
		p2.bonbong = 2000000;
		p2.setTax();
		//p2.settax = (int) p2.settax(p2.bonbong);
		p1.setSilsu();

		System.out.println();

		Pay p3 = new Pay();
		p3.name = "웬디";
		p3.bonbong = 3000000;
		p3.setTax();
		//p3.settax = (int)p3.settax(p3.bonbong);
		p1.setSilsu(); 
		
		p1.display();
		p2.display();
		p3.display();
	}

}
