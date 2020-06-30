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
		System.out.println("���:"+empno);
		System.out.println("�̸�:"+name);
		System.out.println("�ݾ�:"+pay);
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

public class EX_06_10_������ {
	public static void main(String[] args) {

		FullTime f = new FullTime("F00l","������",500,30);
		Contract c = new Contract("C00l","��ȿ��",400,3);
		PartTime p = new PartTime("P00l","����",300,7);

//		�� 3���� ��ü�� �迭�� ���� �غ���
		
//		������ : (pay/(double)12) + (bonus/(double)12)
//		����� : pay/(double)12 * hireYear
//		�Ͽ��� : pay*workDay
//		4���� ������ ����ϴ� �޼���
//		System.out.println(getMonthpay());
		
//		P001,����,300,7
//		2100.0
//		
//		C001,��ȿ��,400,3
//		100.0
//		
//		P001,������,500,30
//		44,166666666666664
		f.getMonthpay();
		c.getMonthpay();
		p.getMonthpay();
		
		System.out.println("��ü�� �迭�� ����� ���");
		System.out.println();
		Employee2[] e = { new FullTime("F00l","������",500,30),
				          new Contract("C00l","��ȿ��",400,3),
		                  new PartTime("P00l","����",300,7)
		};
		int i;
		for(i=0;i<e.length;i++) {
			e[i].getMonthpay();
		}
		
	}

}
