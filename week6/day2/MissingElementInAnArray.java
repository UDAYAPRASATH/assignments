package week6.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,7,6,8};

		
		for (int i = 0; i < arr.length; i++) {
			 
			if(i+1!=arr[i])
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
