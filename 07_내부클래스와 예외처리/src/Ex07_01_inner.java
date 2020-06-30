class Car{
	CarInfo info;
	String color;
	
	class CarInfo{ // 내부 클래스 
		String model;
		int year;
		
		CarInfo(String model,int year){
			this.model = model;
			this.year = year;
		}
		
		void CarInfoPrint() {
			System.out.println(model+","+year);
		}
	} //  CarInfo
	
	Car(String model,int year,String color){
		info = new CarInfo(model,year);
		this.color = color; 
	}
	
	void CarPrint() {
		info.CarInfoPrint();
		System.out.println(info.model+","+info.year+","+color);
	}
	
} // Car

public class Ex07_01_inner {
	public static void main(String[] args) {
		
		Car pride = new Car("프라이드",2020,"파랑");
		pride.CarPrint();
		//pride.color;
		pride.info.CarInfoPrint();
	}
}






