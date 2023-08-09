package chapter_8;

import java.util.Scanner;
    
class Person {
    String name;
    
    public static void main(String[] args) {
        
        // get input values for name1 and name2
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        
        // create objects person1 and person2
        Person person1 = new Person();
        Person person2 = new Person();
        
        // assign values of name for both objects
        person1.name = name1;
        person2.name = name2;
        
        // print values
        System.out.println(person1.name);
        System.out.println(person2.name);

        input.close();
    }
}
