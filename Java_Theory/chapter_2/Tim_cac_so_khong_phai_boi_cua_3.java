package chapter_2;

public class Tim_cac_so_khong_phai_boi_cua_3 {
    public static void main(String[] args) {

        // loop from i = 1 to 10
        // inside the loop, check whether i is divisible by 3
        // if true, skip the current iteration of the loop. Otherwise, print i
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }

}
