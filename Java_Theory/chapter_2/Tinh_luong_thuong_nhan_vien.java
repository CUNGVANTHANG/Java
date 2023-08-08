package chapter_2;
import java.util.Scanner;

public class Tinh_luong_thuong_nhan_vien {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for salary and year of service
        double salary = input.nextDouble();
        double serviceYear = input.nextDouble();

        // check if serviceYear is greater than 5
        if (serviceYear > 5) {

            // compute the bonus and print it 
            // hint: 5% bonus is equal to (5 * salary) / 100
            System.out.println((5 * salary) / 100);
        }
         
        input.close();
    }
}
