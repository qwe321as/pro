class Pay{
	String name;
	int bonbong; //200����/100/300
	int tax; 
	int silsu;
	int sub(int a,int b) {
		return a-b;
	}
}
	/*���ݼ��� �Լ�(���� �ޱ�){ => tax
		������ 300���� �̻��̸� ������ 3%:9����
		������ 200���� �̻��̸� ������ 2% 4
		������ 200���� �����̸� ������ 1%:10000��
	}
	�� ���ɾ� ���() {
		silsu = ����-����
	}

	������� 4�� ����ϴ� �޼���(){

	}
	 */


public class Ex05_06_���ֿ� {

	public static void main(String[] args) {

		Pay p1= new Pay();
		//int sumResult=Pay.sum(num1 , num2);

		Pay p2= new Pay();


		Pay p3= new Pay();


		p1.name="����";
		p1.bonbong=3000000;

		System.out.println(p1.name);
		System.out.println(p1.bonbong);
		
		int tax1= 90000;
		System.out.printf("tax:"+tax1);

		System.out.println();
		p2.name="�¿�";
		p2.bonbong=2000000;
		int tax2= 40000;
		System.out.printf("tax:"+tax2);

		System.out.println(p2.name);
		System.out.println(p2.bonbong);

		p3.name="����";
		p3.bonbong=1000000;

		System.out.println(p3.name);
		System.out.println(p3.bonbong);
		
		int tax3= 10000;
		System.out.printf("tax:"+tax3);



		int silsu=c.sub(p3.bonbong, tax1);
		System.out.println("silsu:"+silsu);








	
	
	}
}
















