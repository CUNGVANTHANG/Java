package chapter_1;

//Replace ___ with your code
public class Giam_hoc_phi {
    public static void main(String[] args) {

        double fee = 1536;
        double discountPercent = 10;

        // compute discount amount
        double discount = fee * discountPercent / 100;

        double finalFee = fee - discount;
        System.out.println(finalFee);

    }
}
