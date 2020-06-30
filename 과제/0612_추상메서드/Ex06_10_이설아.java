abstract class Employee2 {
	String empno ;
	String name;
	int pay;
	Employee2(String empno,String name, int pay){
		this.empno = empno;
		this.name= name;
		this.pay= pay;
	}
	abstract double getMonthPay();
	
}//Employee2

class FullTime extends Employee2 {
	int bonus;
	
	FullTime(String empno,String name, int pay, int bonus){
		super(empno, name, pay);
		this.bonus = bonus;
	}

	double getMonthPay() {
		return	(pay/(double)12) + (bonus/(double)12);
	}
	
	void show() {
		System.out.printf("사번: %s, 이름: %s, 금액: %d, 보너스: %d\n",empno, name, pay, bonus );
	}
	
	
}//FullTime
class Contract extends Employee2 {
	int hireYear;
	
	Contract(String empno,String name, int pay,int hireYear){
		super(empno, name, pay);
		this.hireYear = hireYear;
	}

	double getMonthPay() {
		return pay/(double)12 * hireYear;
	}
	void show() {
		System.out.printf("사번: %s, 이름: %s, 금액: %d, 계약기간: %d\n",empno, name, pay, hireYear );
	}	
	
}//Contract
class PartTime extends Employee2 {
	int workDay;
	
	PartTime(String empno,String name, int pay, int workDay){
		super(empno, name, pay);
		this.workDay = workDay;
	
}
	double getMonthPay() {
		return pay* workDay;
	}
	void show() {
		System.out.printf("사번: %s, 이름: %s, 금액: %d, 월근무일: %d\n",empno, name, pay, workDay );
	}
	
	
	
}//PartTime



public class Ex06_10_이설아 {
	public static void main(String[] args) {

		Employee2 f =new FullTime("F001", "성유리", 500, 30);
		Employee2 c =new Contract("C001", "이효리", 400, 3);
		Employee2 p =new PartTime("P001", "이진", 300, 7);
		
		Employee2[] arr= new Employee2 [3];
		arr[0]= new FullTime("F001", "성유리", 500, 30);
		arr[1]= new Contract("C001", "이효리", 400, 3);
		arr[2]= new PartTime("P001", "이진", 300, 7);
		
		int i;
		for(i=0; i<arr.length; i++) {
			action(arr[i]);
			}
		System.out.println();
		System.out.println("성유리 월급:"+ f.getMonthPay());
		System.out.println("이효리 월급:"+ c.getMonthPay());
		System.out.println("이진 월급:"+ p.getMonthPay());
		
//		f.show();
//		c.show();
//		p.show();
		
	}//main
	
	static void action(Employee2 e) {
		if(e instanceof FullTime ) {
			FullTime f= (FullTime) e;
			f.getMonthPay();
			f.show();
		}
		else if(e instanceof Contract) {
			Contract c =(Contract) e;
			c.getMonthPay();
			c.show();
		}
		else if(e instanceof PartTime) {
			PartTime p =(PartTime) e;
			p.getMonthPay();
			p.show();
		}
		
	}
	
	

}
