import java.util.Scanner;
class armstrong
{
	static boolean checkArmstrongNumber(int num)
	{
		int len = 0;
		int temp = num;
		int n_num = 0;
		while(temp!=0)
		{
			len++;
			temp/=10;
		}
		temp = num;
		while(temp!=0)
		{
			int rem = temp%10;
			n_num+=Math.pow(rem,len);
			temp/=10;
		}
		if(n_num==num)
			return true;
		else
			return false;
	}
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		if(checkArmstrongNumber(num))
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}
		
