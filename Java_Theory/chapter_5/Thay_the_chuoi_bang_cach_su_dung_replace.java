package chapter_5;

public class Thay_the_chuoi_bang_cach_su_dung_replace {

    public static void main(String[] args) {
        String str1 = "Fool Mouse";

        System.out.println("Before: " + str1);

        // replace F with W
        String str2 = str1.replace('F', 'W');

        // replace M with H
        str2 = str2.replace('M', 'H');

        System.out.println("After: " + str2);
    }

}
