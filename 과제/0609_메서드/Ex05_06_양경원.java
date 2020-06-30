	

	class Pay{
		static String name;
		int rd1,rd2,rd3;//세금//실수령액/본봉
		
		//세금계산
		int rd1(int a, int b) {
			if(a > b) {
				return (int)(a*0.03);
				
			}
			else if(a != b){
				return (int)(a*0.02);
			}
			else if(a >= b) {
				return (int)(a*0.01);
			}
			return 0;
		}
//			
//			if(a > b) {//300>100
//				return (int)(a*0.03);
//			}
//			if(a < b){//200!=300
//				return (int)(a*0.02);
//			}
//			if(a >= b) {//100>=100
//				return (int)(a*0.01);
//			}
//			return 0;
//			
//			for(int i=0; i<4;i++) {
//				if(a > b) {
//					return (int)(a*0.03);
//				}
//				if(a < b) {
//					
//					return (int)(a*0.02);
//				}
//				if(a != b) {
//					return 0;
//				}
//			}
//			return (int)(a*0.01);
//		}
//		
		//실수령액 계산
		static int rd2(int a, int b){
			
			return a-b;
		}
		//멤버변수 4개 출력하는 메소드
		static void rd3() {
			System.out.println(Pay.name);
		}

	}	

public class Ex05_06_양경원 {
	
	
	public static void main(String[] args) {
		
		Pay P1 = new Pay();
		Pay P2 = new Pay();
		Pay P3 = new Pay();
		
		P1.rd1 = 3000000;
		int sum = P1.rd1(P1.rd1, P3.rd1);
		P1.rd2 = sum;
		P1.rd3 = Pay.rd2(P1.rd1,P1.rd2);
		
		P2.rd1 = 2000000;
		int sum1 = P2.rd1(P2.rd1, P1.rd1);
		P2.rd2 = sum1;
		P2.rd3 = Pay.rd2(P2.rd1,P2.rd2);
		
		
		P3.rd1 = 1000000;
		int sum2 = P3.rd1(P3.rd1, P3.rd1);
		P3.rd2 = sum2;
		P3.rd3 = Pay.rd2(P3.rd1,P3.rd2);
		
		Pay.name = "누가바";
		P1.rd3();
		System.out.println("월급 : "+P1.rd1);
		System.out.println("세금 : "+sum);
		System.out.println("실수령액 : "+P1.rd3);
		System.out.println("---------------");
		
		Pay.name = "죠스바";
		P1.rd3();
		System.out.println("월급 : "+P2.rd1);
		System.out.println("세금 : "+sum1);
		System.out.println("실수령액 : "+P2.rd3);
		System.out.println("---------------");
		
		
		Pay.name = "수박바";
		P1.rd3();
		System.out.println("월급 : "+P3.rd1);
		System.out.println("세금 : "+sum2);
		System.out.println("실수령액 : "+P3.rd3);
		System.out.println("---------------");
		
	}

	


}
