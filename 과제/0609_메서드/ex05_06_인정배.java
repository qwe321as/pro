class Pay {
	String name;
	int bonbong;
	int tax;
	int silsu;
	/* ������ �����ϴ� �Լ� */

	int a = 0;

	void taxt() {
		if (bonbong >= 3000000) {
			tax = bonbong * 3 / 100;

		} else if (bonbong >= 2000000) {
			tax = bonbong * 2 / 100;

		} else if (bonbong > 1000000) {
			tax = bonbong * 1 / 100;
		}

	}
	// �������ɾ�

	void sil() {
		silsu = bonbong - tax;

	}

	void dsa1() {

		System.out.println("�̸�=" + name);
		System.out.println("����=" + bonbong);
		System.out.println("����=" + tax);
		System.out.println("������=" + silsu);
	}
}

public class ex05_06_������ {

	public static void main(String[] args) {
		Pay sd = new Pay();

		sd.name = "����";
		sd.bonbong = 2000000;
		sd.taxt();
		sd.sil();
		sd.dsa1();
	}// main

}// ex 05-06Ŭ����
/*
 * class Preay{ String name; int bonbong; int tax; int silsu; ������ �����ϴ� �Լ�
 * 
 * int a=0;
 * 
 * static int taxt( int c){ if(c>=3000000) { return c*3/100;
 * 
 * }else if(c>=2000000) { return c/50;
 * 
 * }else if(c>1000000) { return c/100;
 * 
 * } return c; } // �������ɾ�
 * 
 * int sil(int c,int s){ return c-s ;
 * 
 * }
 * 
 * 
 * 
 * void dsa1() { Preay sad=new Preay(); sad.name = "����"; sad.bonbong =2000000;
 * // TODO Auto-generated method stub int resultd = sad.taxt(sad.bonbong); int
 * faxd = sad.sil(sad.bonbong,resultd); String sadf = sad.name;
 * 
 * int asdfd = sad.bonbong; asdfasdf d=new asdfasdf();
 * System.out.println("�̸�="+sadf); System.out.println("����="+asdfd);
 * System.out.println("����="+resultd); System.out.println("������="+faxd);
 * 
 * }
 * 
 * 
 * } public class asdfasdf { public static void main(String[]args) { Preay sd
 * =new Preay();
 * 
 * sd.name = "����"; sd.bonbong = 2000000; int resultq = sd.taxt(sd.bonbong); int
 * faxd = sd.sil(sd.bonbong,resultq); String sadf = sd.name;
 * 
 * int asdfd = sd.bonbong;
 * 
 * // c.mul
 * 
 * System.out.println(sadf); System.out.println(asdfd);
 * System.out.println(resultq); System.out.println(faxd); System.out.println();
 * Preay rvt = new Preay(); rvt.dsa1(); }
 * 
 * 
 * }
 */
//���� ������ �ᱹ�� �سµ�
