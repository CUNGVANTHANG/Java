package chapter_10;

import java.util.Scanner;

class Person {

    // create an private field
    private int age;

    // public method to set age
    public void setAge(int age) {

        this.age = age;
    }

    // public method to get age
    public int getAge() {
        return this.age;
    }
}

class Bai_tap_An_du_lieu {

    public static void main(String[] args) {

        // create Scanner object
        Scanner input = new Scanner(System.in);

        // take user input
        int age = input.nextInt();

        // create object of Person class
        Person person = new Person();

        // set age using setAge()
        person.setAge(age);

        // print age using getAge()
        System.out.println(person.getAge());
        input.close();
    }
}
