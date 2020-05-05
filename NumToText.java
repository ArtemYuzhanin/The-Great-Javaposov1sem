import java.util.Scanner;
public class NumToText {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(numtotext(x));
		in.close();
	}
	public static String numtotext(int x) {
		String num = "";
		int a = x / 100;
		switch (a) {
			case 1:
				num = num + "сто ";
				break;
			case 2:
				num = num + "двести ";
				break;
			case 3:
				num = num + "триста ";
				break;
			case 4:
				num = num + "четыреста ";
				break;
			case 5:
				num = num + "пятьсот ";
				break;
			case 6:
				num = num + "шестьсот ";
				break;
			case 7:
				num = num + "семьсот ";
				break;
			case 8:
				num = num + "восемьсот ";
				break;
			case 9:
				num = num + "девятьсот ";
				break;
			default:
				break;
				
		}
		int b = (x % 100);
		if ((b < 20) && (b > 9)) {
			switch (b) {
				case 10:
					num = num + "десять ";
					break;
				case 11:
					num = num + "одиннадцать ";
					break;
				case 13:
					num = num + "тринадцать ";
					break;
				case 14:
					num = num + "четырнадцать ";
					break;
				case 15:
					num = num + "пятнадцать ";
					break;
				case 16:
					num = num + "шестнадцать ";
					break;
				case 17:
					num = num + "семнадцать ";
					break;
				case 18:
					num = num + "восемнадцать ";
					break;
				case 19:
					num = num + "девятнадцать ";
					break;
				case 12:
					num = num + "двенадцать ";
				default:
					break;
			}
		}
		else {
			int c = b % 10;
			b = b / 10;
			switch (b) {
				case 2:
					num = num + "двадцать ";
					break;
				case 3:
					num = num + "тридцать ";
					break;
				case 4:
					num = num + "сорок ";
					break;
				case 5:
					num = num + "пятьдесят ";
					break;
				case 6:
					num = num + "шестьдесят ";
					break;
				case 7:
					num = num + "семьдесят ";
					break;
				case 8:
					num = num + "восемьдесят ";
					break;
				case 9:
					num = num + "девяносто ";
					break;
				default:
					break;
			}
			switch (c) {
				case 2:
					num = num + "два ";
					break;
				case 3:
					num = num + "три ";
					break;
				case 4:
					num = num + "четыре ";
					break;
				case 5:
					num = num + "пять ";
					break;
				case 6:
					num = num + "шесть ";
					break;
				case 7:
					num = num + "семь ";
					break;
				case 8:
					num = num + "восемь ";
					break;
				case 9:
					num = num + "девять ";
					break;
				case 1:
					num = num + "один ";
				default:
					break;
			}
		}
		return num.substring(0, num.length());
	}
}