//public:
//protected:
//x(default):
//private:

abstract class Employee2{
	private String empno;
	private String name;
	private int pay;
	
	Employee2(String empno,String name,int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	int getPay(){
		return pay;
	}
	void display() {
		System.out.print(empno+","+name+","+pay+",");
	}
	
	abstract double getMonthPay(); 
	
} // Employee2

class FullTime extends Employee2{
//	private String empno;
//	private String name;
//	private int pay;
	private int bonus;
	
	FullTime(String empno,String name,int pay,int bonus){
		super(empno,name,pay);
		this.bonus = bonus;
	}
	public void display() { // �������̵�
		super.display();
		System.out.println(bonus);
	}
	@Override
	double getMonthPay() {
//		return  (pay/(double)12) + (bonus/(double)12) ;
		return  (getPay()/(double)12) + (bonus/(double)12) ;
	}
}//FullTime

class Contract extends Employee2{
//	private String empno;
//	private String name;
//	private int pay;
	private int hireYear;
	
	Contract(String empno,String name,int pay,int hireYear){
		super(empno,name,pay);
		this.hireYear = hireYear;
	}
	void display() { // �������̵�
		super.display();
		System.out.println(hireYear);
	}
	@Override
	double getMonthPay() {
//		return  pay/(double)12 * hireYear;
		return  getPay()/(double)12 * hireYear;
	}
}//Contract

class PartTime extends Employee2{
//	private String empno;
//	private String name;
//	private int pay;
	private int workDay;
	
	PartTime(String empno,String name,int pay,int workDay){
		super(empno,name,pay);
		this.workDay = workDay;
	}
	void display() { // �������̵�
		super.display();
		System.out.println(workDay);
	}
	@Override
	double getMonthPay() {
//		return  pay*workDay ;
		return  getPay()*workDay ;
	}
}//Contract

public class Ex06_10_���̸� {
	public static void main(String[] args) {

		Employee2 f = new FullTime("F001","������",500,30);
		Employee2 c = new Contract("C001","��ȿ��",400,3);
		Employee2 p = new PartTime("P001","����",300,7);
//		4���� ������ ����ϴ� �޼��� �����
		f.display();
		System.out.println(f.getMonthPay());
		System.out.println();
		
		c.display();
		System.out.println(c.getMonthPay());
		System.out.println();
		
		p.display();
		System.out.println(p.getMonthPay());
		System.out.println();
		
		
//		�� 3���� ��ü�� �迭�� ���� �غ���
		Employee2[] empl = {new FullTime("F001","������",500,30),
							new Contract("C001","��ȿ��",400,3),
							new PartTime("P001","����",300,7)
							};
		int i;
		for(i=0;i<empl.length;i++) {
			empl[i].display();
			System.out.println(empl[i].getMonthPay());
			System.out.println();
		}
//		System.out.println(getMonthPay());
		
//		P001,����,300,7
//		2100.0
//
//		C001,��ȿ��,400,3
//		100.0
//
//		F001,������,500,30
//		44.166666666666664
	}

}
