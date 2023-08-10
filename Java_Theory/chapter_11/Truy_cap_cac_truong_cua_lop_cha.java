package chapter_11;

class Person {
    // info field inside Person
    String info = "Person";
}

// create a Student class inheriting from Person
class Student extends Person {

    // create the field with same name as of the parent class
    String info = "Student";

    // create a method named getSuperInfo()
    String getSuperInfo() {

        // use super keyword to access the info field of Person
        return super.info;
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Student named student1
        Student student1 = new Student();

        // use student1 to access the info field of Student
        System.out.println(student1.info);

        // call the getSuperInfo() method using student1
        System.out.println(student1.getSuperInfo());
    }
}
