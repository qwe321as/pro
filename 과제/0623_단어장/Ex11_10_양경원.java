
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_10_���� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str,line;
		int count = 0;
		boolean flag=false;

		Scanner sc =new Scanner(System.in);
		String input;

		
		while(true){
			System.out.println("1. �ܾ��Է�  2. �ܾ�˻�  3. ����  :");
			input = sc.next(); 

			switch(input.charAt(0)){
			case '1':
				System.out.print("�ܾ� / �� �Է�");
				br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine(); 
				bw = new BufferedWriter(new FileWriter("voka.txt",true));

				bw.write(str);
				bw.newLine(); 
				
				bw.close(); 
				break;

			case '2':
				System.out.println("�˻� �ܾ� �Է�");

				br = new BufferedReader( new InputStreamReader(System.in));
				str = br.readLine();
				br = new BufferedReader( new FileReader("voka.txt"));
				
				while((line = br.readLine()) != null){
					flag= false;
					String[] tokens = line.split("/");
					if(tokens[0].trim().compareTo(str.trim()) == 0){ 
						System.out.println("�ܾ� : " + tokens[0].trim());
						System.out.println("�ܾ��� �� : " + tokens[1]);
						flag= true;
						break;
					}
				}
				if(!flag){
					System.out.println("ã�� �ܾ� ����");
				}

				break;
			case '3':
				System.out.println("���α׷� �����մϴ�.");
				br.close();
				System.exit(0);
			}
			
		}
	}

}
//�Է��� �ܾ�/���� voca.txt�� ����
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 1
//�ܾ�/�� �Է�>>apple/���
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 1
//�ܾ�/�� �Է�>>blue sky/�Ķ� �ϴ�
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 2
//�˻� �ܾ� �Է�>>apple
//�ܾ�>apple
//�ܾ��� ��>���
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 2
//�˻� �ܾ� �Է�>>summer
//ã�� �ܾ� ����
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 3
//���α׷� �����մϴ�.
