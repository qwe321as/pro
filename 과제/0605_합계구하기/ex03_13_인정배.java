
public class ex03_13_ภฮมคน่ {
	public static void main(String[]args) {


		int a,c,d=0;

		for(a=1;a<=100;a++) { 
			d=d+a;
			if(a%10==0) {
				System.out.println(1+"~"+a+"="+d);

			}
		}
		d=0;


		for(a=1;a<=100;a++) { 
			d=d+a;
			if(a%10==0) {
				System.out.println((a-9)+"~"+a+"="+d);
				d=0;

			}

		}
	}	
	


}
