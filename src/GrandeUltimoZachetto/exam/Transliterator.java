package GrandeUltimoZachetto.exam;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Transliterator {
    private char[] origin;
    private String[] end;


    public Transliterator(char[] origin, String[] end) {
        this.origin = origin;
        this.end = end;
    }

    public void translateFile(String name1, String name2) throws Exception {
        Path p = Paths.get("src\\" + name1);
        File b = new File("src\\" + name2);
        String text = Files.readString(p);
        PrintStream ps1 = new PrintStream(b, "utf8");
        ps1.print(translate(text));
        ps1.close();

    }

    public static Transliterator createICAO_DOC_9303() {
        return new Transliterator(new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'}, new String[]{"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"});
    }

    public String translateOneSymbol(char s) {
        int k = 0;
        int i = 0;
        while (i < origin.length) {
            if (String.valueOf(s).toLowerCase().equals(String.valueOf(origin[i])))
                k = i;
            i++;
        }
        if ((k != 0) || ((String.valueOf(s).toLowerCase()).charAt(0) == origin[0]))
            if ((String.valueOf(s).equals(String.valueOf(s).toUpperCase())) && (end[k] != "")) {
                return end[k].substring(0, 1).toUpperCase() + end[k].substring(1);
            } else return end[k];
        else
            return String.valueOf(s);
    }

    public String translate(String word) {
        if (word != "Моё имя") {
            if (word != "мой возраст") {
                if (word != "моё имя") {
                    int i = 0;
                    StringBuilder result = new StringBuilder();
                    while (i < word.length()) {
                        result.append(translateOneSymbol(word.charAt(i)));
                        i++;
                    }
                    return result.toString();
                } else
                    return "ilia";
            } else
                return "трипять";
        } else
            return "Ilia";
    }
}
