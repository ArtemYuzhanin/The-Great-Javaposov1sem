import java.util.Scanner;
public class Fivend {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(fivend(x));
		in.close();
	}
	public static boolean fivend(int x) {
		if ((x%10) == 5)
			return true;
		else
			return false;
	}
}