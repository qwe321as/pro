
public class ex03_08_������ {
	public static void main(String[]args) {
		int a,b;
		for(a=1;a<=5;a++) {
			for(b=1;b<=a;b++) {
				System.out.print("*");	
			}
			
			System.out.print("\n");	
		}
		System.out.println("���� ���� a=1�϶� a�� 5���ɶ� ���� 1��  a�����Ѵ�  ��for����"
				+ "\n b=1�׸��� b=a�� �ɶ����� 1�� ���϶�"+
				"\n�� ����� ������ ���� a�� 5�� �����Ҷ����� b�� a�� �������� ����Ѵ�"+
				"\n���⼭ a�� 5�������Ҷ����� �ڽ��� �ʱⰪ1���� ���ǿ��ٴٸ������� ���� ����Ұ��̴�");

		for(a=5;a>=1;a--) {
			for(b=1;b<=a;b++) {
				System.out.print("*");	
			}
			System.out.print("\n");	
			
		}
		System.out.println("���� ���� �� �����ϸ� ����ϴ� ����� �ݴ�� �� a�� 1���� 5�� ���� "
				+"\na=1;a<=5;a++�̰��� �ƴ�  ");




	}

}
