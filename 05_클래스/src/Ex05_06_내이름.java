class Pay{
	String name;
	int bonbong;
	int tax; 
	int silsu;
/*	
	void setTax(int x){ // ����
		if(x>=3000000) {
			tax = (int)(x * 0.03); // (int)90000.0=>90000
		}
		else if(x>=2000000) {
			tax = (int)(x * 0.02);
		}
		else {
			tax = (int)(x * 0.01);
		}
	}
*/
	void setTax() {
		if(bonbong>=3000000) {
			tax = (int)(bonbong * 0.03); // (int)90000.0=>90000
		}
		else if(bonbong>=2000000) {
			tax = (int)(bonbong * 0.02);
		}
		else {
			tax = (int)(bonbong * 0.01);
		}
		//return;
	}
	
	
	void setSilsu() {
		silsu = bonbong - tax;
	}

	void display() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+bonbong);
		System.out.println("����:"+tax);
		System.out.println("�Ǽ��ɾ�:"+silsu);
		System.out.println();
	}
	
}

public class Ex05_06_���̸� {
	public static void main(String[] args) {

		Pay p1 = new Pay(); // ��ü���� 
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		
		p1.name="����";
		p1.bonbong=1000000;
		//p1.setTax(p1.bonbong); // ȣ��
		p1.setTax();
		p1.setSilsu();
		
		
		p2.name="�¿�";
		p2.bonbong=2000000;
		//p2.setTax(p2.bonbong);
		p2.setTax();
		p2.setSilsu();
		
		p3.name="����";
		p3.bonbong=3000000;
		//p3.setTax(p3.bonbong);
		p3.setTax();
		p3.setSilsu();
		
		p1.display();
		p2.display();
		p3.display();
	}

}





