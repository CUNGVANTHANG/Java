package chapter_11;

class Animal {

    // constructor of the Animal class
    Animal(String type) {
        System.out.println(type);
    }
}

// create the Cat class inheriting from Animal
class Cat extends Animal {

    // constructor of the Cat class
    Cat() {

        // use super() to call the constructor of the superclass Animal with argument
        // "Mammal"
        super("Mammal");

        // print "Constructing Cat"
        System.out.println("Constructing Cat");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Cat named cat1
        Cat cat1 = new Cat();
    }
}
