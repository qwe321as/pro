import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_10_���̸� {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int input;
		String str;
		BufferedReader br=null;
		BufferedWriter bw=null;
		BufferedReader br2 = null;
		boolean flag = false;
		
		while(true) {
			System.out.print("1.�ܾ��Է�  2.�ܾ�˻�  3.���� >> ");
			input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.print("�ܾ�/�� �Է�>>");
				
				br = new BufferedReader(
								new InputStreamReader(System.in));
				
				str = br.readLine();
//				System.out.println(str);
				
				bw = new BufferedWriter(new FileWriter("c:\\sun\\voca.txt",true));
				bw.write(str);
				bw.newLine();
				bw.flush();
				
				break;
				
			case 2:
				System.out.print("�˻� �ܾ� �Է�>>");
				br = new BufferedReader(
						new InputStreamReader(System.in));
				
				str = br.readLine(); // apple
				
				br2 = new BufferedReader(new FileReader("c:\\sun\\voca.txt"));
				
				String line;
				while( (line = br2.readLine()) != null ) {
					flag = false;
					//System.out.println(line); // line=apple/���
					
					String[] token = line.split("/"); // token[0]:apple, token[1]:���
					if(token[0].equals(str) ) {
						System.out.println("�ܾ�>"+token[0]);
						System.out.println("��>"+token[1]);
						flag = true;
						break;
					}
//					else {
//						
//					}
				} // while
				if(flag == false)
					System.out.println("ã�� �ܾ� ����");
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				if(br!=null)
					br.close();
				if(bw!=null)
					bw.close();
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
