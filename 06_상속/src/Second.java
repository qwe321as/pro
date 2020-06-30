class First {
	static int a = 11;
	int b = 2;
	protected int c = 3;
}
class Second extends First {
	public static void main(String[] args) {
		First f = new First();
		System.out.print(a);
		System.out.print(f.b);
		System.out.print(f.c);
	}
}