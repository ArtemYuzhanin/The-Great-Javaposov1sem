import java.util.Scanner;
public class Doublend {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(doublend(x));
		in.close();
	}
	public static boolean doublend(int x) {
		if ((x%10) == (x/10)%10)
			return true;
		else
			return false;
	}
}