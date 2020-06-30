import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class QuizServer {
	public static void main(String[] args) throws IOException {

		ServerSocket ss = null;
		Socket cs = null;
		
		ss = new ServerSocket(9999);
		
		System.out.println("Server ready..");
		cs = ss.accept();
		System.out.println("¿¬°áµÊ");
		
		
		PrintWriter out = new PrintWriter(
								cs.getOutputStream(),true);
		
		
		BufferedReader in = new BufferedReader(
						new InputStreamReader(cs.getInputStream()));
		
		
		String inputLine, outputLine;
		
		QuizProtocol qp = new QuizProtocol();
		outputLine = qp.process(null);
		out.println(outputLine);
		

		while((inputLine = in.readLine()) != null) {
			outputLine = qp.process(inputLine);
			out.println(outputLine);
			
			if(outputLine.equals("quit"))
				break;
		}
		out.close();
		in.close();
		cs.close();
		ss.close();
	}

}





