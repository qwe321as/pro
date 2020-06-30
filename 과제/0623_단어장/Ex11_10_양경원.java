
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_10_양경원 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str,line;
		int count = 0;
		boolean flag=false;

		Scanner sc =new Scanner(System.in);
		String input;

		
		while(true){
			System.out.println("1. 단어입력  2. 단어검색  3. 종료  :");
			input = sc.next(); 

			switch(input.charAt(0)){
			case '1':
				System.out.print("단어 / 뜻 입력");
				br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine(); 
				bw = new BufferedWriter(new FileWriter("voka.txt",true));

				bw.write(str);
				bw.newLine(); 
				
				bw.close(); 
				break;

			case '2':
				System.out.println("검색 단어 입력");

				br = new BufferedReader( new InputStreamReader(System.in));
				str = br.readLine();
				br = new BufferedReader( new FileReader("voka.txt"));
				
				while((line = br.readLine()) != null){
					flag= false;
					String[] tokens = line.split("/");
					if(tokens[0].trim().compareTo(str.trim()) == 0){ 
						System.out.println("단어 : " + tokens[0].trim());
						System.out.println("단어의 뜻 : " + tokens[1]);
						flag= true;
						break;
					}
				}
				if(!flag){
					System.out.println("찾는 단어 없음");
				}

				break;
			case '3':
				System.out.println("프로그램 종료합니다.");
				br.close();
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
