import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Ex11_10_�ڱ��� {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String num;
		String str;
		
		  BufferedReader in = null;
		  BufferedWriter out = null;
		  boolean flag=false;
		
		while(true) {
			System.out.println("1.�ܾ��Է�  2.�ܾ�˻�  3.����");
			 num = sc.next();
			switch(num.charAt(0)) {
			
			case '1':System.out.print("�ܾ�/�� �Է�>>");
			in = new BufferedReader(new InputStreamReader(System.in));
		     str = in.readLine(); //apple/���
		    
		    out = new BufferedWriter(new FileWriter("voca.txt",true));
		    
		    out.write(str);
		    out.newLine(); 
		    
		    System.out.println();
		    out.close(); // �� �� ������ �Է��� �ܾ� ������ �ȵȴ�.
		    break;
			
			case '2': System.out.print("�˻� �ܾ� �Է�>>");
				
			in = new BufferedReader( new InputStreamReader(System.in));
		    
		    str = in.readLine(); //apple
		    
		    in = new BufferedReader( new FileReader("voca.txt"));
		    String line;
		    
		    while((line = in.readLine()) != null){ //apple/���
		     flag= false;
		     String[] tokens = line.split("/");
		     //token[0] = apple, tokens[1] = ���
		     
		     if(tokens[0].trim().compareToIgnoreCase(str.trim()) == 0){ // ������ 0 �ٸ��� 0�̾ƴ� �ٸ� ����
		      System.out.println("�ܾ�>" + tokens[0].trim());
		      System.out.println("�ܾ��� ��>" + tokens[1]);
		      flag= true;
		      break;
		     }
		    }
		    // ����
		    if(flag==false){
		     System.out.println("ã�� �ܾ� ����");
		    }
		    System.out.println();
		    
		    break;
		   case '3':
		    System.out.println("���α׷� �����մϴ�.");
		    in.close();
		    System.exit(0);
				
			}//switch
			
		}//ū while
		
		
		
		}

	}
	//�ܾ� �Է¹޾Ƽ� �ְ� ����ϱ�
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


