import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex09_11_HashMap {
	public static void main(String[] args) {

		Map<String,String> dic = new HashMap<String,String>();
		
		dic.put("pencil", "����");
		dic.put("sky", "�ϴ�");
		dic.put("desk", "å��");
		dic.put("face", "��");
		
		System.out.println("dic:"+dic);
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("ã�� �ܾ��?(q�Է½� ����) ");
			String word =sc.next();
			
			if(word.equals("q")) {
				break;
			}
			
			if(dic.get(word) == null) {
//			if(dic.containsKey(word)==false)
				System.out.println("�߸� �Է��ϼ���");
			}
			else {
				System.out.println("��:" + dic.get(word));
			}
			
			
		}while(true);
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}

}

//ã�� �ܾ��?(q�Է½� ����) sky
//�� : �ϴ�
//
//ã�� �ܾ��?(q�Է½� ����) desk
//�� : å��
//
//ã�� �ܾ��?(q�Է½� ����) hand
//�߸��Է��ϼ���
//
//ã�� �ܾ��?(q�Է½� ����) q
//���α׷��� �����մϴ�.
