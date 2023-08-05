// Nhập lớp Scanner
import java.util.Scanner;

public class Input_Value {
    public static void main (String[] args) {
        System.out.println("Enter your age: ");

        // Tạo đối tượng của lớp Scanner
        Scanner input = new Scanner(System.in) ;

        // Nhận đầu vào từ người dùng
        int age = input.nextInt();
        
        System.out.println("Age is " + age);

        // Đóng Scanner
        input.close();
    }
}


// System.in có nghĩa là ta đang lấy đầu vào từ phương tiện nhập liệu tiêu chuẩn (bàn phím)