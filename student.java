import java.util.Scanner;
class student
{
	static String grade(int m1, int m2, int m3)
	{
		float p = (m1+m2+m3)/3;
		if (p<50)
			return "F";
		else if (p>=50 && p<60)
			return "D";
		else if (p>=60 && p<70)
			return "C";
		else if (p>=70 && p<80)
			return "B";
		else if (p>=80 && p<90)
			return "A";
		else if (p>=90 && p<=100)
			return "S";
		else
			return "INVALID";
	}

	public static void main(String args[])
	{
		int m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 subject marks: ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		System.out.println("Grade: "+grade(m1,m2,m3));
	}
}
