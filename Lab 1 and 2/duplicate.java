import java.util.Scanner;
class duplicate
{
	static boolean find(int []arr, int len, int elem)
	{
		for(int i = 0;i< len;i++)
			if(arr[i]==elem)
				return true;
		return false;
	}
	static void display_duplicate(int []arr, int len)
	{
		int []dup_arr = new int[len];
		int dup_count = 0;
		for(int i = 0;i < len;i++)
		{
			int count = 1;
			if(find(dup_arr,dup_count,arr[i]))
				continue;
			for(int j = i+1;j < len; j++)
				if(arr[j]==arr[i])
					count++;
			if(count>1)
			{
				dup_arr[dup_count++] = arr[i];
				System.out.println("Element: "+arr[i]+"\tCount: "+count);
			}
		}
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
		display_duplicate(arr,len);
	}
}
