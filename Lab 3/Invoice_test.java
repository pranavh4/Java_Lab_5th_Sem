import java.util.Scanner;

class Invoice
{
	private int item_id = -1;
	private String item_name = "";
	private int item_type = -1;
	private int item_quantity = -1;
	private double item_price = -1;
	void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter item id: ");
		item_id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter item name: ");
		item_name = sc.nextLine();
		System.out.print("Enter item type: ");
		item_type = Integer.parseInt(sc.nextLine());
		System.out.print("Enter item quantity: ");
		item_quantity = Integer.parseInt(sc.nextLine());
		System.out.print("Enter item price: ");
		item_price = Double.parseDouble(sc.nextLine());
	}

	void getDetails()
	{
		System.out.println("Item id: " + item_id);
		System.out.println("Item name: " + item_name);
		System.out.println("Item type: " + item_type);
		System.out.println("Item quantity: " + item_quantity);
		System.out.println("Item price: " + item_price);
	}

	private double calculateTax()
	{
		double []tax = {0.0,0.05,0.12,0.18,0.28};
		return item_price*tax[item_type];
	}

	void printInvoice()
	{
		System.out.println("-------FINAL INVOICE-------");
		getDetails();
		double tax = calculateTax();
		double total_price = item_quantity*(item_price + tax);
		System.out.println("Tax per item: "+tax);
		System.out.println("Total tax: "+item_quantity*tax);
		System.out.println("Total amount payable: "+total_price);
	}
}

public class Invoice_test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of items: ");
		int num = Integer.parseInt(sc.nextLine());
		Invoice []items = new Invoice[num];
		for(int i = 0; i < num;i++)
		{
			System.out.println("-----ITEM "+i+1+"-----");
			items[i] = new Invoice();
			items[i].setDetails();
		}
		for(int i = 0; i < num;i++)
			items[i].printInvoice();
	}
}

