package chapter_4;

public class Tong_cac_so_tu_nhien_tu_1_den_n {

    int computeSum(int number) {
        int total = 0;

        for (int i = 1; i <= number; i++) {
            total = total + i;
        }

        return total;
    }

    public static void main(String[] args) {
        Tong_cac_so_tu_nhien_tu_1_den_n obj = new Tong_cac_so_tu_nhien_tu_1_den_n();

        int total = obj.computeSum(10);
        System.out.println(total);

        total = obj.computeSum(100);
        System.out.println(total);
    }
}
