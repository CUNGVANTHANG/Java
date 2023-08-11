package chapter_9;

class Person {
    public void displayInfo() {
        System.out.println("I am a person.");
    }
}

// extend Student from Person and override displayInfo()
class Student extends Person {

    public void displayInfo() {
        System.out.println("I am a student.");
    }
}

// extend Employee from Person and override displayInfo()
class Employee extends Person {
    public void displayInfo() {
        System.out.println("I am an employee.");
    }
}

class Bai_tap_ke_thua_phan_cap {
    public static void main(String[] args) {

        // create objects of Student and Employee class
        Student student1 = new Student();
        Employee employee1 = new Employee();

        // call displayInfo() using student1
        student1.displayInfo();

        // call displayInfo() using employee1
        employee1.displayInfo();

    }
}
