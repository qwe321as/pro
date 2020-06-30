import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_03_BufferedStream {
	public static void main(String[] args) {
		
		BufferedOutputStream bos;
		BufferedInputStream bis;
		
		int  num;
		try {
			FileOutputStream fos = 
					new FileOutputStream("data.txt"); // 1�� ��Ʈ��
			
			bos = new BufferedOutputStream(fos,5); // 2�� ��Ʈ�� 

			
			
			FileInputStream fis = 
					new FileInputStream("data.txt");
			
			bis= new BufferedInputStream(fis,5);

			for(int i=1;i<9;i++) {
				//			1~8���� ȭ�� ���
				//			����� ���� �о�ͼ� �ܼ�â�� ���
				System.out.print(i);
				bos.write(i+48); // 1:1(49), 2:2(50) A:65

			} // for
			
			bos.flush();
			
			System.out.println();
			
			while( (num=bis.read())!=-1) {
				System.out.print((char)num+" ");
			}
			
			fis.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}





