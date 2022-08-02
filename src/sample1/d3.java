package sample1;

public class d3 {
	int a=20;
	public static void main(String[] args) 
	{
		d3 o3=new d3();
		System.out.println(o3.a);
		m1();
		d3 o1=new d3();
		o1.m2();
	}

	public static void m1()
	{
		d3 o2=new d3();
		System.out.println(o2.a);
	}
	
	public void m2 ()
	{
		System.out.println(a);
	}
}
