package OSNOVNYE_ZADANYA;

import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressions {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        Biga(a,b);
    }

    public static boolean Gmail(String gmail) {
        return gmail.matches("[a-z._-]+@[a-z.-]+\\.[a-z]{2,4}");
    }

    public static boolean GmailTwo(String gmail) {
        return gmail.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
    }

    public static String TooManySpaces(String text) {
        return text.replaceAll("\\s+,", ",");
    }

    public static String VisaVersa(String text) {
        return text.replaceAll("([а-яА-Я]+)-([а-яА-Я]+)", "$2-$1");
    }

    public static int CatCount(String text) {
        Pattern p = Pattern.compile(
                "кот",
                Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE
        );
        Matcher it = p.matcher(text);
        int i = 0;
        while (it.find()) {
            i++;
        }
        return i;
    }

    public static void Biga(String a, String b) throws Exception{
        Path p = Paths.get("src\\OSNOVNYE_ZADANYA\\"+a);
        String text = Files.readString(p);
        Pattern pn = Pattern.compile("\\d+",Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE);
        Matcher it = pn.matcher(text);
        StringBuilder result = new StringBuilder();
        while (it.find())
            it.appendReplacement(result, Integer.toString(Integer.parseInt(it.group())+1));
        it.appendTail(result);
        Files.writeString(Path.of("src\\OSNOVNYE_ZADANYA\\"+b), result);
    }

}
