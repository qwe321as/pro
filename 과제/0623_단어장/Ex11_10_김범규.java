import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_10_����� {

	public static void main(String[] args) throws IOException {




		while(true) {
			System.out.print("1.�ܾ��Է�  2.�ܾ�˻�  3.���� >> ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			boolean flag = false;
			switch(num) {
			case 1:
				System.out.print("�ܾ�/���Է�>>");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				BufferedWriter bw = new BufferedWriter(new FileWriter("voka.txt",true));
				bw.write(str);
				bw.write("\n");
				System.out.println();
				bw.close();
				break;
			case 2:
				System.out.print("�˻� �ܾ� �Է�>>");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				str = br1.readLine();
				BufferedReader br2 = new BufferedReader(new FileReader("voka.txt"));
				String line;

				while((line = br2.readLine()) != null) {
					flag = false;
					String[] tokens = line.split("/");
					if(tokens[0].trim().compareToIgnoreCase(str.trim()) == 0) {
						System.out.println("�ܾ�>" +tokens[0].trim());
						System.out.println("��>" + tokens[1]);
						flag = true;
						break;
					}
				}
				if(flag == false) {
					System.out.println("ã�� �ܾ� ����");
				}
				System.out.println();
				break;
			case 3:
				System.out.println("���α׷� �����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("��ȣ�� �߸��Է��ϼ̽��ϴ�.");
				break;
			}
		}



	}

}
