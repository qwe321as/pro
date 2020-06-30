abstract class Employee2{
	String empno;
	String name;
	int pay;
	abstract double getMonthPay();
	
	void display() {
		System.out.println();
		System.out.println("��� :"+empno);
		System.out.println("�̸� : "+name);
		System.out.println("�ݾ� :" +pay);
	}
}

class FullTime extends Employee2{
	int bonus;
	FullTime(String empno,String name, int pay,int bonus){
		this.empno=empno;
		this.name=name;
		this.pay=pay;
		this.bonus=bonus;
	}

	
	
	 double getMonthPay() {
		return  (pay/(double)12)+(bonus/(double)12);
		
	}
	void display() {
		super.display();
		System.out.println("���ʽ� :" +bonus);
	}
}

class Contract extends Employee2{
	int hireyear;
	Contract(String empno,String name, int pay, int hireyear){
		this.empno=empno;
		this.name = name;
		this.pay=pay;
		this.hireyear=hireyear;
	}
	
	double getMonthPay() {
		
		return pay/(double)12 * hireyear;
	}
	void display() {
		super.display();
		System.out.println("���Ⱓ :" +hireyear);
	}
}

class PartTime extends Employee2{
	int workday;
	PartTime(String empno,String name, int pay,int workday ){
		this.empno=empno;
		this.name = name;
		this.pay=pay;
		this.workday=workday;
	}
	

	double getMonthPay() {
		
		return pay * workday;
	}
	void display() {
		super.display();
		System.out.println("�� �ٹ��� :" +workday);
	}
}

public class Ex_06_10_������ {

	public static void main(String[] args) {
		int i;
		
		FullTime f = new FullTime("F001","������",500,30);
		Contract c = new Contract("C001","��ȿ��",400,3);
		PartTime p = new PartTime("P001","����",300,7);
	
		f.display();
		System.out.println("���� :"+f.getMonthPay());
		c.display();
		System.out.println("���� :"+c.getMonthPay());
		p.display();
		System.out.println("���� :"+p.getMonthPay());
		
		Employee2 [] arr = {new FullTime("F001","������",500,30), 
				new Contract("C001","��ȿ��",400,3), 
				new PartTime("P001","����",300,7) };
		
		for(i=0;i<arr.length;i++) {			      
			action((arr[i]));
	                                     }
//System.out.println(getMonthPay());
	}
	static void action(Employee2 r) {
		if(r instanceof FullTime) {    //��ĳ����
			FullTime f = (FullTime)r; //�ٿ�ĳ����
			 f.display();
			 System.out.println("���� :"+f.getMonthPay());
		 }
		 else if(r instanceof Contract) {  //r�� SingRobot�� �ٷ�� �ִ°�? true�̸�
			 Contract c = (Contract)r;   //�ٿ�ĳ������ �����ϴ�
			 c.display();
			 System.out.println("���� :"+c.getMonthPay());
		 }
		 else if(r instanceof PartTime) {
			 PartTime p = (PartTime)r;
			 p.display();
			 System.out.println("���� :"+p.getMonthPay());
		 }
	}
}


//