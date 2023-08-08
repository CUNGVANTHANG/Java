package chapter_3;

public class Tim_phan_tu_nho_nhat_cua_mang {

    public static void main(String[] args) {

        // an array of numbers
        int[] numbers = { 55, 64, 75, 80, 65 };

        // assign the first value of the array to the smallest variable
        int smallest = numbers[0];

        // iterate each element of the array
        // compare each element with the smallest
        for (int number : numbers) {
            if (smallest > number) {
                smallest = number;
            }
        }

        System.out.println(smallest);
    }

}
