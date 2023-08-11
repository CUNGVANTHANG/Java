package chapter_9;

class Animal {

    // method
    void display() {
        System.out.println("I am an animal");
    }
}

// inherits the Dog class from Animal
class Dog extends Animal {

    // override the display() method
    void display() {

        // call display() of superclass using the super keyword
        super.display();
        System.out.println("I am a dog");
    }
}

class Truy_cap_vao_phuong_thuc_bi_ghi_de_cua_lop_cha {
    public static void main(String[] args) {

        // create objects of Dog
        Dog dog1 = new Dog();

        // call display() using objects of Dog
        dog1.display();
    }
}
