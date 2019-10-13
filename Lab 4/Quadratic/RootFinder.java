package Quadratic;

public class RootFinder {
	public static void find_root(double []eqn)
	{
		double []roots = {0.0,0.0};
		double a = eqn[0], b = eqn[1], c = eqn[2];
		double d = b*b - 4*a*c;
		roots[0] = (-b + Math.sqrt(d))/(2*a);
		roots[1] = (-b - Math.sqrt(d))/(2*a);
		System.out.println("Roots are " + roots[0] + " and " + roots[1]);
	}
}
