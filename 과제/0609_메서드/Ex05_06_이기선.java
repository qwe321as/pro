class Pay {
	String name  ;
	int bonbong ;
	int tex ;
	int silsu ;
	
	int setTex(int sal) {
		int res=0;
		if(sal > 300) {
			res = (int)((double)sal * 0.03);
		}
		else if (sal <= 300 && sal > 200) {
			res = (int)((double)sal * 0.02);
			
		}
		else {
			res = (int)((double)sal * 0.01);			
		}
		return res;
	}
	
	int calSilsu(int bon, int tex) {
		int res =0 ;
		
		res = bon - tex ;
		return res;
	}
	
//	Member variable print out : 4
	void prn1(String name,int bonbong, int tex, int silsu) {
		System.out.printf("\nName : %s \nBonbong : %d\nTex   : %d\nSilsu : %d\n",name,bonbong,tex,silsu);
	}
}

public class Ex05_06_�̱⼱ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pay p1 = new Pay();
		String[] strname = new String[5];
		int[] bonbong = new int[5];
		
		strname[0] = "Lee00";
		strname[1] = "Lee01";
		strname[2] = "Lee02";
		strname[3] = "Lee03";
		strname[4] = "Lee04";
		bonbong[0] = 500 ;
		bonbong[1] = 400 ;
		bonbong[2] = 300 ;
		bonbong[3] = 200 ;
		bonbong[4] = 150 ;
		
		for(int i= 0 ; i < 5; i++) {
			p1.name = strname[i];
			p1.bonbong = bonbong[i] ;
			p1.tex = p1.setTex(p1.bonbong);
			p1.silsu = p1.calSilsu(p1.bonbong, p1.tex);
			p1.prn1(p1.name, p1.bonbong, p1.tex, p1.silsu);
		}
		

		
		Pay[] p2 = new Pay[5];
		
		for(int i =0 ; i<5; i++) {
			p2[i]= new Pay();
		}
		
		
		p2[0].name="Kim00";
		p2[1].name="Kim01";
		p2[2].name="Kim02";
		p2[3].name="Kim03";
		p2[4].name="Kim04";
		
		p2[0].bonbong = 500 ;
		p2[1].bonbong = 400 ;
		p2[2].bonbong = 200 ;
		p2[3].bonbong = 100 ;
		p2[4].bonbong = 50 ;
		
		for(int i1 = 0 ; i1 < 5 ; i1++) {
			p2[i1].tex = p2[i1].setTex(p2[i1].bonbong);
			p2[i1].silsu = p2[i1].calSilsu(p2[i1].bonbong , p2[i1].tex) ;
			p2[i1].prn1(p2[i1].name, p2[i1].bonbong, p2[i1].tex,p2[i1].silsu);
		}
		
		
		
		
		
	}

}
