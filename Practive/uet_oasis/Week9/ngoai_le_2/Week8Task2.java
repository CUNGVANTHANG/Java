import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    /**
     * void nullPointerEx.
     * 
     * @throws NullPointerException exception.
     */
    public void nullPointerEx() throws NullPointerException {
        String str = null;
        System.err.println(str.length());
    }

    /**
     * void ArrayIndexOutOfBoundsEx.
     * 
     * @throws ArrayIndexOutOfBoundsException exception.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        String[] array = new String[10];
        System.err.println(array[11]);
    }

    /**
     * void arithmeticEx.
     * 
     * @throws ArithmeticException exception.
     */
    public void arithmeticEx() throws ArithmeticException {
        System.err.println(1 / 0);
    }

    /**
     * void fileNotFoundEx.
     * 
     * @throws FileNotFoundException exception.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        String path = "C:\\Users\\PC\\Downloads\\Tuan\\test\\index.html";
        FileInputStream file = new FileInputStream(path);
    }

    /**
     * void ioEx.
     * 
     * @throws IOException exception.
     */
    public void ioEx() throws IOException {
        String path = "C:\\Users\\PC\\Downloads\\Tuan\\test\\index.html";
        FileInputStream file = new FileInputStream(path);
    }

    /**
     * String nullPointerExTest.
     * 
     * @return
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * String arithmeticExTest.
     * 
     * @return
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * String fileNotFoundExTest.
     * 
     * @return
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * String arrayIndexOutOfBoundsExTest.
     * 
     * @return
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * String ioExTest.
     * 
     * @return
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
