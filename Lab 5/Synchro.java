class Print
{
	public boolean flag = false;
	public synchronized void print_one()
	{
		while(flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted");
			}
		}
		System.out.print("JAVA ");
		flag = true;
		notify();
	}
	
	public synchronized void print_two()
	{
		while(!flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted");
			}
		}
		System.out.print("PROGRAMMING\n");
		flag = false;
		notify();
	}
}

class Thread_one extends Thread
{
	Print obj;
	Thread_one(Print ob)
	{
		obj = ob;
		start();
	}
	public void run()
	{
		while(true)
			obj.print_one();
	}
}

class Thread_two extends Thread
{
	Print obj;
	Thread_two(Print ob)
	{
		obj = ob;
		start();
	}
	public void run()
	{
		while(true)
			obj.print_two();
	}
}
public class Synchro {
	public static void main(String []args)
	{
		Print obj = new Print();
		new Thread_one(obj);
		new Thread_two(obj);
	}
}
