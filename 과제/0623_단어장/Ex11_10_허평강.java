import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex11_10_���� {
	public static void main(String[] args) throws Exception{

		String str;
		boolean flag =false;
			
//		FileWriter fw = new FileWriter("voca.txt");
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		while(true) {
			System.out.println("1.�ܾ��Է� 2.�ܾ�˻� 3.���� >>");
			System.out.print("��ȣ�� �Է��ϼ��� :");
			int select = sc.nextInt();

			switch(select) {
			case 1 : System.out.println("�ܾ�/�� �Է�>>");
			
			in= new BufferedReader(new InputStreamReader(System.in));
			str =in.readLine();
			
			out= new BufferedWriter(new FileWriter("voca.txt",true));
			
			out.write(str);
			out.write("\r\n");
			
			System.out.println();
			out.close();
			break;

			case 2 : System.out.println("�˻� �ܾ��Է�>>");
			
			in = new BufferedReader(new InputStreamReader(System.in));
			
			str=in.readLine();
			
			in = new BufferedReader(new FileReader("voca.txt"));
			String line;
			
			while((line=in.readLine()) !=null) {
				flag=false;
				String[]tokens=line.split("/");
				
				if(tokens[0].trim().compareToIgnoreCase(str.trim())==0) {
					System.out.println("�ܾ�>"+tokens[0].trim());
					System.out.println("�ܾ��� ��>"+tokens[1]);
					flag=true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println("ã�´ܾ����");
			}
			System.out.println();
			
			break;
			case 3 : System.out.println("����");
			in.close();
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
