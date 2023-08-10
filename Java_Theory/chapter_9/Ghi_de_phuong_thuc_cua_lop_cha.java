package chapter_9;

class Vehicle {

    // method
    void displayInfo() {
        System.out.println("Four Wheeler or Two Wheeler");
    }
}

// inherit the Car class from Vehicle
class Car extends Vehicle {

    // override the displayInfo method and
    // print Cars are Four Wheeler
    void displayInfo() {
        System.out.println("Cars are Four Wheeler");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Car
        Car car1 = new Car();

        // call the displayInfo() method
        car1.displayInfo();
    }
}
