package chapter_5;

enum Card{
    
    // constant values
    CLUB, DIAMOND, SPADE, HEART;
}

public class Bieu_dien_Hang_so_Enum_duoi_dang_chuoi {
    public static void main(String[] args) {

        // create a variable cardType of String type
        String cardType;

        // convert the constant DIAMOND in String 
        cardType = Card.DIAMOND.toString();

        // print cardType
        System.out.println(cardType);
    }
}
