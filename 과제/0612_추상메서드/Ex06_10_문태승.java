abstract class Employlee2 {
	String empno;
	String name;
	int pay;

	abstract double getMonthPay();

}

class FullTime extends Employlee2 { 
	int bonus;

	FullTime(String empno,String name, int pay, int bonus){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	double getMonthPay() {// �߻�Ŭ���������� ���ʽ�����
		return (pay/(double)12) + (bonus/(double)12);
	}
	void display() {
		System.out.println(empno + ", " + name + ", " + pay + ", " + bonus);

	}

}

class Contract extends Employlee2{ 
	int hireYear; 

	Contract(String empno,String name,int pay,int hireYear){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.hireYear = hireYear;
	}

	double getMonthPay() {
		return pay/(double)12 * hireYear; 
	}

	void display() {

		System.out.println(empno + ", " + name + ", " + pay + ", " + hireYear);
	}

}

class PartTime extends Employlee2{ 
	int workDay;

	PartTime(String empno,String name,int pay,int workDay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}

	double getMonthPay() {
		return pay*workDay; 
	}

	void display() {

		System.out.println(empno + ", " + name + ", " + pay + ", " + workDay);
	}
}



public class Ex06_10_���½� {
	public static void main(String[] args) {

		//		FullTime f = new FullTime("F001","������",500,30);
		//		Contract c = new Contract("C001","��ȿ��",400,3);
		//		PartTime p = new PartTime("P001","����",300,7);
		//		

		//		4���� ������ ����ϴ� �޼���
		//		System.out.println(getMonthPay());

		Employlee2 Arr[] = {new FullTime("F001", "������", 500, 30),
				new Contract("C001", "��ȿ��", 400, 3),
				new PartTime("P001", "����", 300, 7)};

		for(int i = 0; i < Arr.length; i++) {

			action(Arr[i]);
			System.out.println(Arr[i].getMonthPay());
			System.out.println();
		}
	}

	static void action(Employlee2 down) {

		if(down instanceof FullTime) {
			FullTime f = (FullTime)down;
			f.display();
		}
		else if(down instanceof Contract) {
			Contract c = (Contract)down;
			c.display();
		}
		else if(down instanceof PartTime) {
			PartTime p = (PartTime)down;
			p.display();
		}
	}

}


