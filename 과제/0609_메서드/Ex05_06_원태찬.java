class Pay{
	String name;
	int bonbong;
	int tex;
	int silsu;
	double settex(int x) {
		if(x>=3000000) {
			return x*0.03;
		}
		else if(x>=2000000) {
			return x*0.02;
		}
		else {
			return x*0.01;
		}
	}
	////		���ݼ����Լ�(){
	//		������ 300���� �̻��̸� ������ 3% 300�����̸� 90000��
	//		������ 200���� �̻��̸� ������ 2% 200�����̸� 40000��
	//		������ 200���� �����̸� ������ 1% 100�����̸� 10000��
	int setsilsu(int x,int y) {
		return x-y;
	}
	void output(String x,int y,int z,int k) {
		System.out.println(x); // name
		System.out.println(y); // bonbong
		System.out.println(z); // tex
		System.out.println(k); // silsu
		}
	}

	//	�Ǽ��ɾ� ���() {
	//		silsu=����-����

	//	������� 4�� ����ϴ� �޼���() {
	//		���⼭ ���
	//	}

public class Ex05_06_������ {

	public static void main(String[] args) {
		Pay p1=new Pay();
		p1.name="����";
		p1.bonbong=2000000;
		
		p1.tex=(int)p1.settex(p1.bonbong);
		p1.silsu=p1.setsilsu(p1.bonbong, p1.tex);
		p1.output(p1.name,p1.bonbong,p1.tex,p1.silsu);
		
	    Pay p2=new Pay();
		p2.name="�¿�";
		p2.bonbong=1000000;
		
		p2.tex=(int)p2.settex(p2.bonbong);
		p2.silsu=p2.setsilsu(p2.bonbong, p2.tex);
		p2.output(p2.name,p2.bonbong,p2.tex,p2.silsu);
		
		Pay p3=new Pay();
		p3.name="����";
		p3.bonbong=3000000;
		
		p3.tex=(int)p3.settex(p3.bonbong);
		p3.silsu=p3.setsilsu(p3.bonbong, p3.tex);
		p3.output(p3.name,p3.bonbong,p3.tex,p3.silsu);
	}

}
