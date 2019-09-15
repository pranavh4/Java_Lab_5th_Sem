import java.util.Scanner;
import java.io.*;
class string_buffer
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		StringBuffer sb = new StringBuffer(sc.nextLine());
		System.out.println("String: "+sb);
		System.out.print("Enter string to be appended: ");
		String str = sc.nextLine();
		System.out.println("Appended String: "+sb.append(str));
		System.out.print("Enter string to be inserted: ");
		str = sc.nextLine();
		System.out.print("Enter index at which string is inserted: ");
		int ind = Integer.parseInt(sc.nextLine());
		System.out.println("Inserted string: "+sb.insert(ind,str));
		System.out.println("Enter pattern to be replaced: ");
		//flush();
		String pat = sc.nextLine();
		System.out.print("Enter start and end index: ");
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println("Replaced String: "+sb.replace(s,e,pat));
	}
}
