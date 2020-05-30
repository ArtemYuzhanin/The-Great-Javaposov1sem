import java.util.Scanner;
public class Poly {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		System.out.println(poly(a,b,c));
		in.close();
	}
	public static String poly(int a, int b, int c) {
		String z = "";
		if (a != 0) {
			if (a == 1)
				z = z + "x^2";
			else if (a == (-1))
				z = "-x^2";
			else
				z = a + "x^2";
		}
		if (b != 0) {
			if ((b > 0) && (a != 0))
				z = z + "+";
			if (b == 1)
				z = z + "x";
			else if (b == (-1))
				z = z + "-x";
			else
				z = z + b + "x";
		}
		if (c != 0) {
			if ((c > 0) && ((a != 0) || (b != 0)))
				z = z + "+";
			z = z + c;
		}
		if (z == "")
			z = "0";
		return z;
	}
}