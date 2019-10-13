package NumberConversion;

public class hexadecimal {
	
	private static String hexa = "0123456789ABCDEF";
	public static String dec_to_hex(int num)
	{
		if(num==0)
			return "0x0";
		StringBuffer hex = new StringBuffer("");
		while(num!=0)
		{
			int rem = num%16;
			num/=16;
			hex.insert(0,hexa.charAt(rem));
		}
		return String.valueOf("0x"+hex);
	}
	public static int hex_to_dec(String hex)
	{
		String n_hex = hex.substring(2);
		int num = 0;
		int len = n_hex.length();
		for(int i=0;i<len;i++)
		{
				num+=(hexa.indexOf(n_hex.charAt(i))*Math.pow(16,len-i-1));
		}
		return num;
	}
}
