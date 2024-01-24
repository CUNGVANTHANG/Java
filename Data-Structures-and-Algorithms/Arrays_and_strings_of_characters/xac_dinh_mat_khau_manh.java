package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class xac_dinh_mat_khau_manh {
    static String checkPass(String chain) {
        if (chain.length() < 6) {
            return "FALSE";
        }
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        String special_character = "!@#$%^&*()-+";
        for (int i = 0; i < chain.length(); i++) {
            if (Character.isDigit(chain.charAt(i))) {
                flag1 = true;
            } else if (Character.isUpperCase(chain.charAt(i))) {
                flag2 = true;
            } else if (Character.isLowerCase(chain.charAt(i))) {
                flag3 = true;
            }
        }
        for (char c : chain.toCharArray()) {
            if (special_character.contains(String.valueOf(c))) {
                flag4 = true;
            }
        }
        return flag1 && flag2 && flag3 && flag4 ? "TRUE" : "FALSE";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chain = input.nextLine();
        System.err.println(checkPass(chain));
        input.close();
    }
}
