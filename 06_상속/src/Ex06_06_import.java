//import ��Ű��1.��Ű��2.��Ű��3.Ŭ������;
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
//		System.out.println("��ǰ��:"+name);
//		System.out.println("����:"+price);
//	}
//}

public class Ex06_06_import {
	public static void main(String[] args) {
		
		Product p = new Product("���̴�",300);
		p.print();
		
		Scanner sc = new Scanner(System.in);
		
		int result = Math.max(3, 4);
		System.out.println(result);
		
		Date d = new Date();
		System.out.println("d:"+d);
		
	}

}




