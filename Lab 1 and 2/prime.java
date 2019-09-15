public class prime
{
	static boolean isprime(int num)
	{
		for(int i = (int)(num/2);i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	static void displayPrime()
	{
		System.out.println("First 50 prime numbers:");
		int count = 0;
		int num = 2;
		while(count<50)
		{
			boolean flag = isprime(num);
			if(flag)
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
	public static void main(String []args)
	{
		displayPrime();
	}
}

