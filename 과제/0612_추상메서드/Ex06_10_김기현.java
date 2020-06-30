abstract class Employee2{
	String empno;
	String name;
	int pay;
	 Employee2() {
		 
	 }
	Employee2(String empno,String name,int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}	
	
	abstract String show(); 
		
	 abstract double getMonthPay(); 
		
}

class Fulltime extends Employee2{
	int bouns;

	Fulltime(String empno,String name,int pay,int bouns) {
		super(empno,name,pay);
////		this.empno = empno;
////		this.name=name;
////		this.pay=pay;
		this.bouns = bouns;		
	}	
	
	String show() {
		return "��ȣ:"+empno+"�̸�:"+name+"�ݾ�:"+pay+"���ʽ�:"+bouns;
	}
	
		double getMonthPay() {
			return (pay/(double)12) + (bouns/(double)12);		
	}	
}

class Contract extends Employee2{
	int hireyear;
	
	Contract(String empno,String name,int pay,int hireyear) {
		super(empno,name,pay);
//		this.empno = empno;
//		this.name=name;
//		this.pay=pay;
		this.hireyear = hireyear;
	}
	
String show() {
	return "��ȣ:"+empno+"�̸�:"+name+"�ݾ�:"+pay+"���Ⱓ:"+hireyear ;	
	}
		
double getMonthPay() {	
	 return	(pay/(double)12*hireyear );
	}		
}

class Parttime extends Employee2{
	int workday;
	
	Parttime(String empno,String name,int pay,int workday) {
		super(empno,name,pay);
//		this.empno = empno;
//		this.name=name;
//		this.pay=pay;
		this.workday = workday;
	}
		
	String show() {
		return "��ȣ:"+empno+"�̸�:"+name+"�ݾ�:"+pay+"�� �ٹ���:"+workday;	
	}
	
double getMonthPay() {
		return (pay*workday);
	}	
}

public class Ex06_10_����� {
	public static void main(String[] args) {
		
		
//		Fulltime f = new Fulltime("F001","������",500,30);	
//		Contract c = new Contract("C001","��ȿ��",400,3);	
//		Parttime p = new Parttime("P001","����",300,7);	
		
		
		Employee2 e = null;
		Employee2 f = new Fulltime("F001","������",500,30);
		Employee2 c = new Contract("C001","��ȿ��",400,3);	
		Employee2 p = new Parttime("P001","����",300,7);	
		
		
		e = (Employee2)f;
		System.out.println(f.show());
		System.out.println(f.getMonthPay());
		if(f instanceof Employee2) {
			System.out.println("�ٿ� ĳ���� ����");
		}
		
		System.out.println("-----------------");
		
		e = (Employee2)c;
		System.out.println(c.show());
		System.out.println(c.getMonthPay());
		if(c instanceof Employee2) {
			System.out.println("�ٿ� ĳ���� ����");
		}
		
		System.out.println("-----------------");
		
		e = (Employee2)p;
		System.out.println(p.show());
		System.out.println(p.getMonthPay());
		

		if(p instanceof Employee2) {
			System.out.println("�ٿ� ĳ���� ����");
		}
	
		System.out.println("****************");
		
		if(p instanceof Employee2) {
			System.out.println("�ٿ� ĳ���� ����");
		}
		else if(c instanceof Employee2) {
			System.out.println("�ٿ� ĳ���� ����");
		}
		else  {
			System.out.println("�ٿ� ĳ���� ����");
		}
		
		/*		System.out.println("-----------------");
		

		f.show();
		System.out.println("����:"+f.getMonthPay());
		System.out.println();
		
		c.show();
		System.out.println("����:"+c.getMonthPay());
		System.out.println();

		p.show();
		
		System.out.println("����:"+p.getMonthPay());
*/		
		System.out.println();
		
		Employee2[] em = {new Fulltime("F001","������",500,30),
				new Contract("C001","��ȿ��",400,3),
				new Parttime("P001","����",300,7)
							};
		
		int i;
		for(i=0;i<em.length;i++) {
			System.out.println(em[i].show());
			System.out.println();
		} 
		
		//
//		super Ȱ���ؼ� �غ���
//		instanceof Ȱ���ؼ� �غ��� ��ĳ���� �ٿ�ĳ����Ȱ��
		
	}

}
