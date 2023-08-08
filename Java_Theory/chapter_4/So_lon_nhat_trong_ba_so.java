package chapter_4;

public class So_lon_nhat_trong_ba_so {

    int getLargestNumber(int n1, int n2, int n3) {

        int largestNumber = n1 > n2 ? (n1 > n3 ? n1 : n3 ): (n2 > n3 ? n2 : n3);

        return largestNumber;
    }

    public static void main(String[] args) {

        // create object of Main class
        So_lon_nhat_trong_ba_so obj = new So_lon_nhat_trong_ba_so();

        int largestNumber = obj.getLargestNumber(3, 55, -5);
        System.out.println(largestNumber);

        largestNumber = obj.getLargestNumber(0, 12, 20);
        System.out.println(largestNumber);
    }
}
