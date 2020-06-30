import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Scanner;

public class Ex11_10_원태찬 {

	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		String str;
		  int count = 0;
		  String input;
		  int sw=0;
		  

		while(true) {
			System.out.print("1.단어입력 2.단어검색 3.종료>> ");
			
			int a=sc.nextInt();
			switch(a) {
			case 1:
				System.out.print("단어/뜻 입력:");
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 입력
				str = in.readLine(); //apple/사과
				
				BufferedWriter out = new BufferedWriter(new FileWriter("to.txt",true)); //출력
				
				
				out.write(str);
				out.write("\r\n"); //out.newLine();과 같다
				
				System.out.println();
				out.close(); 
				break;
			case 2:System.out.print("검색 단어 입력:");
			in = new BufferedReader( new InputStreamReader(System.in)); //입력
			
			    str = in.readLine(); //apple
			    in = new BufferedReader( new FileReader("to.txt"));
			    String line;
			    while((line = in.readLine()) != null){ //apple/사과
			     String[] tokens = line.split("/");
			     //token[0] = apple, tokens[1] = 사과
			     sw=0;
			     if(tokens[0].trim().compareToIgnoreCase(str.trim()) == 0){ // 같으면 0 다르면 0이아닌 다른 숫자
			      System.out.println("단어:" + tokens[0].trim());
			      System.out.println("단어의 뜻:" + tokens[1]);
			      sw=1;
			      break;
			     }
			    }
			    // 여기
			    if(sw==0){
			     System.out.println("찾는 단어 없음");
			    }
			    System.out.println();

				break;
			case 3:System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				break;
			}
			
			
		}
	}

}
//1.단어입력 2.단어검색 3.종료 >> 1
//단어/뜻 입력>>apple/사과
//
//1.단어입력 2.단어검색 3.종료 >>1
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
//프로그램을 종료합니다.