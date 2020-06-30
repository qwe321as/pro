
abstract class Employee2 {

	private String empno;
	private String name;
	private int pay;

	abstract double getMonthPay();

	String getEmpno() {
		return empno;
	}

	void setEmpno(String empno) {
		this.empno = empno;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getPay() {
		return pay;
	}

	void setPay(int pay) {
		this.pay = pay;
	}
}

class FullTime extends Employee2{

	private int bonus;

	FullTime(String empno, String name, int pay, int bonus) {

		this.setEmpno(empno);
		this.setName(name);
		this.setPay(pay);
		this.bonus = bonus; 
	}

	double getMonthPay() {
		return (getPay()/(double)12) + (bonus/(double)12); 
	}

	void prn() {

		System.out.println(getEmpno() + ", " + getName() + ", " + getPay() + ", " + bonus);
	}
}

class Contract extends Employee2{	

	private int hireYear;

	Contract(String empno, String name, int pay, int hireYear) {

		this.setEmpno(empno);
		this.setName(name);
		this.setPay(pay);
		this.hireYear = hireYear;
	}

	double getMonthPay() {
		return getPay()/(double)12 * hireYear; 
	}

	void prn() {

		System.out.println(getEmpno() + ", " + getName() + ", " + getPay() + ", " + hireYear);
	}
}

class PartTime extends Employee2{

	private int workDay;

	PartTime(String empno, String name, int pay, int workDay) {

		this.setEmpno(empno);
		this.setName(name);
		this.setPay(pay);
		this.workDay = workDay;
	}

	double getMonthPay() {
		return getPay()*workDay; 
	}

	void prn() {

		System.out.println(getEmpno() + ", " + getName() + ", " + getPay() + ", " + workDay);
	}
}

public class Ex06_10_김선우 {

	public static void main(String[] args) {

		//		FullTime f = new FullTime("F001", "성유리", 500, 30);		// 부모로 묶어서 배열
		//		Contract c = new Contract("C001", "이효리", 400, 3);
		//		PartTime p = new PartTime("P001", "이진", 300, 7);

		//		4개의 변수를 출력하는 메서드
		//		System.out.println(getMonthPay());

		Employee2 emArr[] = {new FullTime("F001", "성유리", 500, 30),
				new Contract("C001", "이효리", 400, 3),
				new PartTime("P001", "이진", 300, 7)};

		for(int i = 0; i < emArr.length; i++) {

			action(emArr[i]);
			System.out.println(emArr[i].getMonthPay());
			System.out.println();
		}
	}

	static void action(Employee2 emp) {

		if(emp instanceof FullTime) {
			FullTime f = (FullTime)emp;
			f.prn();
		}
		else if(emp instanceof Contract) {
			Contract c = (Contract)emp;
			c.prn();
		}
		else if(emp instanceof PartTime) {
			PartTime p = (PartTime)emp;
			p.prn();
		}
	}

}
