import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_10_�̼��� {
	public static void main(String[] args) throws IOException {
		//�ܾ��� �����

		//1.�ܾ��Է�  :�ܾ�� ���� /�� ���� 
		//          �Է��� �ܾ�/���� ���� voca.txt�� ��ϵǰ� (���鵵 ���� ��ϵǾ����)
		//3.�����ϰ� �ٽ� �����ϸ� , ������ �Է��ߴ� �ܾ�� ������� �ʰ� ��ӳ����ְ� (���ο� �ܾ�� �ؿ� �߰��ǵ���)
		//2.�ܾ�˻� :voca.txt���� �������پ� �Է¿ͼ�  /�� �������� �ɰ��� ��(�ݺ�) �ܾ ������ ---> �ܾ���� ���ü� �ֵ���
		//          ���࿡ ���� �ܾ��̸�, "ã�´ܾ� �����ϴ�."���

		int num;
		String text;
		boolean flag =false;
		File f = new File("voca.txt");
		
		FileWriter fw =new FileWriter("voca.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner (System.in);
		

		
		
		while(true) {
			System.out.print("1.�ܾ��Է�  2.�ܾ�˻�  3.����>> ");
			num = sc.nextInt();

			switch(num) {
			case 1 : 
				System.out.print("�ܾ�/�� �Է�>> ");
					text = br.readLine();
					bw.write(text);
					bw.newLine();
				break;

			case 2 :
				Scanner sc2 = new Scanner (f);
				System.out.print("�˻��� �ܾ� �Է�>> ");
				text = br.readLine();
				System.out.println("�ܾ�>> " +text);
				
				while( sc2.hasNext() ) {
					flag = false;
					String str = sc2.next();    //�١�<2>
					String[] word = str.split("/");
					
					
					if(word[0].equals(text)) {
						System.out.println("�ܾ��� ��>> "+word[1]);
						flag=true;
						sc2.close();          //�١�<1>ã������ �ݰ� �ٽ� ��ü���� (�׷��� �ٽ�ù�ٺ��� ��ĵ���� ����)
						break;
					}//if
				}//while
//				System.out.println(flag);
				if(flag==false) {
					System.out.println("ã�� �ܾ� ����");
				}
				break;

			case 3 :
				System.out.println("���α׷��� �����մϴ�.");
				bw.close();
				br.close();
				System.exit(0);
				break;

			default :
				System.out.println("1~3�� ������ ���ڸ� �Է��ϼ���.");
				break;

			}


		}//while










	}

}
