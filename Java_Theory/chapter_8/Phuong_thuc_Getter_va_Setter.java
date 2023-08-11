package chapter_8;

import java.util.Scanner;

class Person {
    // create private field name
    private String name;

    // create a setter method to set value of name
    public void setName(String name) {
        this.name = name;
    }

    // create a getter method to return name
    public String getName(String name) {
        return this.name;
    }
}

class Phuong_thuc_Getter_va_Setter {

    public static void main(String[] args) {

        // create person1 object of Person class
        Person person1 = new Person();

        // get input name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // set the value of the name variable
        person1.setName(name);

        // get the value of name
        System.out.println(person1.getName(name));
        input.close();
    }
}
