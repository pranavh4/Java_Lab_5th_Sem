package NumberConversion;

public class binary
{
	public static String dec_to_bin(int num)
	{
		if(num==0)
			return "0";
		StringBuffer bin = new StringBuffer("");
		while(num!=0)
		{
			int rem = num%2;
			num/=2;
			bin.insert(0,String.valueOf(rem));
		}
		return String.valueOf(bin);
	}
	
	public static int bin_to_dec(String bin)
	{
		int num = 0;
		int len = bin.length();
		for(int i=0;i<len;i++)
		{
			if (bin.charAt(i)=='1')
				num+=Math.pow(2,len-i-1);
		}
		return num;
	}
}
