import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex11_07_InputStreamReader {
	public static void main(String[] args) throws IOException {

		System.out.print("데이터 입력:");
		
//		InputStream is = System.in;
//		
//		InputStreamReader ir = new InputStreamReader(is);
//		
//		BufferedReader br = new BufferedReader(ir);
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println("str:"+str);
	}

}



