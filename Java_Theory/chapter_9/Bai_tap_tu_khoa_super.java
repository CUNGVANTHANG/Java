package chapter_9;

class Person {
    public void speak() {
        System.out.println("I am a person.");
    }
}

// create a Student class inheriting from Person
class Student extends Person {

  // override the speak() method
    public void speak() {
      
      // access speak() method of parent class
      super.speak();
      System.out.println("I am a student.");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Student named student1
        Student student1 = new Student();

        // call the speak() method using student1
        student1.speak();
    }
}