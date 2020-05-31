package OSNOVNYE_ZADANYA;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Проверка первой задачи:");
        int n = in.nextInt();
        int[] a = chotno(n);
        for (int i : a)
            System.out.println(i);

        System.out.println("Проверка второй задачи: введите кол-во элементов, а затем заполните массив");
        n = in.nextInt();
        int [] b = new int[n];
        for (int i = 0; i < n; i++)
            b[i] = in.nextInt();
        System.out.println(hasSimilar(b));

        System.out.println("Проверка третей задачи: введите кол-во элементов, а затем заполните массив");
        n = in.nextInt();
        b = new int[n];
        for (int i = 0; i < n; i++)
            b[i] = in.nextInt();
        System.out.println(massiveSum(b));

        System.out.println("Этот же массив используем для четвертой задачи:");
        int[] c = sortReverse(b);
        for (int i : c)
            System.out.println(i);


        in.close();

    }

    public static int[] chotno(int n) {
        int[] massive = new int[n];
        for (int i = 0; i < n; i++) {
            massive[i] = (i+1)*2;
        }
        return massive;
    }

    public static boolean hasSimilar(int[] a) {
        boolean answer = false;
        for (int i = 0; i < (a.length - 1); i++) {
            for (int k = i + 1; k < a.length; k++) {
                if (a[i] == a[k]) {
                    answer = true;
                }
            }
        }

        return answer;
    }

    public static double massiveSum(int[] a) {
        double s = 0;
        for (int i : a)
            s += i;
        s = s/a.length;
        return s;
    }

    private static int[] sortReverse(int[] a) {
        int n = a.length;
        int[] b = Arrays.copyOf(a, n);
        Arrays.sort(b);
        int i = 0;
        int c = 0;
        while (i < (n/2) && (n-1-i)>= (n/2)) {
            c = b[i];
            b[i] = b[n-1-i];
            b[n-1-i] = c;
            i++;
        }
        return b;

    }
}
