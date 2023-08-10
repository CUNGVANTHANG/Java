package chapter_9;

class Animal {

    // method to print statement
    void eat() {
        System.out.println("I can eat.");
    }
}

// inherit a Dog class from Animal
class Dog extends Animal {
    // method inside the Dog
    void dance() {
        System.out.println("Dancing Dog.");
    }
}

class Main {
    public static void main(String[] args) {

        // create object of the Dog class
        Dog obj = new Dog();

        // call the eat()
        obj.eat();

        // call the dance()
        obj.dance();
    }
}
