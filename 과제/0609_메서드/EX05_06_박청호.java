class Pay{
	String name;
	int bonbong;
	int tax;
	int silsu;


	/*	
	void setTax(int x)	{


		if(x>3000000)	{
			tax = (int)(x * 0.03);	//(int)90000.0 =>90000
		}
		else if(x>2000000)	{
			tax = (int)(x * 0.03);
		}
		else {
			tax = (int)(x * 0.03);
		}
	}
	 */	
	void setTax() {


		if(bonbong>3000000)	{
			tax = (int)(bonbong * 0.03);	//(int)90000.0 =>90000
		}
		else if(bonbong>2000000)	{
			tax = (int)(bonbong * 0.03);
		}
		else {
			tax = (int)(bonbong * 0.03);
		}
		//return;
	}

	void setSilsu()	{
		silsu = bonbong - tax;
	}





	void display() {	//����
		System.out.println("�̸�: " + name);
		System.out.println("����: " + bonbong);
		System.out.println("����: " + tax);
		System.out.println("�Ǽ���: "+ silsu);
		System.out.println();
	}

	/*
	 ���ݼ����Լ�(�����ޱ�){
	 ������ 300���� �̻��̸� ������ 3% : 300�����̸� 90000��
	 ������ 200���� �̻��̸� ������ 2%
	 ������ 200���� ���ϸ� ������ 1% : 100�����̸� 10000��
	�Ǽ��ɾ� ���()	{
		silsu = ���� - ����

	������� 4�� ����ϴ� �޼���	{

	}


	 */


}

public class EX05_06_��ûȣ {

	public static void main(String[] args) {

		Pay	p1 = new Pay(); 	//��ü ����
		p1.name = "����";
		p1.bonbong= 1000000;
		//p1.setTax = (int) p1.setTax(p1.bonbong);	//ȣ��
		p1.setTax();
		p1.setSilsu();

		System.out.println();


		Pay p2 = new Pay();
		p2.name = "�¿�";
		p2.bonbong = 2000000;
		p2.setTax();
		//p2.settax = (int) p2.settax(p2.bonbong);
		p1.setSilsu();

		System.out.println();

		Pay p3 = new Pay();
		p3.name = "����";
		p3.bonbong = 3000000;
		p3.setTax();
		//p3.settax = (int)p3.settax(p3.bonbong);
		p1.setSilsu(); 
		
		p1.display();
		p2.display();
		p3.display();
	}

}
