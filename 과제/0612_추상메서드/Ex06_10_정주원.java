abstract class Employee2{
	String empno;
	String name;
	int pay;
	
//	Employee2(String empno,String name,int pay){
//		this.empno=empno;
//		this.name=name;
//		this.pay=pay;
//	}
	void info() {
		System.out.println("���:"+empno+","+"�̸�:"+name+","+"����"+pay);
	}
	
	Employee2(){
		//System.out.println("����:"+getMonthPay);
	}
	
	//abstract void a();
	abstract void getMonthPay();
}
class FullTime extends Employee2{
	int bonus;
	FullTime(){
		
	}
	void info() {
		super.info();
		System.out.println("���ʽ�:"+bonus);
	}
	void getMonthPay() {
		System.out.println((pay/(double)12) + (bonus/(double)12));
	}
}
class Contract extends Employee2{
	int hireYear;
	void info() {
		super.info();
		System.out.println("���Ⱓ:"+hireYear);
	}
	void getMonthPay(){
		System.out.println(pay/(double)12 * hireYear);
	}
}
class PartTime extends Employee2{
	int workDay;
	PartTime(){
	}
	void info() {
		super.info();
		System.out.println("�� �ٹ���:"+workDay);
	}
	void getMonthPay() {
		System.out.println(pay*workDay);
	}
}
public class Ex06_10_���ֿ� {

	public static void main(String[] args) {

//		FullTime f= new FullTime("F001","������",500,30);
//		Contract c= new Contract("C001","��ȿ��",400,3);
//		PartTime p= new PartTime("P001","����",300,7);
		
		Employee2 f= new FullTime("F001","������",500,30);
		Employee2 c= new Contract("C001","��ȿ��",400,3);
		Employee2 p= new PartTime("P001","����",300,7);
		
		
		Employee2[]arr= {new FullTime("F001","������",500,30),
						new Contract("C001","��ȿ��",400,3),
						new PartTime("P001","����",300,7)};
		
		int i;
		for(i=0;i<arr.length;i++) {
			arr[i].info();
		}
		f.info();
		c.info();
		p.info();
		
//		4�� ������ ����ϴ� �޼���
//		�� 3���� ��ü�� �迭�� ���� �غ���
//		
//		4���� ������ ����ϴ� �޼��� �����
//		System.out.println(getMonthPay());
//		
//		P001,����,300,7
//		2100.0
//
//		C001,��ȿ��,400,3
//		100.0
//
//		F001,������,500,30
//		44.166666666666664
	
		
		//�����: pay/(double)12 * hireYear
	}

}