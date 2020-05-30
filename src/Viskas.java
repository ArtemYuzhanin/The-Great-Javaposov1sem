import java.util.Scanner;
public class Viskas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(viskas(x));
		in.close();
	}
	public static boolean viskas(int x) {
		if (((x%4 + x%100) != 0) || ((x%400) == 0))
			return true;
		else
			return false;
	}
}