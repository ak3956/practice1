package sample1;

public class demo12 {
	public static void main(String[] args) 
	{
	int marks =75;
	if(marks>=65) {      //condition 1
		System.out.println("distinction");
	}
	
	else if(marks>=60){  //condition 2
		System.out.println("first class");
	}
	else if (marks>=55) {   //condition 3
		System.out.println("second class");
	}
	else if (marks>=50) {//condition 4
		System.out.println("third class");
	}
	else {
		System.out.println("fail");
	}
	}
}
