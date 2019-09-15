import java.util.*;

public class factorial
{
        public static void findFactorial(int a)
        {
                int fact = 1;
                for(int i=2;i<=a;i++)
                {
                        fact*=i;
                }
                System.out.println("Factorial: "+fact);
        }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		findFactorial(num);
	}
}	

