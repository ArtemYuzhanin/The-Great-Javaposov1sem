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
            if (String.valueOf(s).toLowerCase().equals(String.valueOf(origin[i])))
                k = i;
            i++;
        }
        if ((k!=0)||((String.valueOf(s).toLowerCase()).charAt(0) == origin[0]))
            if ((String.valueOf(s).equals(String.valueOf(s).toUpperCase()))&&(end[k] != "")) {
                return end[k].substring(0, 1).toUpperCase() + end[k].substring(1);
            }
            else return end[k];
        else
            return String.valueOf(s);
    }

    public String translate(String word) {
        if (word!="Моё имя") {
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
