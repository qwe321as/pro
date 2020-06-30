class Top<T>{
	private T data;
	void setData(T data){
		this.data = data;
	}
	T getData() {
		return data;
	}
}

//class Top2{
//	private Integer data;
//	void setData(Integer data){
//		this.data = data;
//	}
//	Integer getData() {
//		return data;
//	}
//}

public class Ex09_01_generic {
	public static void main(String[] args) {
		Top<String> t1 = new Top<String>();
		t1.setData("Hello");
		System.out.println(t1.getData());
		
		Top<Integer> t2 = new Top<Integer>();
		t2.setData(10);
		System.out.println(t2.getData());
		
	}
}






