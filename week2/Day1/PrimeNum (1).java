
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100; //range
		int temp=0;
		for(int i=2;i<=n;i++)
		{
			if(i%2==0 && n%i==0)
			{
				temp=1;
			}
			else
			{
				temp=0;
			}
			if(temp==0)
			{
				System.out.println(i);
			}
		}

	}

}
