class Pay{
	String name;
	int bonbong;
	int tex;
	int silsu;
	
   int xy(int c) {	 
		if(c>=3000000) {
			return c*3/100;			 
		}
		else if(c>=2000000){
			return c*2/100;
		}
		else if(c<2000000){
			return c*1/100;
		}
		return c;


	}


	int ss(int a,int b){

		return a-b;
	}

	void total(String name,int bonbong,int tex,int silsu){
		System.out.println("String name:"+ name);
		System.out.println("int bonbong:"+ bonbong);
		System.out.println("int tex:"+ tex);
		System.out.println("int silsu:"+ silsu);
		System.out.println("--------");

	}

	/*
	 ���ݼ����Լ�(){
		 ������ 300���� �̻��̸� 3% ; 300���� �̹� 90000��
		      200���� �̻��̸� 2% ; 200���� �̸� 40000��
		      200���� �����̸� 1% ; 100���� �̸� 10000��

	 }

	 �Ǽ��ɾ� ���() {
		 silsu =  ���� - ����
	 }
	 */
	//	������� 4�� ����ϴ� �޼���() {



}


public class EX05_06_���� {
	public static void main(String[] args) {



		Pay p1 = new Pay();
		p1.name="����";
		p1.bonbong=1000000;
		p1.tex = p1.xy(p1.bonbong);
		p1.silsu =p1.ss(p1.bonbong,p1.tex);
		Pay p2 = new Pay();
		p2.name="ö��";
		p2.bonbong=2000000;		
		p2.tex = p2.xy(p2.bonbong);
		p2.silsu =p2.ss(p2.bonbong,p2.tex);
		Pay p3 = new Pay();
		p3.name="���";
		p3.bonbong=3000000;
		p3.tex = p3.xy(p3.bonbong);
		p3.silsu =p3.ss(p3.bonbong,p3.tex);

		p1.total(p1.name, p1.bonbong, p1.tex, p1.silsu);
		p2.total(p2.name, p2.bonbong, p2.tex, p2.silsu);
		p3.total(p3.name, p3.bonbong, p3.tex, p3.silsu);
	}
}
