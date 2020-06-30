abstract class Employee1{
	String empno;
	String name;
	int pay;

	Employee1(String empno, String name, int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	abstract double getMonthpay();

	void show() {
		System.out.println("���:" + empno);
		System.out.println("�̸�:" + name);
		System.out.println("�ݾ�:" + pay);
	}
}

class FullTime extends Employee1{
	int bonus;

	FullTime(String empno, String name, int pay, int bonus){
		super(empno, name, pay);
		this.bonus = bonus;
	}

	double getMonthpay(){
		return (pay/(double)12)+(bonus/(double)12);
	}

	void show() {
		super.show();
		System.out.println("���ʽ�:"+bonus);
	}
}
class Contract extends Employee1{
	int hireYear;
	Contract(String empno, String name, int pay, int hireYear){
		super(empno,name,pay);
		this.hireYear = hireYear;
	}

	double getMonthpay() {
		return pay / (double)12 * hireYear;
	}

	void show() {
		super.show();
		System.out.println("���Ⱓ:" + hireYear);
	}
}
class PartTime extends Employee1{
	int workDay;

	PartTime(String empno, String name, int pay, int workDay){
		super(empno, name, pay);
		this.workDay = workDay;
	}

	double getMonthpay() {
		return pay * workDay;
	}

	void show() {
		super.show();
		System.out.println("�� �ٹ� :" + workDay);
	}
}

public class Ex06_10_�蹮�� {
	public static void main(String[] args) {

		FullTime f = new FullTime("F001","�蹮��",500,30);
		Contract c = new Contract("C001","��ȿ��",400,3);
		PartTime p = new PartTime("P001","�ѵ���",300,7);


		System.out.println("============================");
		f.show();
		System.out.println(f.getMonthpay());
		System.out.println("============================");

		c.show();
		System.out.println(c.getMonthpay());
		System.out.println("============================");

		p.show();
		System.out.println(p.getMonthpay());
		System.out.println("============================");

		//�迭���
		Employee1[] emp = {
				new FullTime("F001","�蹮��",500,20),
				new Contract("C001","��ȿ��",400,3),
				new PartTime("P001","�ѵ���",300,7)
		};


		for(int i = 0; i<emp.length;i++) {
			prt(emp[i]);
		}

	}
	static void prt(Employee1 e) {
		if(e instanceof FullTime) {
			FullTime fu = (FullTime) e;
			fu.show();
			System.out.println(fu.getMonthpay());
			System.out.println("============================");
		}
		else if(e instanceof Contract) {
			Contract ct = (Contract)e;
			ct.show();
			System.out.println(ct.getMonthpay());
			System.out.println("============================");
		}
		else if(e instanceof PartTime) {
			PartTime pt = (PartTime)e;
			pt.show();
			System.out.println(pt.getMonthpay());
			System.out.println("============================");
		}
	}
}
