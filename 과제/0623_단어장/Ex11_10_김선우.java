import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex11_10_김선우 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		int num;
		boolean flag=false;

		try {
			BufferedWriter bw;
			BufferedReader br;
			while(true) {
				System.out.print("1.단어입력 2.단어검색 3.종료 >>");
				num=sc.nextInt();

				switch(num) {
				case 1 : 
					br = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("단어/뜻 입력>>");
					str = br.readLine();
					bw = new BufferedWriter(new FileWriter("voca.txt",true));
					bw.write(str);
					bw.newLine();
					bw.close();
					break;

				case 2 : 
					br = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("검색 단어 입력>>");
					str = br.readLine();
					BufferedReader br2 = new BufferedReader(new FileReader("voca.txt"));
					String line;
					while((line = br2.readLine())!=null) {

						String[] str2 = line.split("/");

						flag=false;
						if (str2[0].compareToIgnoreCase(str)==0) {
							System.out.println("단어>"+str2[0]);
							System.out.println("뜻>"+str2[1]);
							flag=true;
							break;
						}
					}
					if(flag==false) {
						System.out.println("찾는 단어 없음");
					}
					break;

				case 3 :
					System.out.println("프로그램 종료합니다.");
					System.exit(0);
					break;
				}//switch
			}//while



		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
//1.번 값이 기록되게하라 공백도 들어가게
//저장되었던 값이 계속 저장되게 하라 true
//검색단어 입력하면 "/"뒤의 값이 나오게 하라
//3번 나올때 까지 반복

//뜻은 voca.txt에 쓰기

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