import java.util.*;
import VehicleNumberPlate.Validate;
public class Validate_Test {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter license plate number: ");
		String plate = sc.nextLine();
		if(Validate.check_number_plate(plate))
			System.out.println("Valid Number plate");
		else
			System.out.println("Invalid Number Plate");
	}
}
