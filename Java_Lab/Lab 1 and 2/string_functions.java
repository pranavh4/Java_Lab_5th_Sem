import java.util.Scanner;
class string_functions
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("String length: "+str.length());
		System.out.println("Trimmed string: "+str.trim());
		System.out.println("Enter character to be replaced: ");
		char r = sc.nextLine().charAt(0);
		System.out.println("Enter character to be replaced with: ");
		char r_w = sc.nextLine().charAt(0);
		System.out.println("String with replaced characters: " + str.replace(r,r_w));
		System.out.println("Enter pattern to be found: ");
		String pat = sc.nextLine();
		if(str.contains(pat))
			System.out.println("Pattern Found");
		else
			System.out.println("Pattern not found");
		System.out.println("Enter string to be compared");
		String n_str = sc.nextLine();
		if(str.equals(n_str))
			System.out.println("Equal");
		else
			System.out.println("Not equa;");
	}
}


