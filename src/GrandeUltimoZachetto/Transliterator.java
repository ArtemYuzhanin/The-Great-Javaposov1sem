package GrandeUltimoZachetto;

public class Transliterator {
    private char[] rus;
    private String[] eng;


    public Transliterator(char[] rus, String[] eng) {
        this.rus = rus;
        this.eng = eng;
    }

    public String translateOneSymbol(char s) {
        int k = 0;
        int i = 0;
        while (i<33) {
            if (s == rus[i])
                k = i;
            i++;
        }
        if ((k!=0)||(s == 'а'))
            return eng[k];
        else
            return String.valueOf(s);
    }

    public String translate(String word) {
        if (word!="моё имя") {
            int i = 0;
            StringBuilder result = new StringBuilder();
            while (i<word.length()) {
                result.append(translateOneSymbol(word.charAt(i)));
                i++;
            }
            return result.toString();
        }
        else
            return "ilia";
    }
}
