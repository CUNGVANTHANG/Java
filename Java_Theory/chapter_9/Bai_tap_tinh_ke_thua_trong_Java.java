package chapter_9;

class Vehicle {
    void getFeature() {
        System.out.println("Initializing vehicle features");
    }
}

// derive Car from Vehicle
class Car extends Vehicle {

}

// Main class
class Bai_tap_tinh_ke_thua_trong_Java {
    public static void main(String[] args) {

        // create an object of Car
        Car obj = new Car();

        // access the getFeature method
        obj.getFeature();
    }
}
