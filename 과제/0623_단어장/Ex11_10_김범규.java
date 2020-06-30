import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_10_김범규 {

	public static void main(String[] args) throws IOException {




		while(true) {
			System.out.print("1.단어입력  2.단어검색  3.종료 >> ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			boolean flag = false;
			switch(num) {
			case 1:
				System.out.print("단어/뜻입력>>");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				BufferedWriter bw = new BufferedWriter(new FileWriter("voka.txt",true));
				bw.write(str);
				bw.write("\n");
				System.out.println();
				bw.close();
				break;
			case 2:
				System.out.print("검색 단어 입력>>");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				str = br1.readLine();
				BufferedReader br2 = new BufferedReader(new FileReader("voka.txt"));
				String line;

				while((line = br2.readLine()) != null) {
					flag = false;
					String[] tokens = line.split("/");
					if(tokens[0].trim().compareToIgnoreCase(str.trim()) == 0) {
						System.out.println("단어>" +tokens[0].trim());
						System.out.println("뜻>" + tokens[1]);
						flag = true;
						break;
					}
				}
				if(flag == false) {
					System.out.println("찾는 단어 없음");
				}
				System.out.println();
				break;
			case 3:
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("번호를 잘못입력하셨습니다.");
				break;
			}
		}



	}

}
