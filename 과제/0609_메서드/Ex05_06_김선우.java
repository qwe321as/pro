import java.util.Scanner;

class pay{
	String name;
	int bonbong;
	int silsu;
	int tex,tex1=0;
//	세금 설정 함수() {분봉이 300만원 이상이면 세금은 3% 30000원
//	본봉이 200만원 이상이면 세금은 2%
//	본봉이 200만원 이하면 세금은 1% :100만원이면 10000원
//	}
//	실수령액 계산() {
//		silsu = 본봉-세금
//	}
//	
//	멤버변수 4개 출력하는 메서드() {
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
		System.out.println("본봉:"+y+"만원");
		System.out.println("세금:"+z+"%");
		System.out.println("실수령액:"+j+"만원");
	}
	
	
}//class
public class Ex05_06_김선우 {

	public static void main(String[] args) {
		
		pay p1 = new pay();
		p1.name = "루나";
		p1.bonbong = 100;
		p1.tex=(int)p1.tex1(p1.bonbong);
		p1.silsu = p1.silsu(p1.bonbong, p1.tex);
		p1.print(p1.name, p1.bonbong, p1.tex, p1.silsu);
		
		pay p2 = new pay();
		p2.name = "웬디";
		p2.bonbong = 200;
		p2.tex=(int)p2.tex1(p2.bonbong);
		p2.silsu = p2.silsu(p2.bonbong, p2.tex);
		p2.print(p2.name, p2.bonbong, p2.tex, p2.silsu);
		
		pay p3 = new pay();
		p3.name = "태연";
		p3.bonbong = 300;
		p3.tex=(int)p3.tex1(p3.bonbong);
		p3.silsu = p3.silsu(p3.bonbong, p3.tex);
		p3.print(p3.name, p3.bonbong, p3.tex, p3.silsu);
		
		
		
		
	}//main

}//class
