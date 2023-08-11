package chapter_9;

import java.util.Scanner;

class Animal {
    void eat() {
        System.out.println("I eat animal food.");
    }
}

// inherit the Mammal class from Animal
// create display() method to print I am a mammal.
class Mammal extends Animal {
    void display() {
        System.out.println("I am a mammal.");
    }
}

// inherit the Dog class from Mammal
class Dog extends Mammal {

    // get the name parameter and print the name
    void displayName(String name) {
        System.out.println("My name is " + name + ".");
    }
}

class Ke_thua_nhieu_cap {
    public static void main(String[] args) {

        // get input value for the name
        Scanner input = new Scanner(System.in);
        String name = input.next();

        // create an object of Dog
        Dog labrador = new Dog();

        // call the displayName() method with the name argument
        labrador.displayName(name);

        // call display() and eat() method of Mammal and Animal
        labrador.display();
        labrador.eat();

        input.close();
    }
}
