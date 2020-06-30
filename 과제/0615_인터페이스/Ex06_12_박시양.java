interface Camera{
	void takePhoto(); //사진 찍기
}

interface MP3{
	void playMp3(); //음악 감상
}

interface DMB{
	void viewTv(); // TV시청
}

class Shape2{
	private int size;
	private String color;
	Shape2(int size, String color){
		this.size = size;
		this.color = color;
	}
	public void show() {
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
	}
}

class Phone extends Shape2 implements Camera, MP3, DMB{
	Phone(int size, String color){
		super(size, color);		
	}
	public void show() {
		super.show();
	}
	
	public void takePhoto() {
		System.out.println("사진찍기.");
	}
	public void playMp3() {
		System.out.println("음악감상.");
	}
	public void viewTv() {
		System.out.println("TV시청");
	}
}

public class Ex06_12_박시양 {
	public static void main(String[] args) {
		
		Phone p = new Phone(7, "blue");
		p.playMp3();
		p.takePhoto();
		p.viewTv();
		p.show();
//		Phone p = new Phone(7, "blue");

	}

}
