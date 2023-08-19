package chapter_5;

// Replace ___ with your code
// create an enum
enum Card {

    // add constants
    CLUB, DIAMOND, HEART, SPADE;

    // create a method
    public String getCard() {

        // create switch case
        switch (this) {
        
        // create cases for switch statements
        case CLUB:
          return "club";

        case DIAMOND:
          return "diamond";

        case HEART:
          return "heart";

        case SPADE:
          return "spade";
 
        default:
            return "nothing";
        }
    }
}

public class Bai_tap_lop_enum {
    public static void main(String[] args) {

        // print statement
        System.out.println("Your card is: " + Card.DIAMOND.getCard());
    }
}
