abstract class Employee1{
	String empno;
	String name;
	int pay;
	abstract double getMonthPay();
	public Employee1(){
		
	}
	
	 Employee1(String empno,String name,int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	void display() {
		System.out.println("���:"+empno);
		System.out.println("�̸�:"+name);
		System.out.println("����:"+pay);
	}
	
}


class FullTime extends Employee1{
	
	//������(pay/(double)12)+ (bonus/(double)12)
	
	int bouns;
	
	FullTime(String empno,String name, int pay, int bouns){
		super(empno,name,pay);
		this.bouns = bouns;
		
	}
	void display() {
		super.display();
		  System.out.println("���ʽ�" + bouns);
	}

	double getMonthPay() {
		return (pay/(double)12) + (bouns/(double)12);
	}
	
	
	
}
class Contract extends Employee1{
	int hireYear;
	double money2;
	//�����pay/(double)12
	Contract(String empno,String name,int pay,int hireyear){
		super(empno,name,pay);
		this.hireYear = hireyear;
		
	}
	
	void display() {
		super.display();
		System.out.println("���Ⱓ:"+hireYear);
		
	}
double getMonthPay() {
	return pay/(double)12*hireYear;
	
	}
}
class PartTime extends Employee1{
	//�Ͽ���pay*workDay
	int workDay;
	double money3;
	
	PartTime(String empno,String name,int pay,int workDay){
		super(empno,name,pay);
		this.workDay = workDay;
		money3= pay*workDay;
		
	}
	
	void display() {
		super.display();
		System.out.println("workday:"+workDay);
		
	}
double getMonthPay() {
		return pay*workDay;
	}
}


public class Ex06_10_�ڱ��� {

	public static void main(String[] args) {
		FullTime f = new FullTime("F001","������",500,30);
		Contract c = new Contract("C001","��ȿ��",400,3);
		PartTime p = new PartTime("P001","����",300,7);
		f.display();
		System.out.println(f.getMonthPay());
		System.out.println("============================");
		c.display();
		System.out.println(c.getMonthPay());
		System.out.println("============================");
		p.display();
		System.out.println(p.getMonthPay());
		System.out.println("============================");
		
		//Employee1 ff = new FullTime("F001", "������", 500, 30);
		//Employee1 cc = new Contract("C001","��ȿ��",400,3);
		//Employee1 pp = new PartTime("P001","����",300,7);
		
		int i;	
		Employee1[] arr = { 
				new FullTime("F001", "������", 500, 30),  //arr[0]
				new Contract("C001","��ȿ��",400,3), //a[1]
				new PartTime("P001","����",300,7) // Employee1[2]
		};
		
		
		
		//double i = (double)1;  1.0
		//int i = (int)1.1;  1
		
		
		for(i=0;i<arr.length;i++) {
			allShow(arr[i]);
			
		}
		
		
		
		//}
		
		// �� 3���� ��ü�� �迭�� ���� �غ���
		//4���� ������ ����ϴ� �޼���
		//System.out.println(getMonthPay());
		//P001, ����,300,7
		// 2100.0
		//C001 ��ȿ��,400,3
		//100.0
		//F001 , ������,500,30
		//4.16666666

		
	}//main
	
	static void allShow(Employee1 y) {
		System.out.println("�迭============");
		if(y instanceof FullTime) {
			FullTime ft = (FullTime) y;
			ft.display();
			System.out.println(ft.getMonthPay());
		}
		else if (y instanceof Contract) {
			Contract ct = (Contract) y;
			ct.display();
			System.out.println(ct.getMonthPay());
		}
		
		else if (y instanceof PartTime) {
			PartTime pt = (PartTime) y;
			pt.display();
			System.out.println(pt.getMonthPay());
		}
		
	}
	

}
