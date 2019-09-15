import java.util.*;

public class gcdlcm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		find obj = new find(n1,n2);
		System.out.println("GCD: "+obj.gcd());
		System.out.println("LCM: "+obj.lcm());
	}
}

class find
{
	int n1,n2;
	public find(int x, int y)
	{
		n1 = x;
		n2 = y;
	}

	public int gcd()
	{
		int greatest;
		int hcf = 1;
		if(n1>n2)
			greatest = n1;
		else
			greatest = n2;
		for(int i=greatest;i>=1;i--)
		{
			if((n1%i)==0 && (n2%i)==0)
			{
				hcf = i;
				break;	
			}
		}
		return hcf;
	}

	public int lcm()
	{
		int hcf = gcd();
		return (n1*n2)/hcf;
	}
}
		


