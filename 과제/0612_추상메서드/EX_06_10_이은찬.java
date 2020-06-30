abstract class Employee2{
	String empno,name;
	int pay;
	
	Employee2(String empno, String name, int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	abstract void getMonthpay();
	
	void display() {
		System.out.println("사번:"+empno);
		System.out.println("이름:"+name);
		System.out.println("금액:"+pay);
	}
}//Employee2

class FullTime extends Employee2{
	int bonus;
	
	
	public FullTime(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}


	void getMonthpay() {
		display();
		System.out.println((pay/(double)12) +(bonus/(double)12));
		System.out.println();
	}
}//FullTime

class Contract extends Employee2{
	int hireYear;

	public Contract(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}
	
	void getMonthpay() {
		display();
		System.out.println(pay/(double)12 * hireYear);
		System.out.println();
	}
}//Contract

class PartTime extends Employee2{
	int workDay;

	public PartTime(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	
	void getMonthpay() {
		display();
		System.out.println(pay*workDay);
		System.out.println();
	}
}//PartTime

public class EX_06_10_이은찬 {
	public static void main(String[] args) {

		FullTime f = new FullTime("F00l","성유리",500,30);
		Contract c = new Contract("C00l","이효리",400,3);
		PartTime p = new PartTime("P00l","이진",300,7);

//		위 3개의 객체를 배열로 만들어서 해보기
		
//		정규직 : (pay/(double)12) + (bonus/(double)12)
//		계약직 : pay/(double)12 * hireYear
//		일용직 : pay*workDay
//		4개의 변수를 출력하는 메서드
//		System.out.println(getMonthpay());
		
//		P001,이진,300,7
//		2100.0
//		
//		C001,이효리,400,3
//		100.0
//		
//		P001,성유리,500,30
//		44,166666666666664
		f.getMonthpay();
		c.getMonthpay();
		p.getMonthpay();
		
		System.out.println("객체를 배열로 만들어 출력");
		System.out.println();
		Employee2[] e = { new FullTime("F00l","성유리",500,30),
				          new Contract("C00l","이효리",400,3),
		                  new PartTime("P00l","이진",300,7)
		};
		int i;
		for(i=0;i<e.length;i++) {
			e[i].getMonthpay();
		}
		
	}

}
