package OSNOVNYE_ZADANYA;

import java.util.Arrays;

public class TwoDimensionalArrayTask {
    public static void main(String[] args) {
        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
    }

    public static char[][] createTable(int n, char a) {
        char[][] r = new char[n][n];
        for (int i = 0;i < n; i++)
            Arrays.fill(r[i],'.');
        return r;
    }

    public static void printTable(char[][] c) {
        for (char[] a : c) {
            for (char b : a) {
                System.out.print(b);
                System.out.print(' ');
            }
            System.out.println('\b');
        }
    }
    public static void fillFirstAndLastLines(char[][] c, char a) {
        Arrays.fill(c[0], a);
        Arrays.fill(c[c.length - 1],a);
    }

    public static void fillFirstAndLastColumns(char[][] c, char a) {
        for (char[] b : c) {
            b[0] = a;
            b[b.length - 1] = a;
        }
    }
}
