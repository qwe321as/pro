class Pay{
	String name;
	int bonbong;
	int tax;
	int silsu;

	/*	���ݼ����Լ�(���� �ޱ�){
		������ 300���� �̻��̸� ������ 3%
		������ 200���� �̻��̸� ������ 2%
		������200���� ���ϸ� ������ 1% 
	}

	�Ǽ��ɾ� ���() {
		silsu = ����-����
	}
	������� 4�� ����ϴ� �޼���() {

	}*/

	double setTax(int x) {

		if(x>=3000000) {
			return x*0.03;
		}
		else if(x>=2000000) {
			return x*0.02;
		}
		else{
			return x*0.01;
		}	

	}

	int setSilsu(int x,int y) {
		return x-y;
	}

	void total(String name,int bonbong,int tax,int silsu){
		System.out.println("�̸�:"+ name);
		System.out.println("�޿�:"+ bonbong);
		System.out.println("����:"+ tax);
		System.out.println("�Ǽ��ɾ�:"+ silsu);
		System.out.println("--------");
	}

}
public class EX_05_06_������ {
	public static void main(String[] args) {


		Pay p1 = new Pay();
		p1.name="����";
		p1.bonbong=2000000;
		p1.tax=(int)p1.setTax(p1.bonbong);
		p1.silsu= p1.setSilsu(p1.bonbong,p1.tax);

		Pay p2 = new Pay();
		p2.name="�¿�";
		p2.bonbong=5000000;
		p2.tax=(int)p2.setTax(p2.bonbong);
		p2.silsu= p2.setSilsu(p2.bonbong,p2.tax);

		Pay p3 = new Pay();
		p3.name="����";
		p3.bonbong=1000000;
		p3.tax=(int)p3.setTax(p3.bonbong);
		p3.silsu= p3.setSilsu(p3.bonbong,p3.tax);

		p1.total(p1.name, p1.bonbong, p1.tax, p1.silsu);
		p2.total(p2.name, p2.bonbong, p2.tax, p2.silsu);
		p3.total(p3.name, p3.bonbong, p3.tax, p3.silsu);

	}

}
