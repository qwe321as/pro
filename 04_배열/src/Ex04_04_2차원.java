
public class Ex04_04_2차원 {
	public static void main(String[] args) {

		int[] a = {1,2,3};
		
		for(int temp:a) {
			System.out.println(temp);
		}
		
		int i,j;
		int[][] score = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		}; // 방법1

		System.out.println("***");
		// 확장for문 
		for( int[] temp2  : score) {
			for( int t  : temp2) {
				System.out.print(t+" ");
			}
			System.out.println();
		}
		System.out.println("***");
		
		
		
		int[][] score2 = new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{10,11,12}
		}; // 방법2

		int[][] score3 = new int[4][3];
		score3[0][0]=11;
		score3[3][2]=32;


		System.out.println(score[0][0]);
		System.out.println(score[0][1]); // 0행1열
		System.out.println(score[3][2]); // 3행2열

		System.out.println();

		for(i=0;i<score.length;i++) { // i=0,1,2,3
			
			for(j=0;j<score[i].length;j++) {
				
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println(score.length);
		System.out.println(score[0].length);
		System.out.println(score[1].length);
		System.out.println(score[2].length);
		System.out.println(score[3].length);

	} // main
} // class
















