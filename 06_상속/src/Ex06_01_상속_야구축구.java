class Sports{
	String name;
	int inwon;
	
//	Sports(){
//		System.out.println("Sports()");
//	}
	Sports(String name,int inwon){
		this.name = name;
		this.inwon = inwon;
	}
	
	void display() {
		System.out.println("종목이름:"+name);
		System.out.println("인원수:"+inwon);
		System.out.println();
	}
} // Sports

class Baseball extends Sports{ // 자식 extends 부모
//	String name;
//	int inwon;
	double ta;
	
	public Baseball(String name, int inwon, double ta) {
		super(name,inwon); // 
//		this.name = name;
//		this.inwon = inwon;
		this.ta = ta;
	}
	void display() {
//		System.out.println("종목이름:"+name);
//		System.out.println("인원수:"+inwon);
		super.display();
		System.out.println("타율:"+ta);
		System.out.println();
	}
}// Baseball

class Football extends Sports{
//	String name;
//	int inwon;
	int goal;
	
	Football(String name, int inwon,int goal){
		super(name,inwon);
//		this.name = name;
//		this.inwon = inwon;
		this.goal = goal;
	}
	void display() {
//		System.out.println("종목이름:"+name);
//		System.out.println("인원수:"+inwon);
		super.display();
		System.out.println("골수:"+goal);
		System.out.println();
	}
}

public class Ex06_01_상속_야구축구 {
	public static void main(String[] args) {
		//Sports s = new Sports();
		Sports s = new Sports("스포츠",1);
		s.display();
		
		//Baseball b = new Baseball("야구",9,0.235);
		Sports b = new Baseball("야구",9,0.235);
		b.display();
		
		//Football f = new Football("축구",11,6);
		Sports f = new Football("축구",11,6);
		f.display();
		
		System.out.println("=====");
		Sports[] spo = {
						new Sports("스포츠",1),
						(Sports)new Baseball("야구",9,0.235),
						new Football("축구",11,6)
						};
		int i;
		for(i=0;i<spo.length;i++) {
			spo[i].display();
		}
		
	}

}








