import java.util.Scanner;

public class ex08_06_������ {
	public static void main(String[]args) {
		
		//1~45
		int i;
		int [] lotto = new int [6];
		int [] my = new int [6];
		int num =	(int)(Math.random()*6)+1;//math�ȿ� �־�� �ϴ������� int�� math.ramdom�� �����ؤä�
		System.out.print(num+" ");
		for(i=0;i<6;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			System.out.print(lotto[i]+" ");
		
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int s=0;
		for(i=0;i<6;i++) {
			System.out.println("����"+(i+1)+":");
			my[i] = sc.nextInt();
			s+= my[i];
			
			if(my[i]==s) { 
				s=0;
				System.out.println("�Ȱ����� ġ����" +my[i]);
				continue;
			}
				else if(my[i]>45) {
				System.out.println("1~45�� ��������");
			}
			
			
		}
			
			
		}
	
	}


//����


//����1: 3
//����2: 4
//����3: 12
//����4: 4
//�ߺ��� �ٽ� ����4: 12
//�ߺ��� �ٽ� ����4: 3
//�ߺ��� �ٽ� ����4: 43
//����5: 89
//1~45������ �� �Է��ϼ���.
//����5: 22
//����6: 33
//���� �߻���Ų �ζ� ��ȣ
//2 19 32 15 43 7 
//
//���� ������ �ζ� ��ȣ
//3 4 12 43 22 33 
//
//���� ���� : 1
//��!!




