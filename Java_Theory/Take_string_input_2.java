import java.util.Scanner;
 
class Take_string_input_2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // take string input
        System.out.println("Enter your name:");
        String name = input.nextLine();
        
        System.out.println("Name: " + name);
 
        input.close();
    }
}
