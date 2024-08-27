package week2.Day2;

public class Factorial {

	public static void main(String[] args) {

		int num=5;
		
		int fact=1;
		
		for (int i = num; i >=1; i--) {
			fact=i*fact;
		}
		
		System.out.println("Factorial of "+num+"is :"+fact);
		
	}

}
