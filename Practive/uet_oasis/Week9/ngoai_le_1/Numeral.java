public class Numeral extends Expression {
    private double value;

    public Numeral() {
        this.value = 0;
    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%.0f", value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}
