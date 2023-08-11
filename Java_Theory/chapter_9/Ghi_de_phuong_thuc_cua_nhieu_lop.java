package chapter_9;

class Animal {

    // method
    void display() {
        System.out.println("I am an animal");
    }
}

// inherit Dog class from Animal
class Dog extends Animal {

    // override the display method
    void display() {
        System.out.println("I am a dog");
    }
}

// inherit Cat class from Animal
class Cat extends Animal {

    // override the display method
    void display() {
        System.out.println("I am a cat");
    }
}

class Ghi_de_phuong_thuc_cua_nhieu_lop {
    public static void main(String[] args) {

        // create objects of Dog and Cat
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        // call display() using objects of Dog and Cat
        dog1.display();
        cat1.display();
    }
}
