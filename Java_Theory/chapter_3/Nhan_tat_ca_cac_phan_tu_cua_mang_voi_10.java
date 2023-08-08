package chapter_3;

public class Nhan_tat_ca_cac_phan_tu_cua_mang_voi_10 {

    public static void main(String[] args) {

        // an array of scores
        int[] numbers = { 43, 78, 23, 45 };

        // declare new array of the same size
        int[] newNumbers = new int[numbers.length];

        // loop through each element of numbers
        // multiply them by 10
        int i = 0;
        for (int number : numbers) {
            newNumbers[i] = number * 10;
            i++;
        }

        // print the new array
        for (int num : newNumbers) {
            System.out.println(num);
        }
    }

}
