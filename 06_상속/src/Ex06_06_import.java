//import 패키지1.패키지2.패키지3.클래스명;
import java.util.Date;
import java.util.Scanner;

//import a.b.c.Test;
import com.javastudy.Product;

//class Product{
//	private String name;
//	private int price;
//	
//	Product(String name,int price){
//		this.name = name;
//		this.price = price;
//	}
//	void print() {
//		System.out.println("제품명:"+name);
//		System.out.println("가격:"+price);
//	}
//}

public class Ex06_06_import {
	public static void main(String[] args) {
		
		Product p = new Product("사이다",300);
		p.print();
		
		Scanner sc = new Scanner(System.in);
		
		int result = Math.max(3, 4);
		System.out.println(result);
		
		Date d = new Date();
		System.out.println("d:"+d);
		
	}

}




