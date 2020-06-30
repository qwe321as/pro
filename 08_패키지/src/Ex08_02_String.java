import java.util.Scanner;

public class Ex08_02_String {
	public static void main(String[] args) {
		
		int a=1,b=2;
		System.out.println(a==b);
		
		String str1  = new String("Have a nice day");
		String str2  = new String("Have A nice day");
		
//		String str1  = "Have a nice day";
//		String str2  = "Have a nice day";
		
		System.out.println("str1:"+str1);
		System.out.println("str1의 길이:"+str1.length());
		System.out.println(str1.equals(str2));
		if( str1.equals(str2) ) {
			System.out.println("str1과 str2문자열 같음");
		}
		else {
			System.out.println("str1과 str2문자열 같지 않음");
		}
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1 == str2);
		System.out.println(str1.compareTo(str2));
		System.out.println();
		
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
		System.out.println();
		
		System.out.println(str1.indexOf("nice"));
		System.out.println(str1.indexOf("happy"));
		System.out.println(str1.lastIndexOf("a"));
		System.out.println(str1.contains("nice")); // 
		System.out.println(str1.contains("happy"));
		System.out.println();
		
		System.out.println(str1.charAt(3));
		char c = str1.charAt(3);
		System.out.println("c:"+c);
		System.out.println();
		
		System.out.println(str1.substring(7, 9)); 
		System.out.println(str1.substring(7)); 
		
		
		System.out.println(str1.replace("a","x"));
		System.out.println("str1:"+str1);
		System.out.println();
		
		
		String s = "  abc D1$E   Fg     ";
		System.out.println("s:"+s);
		System.out.println(s.trim());
		s = s.trim();
		System.out.println("s:"+s);
		System.out.println();
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println();
		
		String fullName = "Hello.java";
		String fileName; // Hello
		String ext; // java
		
//		.의 위치 : 5
		int pos = fullName.indexOf(".");
		System.out.println("pos:"+pos);
		fileName = fullName.substring(0,pos);
		ext =fullName.substring(pos+1);
		
		System.out.println("화일명:"+fileName);
		System.out.println("확장자:"+ext);
		
		String id="kim";
		String pw="1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력:");
		String inputId = sc.next();
		
		System.out.print("비번 입력:");
		String inputPw = sc.next();
		
		if(id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("로그인 가능");
		}
		else {
			System.out.println("로그인 불가능");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n");
		
	}

}







//아스키코드
//A:65
//B:66
//a:97





