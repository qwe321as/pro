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
		System.out.println("�����̸�:"+name);
		System.out.println("�ο���:"+inwon);
		System.out.println();
	}
} // Sports

class Baseball extends Sports{ // �ڽ� extends �θ�
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
//		System.out.println("�����̸�:"+name);
//		System.out.println("�ο���:"+inwon);
		super.display();
		System.out.println("Ÿ��:"+ta);
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
//		System.out.println("�����̸�:"+name);
//		System.out.println("�ο���:"+inwon);
		super.display();
		System.out.println("���:"+goal);
		System.out.println();
	}
}

public class Ex06_01_���_�߱��౸ {
	public static void main(String[] args) {
		//Sports s = new Sports();
		Sports s = new Sports("������",1);
		s.display();
		
		//Baseball b = new Baseball("�߱�",9,0.235);
		Sports b = new Baseball("�߱�",9,0.235);
		b.display();
		
		//Football f = new Football("�౸",11,6);
		Sports f = new Football("�౸",11,6);
		f.display();
		
		System.out.println("=====");
		Sports[] spo = {
						new Sports("������",1),
						(Sports)new Baseball("�߱�",9,0.235),
						new Football("�౸",11,6)
						};
		int i;
		for(i=0;i<spo.length;i++) {
			spo[i].display();
		}
		
	}

}








