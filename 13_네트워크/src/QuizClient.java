import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class QuizClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket cs = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		cs = new Socket("localhost",9999);
		
		out = new PrintWriter(cs.getOutputStream(),true);
		
		in = new BufferedReader(
				new InputStreamReader(cs.getInputStream()));
		
		
		BufferedReader br = new BufferedReader(
							new InputStreamReader(System.in));
		
		
		String fromServer,fromUser;
		
		while(( fromServer = in.readLine()) != null   ) {
			System.out.println("서버:" + fromServer);
			if(fromServer.equals("quit"))
				break;
			
			fromUser = br.readLine(); // 답입력
			if(fromUser != null) {
				System.out.println("클라이언트:"+fromUser);
				out.println(fromUser);
			}
		}
		
		out.close();
		in.close();
		br.close();
		cs.close();
		
	}

}








