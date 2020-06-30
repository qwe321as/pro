abstract class Employee0{
	String empno;
	String name;
	int pay;
	 Employee0(String empno, String name, int pay) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;		
	}

	abstract double getMonthPay();
	
	void show() {
		System.out.println("사번: "+empno+"이름 : "+name+"금액: "+pay);
		System.out.println(getMonthPay());
	}

}
class FullTime extends Employee0{
	int bonus;
	public FullTime(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus=bonus;
	}
	void Full(){
	}
	double getMonthPay() {
		return(pay/(double)12)+(bonus/(double)12);

	}

}
class Contract extends Employee0{
	int hireYear;
	public Contract(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear=hireYear;
	}
	void Con(){
	}
	double getMonthPay() {
		return pay/(double)12*hireYear;
		//		pay/(double)12*hireYear
	}
}
class PartTime extends Employee0{
	int workDay;
	public PartTime(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay=workDay;
	}
	double getMonthPay() {
		return pay*workDay;
		//		pay*workDay
	}
	void Part(){
	}

}
public class Ex06_10_이예지 {

	public static void main(String[] args) {
		FullTime f = new FullTime("F001","성유리",50000000,30);
		Contract c = new Contract("C001","이효리",4000000,3);
		PartTime p = new PartTime("P001","이진",50000,10);
		//		System.out.println(getMonthPay());
		f.show();
		c.show();
		p.show();
		p.getMonthPay();
		Employee0 [] emp= {new FullTime("F001","성유리",50000000,30),
				new Contract("C001","이효리",4000000,3),new PartTime("P001","이진",50000,10)};
		for (int i = 0; i < emp.length; i++) {
			action(emp[i]);
		}
	}
double e;
	static void action(Employee0 e) { //다운캐스팅되는지 알기위한 if ans
		if(e instanceof FullTime) {
			FullTime f=(FullTime)e;
			f.Full();}
		else if(e instanceof Contract) {
			Contract c=(Contract)e;
			c.Con();
		}
		else if(e instanceof PartTime) {
			PartTime p=(PartTime)e;
			p.Part();
		}
	}
		
	}


