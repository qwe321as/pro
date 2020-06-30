import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Ex11_10_박근주 {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String num;
		String str;
		
		  BufferedReader in = null;
		  BufferedWriter out = null;
		  boolean flag=false;
		
		while(true) {
			System.out.println("1.단어입력  2.단어검색  3.종료");
			 num = sc.next();
			switch(num.charAt(0)) {
			
			case '1':System.out.print("단어/뜻 입력>>");
			in = new BufferedReader(new InputStreamReader(System.in));
		     str = in.readLine(); //apple/사과
		    
		    out = new BufferedWriter(new FileWriter("voca.txt",true));
		    
		    out.write(str);
		    out.newLine(); 
		    
		    System.out.println();
		    out.close(); // 이 줄 없으면 입력한 단어 저장이 안된다.
		    break;
			
			case '2': System.out.print("검색 단어 입력>>");
				
			in = new BufferedReader( new InputStreamReader(System.in));
		    
		    str = in.readLine(); //apple
		    
		    in = new BufferedReader( new FileReader("voca.txt"));
		    String line;
		    
		    while((line = in.readLine()) != null){ //apple/사과
		     flag= false;
		     String[] tokens = line.split("/");
		     //token[0] = apple, tokens[1] = 사과
		     
		     if(tokens[0].trim().compareToIgnoreCase(str.trim()) == 0){ // 같으면 0 다르면 0이아닌 다른 숫자
		      System.out.println("단어>" + tokens[0].trim());
		      System.out.println("단어의 뜻>" + tokens[1]);
		      flag= true;
		      break;
		     }
		    }
		    // 여기
		    if(flag==false){
		     System.out.println("찾는 단어 없음");
		    }
		    System.out.println();
		    
		    break;
		   case '3':
		    System.out.println("프로그램 종료합니다.");
		    in.close();
		    System.exit(0);
				
			}//switch
			
		}//큰 while
		
		
		
		}

	}
	//단어 입력받아서 넣고 출력하기
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


