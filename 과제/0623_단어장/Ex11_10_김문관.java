import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_10_�蹮�� {

	public static void main(String[] args) throws IOException {

		while(true) {
			System.out.println("1.�ܾ��Է�/2.�ܾ�˻�/3.����>>");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			if(num == 3) {
				System.out.println("�ý����� ���� �մϴ�.");
				break;
			}
			
			boolean flag = false;
			
			switch(num) {
			
			case 1:

				System.out.print("�ܾ�/�� �Է� :");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				BufferedWriter bw = new BufferedWriter(new FileWriter("voca.txt",true));
				bw.write(str +"\n");
				System.out.println();
				bw.close(); 
				break;

			case 2:
				
				System.out.print("ã�� �ܾ �Է� �ϼ��� :");
				BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in));

				str = br2.readLine(); 

				BufferedReader br3 = new BufferedReader(new FileReader("voca.txt"));
				
				String result;

				while((result = br3.readLine()) != null){ 
					flag = false;
					String[] cut = result.split("/");

					if(cut[0].trim().compareToIgnoreCase(str.trim()) == 0){ 
						System.out.println("�ܾ� :" + cut[0].trim());
						System.out.println("��  :" + cut[1]);
						flag = true;
						break;
					}
				}

				if(flag == false){
					System.out.println("ã�� �ܾ� ����");
				}
				
				System.out.println();
				
				break;

			default: 
				
				System.out.println("�߸��� ��ȣ �Դϴ�. �ٽ� �Է����ּ���.");
			
			}

		}
	}

}

