import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex11_08_InputStreamReader {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		
		try {
			System.out.print("화일 이름 입력:");
			String fileName = br.readLine(); // c:\\sun\\x.txt
			
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			System.out.println("화일에 저장할 내용을 입력하세요");
			String text;
			while( (text = br.readLine()) != null ) {
				bw.write(text);
				bw.newLine();
			}
			System.out.println("입력을 마칩니다.");
			bw.close();
			br.close();
			
			BufferedReader br2 = new BufferedReader(
									new FileReader(fileName));
			String line;
			while( (line = br2.readLine()) != null ) {
				System.out.println(line);
			}
			br2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}





