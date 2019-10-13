import NumberConversion.binary;
import NumberConversion.octal;
import NumberConversion.hexadecimal;
import java.util.Scanner;
public class num_conv 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Decimal\t2.Binary\t3.Octal\t4.Hexadecimal\t5.Exit");
		while(true)
		{
			int ch = sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
			case 1:
			{
				System.out.print("Enter Decimal Number: ");
				int dec = sc.nextInt();
				sc.nextLine();
				System.out.println("Binary: " + binary.dec_to_bin(dec));
				System.out.println("Octal: " + octal.dec_to_oct(dec));
				System.out.println("Hexadecimal: " + hexadecimal.dec_to_hex(dec));
				break;
			}
			case 2:
			{
				System.out.print("Enter Binary Number: ");
				String bin = sc.nextLine();
				int dec = binary.bin_to_dec(bin);
				System.out.println("Decimal: " + dec);
				System.out.println("Octal: " + octal.dec_to_oct(dec));
				System.out.println("Hexadecimal: " + hexadecimal.dec_to_hex(dec));
				break;
			}
			case 3:
			{
				System.out.print("Enter Octal Number: ");
				String oct = sc.nextLine();
				int dec = octal.oct_to_dec(oct);
				System.out.println("Binary: " + binary.dec_to_bin(dec));
				System.out.println("Decimal: " + dec);
				System.out.println("Hexadecimal: " + hexadecimal.dec_to_hex(dec));
				break;
			}
			case 4:
			{
				System.out.print("Enter Hexadecimal Number: ");
				String hex = sc.nextLine();
				int dec = hexadecimal.hex_to_dec(hex);
				System.out.println("Binary: " + binary.dec_to_bin(dec));
				System.out.println("Octal: " + octal.dec_to_oct(dec));
				System.out.println("Decimal: " + dec);
				break;
			}
			case 5:
				System.out.println("Exit Program");
				System.exit(1);
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}

