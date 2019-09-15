class str_fun
{
	static boolean equal_ignore_case(String str1,String  str2)
	{
		return str1.equalsIgnoreCase(str2);
	}

	static int vowel_count(String str)
	{
		String vowel = "aeiou";
		int count = 0;
		for(int i=0;i<str.length();i++)
			if(vowel.contains((String)str.charAt(i)))
				count++;
		return count;
	}

	public static void main(String []args)
	{
		vowel_count("hello");
	}
}
			
	
