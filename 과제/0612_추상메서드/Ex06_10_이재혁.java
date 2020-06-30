abstract class Employee2{
	String empno;
	String name;
	int pay;

	Employee2(String empno, String name, int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	void display() {
		System.out.print(empno+","+name+","+pay+",");
	}

	abstract void getMonthPay();
}//Employee2

class FullTime extends Employee2 {
	int bonus;

	FullTime(String empno, String name, int pay, int bonus){
		super(empno, name, pay);
		this.bonus = bonus;
	}

	void display() {
		super.display();
		System.out.println(bonus);
	}

	@Override
	void getMonthPay() {
		System.out.println((pay/(double)12) + (bonus/(double)12));
	}

}//FullTime

class Contract extends Employee2{
	int hireYear;

	Contract(String empno, String name, int pay, int hireYear){
		super(empno, name, pay);
		this.hireYear = hireYear;
	}

	void display() {
		super.display();
		System.out.println(hireYear);
	}

	@Override
	void getMonthPay() {
		System.out.println(pay/(double)12 * hireYear);
	}

}//Contract

class PartTime extends Employee2{
	int workDay;

	PartTime(String empno, String name, int pay, int workDay){
		super(empno, name, pay);
		this.workDay = workDay;
	}

	void display() {
		super.display();
		System.out.println(workDay);
	}

	@Override
	void getMonthPay() {
		System.out.println(pay*workDay);
	}

}//PartTime

public class Ex06_10_������ {
	public static void main(String[] args) {

		Employee2 f = new FullTime("F001","������",500,30);
		Employee2 c = new Contract("C001","��ȿ��",400,3);
		Employee2 p = new PartTime("P001","����",300,7);

		p.display();
		p.getMonthPay();
		c.display();
		c.getMonthPay();
		f.display();
		f.getMonthPay();

		System.out.println("++++++++++�迭++++++++++");

		Employee2[] e2 = {new PartTime("P001","����",300,7),
				          new Contract("C001","��ȿ��",400,3),
				          new FullTime("F001","������",500,30)
		};
		int i;
		for(i=0;i<e2.length;i++) {
			e2[i].display();
			e2[i].getMonthPay();

		}


		//	4���� ������ ����Ϲ� �ż���
		//	System.out.println(getMonthPay());

		//	P001,����,300,7
		//	2100.0
		//	
		//	C001,��ȿ��,400,3
		//	100.0
		//	
		//	F001,������,500,30
		//	44.166666666..
		/*
		������ : (pay/(double)12) + (bonus/(double)12)
		����� : pay/(double)12 * hireYear
		�Ͽ��� : pay*workDay
		 */


	}
}
