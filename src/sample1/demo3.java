package sample1;

public class demo3 {
	public static void main(String[] args) {
		m1();
		demo4.m2();
		
		demo3 o1=new demo3();
		o1.m3();
		demo4 o2= new demo4();
		o2.m4();
		
		
	}

	
	
	
	
	
	public static void m1() {
		System.out.println("run static regular method m1 in same class");
	}
	
	public void m3() {
		System.out.println("run non static method m3 in same class");
	}
}
