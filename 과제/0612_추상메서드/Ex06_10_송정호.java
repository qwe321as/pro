
abstract class Employee2 {
	
	String empno;
	String name;
	int pay;
	
	abstract double getMonthPay();
}

class FullTime extends Employee2{
	
	int bonus;

	FullTime(String empno, String name, int pay, int bonus) {
		
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus; 
	}
	
	double getMonthPay() {
		return (pay/(double)12) + (bonus/(double)12); 
	}
	
	void prn() {
		
		System.out.println(empno + ", " + name + ", " + pay + ", " + bonus);
	}
}

class Contract extends Employee2{	//  pay/(double)12 * hireYear
	
	int hireYear;
	
	Contract(String empno, String name, int pay, int hireYear) {
		
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.hireYear = hireYear;
	}
	
	double getMonthPay() {
		return pay/(double)12 * hireYear; 
	}
	
	void prn() {
		
		System.out.println(empno + ", " + name + ", " + pay + ", " + hireYear);
	}
}

class PartTime extends Employee2{
	
	int workDay;
	
	PartTime(String empno, String name, int pay, int workDay) {
		
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}
	
	double getMonthPay() {
		return pay*workDay; 
	}
	
	void prn() {
		
		System.out.println(empno + ", " + name + ", " + pay + ", " + workDay);
	}
}

public class Ex06_10_송정호 {

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
	
	static void action(Employee2 down) {
		
		if(down instanceof FullTime) {
			FullTime f = (FullTime)down;
			f.prn();
		}
		else if(down instanceof Contract) {
			Contract c = (Contract)down;
			c.prn();
		}
		else if(down instanceof PartTime) {
			PartTime p = (PartTime)down;
			p.prn();
		}
	}

}
