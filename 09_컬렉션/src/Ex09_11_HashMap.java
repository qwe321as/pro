import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex09_11_HashMap {
	public static void main(String[] args) {

		Map<String,String> dic = new HashMap<String,String>();
		
		dic.put("pencil", "연필");
		dic.put("sky", "하늘");
		dic.put("desk", "책상");
		dic.put("face", "얼굴");
		
		System.out.println("dic:"+dic);
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("찾는 단어는?(q입력시 종료) ");
			String word =sc.next();
			
			if(word.equals("q")) {
				break;
			}
			
			if(dic.get(word) == null) {
//			if(dic.containsKey(word)==false)
				System.out.println("잘못 입력하셨음");
			}
			else {
				System.out.println("뜻:" + dic.get(word));
			}
			
			
		}while(true);
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}

//찾는 단어는?(q입력시 종료) sky
//뜻 : 하늘
//
//찾는 단어는?(q입력시 종료) desk
//뜻 : 책상
//
//찾는 단어는?(q입력시 종료) hand
//잘못입력하셨음
//
//찾는 단어는?(q입력시 종료) q
//프로그램을 종료합니다.
