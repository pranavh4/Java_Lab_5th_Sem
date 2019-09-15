import java.util.Scanner;
class zero
{
	static void disp_zero(int []arr, int len)
	{
		int []new_arr = new int[len];
		int n_index = 0;
		for(int i = 0;i < len;i++)
		{
			if(arr[i]==0)
				continue;
			new_arr[n_index++] = arr[i];
		}
		for(int i =0;i< len;i++)
			System.out.print(new_arr[i]);
		System.out.println();
	}
	public static void main(String []args)
        {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter array length: ");
                int len = sc.nextInt();
                int [] arr = new int[len];
                System.out.print("Enter array elements: ");
                for(int i = 0;i<len;i++)
                        arr[i] = sc.nextInt();
		disp_zero(arr,len);
	}
}
