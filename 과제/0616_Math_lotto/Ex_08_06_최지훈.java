import java.util.Scanner;

public class Ex_08_06_������ {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[]	my = new int[6];
		int count = 0;
		
		for(i=0;i<lotto.length;i++) {
		lotto [i] = (int)(Math.random()*45)+1;
		
		   for(j=0;j<i;j++) {
			if(lotto[j]==lotto[i]) {
				i--;
				break;
			}
		}
		   
		} //�ߺ������ϰ� ���� ����
		
		
		
		
		for(i=0;i<lotto.length;i++) {
		System.out.print("����"+(i+1)+" ");
			my[i] =	sc.nextInt();
			if(my[i]>45) {
				System.out.println("1���� 45���� ���� �Է����ּ���");
				--i; continue;
			}
			 for(j=0;j<i;j++) {
					if(my[i]==my[j]) {
						 System.out.println("�ߺ��Դϴ�. : �ٽ�"); --i;
						
					}
					 	
			}
			 
			
		}
		System.out.println("���� ���� ��ȣ : "+my[0]+" "+my[1]+" "+my[2]+" "+my[3]+" "+my[4]+" "+my[5]);
		System.out.println("*******************");
		System.out.println("��ǻ�Ͱ� �����ȣ :"+ lotto[0]+" "+ lotto[1]+" "+ lotto[2]+" "+ lotto[3]+" "+ lotto[4]+" "+ lotto[5]+" ");
		
		int total=0;
		for(i=0;i<lotto.length;i++) {
		for(j=0;j<lotto.length;j++) {
			if(my[i]==lotto[i]) {
				total = total +1;
			}
			
		}
			}
		System.out.println("���� ������ :"+total);
		if(total==6) {
			System.out.println("1���Դϴ�");
		}
		else if (total==5) {
			System.out.println("2���Դϴ�");
		}
		else if (total==4) {
			System.out.println("3���Դϴ�");
		}
		else if (total==3) {
			System.out.println("4���Դϴ�");
		}
		else System.out.println("���Դϴ�");
		
		
	}

}
