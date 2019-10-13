import java.util.Scanner;
import Quadratic.RootFinder;
public class Quadratic_Test {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		double []eqn = {0.0,0.0,0.0};
		System.out.print("Enter a, b and c values: ");
		eqn[0] = sc.nextDouble();
		eqn[1] = sc.nextDouble();
		eqn[2] = sc.nextDouble();
		RootFinder.find_root(eqn);
	}
}
