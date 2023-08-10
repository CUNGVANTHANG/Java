package chapter_8;

import java.util.Scanner;

class Student {

    // private field
    private String name;

    // setter method
    public void setName(String name) {
        System.out.println("Setting Name");
        
        // initialize value of name using this
        this.name = name;
    }

    // getter method
    public String getName() {
        System.out.println("Getting Name");
        
        // return the value of name using this
        return this.name;
    }
}

// Main class
class Main {
    
    // main method
    public static void main(String[] args) {
        
        // get input value for name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        // create an object of Student
        Student s1 = new Student();
        
        // call setter method
        s1.setName(name);
        
        // call getter method
        String returnedValue = s1.getName();
        
        // print the returned value
        System.out.println(returnedValue);

        input.close();
    }
}

