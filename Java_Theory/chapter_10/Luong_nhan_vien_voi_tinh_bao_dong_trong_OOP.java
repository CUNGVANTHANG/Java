package chapter_10;

import java.util.Scanner;

// create a class Employee
class Employee {

    // create a private field
    private double salary;

    // create a method to set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // create a method to get salary
    public double getSalary() {
        return this.salary;
    }
}

class Luong_nhan_vien_voi_tinh_bao_dong_trong_OOP {

    // main method
    public static void main(String[] args) {

        // get input value for the salary
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();

        // create an object of Employee
        Employee obj = new Employee();

        // initialize the value of the salary field using setter method
        obj.setSalary(salary);

        // get the value of the salary field using the getter method
        double result = obj.getSalary();

        // print the salary
        System.out.println(result);

        input.close();
    }
}
