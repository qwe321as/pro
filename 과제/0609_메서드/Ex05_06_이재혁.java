class pay{
	String name;
	int bonbong;
	int tex;
	int silsu;

	double setTex(int a) {
		if (a >= 3000000)
			return a*3/100;
		else if (a >= 2000000)
			return a*2/100;
		else
			return a*1/100;
	}
	int setSilsu(int a,int b) {
		return a-b;
	}
	
	void prn() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+bonbong+"��");
		System.out.println("����:"+tex+"��");
		System.out.println("�Ǽ��ɾ�:"+silsu+"��");
	}
}
	//	���ݼ����Լ�(�����ޱ�){
	//		������ 300���� �̻��̿� ������ 3% : 300�����̸� 90000��
	//		������ 200���� �̻��̿� ������ 2% 
	//		������ 200���� �����̿� ������ 1% : 100�����̸� 10000��
	//	}
	

	//	�Ǽ��ɾ� ���() {
	//		silsu = ���� - ����
	//	}
	//	������� 4�� ����ϴ� �޼���() {
	//		
	//	}


public class Ex05_06_������ {

	public static void main(String[] args) {
pay p1 = new pay();
		p1.name = "�糪";
		p1.bonbong = 2000000;
		p1.tex = (int)p1.setTex(p1.bonbong);
		p1.silsu = (int)p1.setSilsu(p1.bonbong, p1.tex);
		p1.prn();
		

		pay p2 = new pay();
		p2.name = "�¿�";
		p2.bonbong = 1000000;
		p2.tex = (int)p2.setTex(p2.bonbong);
		p2.silsu = (int)p2.setSilsu(p2.bonbong, p2.tex);
		p2.prn();

		pay p3 = new pay();
		p3.name = "����";
		p3.bonbong = 3000000;
		p3.tex = (int)p3.setTex(p3.bonbong);
		p3.silsu = (int)p3.setSilsu(p3.bonbong, p3.tex);
		p3.prn();


	}
}