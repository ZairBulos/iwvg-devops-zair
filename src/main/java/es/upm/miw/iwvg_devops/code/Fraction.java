package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return numerator < denominator;
    }

    public boolean isImproper() {
        return numerator > denominator;
    }

    public boolean isEquivalent(Fraction fraction) {
        return extremeProduct(fraction) == middleProduct(fraction);
    }

    public Fraction multiply(Fraction fraction) {
        int newNumerator = numerator * fraction.getNumerator();
        int newDenominator = denominator * fraction.getDenominator();

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction fraction) {
        int newNumerator = numerator * fraction.getDenominator();
        int newDenominator = denominator * fraction.getNumerator();

        return new Fraction(newNumerator, newDenominator);
    }

    private int extremeProduct(Fraction fraction) {
        return numerator * fraction.getDenominator();
    }

    private int middleProduct(Fraction fraction) {
        return denominator * fraction.getNumerator();
    }
}
