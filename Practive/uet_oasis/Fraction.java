package uet_oasis;

public class Fraction {
    private int numerator;
    private int denominator = 1;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;

        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    private int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            a = -a;
            b = -b;
        }

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    Fraction reduce() {
        int ucln = gcd(this.numerator, this.denominator);
        this.numerator /= ucln;
        this.denominator /= ucln;
        return this;
    }

    Fraction add(Fraction other) {
        if (other.denominator != 0) {
            this.numerator = this.numerator * other.denominator
                    + other.numerator * this.denominator;
            this.denominator *= other.denominator;
            reduce();
        }
        return this;
    }

    Fraction subtract(Fraction other) {
        if (other.denominator != 0) {
            this.numerator = this.numerator * other.denominator
                    - other.numerator * this.denominator;
            this.denominator *= other.denominator;
            reduce();
        }
        return this;
    }

    Fraction multiply(Fraction other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        reduce();
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            if (this == obj) {
                return true;
            }
            Fraction other = (Fraction) obj;
            other.reduce();
            this.reduce();
            return other.numerator == this.numerator
                    && other.denominator == this.denominator;
        }

        return false;
    }

    Fraction divide(Fraction other) {
        if (other.numerator != 0) {
            this.numerator *= other.denominator;
            this.denominator *= other.numerator;
            reduce();
        }
        return this;
    }
}
