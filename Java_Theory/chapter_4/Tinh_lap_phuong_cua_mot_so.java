package chapter_4;

class Tinh_lap_phuong_cua_mot_so {

    // create a method named findCube()
    void findCube() {
        int number = 5;

        // find the cube of number
        int result = number * number * number;
        System.out.println(result);
    }

    public static void main(String[] args) {

        // creating object of Main class
        Tinh_lap_phuong_cua_mot_so obj = new Tinh_lap_phuong_cua_mot_so();

        // call findCube using the object
        obj.findCube();
    }
}
