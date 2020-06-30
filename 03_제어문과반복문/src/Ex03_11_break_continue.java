
public class Ex03_11_break_continue {
	public static void main(String[] args) {

		int i,j;
		for(i=2;i<=9;i++) {
			if(i%2==1)
				continue;
			
			System.out.println("***"+i+"´Ü***");
			for(j=1;j<=9;j++) {
				if(i<j) // 2 3
					break;
				System.out.println(i+"*"+j+"="+i*j);
				
			}
		}
	}

}

//2*1=2
//2*2=4
//
//4*1=4
//4*2=8
//4*3=12
//4*4=16
//
//6*1=6
//6*2=12
//6*3=18
//6*4=24
//6*5=30
//6*6=36
//
//8*1=8
//8*2=16
//8*3=24
//8*4=32
//8*5=40
//8*6=48
//8*7=56
//8*8=64
