import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Scanner;

public class Ex11_10_������ {

	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		String str;
		  int count = 0;
		  String input;
		  int sw=0;
		  

		while(true) {
			System.out.print("1.�ܾ��Է� 2.�ܾ�˻� 3.����>> ");
			
			int a=sc.nextInt();
			switch(a) {
			case 1:
				System.out.print("�ܾ�/�� �Է�:");
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // �Է�
				str = in.readLine(); //apple/���
				
				BufferedWriter out = new BufferedWriter(new FileWriter("to.txt",true)); //���
				
				
				out.write(str);
				out.write("\r\n"); //out.newLine();�� ����
				
				System.out.println();
				out.close(); 
				break;
			case 2:System.out.print("�˻� �ܾ� �Է�:");
			in = new BufferedReader( new InputStreamReader(System.in)); //�Է�
			
			    str = in.readLine(); //apple
			    in = new BufferedReader( new FileReader("to.txt"));
			    String line;
			    while((line = in.readLine()) != null){ //apple/���
			     String[] tokens = line.split("/");
			     //token[0] = apple, tokens[1] = ���
			     sw=0;
			     if(tokens[0].trim().compareToIgnoreCase(str.trim()) == 0){ // ������ 0 �ٸ��� 0�̾ƴ� �ٸ� ����
			      System.out.println("�ܾ�:" + tokens[0].trim());
			      System.out.println("�ܾ��� ��:" + tokens[1]);
			      sw=1;
			      break;
			     }
			    }
			    // ����
			    if(sw==0){
			     System.out.println("ã�� �ܾ� ����");
			    }
			    System.out.println();

				break;
			case 3:System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				break;
			}
			
			
		}
	}

}
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 1
//�ܾ�/�� �Է�>>apple/���
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >>1
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
//���α׷��� �����մϴ�.