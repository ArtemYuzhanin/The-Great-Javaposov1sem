package OSNOVNYE_ZADANYA;

import java.util.Scanner;
public class Prosto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(prosto(x));
        in.close();
    }

    public static String prosto(int x) {
        String a = "Простое";
        String b = "Не простое";
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
}