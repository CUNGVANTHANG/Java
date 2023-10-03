public class Test {
    public static void main(String[] args) {
        float sum;
        try {
            sum = Calculator.divide(5, 0); // Có khả năng gặp lỗi nên phải thêm try..catch
            System.out.println("Sum: " + sum);
        } catch(DevideByZeroException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
