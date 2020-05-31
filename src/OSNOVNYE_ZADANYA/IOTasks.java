package OSNOVNYE_ZADANYA;

import java.io.File;
import java.nio.file.*;
import java.util.Scanner;

public class IOTasks {
    public static void main(String[] args) throws Exception {
        File f = new File("src\\OSNOVNYE_ZADANYA\\Data.txt");
        System.out.println(TextSumm(f));
    }

    public static int TextSumm(File f) throws Exception {
        Scanner in = new Scanner(f,"utf-8");
        int s = 0;
        while (in.hasNext()) {
            if (in.hasNextInt())
                s += in.nextInt();
            else
                in.next();
        }
        return s;
    }
}
