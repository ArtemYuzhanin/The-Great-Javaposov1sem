package ThinkingRationally;

import java.util.Scanner;

public class ExperimetsWithRationals {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            a = a*i + b;
            b = b*i;
        }
        System.out.println(a/b);
    }
}
