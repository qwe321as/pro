class Pay{
	String name;
	int bonbong;
	double tax;
	double silsu;

	/*
	 * //���� ���� �Լ�(){
	 *     ������ 300>=���� 3% :300�����̸� 90000��
	 *     ������ 200>=������ 2% 
	 *     ������ 100>=������ 1%}
	 *
	 *�Ǽ��ɾ� ���(){
	 *    silsu= bonbong-tax
	 *
	 *������� 4�� ����ϴ� �޼���(){
	 *}
	 */

	static double tax1(int x){
		return x/100*3;
	}
	static double sil1(int x) {
		return  x-(100*3);
	}



	

}
public class Ex05_06_���� {
	public static void main(String[] args) {

		Pay p1= new Pay();
		p1.name="����";
		p1.bonbong=1000000;
		p1.tax=p1.tax1(p1.bonbong);
		p1.silsu =p1.sil1(p1.bonbong);

		System.out.println("name:"+p1.name);
		System.out.println("bonbong:"+p1.bonbong);
		System.out.println("tax:"+p1.tax);
		System.out.println("silsu:"+p1.silsu);

		System.out.println("-------");

		Pay p2= new Pay();
		p2.name="�¹�";
		p2.bonbong=2000000;
		p2.tax = p2.tax1(p2.bonbong);
		p2.silsu =p2.sil1(p2.bonbong);

		System.out.println("name:"+p2.name);
		System.out.println("bonbong:"+p2.bonbong);
		System.out.println("tax:"+p2.tax);
		System.out.println("silsu:"+p2.silsu);

		System.out.println("-------");

		Pay p3= new Pay();
		p3.name="����";
		p3.bonbong=3000000;
		p3.tax = p3.tax1(p3.bonbong);
		p3.silsu =p3.sil1(p3.bonbong);

		System.out.println("name:"+p3.name);
		System.out.println("bonbong:"+p3.bonbong);
		System.out.println("tax:"+p3.tax);
		System.out.println("silsu:"+p3.silsu);

	}

}
