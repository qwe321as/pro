class Pay{
	String name;
	int bonbong;
	int tex; // ���� ����ϴ� �޼���
	int silsu; // ���� �� �� ���ɾ�
	
	//���ݼ����Լ�(){
	//				������ 300���� �̻��̸� ������ 3%
	//				������ 200���� �̻��̸� ������ 2%
	//				������ 200���� ���ϸ� ������ 1%
	//}
	// �Ǽ��ɾ� ���(){
	// silsu = ����-����
	// }
	// ������� 4�� ����ϴ� �޼���(){
	//}
	
	static int texsum(int a) {
		double pays;
		if(a>=3000000) 
		{
			 pays = a*0.03;
			 
			 
		}
		else if(a>=2000000) {
			 pays = a*0.02;
			 
		}
		else {
			 pays = a*0.01;
			 
		}
		
		
		int texresult = (int)pays;
		return texresult;
	}
	int sils(int bonbong,int tax){
		
		return bonbong-tax;
	}
	void sess(String name,int bonbong,int tex,int silsu){
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+bonbong);
		System.out.println("����: "+tex);
		System.out.println("�Ǽ��ɾ�: "+silsu);
		System.out.println();
		
		
	}
	
	
}
public class Ex05_06_�ڱ��� {

	public static void main(String[] args) {
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		
		p1.name = "����";
		p1.bonbong = 3000000;
		p2.name = "�¿�";
		p2.bonbong = 2000000;
		p3.name = "����";
		p3.bonbong = 1000000;
		
		
		p1.tex = Pay.texsum(p1.bonbong);
		p2.tex = Pay.texsum(p2.bonbong);
		p3.tex = Pay.texsum(p3.bonbong);
		p1.silsu = p1.sils(p1.bonbong,p1.tex);
		p2.silsu = p2.sils(p2.bonbong,p2.tex);
		p3.silsu = p3.sils(p3.bonbong,p3.tex);
		
		
		
		p1.sess(p1.name,p1.bonbong,p1.tex,p1.silsu);
		p2.sess(p2.name,p2.bonbong,p2.tex,p2.silsu);
		p3.sess(p3.name,p3.bonbong,p3.tex,p3.silsu);
		
		
		
		
		
		
		
	}

}
