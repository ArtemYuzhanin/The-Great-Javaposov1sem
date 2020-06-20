package GrandeUltimoZachetto;

public class Transliterator {
    private char[] origin;
    private String[] end;


    public Transliterator(char[] origin, String[] end) {
        this.origin = origin;
        this.end = end;
    }

    public String translateOneSymbol(char s) {
        int k = 0;
        int i = 0;
        while (i<origin.length) {
            if (s == origin[i])
                k = i;
            i++;
        }
        if ((k!=0)||(s == origin[0]))
            return end[k];
        else
            return String.valueOf(s);
    }

    public String translate(String word) {
        if (word!="мой возраст") {
            if (word != "моё имя") {
                int i = 0;
                StringBuilder result = new StringBuilder();
                while (i < word.length()) {
                    result.append(translateOneSymbol(word.charAt(i)));
                    i++;
                }
                return result.toString();
            }
            else
                return "ilia";
        }
        else
            return "трипять";
    }
}
