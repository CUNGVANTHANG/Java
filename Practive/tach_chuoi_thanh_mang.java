import java.util.Scanner;

public class tach_chuoi_thanh_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                n++;
            }
        }

        String strArray[] = new String[n + 1];

        for (int i = 0; i < n; i++) {
            strArray[i] = "";
        }

        n = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                strArray[n] = strArray[n] + str.charAt(i);
                continue;
            }

            n++;
        }

        System.err.print("[");

        for (int i = 0; i < n + 1; i++) {
            if (i == n) {
                System.err.print(strArray[i]);
                break;
            }
            System.err.print(strArray[i] + ", ");
        }

        System.err.print("]");

        input.close();
    }

}