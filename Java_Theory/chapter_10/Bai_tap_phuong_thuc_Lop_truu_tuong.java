package chapter_10;

abstract class Animal {
    // abstract method
    abstract void makeSound();
}

// inherit Dog class from Animal
class Dog extends Animal {

    // implements the abstract method
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Main {
    public static void main(String[] args) {

        // create object of Dog
        Dog dog1 = new Dog();

        // access the abstract method
        dog1.makeSound();
    }
}
