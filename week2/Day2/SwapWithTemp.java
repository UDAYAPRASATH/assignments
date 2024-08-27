package week2.Day2;

public class SwapWithTemp {

	public static void main(String[] args) {
		int a=10;
		int b=87;
		
		int temp;
		System.out.println("Before Swapping a is:"+a);
		System.out.println("Before Swapping b is:"+b);
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("After Swapping a is"+a);
		System.out.println("After Swaping b is "+b);
	}

}
/*Console:
 * Before Swapping a is:10 Before Swapping b is:87 After Swapping a is87 After
 * Swaping b is 10
 */
