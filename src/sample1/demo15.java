package sample1;

public class demo15 {
	public static void main(String[] args) {
		
		int boyedge=21;
		int girledge =11;
		if (boyedge>=21) {
			System.out.println("boy is eligible for marrage");
			if (girledge>=21) {
				System.out.println("girl is eligible for marrage");
			}
			else {
				System.out.println("girl is not eligible for marrage");
			}
		}
		else {
			System.out.println("boy is not eligible for marrage");
		}
	}

}
