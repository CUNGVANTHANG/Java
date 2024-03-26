package uet_oasis.week2;

public class JUnit {
    public static int max2Int(int a, int b) {
        return a > b ? a : b;
    }

    public static int minArray(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;

    }

    public static String calculateBMI(double weight, double height) {
        double BMI = Math.ceil(10 * weight / (height * height)) / 10;
        if (weight <= 0 || height <= 0) {
            return "Invalid";
        }
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else if (BMI >= 18.5 && BMI <= 22.9) {
            return "Bình thường";
        } else if (BMI >= 23 && BMI <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
 
