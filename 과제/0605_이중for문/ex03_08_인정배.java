
public class ex03_08_인정배 {
	public static void main(String[]args) {
		int a,b;
		for(a=1;a<=5;a++) {
			for(b=1;b<=a;b++) {
				System.out.print("*");	
			}
			
			System.out.print("\n");	
		}
		System.out.println("오늘 배운것 a=1일때 a가 5가될때 까지 1을  a에더한다  이for문에"
				+ "\n b=1그리고 b=a가 될때까지 1을 합하라"+
				"\n즉 결과에 나오는 답은 a가 5에 도달할때까지 b는 a와 같은값을 출력한다"+
				"\n여기서 a는 5에도달할때까지 자신의 초기값1부터 조건에다다를때까지 식을 계속할것이다");

		for(a=5;a>=1;a--) {
			for(b=1;b<=a;b++) {
				System.out.print("*");	
			}
			System.out.print("\n");	
			
		}
		System.out.println("오늘 과제 를 정리하면 출력하는 방식을 반대로 즉 a가 1에서 5로 가는 "
				+"\na=1;a<=5;a++이것이 아닌  ");




	}

}
