package chapter_3;
import java.util.Scanner;

public class Tim_phan_tram_so_diem_cua_hoc_sinh {
    public static void main(String[] args) {

        // create a double array
        double[] marks = new double[8];

        // get input values for obtained marks
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < marks.length; ++i) {
            marks[i] = input.nextDouble();
        }

        // create a variable to store obtainedMarks
        double obtainedMarks = 0.0;
        
        // find the sum of obtained marks using a loop
        for (double mark : marks) {
          obtainedMarks += mark;
        }

        // create totalMarks variable
        int totalMarks = 800;
        
        // find the percentage and print it
        double percentage = obtainedMarks * 100 / (double) totalMarks;
        System.out.println(percentage);

        input.close();
    }
}
