class Pay{
	String name;
	int bonbong;
	int tax;
	int silsu;
	
	//���� ���
	double setTax(int x) {
		if(x >= 3000000) {
			return x * 0.03;
		}
		else if(x >= 2000000) {
			return x * 0.02;
		}
		else return x * 0.01;
	}
	
	int setSilsu(int x,int y) {
		return x - y;
	}
	
	//��� ���� ��� 
	void memberPrint(String x, int y, int z, int k) {
		System.out.println("�̸� : " + x);
		System.out.println("�޿� : " + y + "��");
		System.out.println("tax : " + z + "��");
		System.out.println("�Ǳ޿� : " + k +"��");
		pr1();
	}
	
	void pr1() {
		System.out.println("**********************************");
		
	}
}

public class Ex05_06_�蹮�� {
	public static void main(String[] args) {
		
		Pay p1 = new Pay();
		p1.name = "�蹮��";
		p1.bonbong = 2000000;
		
		Pay p2 = new Pay();
		p2.name = "������";
		p2.bonbong = 4000000;
		
		Pay p3 = new Pay();
		p3.name = "������";
		p3.bonbong = 1000000;
		
		
		p1.tax = (int)p1.setTax(p1.bonbong);
		p1.silsu = p1.setSilsu(p1.bonbong, p1.tax);
		
		p2.tax = (int)p2.setTax(p2.bonbong);
		p2.silsu = p2.setSilsu(p2.bonbong, p2.tax);
		
		p3.tax = (int)p3.setTax(p3.bonbong);
		p3.silsu = p3.setSilsu(p3.bonbong, p3.tax);
		
		
		//�蹮�� �޿�
		p1.memberPrint(p1.name, p1.bonbong, p1.tax, p1.silsu);
		System.out.println();
		//������ �޿�
		p2.memberPrint(p2.name, p2.bonbong, p2.tax, p2.silsu);
		System.out.println();
		//������ �޿�
		p3.memberPrint(p3.name, p3.bonbong, p3.tax, p3.silsu);
		System.out.println();
		
	}
}
