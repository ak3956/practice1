package sample1;

public class demo5 {
	public static void main(String[] args) {
		
		
		m1();
		demo5 o1=new demo5();
		o1.m2();
		demo6.m3();
		demo6 o2=new demo6();
		o2.m4();
		
	}

	
	public static void m1() {
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void m2() {
		int a=100;
		int b=10;
		int c=10;
		int diff=a-b-c;
		System.out.println(diff);
	}
	
	
}

