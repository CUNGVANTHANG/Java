public class Calculator {
    public static float divide(float x, float y) throws DevideByZeroException {
        if (y == 0) {
            throw new DevideByZeroException(x, y);
        }
        return x/y;
    }

    public static float plus(float x, float y) {
        return x + y;
    }
}
