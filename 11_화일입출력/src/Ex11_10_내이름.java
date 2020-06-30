import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_10_내이름 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int input;
		String str;
		BufferedReader br=null;
		BufferedWriter bw=null;
		BufferedReader br2 = null;
		boolean flag = false;
		
		while(true) {
			System.out.print("1.단어입력  2.단어검색  3.종료 >> ");
			input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.print("단어/뜻 입력>>");
				
				br = new BufferedReader(
								new InputStreamReader(System.in));
				
				str = br.readLine();
//				System.out.println(str);
				
				bw = new BufferedWriter(new FileWriter("c:\\sun\\voca.txt",true));
				bw.write(str);
				bw.newLine();
				bw.flush();
				
				break;
				
			case 2:
				System.out.print("검색 단어 입력>>");
				br = new BufferedReader(
						new InputStreamReader(System.in));
				
				str = br.readLine(); // apple
				
				br2 = new BufferedReader(new FileReader("c:\\sun\\voca.txt"));
				
				String line;
				while( (line = br2.readLine()) != null ) {
					flag = false;
					//System.out.println(line); // line=apple/사과
					
					String[] token = line.split("/"); // token[0]:apple, token[1]:사과
					if(token[0].equals(str) ) {
						System.out.println("단어>"+token[0]);
						System.out.println("뜻>"+token[1]);
						flag = true;
						break;
					}
//					else {
//						
//					}
				} // while
				if(flag == false)
					System.out.println("찾는 단어 없음");
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				if(br!=null)
					br.close();
				if(bw!=null)
					bw.close();
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
