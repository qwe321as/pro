class Pay{
	String name;
	int bonbong;
	int tax;//10000��
	int silsu;//99����


	/*���ݼ����Լ�(){
		������ 300���� �̻��̸� ������ 3%:300�����̸�  9����
		������ 200���� �̻��̸� ������ 2%:4����
		������ 200���� ���ϸ� ������ 1%:100�����̸� ����

	}
	�Ǽ��ɾ� ���() {
		silsu=����-����
	}
	������� 4�� ����ϴ� �޼���() {

	}
	 */
	int sub(int a,int b) {
		return a-b;

	}

	static int tax(int a,int b) {
		int tax=a/b;
		return tax;
	}
}
public class Ex05_06_������ {

	public static void main(String[] args) {








		Pay p1=new Pay();
		Pay p2=new Pay();
		Pay p3=new Pay();


		p1.name="����";
		p1.bonbong=3000000;
		System.out.println(p1.name);
		System.out.println(p1.bonbong);

		int subResult=p1.sub(3000000,9);
		System.out.println("silsu="+subResult);


		p2.name="�¿�";
		p2.bonbong=2000000;
		System.out.println(p2.name);
		System.out.println(p2.bonbong);

		int subResult2=p2.sub(2000000,4);
		System.out.println("silsu="+subResult2);

		p3.name="����";
		p3.bonbong=1000000;
		System.out.println(p3.name);
		System.out.println(p3.bonbong);

		int subResult3=p3.sub(1000000,1);
		System.out.println("silsu="+subResult3);


	
	
	
	
	
	
	
	
	
	
	}
}



