package NumberConversion;

public class octal 
{
	public static String dec_to_oct(int num)
	{
		if(num==0)
			return "00";
		StringBuffer oct = new StringBuffer("");
		while(num!=0)
		{
			int rem = num%8;
			num/=8;
			oct.insert(0,String.valueOf(rem));
		}
		return String.valueOf("0"+oct);
	}
	
	public static int oct_to_dec(String oct)
	{
		String n_oct = oct.substring(1);
		int num = 0;
		int len = n_oct.length();
		for(int i=0;i<len;i++)
		{
				num+=(Character.getNumericValue(n_oct.charAt(i))*Math.pow(8,len-i-1));
		}
		return num;
	}
}
