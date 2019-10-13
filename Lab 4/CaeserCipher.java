import java.util.Scanner;

interface EncryptDecrypt
{
	public void Encrypt(int dir,int step);
	public void Decrypt(int dir, int step);
}

class Encrypt_Number implements EncryptDecrypt
{
	int number;
	int enc_num;
	Encrypt_Number(int num)
	{
		number = num;
	}
	
	@Override
	public void Encrypt(int dir, int step) {
		// TODO Auto-generated method stub
		String enc = "";
		enc_num=0;
		int num = number;
		if(dir==1)
		{
			while(num!=0)
			{
				int rem = num%10;
				enc = String.valueOf((rem+step)%10) + enc;
				num/=10; 
			}
		}
		else
		{
			while(num!=0)
			{
				int rem = num%10;
				enc = String.valueOf((rem+10-step)%10) + enc;
				num/=10; 
			}
		}
		enc_num = Integer.parseInt(enc);
		System.out.println("Encrypted Number: " + enc_num);
	}

	@Override
	public void Decrypt(int dir, int step) {
		// TODO Auto-generated method stub
		String dec = "";
		int num = enc_num;
		if(dir==1)
		{
			while(num!=0)
			{
				int rem = num%10;
				dec = String.valueOf((rem+10-step)%10) + dec;
				num/=10; 
			}
		}
		else
		{
			while(num!=0)
			{
				int rem = num%10;
				dec = String.valueOf((rem+step)%10) + dec;
				num/=10; 
			}
		}
		System.out.println("Decrypted Number: " + dec);
	}
}

class Encrypt_Message implements EncryptDecrypt
{
	String alpha = "abcdefghijklmnopqrstuvwxyz";
	String message;
	String enc_message="";
	Encrypt_Message(String m)
	{
		message = m;
	}
	
	@Override
	public void Encrypt(int dir, int step) {
		// TODO Auto-generated method stub
		if(dir==1)
		{
			for(int i=0;i<message.length();i++)
				enc_message += String.valueOf(alpha.charAt((alpha.indexOf(message.charAt(i))+step)%26));
		}
		else
		{
			for(int i=0;i<message.length();i++)
				enc_message += String.valueOf(alpha.charAt((alpha.indexOf(message.charAt(i))+26-step)%26));
		}
		System.out.println("Encrypted Message: " + enc_message);
	}

	@Override
	public void Decrypt(int dir, int step) {
		// TODO Auto-generated method stub
		String dec_message="";
		if(dir==1)
		{
			for(int i=0;i<message.length();i++)
				dec_message += String.valueOf(alpha.charAt((alpha.indexOf(enc_message.charAt(i))+26-step)%26));
		}
		else
		{
			for(int i=0;i<message.length();i++)
				dec_message += String.valueOf(alpha.charAt((alpha.indexOf(enc_message.charAt(i))+step)%26));
		}
		System.out.println("Decrypted Message: " + dec_message);
	}
}


public class CaeserCipher {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		Encrypt_Number enc_n = new Encrypt_Number(sc.nextInt());
		System.out.print("Enter Direction and Step: ");
		int dir = sc.nextInt(), step = sc.nextInt();
		sc.nextLine();
		enc_n.Encrypt(dir, step);
		enc_n.Decrypt(dir, step);
		System.out.print("Enter Message: ");
		Encrypt_Message enc_m = new Encrypt_Message(sc.nextLine());
		System.out.print("Enter Direction and Step: ");
		dir = sc.nextInt();
		step = sc.nextInt();
		enc_m.Encrypt(dir, step);
		enc_m.Decrypt(dir, step);
	}

}
