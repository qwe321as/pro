import java.util.Scanner;

public class Ex04_07_�濬�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, stuNum = 0, i, total = 0, max, min, j, temp;
		float avg;
		int[] score = null;
		while (true) {

			System.out.println("-----------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.�������|4.�м�|5.����"); // ������� �ڵ� �ۼ��Ұ�!
			System.out.println("-----------------------------------------");
			System.out.print("��ȣ����>>");
			num = sc.nextInt();
			if (num == 1) {
				System.out.print("�л��� �Է� >>");
				stuNum = sc.nextInt();

				score = new int[stuNum];

			} else if (num == 2) {
				System.out.println("2.�����Է�");
				if (score == null) {
					System.out.println("1�� �л��� ���� �Է��ϼ���~");
					continue; // *while������ continue������ ������ �������� ���ϰ� �� --> ���ǽ����� ��whil(true)! *for��������
								// -->���������ΰ�
				}
				for (i = 0; i < score.length; i++) {
					System.out.printf("%d�� �л�����", i + 1);

					score[i] = sc.nextInt();

				}
			} else if (num == 3) {
				System.out.println("3.�������");
				if (score == null) {
					System.out.println("1�� �л������� �Է��ϼ���~");
					continue;
				}
				for (i = 0; i < score.length; i++) {
					System.out.printf("%d�� �л�����: %d��\n", i + 1, score[i]);
				}

			} else if (num == 4) {
				if (score == null) {
					System.out.println("1�� �л������� �Է��ϼ��뤷");
					continue;
				}
				System.out.println("4.�м�");
				for (i = 0; i < score.length; i++) {
					total = score[i] + total;
				}
				System.out.printf("����:%d\n", total);
				avg = (float)total / stuNum;
				System.out.printf("���:%.2f\n", avg);
				max = score[0];
				min = score[0];
				for (i = 1; i < score.length; i++) {
					if (max < score[i]) {
						max = score[i];
					}
					if (min > score[i]) {
						min = score[i];
					}

				}
				System.out.printf("�ִ밪:%d", max);
				System.out.printf("�ּҰ�:%d", min);
				System.out.println();
				
				//����
				for (i = 0; i < score.length - 1; i++) {
					for (j = i + 1; j < score.length; j++) {
						if (score[i] > score[j]) {
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
				}
				for (i = 0; i < score.length; i++) {
					System.out.print(score[i] + " ");
				}
				System.out.println();

			} else if (num == 5) {
				System.out.println("5.����");
				break;
			} else {
				System.out.println("1~5������ ��ȣ�� �Է� �����մϴ�.");
			}

		}
		System.out.println("���α׷��� �����մϴ�.");

	}

}
