package chapter_8;

import java.util.Scanner;

class Student {
    
    int score;
    char grade;
    
    // assign value to score
    Student(int score) {
        this.score = score;
    }
    
    void assignGrade() {
        
        // assign grade based on the value
        if (this.score >= 90) {
            this.grade = 'A';
        }
        else if (this.score >= 80) {
            this.grade = 'B';
        }
        else {
            this.grade = 'C';
        }
    }
}

class Main {
    public static void main(String[] args) {
        
        // take the score input
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        
        // create object
        Student student = new Student(score);
        
        // call the assignGrade() method
        student.assignGrade();
        
        // print the grade
        System.out.println(student.grade);
        input.close();
    }
}

