import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_10_����ȣ {

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
				
				System.out.print("1.�ܾ� �Է�     2.�ܾ� �˻�     3.����   >> ");
				num = sc.nextInt();
				
				switch(num) {
				
					case 1:
						
						System.out.print("�ܾ�/�� �Է�  >> ");
						word = br.readLine();
						bw.write(word);
						bw.newLine();
						
						bw.close();
						
						break;
						
					case 2:
						
						boolean check = false;
						
						System.out.print("�˻� �ܾ� �Է�  >> ");
						word = br.readLine();
						
						while((line = br2.readLine()) != null) {
							
//							System.out.println(line);
							String voca[] = line.split("/");
							
							for(int i = 0; i < voca.length; i++) {
								
								if(word.equals(voca[i])) {
									System.out.println("�ܾ� > " + voca[i]);
									System.out.println("�ܾ��� �� > " + voca[i + 1]);
									check = true;
									break;
								}
							}
						}
						
						if(!check) {
							System.out.println("ã�� �ܾ �����ϴ�.");
						}
						
						br2.close();
						
						break;
						
					case 3:
						
						System.out.println("���α׷��� �����մϴ�.");
						System.exit(0);
						
						break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
