import java.util.Scanner;
public class ThreeNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(threenum(x));
		in.close();
	}
	public static boolean threenum(int x) {
		if ((x < 1000) && (x > 99))
			return true;
		else
			return false;
	}
}