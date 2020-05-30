package OSNOVNYE_ZADANYA;

import java.util.Scanner;
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] answer = sieveOfEratosthenes(n);
        for (int i : answer)
            System.out.println(i);

        in.close();
    }

    public static int[] sieveOfEratosthenes(int n) {
        int k = 0;
        int s = 0;
        boolean[] osnova = massiveOftruth(n);

        for (int i = 0; i < n+1; i++) {
            if (osnova[i])
                k++;
        }

        int[] prostaki = new int[k];

        for (int i = 1; i < n+1; i++) {
            if (osnova[i]) {
                prostaki[s] = i;
                s++;
            }

        }

        return prostaki;
    }

    public static boolean prosto(int x) {
        boolean a = true;
        boolean b = false;
        if (x < 4 && x > 0) {
            return a;
        }
        else {
            if (x % 2 == 0) {
                return b;
            }
            else {
                for (int i = 3; i < (x / 2); i += 2) {
                    if (x % i == 0) {
                        return b;
                    }
                }
                return a;
            }
        }
    }

    public static boolean[] massiveOftruth(int n) {
        boolean[] truth = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            truth[i] = prosto(i);
        }
        return truth;
    }

}
