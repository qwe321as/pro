class Pay{
	String name;
	int bonbong;
	int tax;
	int silsu;

//	���ݰ�� �޼���
//		������ 300���� �̻��̸� ������ 3%
//		������ 200���� �̻��̸� ������ 2%
//		������ 100���� �̻��̸� ������ 1%
//	            ������ 100���� ���ϸ� ������ ����
	void tax() {
		if(bonbong>=3000000) {
			tax=bonbong*3/100;
		} else if(bonbong>=2000000) {
			tax=bonbong*2/100;
		} else if(bonbong>=1000000) {
			tax=bonbong*1/100;
		}
	}

	// �Ǽ��ɾ� ��� �޼���
	void silsu() {
		silsu=bonbong - tax;
	}

	// ������� 4�� ����ϴ� �޼���
	void prn() {
		tax();
		silsu();
		System.out.println("��     ��:"+name);
		System.out.println("��     ��:"+bonbong);
		System.out.println("��     ��:"+tax);
		System.out.println("�Ǽ��ɾ�:"+silsu);
	}
}

public class Ex05_06_��뼮 {
	public static void main(String[] args) {
		
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		Pay p4 = new Pay();
		
		p1.name="����";
		p1.bonbong=1000000;
		p2.name="�浿";
		p2.bonbong=2000000;
		p3.name="����";
		p3.bonbong=3000000;
		p4.name="�¿�";
		p4.bonbong=900000;
		
		p1.prn();
		p2.prn();
		p3.prn();
		p4.prn();
	}

}
