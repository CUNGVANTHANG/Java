package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class xac_dinh_mat_khau_manh {
    static String checkPass(String chain) {
        if (chain.length() < 6) {
            return "FALSE";
        }
        int flag = 0;
        for (int i = 0; i < chain.length(); i++) {
            if (chain.contains("123456789")) {

            }
        }
        return "FALSE";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String chain = input.nextLine();
        // String check = "1 2 3 4 5 6 7 8 9 0";

        input.close();
    }
}
