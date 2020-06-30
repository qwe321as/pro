abstract class Employee2 {
	private String empno;
	private String name;
	private int price;
	private int bonus;
	
	abstract void getMonthPay();
	
}

class FullTime extends Employee2{
	
	public FullTime(String empno, String name, int price, int bonus) {
		System.out.println(empno);
		System.out.println(name);
		System.out.println(price);
		System.out.println(bonus);
		System.out.println((price/(double)12)+(bonus/(double)12));
		System.out.println();
	}


	@Override
	void getMonthPay() {
		
		
	}
	
}
class Contract extends Employee2{
	
	public Contract(String empno, String name, int price, int bonus) {
		System.out.println(empno);
		System.out.println(name);
		System.out.println(price);
		System.out.println(bonus);
		System.out.println((price/(double)12)*bonus);
		System.out.println();
	}

	@Override
	void getMonthPay() {
		
		
	}
	
}
class PartTime extends Employee2{
	
	public PartTime(String empno, String name, int price, int bonus) {
		System.out.println(empno);
		System.out.println(name);
		System.out.println(price);
		System.out.println(bonus);
		System.out.println(price*bonus);
		System.out.println();
	}

	@Override
	void getMonthPay() {
		
		
	}
	
}

public class Ex06_10_김용주 {

	public static void main(String[] args) {
		
		FullTime f = new FullTime("F001","성유리",500,30);
		Contract c = new Contract("C001","이효리",400,3);
		PartTime p = new PartTime("P001","이진",300,7);
		
		f.getMonthPay();
		c.getMonthPay();
		p.getMonthPay();

//		4개의 변수를 출력하는 메소드
//		System.out.println(getMonthPay());
	}

}
