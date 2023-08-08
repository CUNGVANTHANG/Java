public class method_create {
  
    void greet() {
        System.out.println("Hello");
        System.out.println("How do you do?");
    }
  
    public static void main(String[] args) {
        
        // create object of Main
        method_create obj = new method_create();
        
        // call the method
        obj.greet();
  
    }
}