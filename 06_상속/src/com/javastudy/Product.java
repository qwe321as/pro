package com.javastudy;
import java.util.Scanner;
//import java.lang.*;

public class Product {
	private String name;
	private int price;
	
	public Product(String name,int price){
		this.name = name;
		this.price = price;
	}
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ��2:"+name);
		System.out.println("����:"+price);
	}
}




