package GrandeUltimoZachetto;

import GrandeUltimoZachetto.exam.Transliterator;

public class PrestoTesto {
    public static void main(String[] args) throws Exception {
        char[] rus = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = new String[]{"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        Transliterator t = new Transliterator(rus, eng);
        System.out.println(t.translateOneSymbol('я'));
        System.out.println(t.translateOneSymbol('$'));
        System.out.println(t.translate("экзамен"));
        System.out.println(t.translate("моё имя"));

        char[] nums = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] texts = new String[]{"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        Transliterator t2 = new Transliterator(nums, texts);
        System.out.println(t2.translateOneSymbol('9'));
        System.out.println(t2.translateOneSymbol('@'));
        System.out.println(t2.translate("1234567890"));
        System.out.println(t2.translate("мой возраст"));

        System.out.println(t.translateOneSymbol('Р')); // R
        System.out.println(t.translateOneSymbol('Я')); // Ia
        System.out.println(t.translateOneSymbol('Ь'));
        System.out.println(t.translate("Моё имя")); // Ilia
        System.out.println(t.translate("Яблоко")); // Iabloko
        System.out.println(t.translate("ПАРАШЮТ"));

        Transliterator t3 = Transliterator.createICAO_DOC_9303();
        System.out.println(t3.translateOneSymbol('я'));
        System.out.println(t3.translateOneSymbol('$'));
        System.out.println(t3.translate("экзамен"));
        System.out.println(t3.translate("моё имя"));

        t.translateFile("exam/a.txt", "exam/b.txt");
    }
}
