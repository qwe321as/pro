class Pay{
	String name;
	int bong;
	int tax;
	int silsu;
	
	
	//���ݼ��� �޼���
	int taxset(int x) {
		if(x>=3000000) {
			tax=(int)(x*0.03);
		}
		else if(x>=2000000) {
			tax=(int)(x*0.02);
		}
		else {
			tax=(int)(x*0.01);
		}
		return tax;
	}
	
	//�Ǽ��ɾ� �޼���
	int silsuset(int x, int y) {
		silsu= x-y;    //x:bong , y:tax
		return silsu;
	}
	
	
	//������� 4�� ����ϴ� �޼���
	void print(String a, int b, int c, int d) {
		System.out.println("�̸�: "+ a );
		System.out.println("����: "+ b );
		System.out.println("����: "+ c);
		System.out.println("�Ǽ��ɾ�: "+ d);
	}
	
	
	
	
	
}//class

public class Ex05_06_�̼��� {

	public static void main(String[] args) {

		Pay p1 =new Pay();  //��ü����(��������)
		p1.name ="����";
		p1.bong =2000000;
		
		Pay p2 =new Pay();
		p2.name ="�¿�";
		p2.bong =1000000;
		
		Pay p3 =new Pay();
		p3.name ="����";
		p3.bong =3000000;
		
		int t1= p1.taxset(p1.bong);
		int t2= p2.taxset(p2.bong);
		int t3= p3.taxset(p3.bong);
		
		int s1= p1.silsuset(p1.bong, t1);
		int s2= p2.silsuset(p2.bong, t2);
		int s3= p3.silsuset(p3.bong, t3);
		
		p1.print(p1.name, p1.bong , t1 , s1);
		System.out.println("---------------");
		p2.print(p2.name, p2.bong , t2 , s2);
		System.out.println("---------------");
		p3.print(p3.name, p3.bong , t3 , s3);		
		
		
	}//main

}//class
