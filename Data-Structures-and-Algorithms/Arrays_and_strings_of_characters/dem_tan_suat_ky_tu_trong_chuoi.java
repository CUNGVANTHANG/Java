package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class dem_tan_suat_ky_tu_trong_chuoi {
    static void characterCount(String chain) {
        int count = 1;
        char arrayChain[] = chain.toCharArray();
        for (int i = 0; i < arrayChain.length; i++) {
            for (int j = i + 1; j < arrayChain.length; j++) {
                if (arrayChain[i] == arrayChain[j] && arrayChain[i] != ' ') {
                    count++;
                    arrayChain[j] = ' ';
                }
            }
            if (arrayChain[i] != ' ') {
                System.err.print(arrayChain[i] + "" + count + " ");
                count = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chain = input.nextLine();
        characterCount(chain);
        input.close();
    }
}
