package week3.Day1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
	
		
		
		int arr[]= {12,34,23,97,56,89,74};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}

}
