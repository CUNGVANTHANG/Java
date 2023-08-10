package chapter_10;

import java.util.Scanner;

class Greeting {

    public void greet(String name) {
        System.out.println("Hello " + name);
    }
}

// create a LocalGreeting class that inherits Greeting
class LocalGreeting extends Greeting {

    // override the greet() method
    public void greet(String name) {
        System.out.println("Namaste " + name);
    }
}

class Main {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // take input for name
        String name = input.nextLine();

        // create object of Greeting class
        Greeting g1 = new Greeting();
        // create object to LocalGreeting class
        LocalGreeting g2 = new LocalGreeting();

        // call greet() method
        g1.greet(name);

        // call the overridden method
        g2.greet(name);
        input.close();
    }
}
