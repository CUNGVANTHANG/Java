package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class xoa_khoang_trang {
    static String chainNew(String chain) {
        while (chain.charAt(0) == ' ') {
            chain = chain.substring(1, chain.length());
        }

        while (chain.charAt(chain.length() - 1) == ' ') {
            chain = chain.substring(0, chain.length() - 1);
        }

        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == ' ' && chain.charAt(i + 1) == ' ') {
                chain = chain.substring(0, i) + chain.substring(i + 1, chain.length());
                i--;
            }
        }

        return chain;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chain = input.nextLine();

        System.err.println(chainNew(chain));

        input.close();
    }
}
