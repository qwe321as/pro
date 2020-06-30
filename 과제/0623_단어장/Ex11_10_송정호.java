import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_10_송정호 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			BufferedWriter bw;
			BufferedReader br;
			BufferedReader br2;
			
			int num = 0;
			String word, line;
			
			while(true) {
				bw = new BufferedWriter(new FileWriter("voca.txt", true));
				br = new BufferedReader(new InputStreamReader(System.in));
				br2 = new BufferedReader(new FileReader("voca.txt"));
				
				System.out.print("1.단어 입력     2.단어 검색     3.종료   >> ");
				num = sc.nextInt();
				
				switch(num) {
				
					case 1:
						
						System.out.print("단어/뜻 입력  >> ");
						word = br.readLine();
						bw.write(word);
						bw.newLine();
						
						bw.close();
						
						break;
						
					case 2:
						
						boolean check = false;
						
						System.out.print("검색 단어 입력  >> ");
						word = br.readLine();
						
						while((line = br2.readLine()) != null) {
							
//							System.out.println(line);
							String voca[] = line.split("/");
							
							for(int i = 0; i < voca.length; i++) {
								
								if(word.equals(voca[i])) {
									System.out.println("단어 > " + voca[i]);
									System.out.println("단어의 뜻 > " + voca[i + 1]);
									check = true;
									break;
								}
							}
						}
						
						if(!check) {
							System.out.println("찾는 단어가 없습니다.");
						}
						
						br2.close();
						
						break;
						
					case 3:
						
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
						
						break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
