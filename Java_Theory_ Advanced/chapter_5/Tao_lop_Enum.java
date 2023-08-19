package chapter_5;

// Replace ___ with your code
// create an enum of type Size
enum Size {

    // add enum constants
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;

    // create a method
    public String getSize() {

        // this refers to current object
        switch (this) {
        
        case SMALL:
            return "small";

        case MEDIUM:
            return "medium";

        case LARGE:
            return "large";

        case EXTRA_LARGE:
            return "extra large";

        default:
            return "nothing";
        }
    }
}

public class Tao_lop_Enum {
    public static void main(String[] args) {

        // print "Your card is: " + Size.MEDIUM.getSize()
        System.out.println("Your card is: " + Size.MEDIUM.getSize());
    }
}
