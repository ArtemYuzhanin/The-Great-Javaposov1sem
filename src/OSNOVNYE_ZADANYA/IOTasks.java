package OSNOVNYE_ZADANYA;

import java.io.File;
import java.nio.file.Files;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOTasks {
    public static void main(String[] args) throws Exception {
        Scanner pin = new Scanner(System.in);
        String name = pin.next();
        String nametwo = pin.next();
        File a = new File("src\\OSNOVNYE_ZADANYA\\"+name);
        File b = new File("src\\OSNOVNYE_ZADANYA\\"+nametwo);
        FixItFelix(a,b);
        pin.close();
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

    public static void FixItFelix(File a, File b) throws Exception{
        Scanner in = new Scanner(a, "utf-8");
        String w = in.next();
        boolean p = true;
        char last = w.charAt(w.length() - 1);;
        PrintStream ps1 = new PrintStream(b);
        while (in.hasNext()) {
            if (w.charAt(0) != '-') {
                switch (last) {
                    case '!':
                        p = true;
                        break;
                    case '?':
                        p = true;
                        break;
                    case '.':
                        p = true;
                        break;
                    default:
                }
                if (p) {
                    w = w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase();
                }
                else
                    w = w.substring(0, w.length() - 1).toLowerCase() + w.substring(w.length()-1);
            }
            p = false;
            ps1.print(w+' ');
            System.out.println(w+' ');;
            last = w.charAt(w.length() - 1);
            w = in.next();
        }
        switch (last) {
            case '!':
                ps1.print(w.substring(0, 1).toUpperCase() + w.substring(1, w.length() - 1).toLowerCase() + w.substring(w.length()-1));
                break;
            case '?':
                ps1.print(w.substring(0, 1).toUpperCase() + w.substring(1, w.length() - 1).toLowerCase() + w.substring(w.length()-1));
                break;
            case '.':
                ps1.print(w.substring(0, 1).toUpperCase() + w.substring(1, w.length() - 1).toLowerCase() + w.substring(w.length()-1));
                break;
            default:
                ps1.print(w.substring(0, w.length() - 1).toLowerCase() + w.substring(w.length()-1));
        }
        ps1.close();
        in.close();

    }
}
