
public class Ex08_04_Wrapper {
	public static void main(String[] args) {

		Integer it1 = new Integer(11); // int->Integer
		
		Integer it2 = 11; // 11->new Integer(11) : autoboxing
		Integer it3 = 22;
		System.out.println(it2+it3);
		
		int it4 = 33;
		int it5 = new Integer(44); // new Integer(44)->44 : unboxing 
		
		int i = Integer.parseInt("100");
		int j = Integer.parseInt("200");
		System.out.println(i+j);
		System.out.println("100" + "200");
		
		Integer a = Integer.valueOf("100");
		int b = Integer.valueOf("200");
		System.out.println(a+b);
		System.out.println();
		
		double c = Double.parseDouble("123.4");
		System.out.println("c:"+c);
		System.out.println();
		
		try {
			i = Integer.parseInt("100.3"); // new NumberFormatException()
			System.out.println("i:"+i);
			
		}catch(NumberFormatException e) {
			System.out.println("정수 변환 불가능");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		int[] arr = {1,2,3,4,5};
		int sum=0;
		for(i=0;i<arr.length;i++) {
			sum += arr[i]; // sum = sum + arr[i];
//			1+2+3+4+5
		}
		System.out.println("sum:"+sum);
		
		sum=0;
		String[] arr2 = {"1","2","3","4","5"};
		for(i=0;i<arr2.length;i++) {
			sum += Integer.parseInt(arr2[i]); // sum = sum + arr[i];
//			"1"+"2"+"3"+"4"+"5"=12345
		}
		System.out.println("sum:"+sum);
		
		System.out.println();
		
		sum = 0;
		String[] str = {"웬디:90","크리스탈:70","아이유:80"};
		for(i=0;i<str.length;i++) {
			System.out.println(str[i]);
			
			int pos = str[i].indexOf(":");
			System.out.println("pos:"+pos);
			
			String s = str[i].substring(pos+1);
			System.out.println("s:"+s);
			
			int jumsu = Integer.parseInt(s);
			sum += jumsu;
			
//			sum += Integer.parseInt(str[i].substring(str[i].indexOf(":")+1));
			
			
//			"90"+"70"+"80"=907080
//			합:240 => 결과 출력
		}
		
		System.out.println("합:"+sum);
		
		
		sum = 0;
		String[] str2 = {"웬디:90","크리스탈:70","아이유:80"};
		for(i=0;i<str2.length;i++) {
			String[] s = str2[i].split(":");
			sum += Integer.parseInt(s[1]);
		}
		System.out.println("합:"+sum);
		
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n");
	}

}





