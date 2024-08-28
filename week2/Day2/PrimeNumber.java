package week2.Day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
	int a=13;
	
	boolean flag=false;
	
	for(int i=2;i<a/2;i++)
	{
		if(a%i==0)
		{
			flag=true;
			break;
		}
	}
	
	if(!flag)
	{
		System.out.println("The Given number is a Prime number");
	}
	else
	{
		System.out.println("The Given Number is not a prime number");
	}
	
	}

}


//Console:
//The Given number is a Prime number.
