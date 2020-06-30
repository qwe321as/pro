abstract class Employee2{
	String empno;
	String name;
	int pay;
	
//	Employee2(String empno,String name,int pay){
//		this.empno=empno;
//		this.name=name;
//		this.pay=pay;
//	}
	void info() {
		System.out.println("사번:"+empno+","+"이름:"+name+","+"연봉"+pay);
	}
	
	Employee2(){
		//System.out.println("월급:"+getMonthPay);
	}
	
	//abstract void a();
	abstract void getMonthPay();
}
class FullTime extends Employee2{
	int bonus;
	FullTime(){
		
	}
	void info() {
		super.info();
		System.out.println("보너스:"+bonus);
	}
	void getMonthPay() {
		System.out.println((pay/(double)12) + (bonus/(double)12));
	}
}
class Contract extends Employee2{
	int hireYear;
	void info() {
		super.info();
		System.out.println("계약기간:"+hireYear);
	}
	void getMonthPay(){
		System.out.println(pay/(double)12 * hireYear);
	}
}
class PartTime extends Employee2{
	int workDay;
	PartTime(){
	}
	void info() {
		super.info();
		System.out.println("월 근무일:"+workDay);
	}
	void getMonthPay() {
		System.out.println(pay*workDay);
	}
}
public class Ex06_10_정주원 {

	public static void main(String[] args) {

//		FullTime f= new FullTime("F001","성유리",500,30);
//		Contract c= new Contract("C001","이효리",400,3);
//		PartTime p= new PartTime("P001","이진",300,7);
		
		Employee2 f= new FullTime("F001","성유리",500,30);
		Employee2 c= new Contract("C001","이효리",400,3);
		Employee2 p= new PartTime("P001","이진",300,7);
		
		
		Employee2[]arr= {new FullTime("F001","성유리",500,30),
						new Contract("C001","이효리",400,3),
						new PartTime("P001","이진",300,7)};
		
		int i;
		for(i=0;i<arr.length;i++) {
			arr[i].info();
		}
		f.info();
		c.info();
		p.info();
		
//		4개 변수를 출력하는 메서드
//		위 3개의 객체를 배열로 만들어서 해보기
//		
//		4개의 변수를 출력하는 메서드 만들기
//		System.out.println(getMonthPay());
//		
//		P001,이진,300,7
//		2100.0
//
//		C001,이효리,400,3
//		100.0
//
//		F001,성유리,500,30
//		44.166666666666664
	
		
		//계약직: pay/(double)12 * hireYear
	}

}