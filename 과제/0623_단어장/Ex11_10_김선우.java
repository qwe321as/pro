import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex11_10_�輱�� {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		int num;
		boolean flag=false;

		try {
			BufferedWriter bw;
			BufferedReader br;
			while(true) {
				System.out.print("1.�ܾ��Է� 2.�ܾ�˻� 3.���� >>");
				num=sc.nextInt();

				switch(num) {
				case 1 : 
					br = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("�ܾ�/�� �Է�>>");
					str = br.readLine();
					bw = new BufferedWriter(new FileWriter("voca.txt",true));
					bw.write(str);
					bw.newLine();
					bw.close();
					break;

				case 2 : 
					br = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("�˻� �ܾ� �Է�>>");
					str = br.readLine();
					BufferedReader br2 = new BufferedReader(new FileReader("voca.txt"));
					String line;
					while((line = br2.readLine())!=null) {

						String[] str2 = line.split("/");

						flag=false;
						if (str2[0].compareToIgnoreCase(str)==0) {
							System.out.println("�ܾ�>"+str2[0]);
							System.out.println("��>"+str2[1]);
							flag=true;
							break;
						}
					}
					if(flag==false) {
						System.out.println("ã�� �ܾ� ����");
					}
					break;

				case 3 :
					System.out.println("���α׷� �����մϴ�.");
					System.exit(0);
					break;
				}//switch
			}//while



		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
//1.�� ���� ��ϵǰ��϶� ���鵵 ����
//����Ǿ��� ���� ��� ����ǰ� �϶� true
//�˻��ܾ� �Է��ϸ� "/"���� ���� ������ �϶�
//3�� ���ö� ���� �ݺ�

//���� voca.txt�� ����

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