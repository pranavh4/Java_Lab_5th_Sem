public class Program1
{
	public static void display()
	{
		System.out.println("Program1 Static Display");
	}

	public static void main(String args[])
	{
		System.out.println("Program1 Main");
		display();
		Program2.display();
	}
}

class Program2
{
	public static void display()
	{
		System.out.println("Program2 Static Display");
	}
}

