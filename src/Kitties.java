import java.util.Scanner;
public class Kitties {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(kitties(x));
		in.close();
	}
	public static String kitties(int x) {
		String answer = x + " кот";
		if ((((x%100) < 20) && ((x%100) > 10)) || (((x%10) > 4) && ((x%10) < 10)) || ((x%10) == 0))
			answer = answer + "ов";
		else if (((x%10) < 5) && ((x%10) > 1))
			answer = answer + "а";
		return answer;
	}
}