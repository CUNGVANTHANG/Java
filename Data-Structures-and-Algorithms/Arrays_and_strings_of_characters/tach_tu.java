package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class tach_tu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        String result = "Ket qua tach tu: ";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) >= 65 && s.charAt(i) <= 90) {
                char c = Character.toLowerCase(s.charAt(i));
                if (i == 0) {
                    result = result + c;
                    continue;
                }
                result = result + " " + c;
            } else {
                result = result + s.charAt(i);
            }
        }

        System.err.println(result);

        input.close();
    }
}
