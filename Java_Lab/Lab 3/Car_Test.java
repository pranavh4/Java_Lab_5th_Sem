import java.util.Scanner;
class Car
{
	String car_name, car_model,car_color;
	Car(String name, String model, String color)
	{
		car_name = name;
		car_model = model;
		car_color = color;
	}
	public String toString()
	{
		String val = "Name: "+this.car_name+"\nModel: "+this.car_model+"\nColor: "+this.car_color+"\n";
		return val;
	}

	void printDetails
