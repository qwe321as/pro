import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_10_김문관 {

	public static void main(String[] args) throws IOException {

		while(true) {
			System.out.println("1.단어입력/2.단어검색/3.종료>>");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			if(num == 3) {
				System.out.println("시스템을 종료 합니다.");
				break;
			}
			
			boolean flag = false;
			
			switch(num) {
			
			case 1:

				System.out.print("단어/뜻 입력 :");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				BufferedWriter bw = new BufferedWriter(new FileWriter("voca.txt",true));
				bw.write(str +"\n");
				System.out.println();
				bw.close(); 
				break;

			case 2:
				
				System.out.print("찾을 단어를 입력 하세요 :");
				BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in));

				str = br2.readLine(); 

				BufferedReader br3 = new BufferedReader(new FileReader("voca.txt"));
				
				String result;

				while((result = br3.readLine()) != null){ 
					flag = false;
					String[] cut = result.split("/");

					if(cut[0].trim().compareToIgnoreCase(str.trim()) == 0){ 
						System.out.println("단어 :" + cut[0].trim());
						System.out.println("뜻  :" + cut[1]);
						flag = true;
						break;
					}
				}

				if(flag == false){
					System.out.println("찾는 단어 없음");
				}
				
				System.out.println();
				
				break;

			default: 
				
				System.out.println("잘못된 번호 입니다. 다시 입력해주세요.");
			
			}

		}
	}

}

