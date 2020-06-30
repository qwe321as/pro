import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_02_FileCopy {
	public static void main(String[] args) {

		try {
			FileInputStream fis = 
					new FileInputStream("from.txt");
			FileOutputStream fos = new FileOutputStream("to.txt");
			
			// false : ������ �ϳ� ������, ������ ȭ�Ͼ��� ���� �� ����� ���� ���������.
			// true : ������ �ϳ� ������, ������ ���� ����ڿ� �߰��ȴ�.
			
			
			while(true) {
				int i = fis.read(); // H:72
				if (i==-1) {
					break;
				}
				System.out.print((char)i);
				fos.write(i);
				
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











