package ThinkingRationally;


public class Rational {
    private int numerator;
    private int denominator;

    public static final Rational ONE = new Rational(1);
    public static final Rational ZERO = new Rational(0);

    private int nod(int a, int b) {
        int min;
        int sokr = 0;
        if (a > b)
            min = b;
        else
            min = a;
        for (int i = 1; i <= min; i++) {
            if ((a % i == 0) && (b % i == 0))
                sokr = i;
        }
        return sokr;
    }
    public Rational(int numerator, int denominator) {
        int a = Math.abs(numerator);
        int b = Math.abs(denominator);
        int sokr = nod(a,b);
        if (denominator < 0) {
            if (numerator < 0) {
                numerator = a;
                denominator = b;
            }
            else {
                denominator = b;
                numerator = numerator*(-1);
            }
        }

        this.numerator = numerator/sokr;
        this.denominator = denominator/sokr;
    }

    public Rational(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public String toString() {
        String b = "";
        if (numerator != 0 && denominator != 1)
            b = "/"+Integer.toString(denominator);
        return Integer.toString(numerator)+b;
    }

    public double toDouble() {
        double a = numerator;
        double b = denominator;
        return a/b;
    }


    public Rational add(Rational b) {
        return new Rational(this.numerator*b.denominator + this.denominator* b.numerator, this.denominator*b.denominator);
    }

    static Rational add(Rational r1, Rational r2) {
        return r1.add(r2);
    }

    public void addInPlace(Rational b) {
        b = new Rational(this.numerator*b.denominator + this.denominator* b.numerator, this.denominator*b.denominator);
    }

    public Rational sub(Rational b) {
        return new Rational(this.numerator*b.denominator - this.denominator* b.numerator, this.denominator*b.denominator);
    }

    static Rational sub(Rational r1, Rational r2) {
        return r1.sub(r2);
    }

    public void subInPlace(Rational b) {
        b = new Rational(this.numerator*b.denominator - this.denominator* b.numerator, this.denominator*b.denominator);
    }

    public Rational mul(Rational b) {
        return new Rational(this.numerator*b.numerator, this.denominator*b.denominator);
    }

    static Rational mul(Rational r1, Rational r2) {
        return r1.mul(r2);
    }

    public void mulInPlace(Rational b) {
        b = new Rational(this.numerator*b.numerator, this.denominator*b.denominator);
    }

    public Rational div(Rational b) {
        return new Rational(this.numerator*b.denominator, this.denominator*b.numerator);
    }

    static Rational div(Rational r1, Rational r2) {
        return r1.div(r2);
    }

    public void divInPlace(Rational b) {
        b = new Rational(this.numerator*b.denominator, this.denominator*b.numerator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
