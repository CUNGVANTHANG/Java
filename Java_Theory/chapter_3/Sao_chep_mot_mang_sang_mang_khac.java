package chapter_3;

public class Sao_chep_mot_mang_sang_mang_khac {
    public static void main(String[] args) {
     
        // an array of numbers
        int[] numbers = { 55, 64, 75, 80, 65 };
     
        // declare new array of the same size
        int[] newNumbers = new int[numbers.length];
     
        // loop through each element of numbers
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
     
        // print the new array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(newNumbers[i]);
        }
    }

}
