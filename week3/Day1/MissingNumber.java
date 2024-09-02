package week3.Day1;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[]=new int[6];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=7;
		a[4]=5;
		a[5]=6;
		
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			if(i+1!=a[i])
			{
				System.out.println(i+1);
				break;
			}
		}
		
		
		
		
	}

}
