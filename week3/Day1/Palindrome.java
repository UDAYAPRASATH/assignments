package week3.Day1;

public class Palindrome {

	public static void main(String[] args) {
	
		String str="madam";
		String str1="";
		
		for(int i=0;i<str.length();i++)
		{
			str1=str.charAt(i)+str1;
		}
		if(str.equals(str1))
		{
			System.out.println("The given string is palindrome");
		
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}

	}

}
