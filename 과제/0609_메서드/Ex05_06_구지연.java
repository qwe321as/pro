class Pay{
	String name;
	int bonbong; 
	int tex;
	int silsu;

	
	void setName() {
		System.out.println("�̸�:"+ name);
	}

	void setBonbong() {
		System.out.println("����:"+ bonbong+ "����");
	}
	
	void setTex() {
		if(bonbong>=300) {
			tex = (bonbong*3)/100;
			System.out.println("����:" + tex + "����");
		}
		else if(bonbong>=200) {
			tex = (bonbong*2)/100;
			System.out.println("����:" + tex + "����");
		}
		else if(bonbong<200) {
			tex = (bonbong*1)/100;
			System.out.println("����:" + tex + "����");
		}
	}
	void setSilsu() {
			silsu = bonbong - tex;
			System.out.println("�� ����:" + silsu + "����");
			System.out.println("==============");
	}
	
}

public class Ex05_06_������ {
	public static void main(String[] args) {
		
	
		
		Pay p1 = new Pay();
		p1.name = "��";
		p1.bonbong = 100;
		p1.setName();
		p1.setBonbong();
		p1.setTex();
		p1.setSilsu();

		
		Pay p2 = new Pay();
		p2.name = "����";
		p2.bonbong = 200;
		p2.setName();
		p2.setBonbong();
		p2.setTex();
		p2.setSilsu();
			

		Pay p3 = new Pay();
		p3.name = "����";
		p3.bonbong = 300;
		p3.setName();
		p3.setBonbong();
		p3.setTex();
		p3.setSilsu();
		
		
	}

}
