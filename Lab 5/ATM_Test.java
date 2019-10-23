import java.util.Scanner;

class DailyTransactionLimitException extends Exception
{
	public String toString()
	{
		return "Exceeded Daily Transaction Limit";
	}
}

class InsufficientAmountException extends Exception
{
	public String toString()
	{
		return "Insufficient Funds in Account";
	}
}

class Account
{
	int balance;
	int lim = 0;
	Account(int bal)
	{
		balance = bal;
	}
	public void withdraw(int amt) throws DailyTransactionLimitException, InsufficientAmountException 
	{
		if(lim+amt>25000)
			throw new DailyTransactionLimitException();
		if(amt>balance)
			throw new InsufficientAmountException();
		balance -= amt;
		lim+=amt;
		System.out.println("Withdrawal Succesful\nBalance: "+balance);
	}
}
public class ATM_Test {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Balance: ");
		Account acc = new Account(sc.nextInt());
		System.out.println("1.Withdraw\t2.Exit");
		while(true)
		{
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter Amount: ");
				try
				{
					acc.withdraw(sc.nextInt());
				}
				catch(DailyTransactionLimitException e)
				{
					System.out.println("Warning: "+ e);
				} 
				catch (InsufficientAmountException e) {
					System.out.println("Warning: "+ e);
				}
				break;
			}
			case 2:
				System.out.println("Exited");
				System.exit(1);
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
