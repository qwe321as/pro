class Pay{
	String name;
	int bonbong;
	int tex; // 0
	int silsu; // 0
	double setTex(int a) { 
		if(a>=3000000) {
			return a * 0.03;
		}
		else if(a>=2000000) {
			return a * 0.02;
		}
		else{
			return a * 0.01;
		}
		
	}
	
	int setSilsu(int a, int b) {
		return a-b;
	} 
	
	void member(String a, int b, int c, int d) {
		System.out.println("�̸�: " + a);
		System.out.println("����: " + b +"��");
		System.out.println("����: " + c +"��");
		System.out.println("�Ǽ���: "+ d +"��");
	}
	
	
}


public class Ex05_06_����� {

	public static void main(String[] args) {
		
//		�ѻ���� �޿��������� �̸�(name), ����(bonbong) , ����(tax), �Ǽ��ɾ�(silsu)
//		������ 300���� �̻��̸� ������ 3% : 300�����̸� 90000��
//		200���� �̻��̸� ������ 2% : 200�����̸� 40000��
//		200���� ���ϸ� ������ 1% : 100�����̸� 10000��
//		���ݼ����Լ�(���� �ޱ�)
//      �Ǽ��ɾ� ���(){ ���� - ���� }
//		������� 4�� ����ϴ� �޼���(){ 
		
		
		
		Pay	p1 = new Pay(); 
		p1.name = "����";
		p1.bonbong= 2000000;
		p1.tex = (int) p1.setTex(p1.bonbong);
		p1.silsu = p1.setSilsu(p1.bonbong, p1.tex);
		p1.member(p1.name, p1.bonbong, p1.tex, p1.silsu);
		System.out.println();
		
		
		Pay p2 = new Pay();
		p2.name = "�¿�";
		p2.bonbong = 1000000;
		p2.tex = (int) p2.setTex(p2.bonbong);
		p2.silsu = p2.setSilsu(p2.bonbong, p2.tex);
		p2.member(p2.name, p2.bonbong, p2.tex, p2.silsu);
		System.out.println();
		
		Pay p3 = new Pay();
		p3.name = "����";
		p3.bonbong = 3000000;
		p3.tex = (int)p3.setTex(p3.bonbong);
		p3.silsu = p3.setSilsu(p3.bonbong, p3.tex);
		p3.member(p3.name, p3.bonbong, p3.tex, p3.silsu);
		
		
		
	} // main

} // class
