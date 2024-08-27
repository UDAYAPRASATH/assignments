package week2.Day2;

import java.util.Iterator;

public class FibanocciSeries {

	public static void main(String[] args) {

		System.out.println("FIBANOCCI SERIES:");
		int a=0;
		int b=1;
		int range=8;
		System.out.print(a+" "+b+" ");
		for (int i = 0; i < range-2; i++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}
		
	}

}


//Console:
//FIBANOCCI SERIES:
//0 1 1 2 3 5 8 13 