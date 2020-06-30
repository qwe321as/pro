import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex11_10_허평강 {
	public static void main(String[] args) throws Exception{

		String str;
		boolean flag =false;
			
//		FileWriter fw = new FileWriter("voca.txt");
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		while(true) {
			System.out.println("1.단어입력 2.단어검색 3.종료 >>");
			System.out.print("번호를 입력하세요 :");
			int select = sc.nextInt();

			switch(select) {
			case 1 : System.out.println("단어/뜻 입력>>");
			
			in= new BufferedReader(new InputStreamReader(System.in));
			str =in.readLine();
			
			out= new BufferedWriter(new FileWriter("voca.txt",true));
			
			out.write(str);
			out.write("\r\n");
			
			System.out.println();
			out.close();
			break;

			case 2 : System.out.println("검색 단어입력>>");
			
			in = new BufferedReader(new InputStreamReader(System.in));
			
			str=in.readLine();
			
			in = new BufferedReader(new FileReader("voca.txt"));
			String line;
			
			while((line=in.readLine()) !=null) {
				flag=false;
				String[]tokens=line.split("/");
				
				if(tokens[0].trim().compareToIgnoreCase(str.trim())==0) {
					System.out.println("단어>"+tokens[0].trim());
					System.out.println("단어의 뜻>"+tokens[1]);
					flag=true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println("찾는단어없음");
			}
			System.out.println();
			
			break;
			case 3 : System.out.println("종료");
			in.close();
			System.exit(0);
			} 


		}


	}
}
//입력한 단어/뜻은 voca.txt에 쓰기
//1.단어입력 2.단어검색 3.종료 >> 1
//단어/뜻 입력>>apple/사과
//
//1.단어입력 2.단어검색 3.종료 >> 1
//단어/뜻 입력>>blue sky/파란 하늘
//
//1.단어입력 2.단어검색 3.종료 >> 2
//검색 단어 입력>>apple
//단어>apple
//단어의 뜻>사과
//
//1.단어입력 2.단어검색 3.종료 >> 2
//검색 단어 입력>>summer
//찾는 단어 없음
//
//1.단어입력 2.단어검색 3.종료 >> 3
//프로그램 종료합니다.
