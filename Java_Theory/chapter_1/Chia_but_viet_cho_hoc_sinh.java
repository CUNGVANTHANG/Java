package chapter_1;

//Replace ___ with your code
public class Chia_but_viet_cho_hoc_sinh {
    public static void main(String[] args) {

        // variables to store numbers of pen and student
        int penNumber = 14;
        int studentNumber = 3;

        // compute and print the number of pens each student will get
        // Hint: find the quotient
        int penPerStudent = penNumber / studentNumber;
        System.out.println(penPerStudent);

        // compute and print the number of pens that will be left
        // Hint: find the remainder
        int remainingPen = penNumber % studentNumber;
        System.out.println(remainingPen);
    }
}
