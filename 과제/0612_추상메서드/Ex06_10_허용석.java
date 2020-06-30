abstract class Employee1{
	private String empno;
	private String name;
	private int pay;

	public Employee1(String empno, String name, int pay) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;
	}

	public int getPay() {
		return pay;
	}

	public void display() {
		System.out.println(empno+","+name+","+pay);
	}
	public void display1() {
	}

	abstract int getMonthPay();
	
}
class FullTime extends Employee1{
	private int bonus;
	
	public FullTime(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus=bonus;
	}

	public int getMonthPay() {
		return (int)(getPay()/(double)12+bonus/(double)12);
	}
	
	public void display() {
		super.display();
		System.out.println(bonus);
	}

	public void display1() {
		System.out.println(getMonthPay());
	}
}
class Contract extends Employee1{
	private int hireYear;

	public Contract(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear=hireYear;
	}

	public int getMonthPay() {
		return (int)(getPay()/(double)12*hireYear);
	}
	
	public void display() {
		super.display();
		System.out.println(hireYear);
	}

	public void display1() {
		System.out.println(getMonthPay());
	}
}
class PartTime extends Employee1{
	private int workDay;

	public PartTime(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay=workDay;
	}

	public int getMonthPay() {
		return (int)(getPay()*workDay);
	}

	public void display() {
		super.display();
		System.out.println(workDay);
	}

	public void display1() {
		System.out.println(getMonthPay());
	}
}
public class Ex06_10_��뼮 {
	public static void main(String[] args) {
		
		Employee1[] arr= {new FullTime("F001","������",500,30),
				          new Contract("C001","��ȿ��",400,3),
				          new PartTime("P001","����",300,7)
		                 };
		
//		4���� ������ ����ϴ� �޼���
		for(int i=0;i<arr.length;i++) {
			arr[i].display();
			arr[i].display1();
		}
	}
}
