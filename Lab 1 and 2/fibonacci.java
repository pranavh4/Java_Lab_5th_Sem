import java.util.*;
public class fibonacci
{
	public static void displayFibonacci(int a)
        {
		if(a<=0)
			return;
                int first = 0;
                int second = 1;
                System.out.print(first + " ");
		if(a==1)
		{
			System.out.println();
			return;
		}
                for(int i = 2;i<=a;i++)
                {
                        System.out.print(second + " ");
                        int temp = first;
                        first = second;
                        second = temp+second;
                }
		System.out.println();
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		displayFibonacci(num);
	}
}
	
