import java.util.Scanner;
 
class Take_string_input_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // take string input
        System.out.println("Enter your name:");
        String name = input.next();
        
        System.out.println("Name: " + name);
 
        input.close();
    }
}
