package chapter_5;

enum OS {
    // add constant values to enum
    WINDOWS, MACOS, LINUX;
}

public class Luyen_tap_bieu_dien_hang_so_enum_duoi_dang_chuoi {
    public static void main(String[] args) {

        // create a variable osType
        String osType;

        // convert MACOS to string 
        osType = OS.MACOS.toString();

        // print osType
        System.out.println(osType);
    }
}
