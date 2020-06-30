class Book{
	private String title;
	private int price;
	
	Book(String title,int price){
		this.title = title;
		this.price = price;
	}
	
	Book(){
		
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void setPrice(int price){
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
	void display() {
		System.out.println("title:"+title);
		System.out.println("price:"+price);
		System.out.println();
	}
}

public class Ex05_18_객체배열 {
	public static void main(String[] args) {

		int a=1,b=2,c=3;
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[] {1,2,3};
		int[] arr3 = new int[3];
		arr3[0]=1;
		arr3[1]=2;
		arr3[2]=3;
		
		Book b1 = new Book("자바",1000);
		Book b2 = new Book("HTML",2000);
		b1.display();
		b2.display();
		System.out.println("-----------------");
		
//		Book[] bk = new Book[3];
//		bk[0] = new Book("자바",1000);
//		bk[1] = new Book("HTML",2000);
//		bk[2] = new Book(); //JSP,3000 ,setter
		
		Book[] bk = {new Book("자바",1000),
					new Book("HTML",2000),
					new Book()};
		
		
		bk[2].setTitle("JSP");
		bk[2].setPrice(3000);
		
		bk[0].display();
		bk[1].display();
		bk[2].display();
		System.out.println("***********");
		int i;
		for(i=0;i<bk.length;i++) {
			bk[i].display();
		}
		
		System.out.println(bk[2].getPrice());
	}

}






