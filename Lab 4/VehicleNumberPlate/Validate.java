package VehicleNumberPlate;

public class Validate {
	public static boolean check_number_plate(String plate)
	{
		String []parts = plate.split(" ");
		if (parts.length > 4)
			return false;
		for(int i = 0; i < 4; i+=2)
		{
			if(parts[i].length()>2)
				return false;
			for(int j = 0; j < 2; j++)
				if(!Character.isLetter(parts[i].charAt(j)))
					return false;
		}
		if (parts[1].length()>2 || parts[3].length()>4)
			return false;
		try
		{
			Integer.parseInt(parts[1]);
			Integer.parseInt(parts[3]);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
	}
}
