package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class he_mat_affine {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int getCharacterCode(char ch) {
        int ascii = (int) ch;
        if (ascii > 64 && ascii < 91) {
            return ascii - 65;
        } else if (ascii > 96 && ascii < 123) {
            return ascii - 97;
        }
        return -1;
    }

    // y = (a*x + b) mod 26
    static String encode(int a, int b, String str) {
        String strNew = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            int x = getCharacterCode(ch);
            if (x != -1) {
                int y = (a * x + b) % 26;
                if (ascii > 64 && ascii < 91) {
                    strNew = strNew + (char) (y + 65);
                } else if (ascii > 96 && ascii < 123) {
                    strNew = strNew + (char) (y + 97);
                }
            } else {
                strNew = strNew + ch;
            }
        }
        return strNew;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        input.nextLine();
        String str = input.nextLine();

        if (gcd(a, 26) != 1) {
            System.out.println("Can't Encrypted and Decrypted this Message");
        } else {
            System.out.println("Encrypted Message is : " + encode(a, b, str));
            System.out.println("Decrypted Message is : " + str);
        }

        input.close();
    }
}
