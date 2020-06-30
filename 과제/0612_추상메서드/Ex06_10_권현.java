
abstract class Employee2{
	String empno;
	String name;
	int pay;
	abstract void getMonthPay();
	
	Employee2(String empno, String name, int pay){
		this.empno=empno;
		this.name=name;
		this.pay=pay;
	}
	
	void display() {
		System.out.println(empno+","+name+","+pay);
	}
}//class e


class FullTime extends Employee2{
	int bonus;
	
	FullTime(String empno, String name, int pay, int bonus){
		super(empno,name,pay);
		this.bonus=bonus;
	}
	void getMonthPay() {
		System.out.println(pay/(double)12 + bonus*(double)12); 
	}
}//class f
	

class Contract extends Employee2{
	int hireYear;
   
	Contract(String empno, String name, int pay, int hireYear){
		super(empno, name, pay);
		this.hireYear= hireYear;
	}
	void getMonthPay() {
		System.out.println(pay/(double)12); 
	}
}//class c


class PartTime extends Employee2{
	int workDay;
	
	PartTime(String empno, String name, int pay, int workDay){
		super(empno, name, pay);
		this.workDay=workDay;
	}
	void getMonthPay() {
		System.out.println(pay*workDay);
	}
}//class p



public class Ex06_10_���� {
	public static void main(String[] args) {
		
		FullTime f = new FullTime("F001", "������",500,30);
	    Contract c = new Contract("C001", "��ȿ��",400,3);
		PartTime p = new PartTime("P001", "����",300,7);
		
		System.out.println(f.empno+","+f.name+","+f.pay+","+f.bonus);
		f.getMonthPay();
		System.out.println(c.empno+","+c.name+","+c.pay+","+c.hireYear);
		c.getMonthPay();
		System.out.println(p.empno+","+p.name+","+p.pay+","+p.workDay);
		p.getMonthPay();
		
		
		
		
		
		
		
		
		
		//�迭
		//Employee e = new FullTime("F001", "������",500,30);
		//Employee e = new Contract("C001", "��ȿ��",400,3);
		//Employee e = new PartTime("P001", "����",300,7);
		
	}//main

}//class

//
//getMonth pay�� �߻�޼�����ض�
//4���� ������ ����ϴ� �޼��� ������
//�迭�ε� �غ���


//����ϸ� �̷��� ��������
//
//P001,����,300,7
//2100.0
//
//C001,��ȿ��,400,3
//100.0
//
//F001,������,500,30
//44.166666666666664
