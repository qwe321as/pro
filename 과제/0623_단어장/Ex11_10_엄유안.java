import java.io.*;
import java.util.*;

public class Ex11_10_������ {

	public static void main(String[] args){
		String vocan = null, voc = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		try {
			FileWriter fw = new FileWriter("voca.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			while(true) {
				System.out.print("1.�ܾ��Է�  2.�ܾ�˻�  3.���� >>  ");
				int num = sc.nextInt();
				
				if (num==1) {
					System.out.print("�ܾ�/�� �Է�>>");
					vocan=br.readLine();
					bw.write(vocan);
					bw.newLine();
				}
				
				
				else if(num==2) {
					System.out.print("�˻� �ܾ� �Է�>>");
					voc=br.readLine();
					if(vocan.equals(voc)) {
						StringTokenizer str = new StringTokenizer(vocan,",/:");
						
						while(str.hasMoreTokens()){
							System.out.print("�ܾ�>");
							String s = str.nextToken();
							System.out.println(s);
							System.out.print("�ܾ��� ��>");
							String s1 = str.nextToken();
							System.out.println(s1);
							
						}
					}
					else
						System.out.println("ã�� �ܾ� ����");
				}
				else
					System.out.println("�ý��� ����");
				
				bw.close(); // close�� �ؾ� voca.txt�� ���ڰ� ����µ� close�� ������ scanner�� ������ �ִٰ� ���� �Ф�
				br.close();	// �׷��ٰ� close�� ���� while moreTokens������ �ű�� �ݺ��� �ȵǱ���..��������� �� �Ѱ��Դϴ�.
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	
	
		}
}

//�Է��� �ܾ�/���� voca.txt�� ����
//1.�ܾ��Է�  2.�ܾ�˻�  3.���� >>
//�ܾ�/�� �Է�>> apple/���
//1.�ܾ��Է�  2.�ܾ�˻�  3.���� >>
//�ܾ�/�� �Է�>> blue sky/�Ķ� �ϴ� ---> �Ʊ� �Է��ߴ� �ܾ �״�� �����ֵ��� 
//1.�ܾ��Է�  2.�ܾ�˻�  3.���� >> -----> ���� ��ϵ� �ܾ�� ��� �߰��ǵ���
//�˻� �ܾ� �Է�>> apple
//�ܾ�> apple --------------> "/" ������ �������� �ɰ��� �հ� �� �� ������
//�ܾ��� ��> ���
// ��> ã�� �ܾ� ����
// 3�� �Է��Ҷ����� ��� �ؿ�