class Pay {
	String name;
	int bonbong;
	int tex; // 1����
	int silsu;

	// setTex(�����ޱ�)
	/*
	 * ������ 300���� �̻��̸� ������ 3% 300�����̸� 90000�� ������ 200���� �̻��̸� ������ 2% ������ 100���� �����̸� ������
	 * 1% 100���� ���� ����
	 */
	int setTex(int bonbong) {
		if (bonbong >= 3000000) {
			tex = (int) (bonbong * 0.03);

		} else if (bonbong >= 2000000) {
			tex = (int) (bonbong * 0.02);
		} else {
			tex = (int) (bonbong * 0.01);
		}
		return tex;

	}

	// �Ǽ��ɾ� ���(����, ����) {
//	silsu = ���� -����
	int silsuSet(int bonbong, int tex) {
		silsu = bonbong - tex;
		return silsu;
	}

	// ������� 4�� ����ϴ� �޼���() {
	void info(){
		System.out.printf("�̸�=%s\n", name);
		System.out.printf("����=%d\n",bonbong);
		System.out.printf("����=%d\n",tex);
		System.out.printf("�Ǽ���=%d\n",silsu);
		System.out.println();
	}


	
	
	
}

public class Ex05_06_�濬�� {
	public static void main(String[] args) {
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();

		p1.name = "����";
		p1.bonbong = 4000000;
		
		p2.name = "�ξ�";
		p2.bonbong = 2000000;
		
		p3.name = "����";
		p3.bonbong = 1000000;
		
		p1.setTex(p1.bonbong);
		p1.silsuSet(p1.bonbong, p1.tex);
		
		p2.setTex(p2.bonbong);
		p2.silsuSet(p2.bonbong, p2.tex);
		
		p3.setTex(p1.bonbong);
		p3.silsuSet(p3.bonbong, p3.tex);
		
		p1.info();
		p2.info();
		p3.info();
	}
}