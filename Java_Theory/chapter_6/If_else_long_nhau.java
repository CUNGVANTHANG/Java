package chapter_6;

import java.util.Scanner;

public class If_else_long_nhau {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get university input
        String university = input.nextLine();
        
        // get marks input
        int marks = input.nextInt();
        
        // outer if condition to check the university
        if (university.equals("Unique University")) {
            
            // passing mark for this university is 80
            if (marks >= 80) {
                System.out.println("Student Passed");
            }
            else {
                System.out.println("Student Failed");
            }
        }
        // if the student is not from the Unique University
        else {
            
            // passing mark for all other universities is 32
            if (marks >= 32) {
                System.out.println("Student Passed");
            }
            else {
                System.out.println("Student Failed");
            }
        }
        
        input.close();
    }
}
