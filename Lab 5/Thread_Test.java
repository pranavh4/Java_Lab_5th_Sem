class Thread_one extends Thread
{
	Thread_one()
	{
		super("Prime");
		start();
	}
	static boolean isPrime(int num)
	{
		if(num==1)
			return false;
		for(int i = 2;i<=num/2;i++)
			if(num%i==0)
				return false;
		return true;
	}
	
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			if(isPrime(i))
			{
				try 
				{
					System.out.println("Thread: "+this.getName()+" : " + i);
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println("Exception caught");
				}
			}
		}
	}
}

class Thread_two extends Thread
{
	Thread_two()
	{
		super("Divide");
		start();
	}
	
	public void run()
	{
		for(int i = 1;i<=100;i++)
		{
			if(i%2==0 && i%4==0 && i%6==0)
			{
				try
				{
					System.out.println("Thread: "+this.getName()+" : "+i);
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println("Exception caught");
				}
			}
		}
	}
}

public class Thread_Test {
	public static void main(String []args)
	{
		new Thread_one();
		new Thread_two();
	}
}
