class Pay{
	String name;
	int bonbong;
	int tex;
	int silsu;
	int set_silsu(int a,int b) {
		 return a-b;
	 }
	double set_tex(int a)  {
		if (a>=3000000) {
		return a*0.03;
}
		else if (a>=2000000) {
			return a*0.02;
}
		else if (a>=1000000){
			return a*0.01;
			}
		else{
			return 0;
			}
}
	void print() {
		System.out.println("�̸�: " + name);
		System.out.println("�޿�: " + bonbong);
		System.out.println("����: " + tex);
		System.out.println("���ɾ�: " + silsu);

	}

}

//	���ݼ����Լ�(�����ޱ�) 
//	���� 300���� �̻� ���� 3%
//	���� 200���� �̻� ���� 2%
//	���� 100���� �̻� ���� 1%
//	�Ǽ��ɾװ��
//	silsu=���� -����


public class Ex_05_06_�̿��� {

	public static void main(String[] args) {
		Pay p1 = new Pay();	
		Pay p2 = new Pay();	
		Pay p3 = new Pay();	

		p1.name = "�ϴ�";
		p1.bonbong = 2000000;
		p2.name = "��";
		p2.bonbong = 1000000;
		p3.name = "��";
		p3.bonbong = 5000000;

		p1.tex = (int)p1.set_tex(p1.bonbong);
		p1.silsu = p1.set_silsu(p1.bonbong, p1.tex);
		p1.print();
		p2.tex = (int)p2.set_tex(p2.bonbong);
		p2.silsu = p2.set_silsu(p2.bonbong, p2.tex);
		p2.print();
		p3.tex = (int)p3.set_tex(p3.bonbong);
		p3.silsu = p3.set_silsu(p3.bonbong, p3.tex);
		p3.print();
	
		}

}
