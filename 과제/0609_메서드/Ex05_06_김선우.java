import java.util.Scanner;

class pay{
	String name;
	int bonbong;
	int silsu;
	int tex,tex1=0;
//	���� ���� �Լ�() {�к��� 300���� �̻��̸� ������ 3% 30000��
//	������ 200���� �̻��̸� ������ 2%
//	������ 200���� ���ϸ� ������ 1% :100�����̸� 10000��
//	}
//	�Ǽ��ɾ� ���() {
//		silsu = ����-����
//	}
//	
//	������� 4�� ����ϴ� �޼���() {
//		
//	}
	
	double tex1 (int x) {
		if(x>=300) {
			return x*0.03;
		}
		else if (x>=200) {
			return x*0.02;
		}
		else if (x>=100) {
			return x*0.01;
		}
		return (int) tex;
	}
	
	int silsu (int x, int y) {
		return x-y;
	}
	
	void print (String x, int y, int z, int j) {
		System.out.println(x);
		System.out.println("����:"+y+"����");
		System.out.println("����:"+z+"%");
		System.out.println("�Ǽ��ɾ�:"+j+"����");
	}
	
	
}//class
public class Ex05_06_�輱�� {

	public static void main(String[] args) {
		
		pay p1 = new pay();
		p1.name = "�糪";
		p1.bonbong = 100;
		p1.tex=(int)p1.tex1(p1.bonbong);
		p1.silsu = p1.silsu(p1.bonbong, p1.tex);
		p1.print(p1.name, p1.bonbong, p1.tex, p1.silsu);
		
		pay p2 = new pay();
		p2.name = "����";
		p2.bonbong = 200;
		p2.tex=(int)p2.tex1(p2.bonbong);
		p2.silsu = p2.silsu(p2.bonbong, p2.tex);
		p2.print(p2.name, p2.bonbong, p2.tex, p2.silsu);
		
		pay p3 = new pay();
		p3.name = "�¿�";
		p3.bonbong = 300;
		p3.tex=(int)p3.tex1(p3.bonbong);
		p3.silsu = p3.silsu(p3.bonbong, p3.tex);
		p3.print(p3.name, p3.bonbong, p3.tex, p3.silsu);
		
		
		
		
	}//main

}//class
