package chapter_8;

import java.util.Scanner;

class ComplexNumber {
    
    // real and imag fields
    double real;
    double imag;
    
    // constructor to initialize value of real and imag
    ComplexNumber(double real, double imag) {
        // use this keyword to initialize the value
        this.real = real;
        this.imag = imag;
    }
}

// Main class
class Cong_hai_so_phuc {
    
    // main method
    public static void main(String[] args) {
        
        // get 4 input values
        Scanner input = new Scanner(System.in);

        // input for the first complex number
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        // input for the second complex number
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        
        // create c1 object of ComplexNumber with arguments n1 and n2
        ComplexNumber c1 = new ComplexNumber(n1, n2);
        
        // create c2 object of ComplexNumber with arguments n3 and n4
        ComplexNumber c2 = new ComplexNumber(n3, n4);
        
        // add real part of c1 and c2
        double realSum = c1.real + c2.real;
        
        // add imag part of c1 and c2
        double imagSum = c1.imag + c2.imag;
        
        // print the output in the format real + imagSumi
        System.out.println(realSum + " + " + imagSum + 'i');
        input.close();
    }
}
