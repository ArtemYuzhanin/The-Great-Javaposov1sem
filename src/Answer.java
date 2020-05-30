import java.util.Scanner;
import java.text.DecimalFormat;
public class Answer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		System.out.println(answer(a, b, c));
		in.close();
	}
	public static String answer(double a, double b, double c) {
		String z;
		DecimalFormat df = new DecimalFormat("#0.00");
		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					z = "решений бесконечно много";
				else
					z = "решений нет";
			}
			else
				z = "одно решение x = " + df.format((-c)/b);
		}
		else {
			if (b == 0) {
				if (c == 0)
					z = "одно решение x = 0";
				else {
					if (((-c)/a) < 0)
						z = "решений нет";
					else {
						double x = Math.sqrt((-c)/a);
						z = "два решения x1 = -" + df.format(x) + ", x2 = " + df.format(x);
					}
				}
			}
			else {
				double d = b*b - 4*a*c;
				if (d < 0)
					z = "решений нет";
				else if (d == 0)
					z = "одно решение x = " + df.format(-b/(2*a));
				else {
					double xa = (-b - Math.sqrt(d))/(2*a);
					double xb = (-b + Math.sqrt(d))/(2*a);
					if (xa < xb)
						z = "два решения x1 = " + df.format(xa) + ", x2 = " + df.format(xb);
					else
						z = "два решения x1 = " + df.format(xb) + ", x2 = " + df.format(xa);
				}
			}
		}
		return z;
	}
}