abstract class Employee2{
	String empno;
	String name;
	int pay;

	public Employee2(String empno,String name,int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	void display() {
		System.out.println("���: "+empno);
		System.out.println("�̸�: "+name);
		System.out.println("�ݾ�: "+pay);
	}
	
	abstract void getMonthPay();
	
}// Employee2

class FullTime extends Employee2{
	int bonus;
	FullTime(String empno, String name,int pay, int bonus){
		super(empno,name,pay);
		this.bonus = bonus;
	}
	
	void display() {
		super.display();
		System.out.println("���ʽ�: " + bonus);
		System.out.println("getMonthPay: "+(pay/(double)12)+(bonus/(double)12));
	}

	void getMonthPay() {
		
	}
	

}//FullTime

class Contract extends Employee2{ 
	int hireYear;
	Contract(String empno, String name,int pay, int hireYear){
		super(empno,name,pay);
		this.hireYear = hireYear;
	}
	
	void display() {
		super.display();
		System.out.println("���Ⱓ: "+hireYear);
		System.out.println("getMonthPay: "+ (pay/(double)12) * hireYear);
	}

	void getMonthPay() {
		
	}

}//Contract

class PartTime extends Employee2{
	int workDay;
	PartTime(String empno, String name,int pay, int workDay){
		super(empno,name,pay);
		this.workDay = workDay;
	}
	
	void display() {
		super.display();
		System.out.println("�� �ٹ���: "+workDay);
		System.out.println("getMonthPay: "+ pay*workDay);
	}

	void getMonthPay() {
		
	}

}//PartTime


public class Ex06_10_����� {

	public static void main(String[] args) {

		FullTime f = new FullTime("F001","������",500,30);
		Contract c = new Contract("C001","��ȿ��",400,3);
		PartTime p = new PartTime("P001","����",300,7);
		
		f.display();
		System.out.println();
		c.display();
		System.out.println();
		p.display();
		System.out.println();
		
		
//		3���� ��ü�� �迭�� �غ���.
		
		Employee2 f1 = new FullTime("F001","������",500,30);
		Employee2 c1 = new Contract("C001","��ȿ��",400,3);
		Employee2 p1 = new PartTime("P001","����",300,7);
		
		Employee2[] arr = {new FullTime("F001","������",500,30),
						   new Contract("C001","��ȿ��",400,3),
						   new PartTime("P001","����",300,7)
						  };
		
		int i;
			for(i=0;i<arr.length;i++) {
				action(arr[i]);
				System.out.println();
			}
		
		
		//		4���� ������ ����ϴ� �޼���


	} // main
	static void action(Employee2 r) { // �κ�Ÿ���� ������ ���������� ��ĳ���õǸ鼭 ����
		if(r instanceof FullTime) {
			FullTime ft = (FullTime)r; // �ٿ�ĳ������ (�ڽİ������� ���������!)
			ft.display();
		} 
		else if (r instanceof Contract) {
			Contract ct = (Contract)r;
			ct.display();
		}
		else if (r instanceof PartTime) {
			PartTime dr = (PartTime)r;
			dr.display();
		}
}
	
} // class
