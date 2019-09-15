import java.util.*

public class staticmath()
{
	public static void factorial(int a)
	{
		int fact = 1;
		for(int i=2;i<=a;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

	public static void fibonacci(int a)
	{
		first = 0;
		second = 1;
		System.out.[p
		for(int i = 2;i<=a;i++)
		{
			System.out.print(second + " ");
			int temp = first;
			first = second;
			second = temp+second;
		}

