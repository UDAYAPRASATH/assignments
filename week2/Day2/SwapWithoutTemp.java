package week2.Day2;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		
		System.out.println("Before Swapping a is:"+a);
		System.out.println("Before Swapping b is:"+b);
		
		
		b=b-a;
		a=a+b;
		
		
		
		System.out.println("After Swapping a is"+a);
		System.out.println("After Swaping b is "+b);

	}

}
