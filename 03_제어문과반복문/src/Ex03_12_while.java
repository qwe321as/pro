import java.util.Scanner;

public class Ex03_12_while {
	public static void main(String[] args) {

		//while 1~5���� ���
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println();

		i=1;
		while(true) {
			System.out.println(i);
			if(i==5)
				break; // �ݺ����� ���������� ���
			i++;
		}

		// break������ ����� �´�.

		System.out.println();

		Scanner sc = new Scanner(System.in); // ctrl+shift+���ĺ�O 
		int num,sum=0;
		while(true) {
			System.out.print("�����Է�:");
			num = sc.nextInt();
			
			if(num<0)
				break;
			
			sum = sum+num;
		}
		// ����
		System.out.println("sum="+sum);
		
	}

}

//�����Է�:3
//�����Է�:23
//�����Է�:1
//�����Է�:-2
//����:27










