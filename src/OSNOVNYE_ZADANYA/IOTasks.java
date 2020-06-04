package OSNOVNYE_ZADANYA;

import java.io.File;
import java.nio.file.Files;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOTasks {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Введите кол-во строк");
        int num = in.nextInt();
        System.out.println("Вводите строки");
        String[] massive= new String[num];
        for (int i = 0;i<massive.length;i++) {
            massive[i] = in.next();
        }
        for (String line : massive) {
            System.out.println(line);
        }
        WriteThatDown(name, massive);
        in.close();

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
        in.close();
        return s;
    }

    public static void WriteThatDown(String name, String[] lines) throws Exception {
        PrintStream ps1 = new PrintStream("src\\OSNOVNYE_ZADANYA\\"+name, "utf8");
        for (String line : lines) {
            ps1.println(line);
        }
        ps1.close();
    }
}
