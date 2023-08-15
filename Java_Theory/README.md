# Java Theory
## MỤC LỤC
- [I. Kiến thức lập trình cơ bản]()
  - [1. Xuất dữ liệu](#1-xuất-dữ-liệu)
  - [2. Nhập dữ liệu đầu vào từ bàn phím]()
  - [3. Mảng]()
  - [4. Vòng lặp for-each]()
  - [5. Phương thức]()
  - [6. Chuỗi]()
- [II. Kiến thức lập trình hướng đối tượng (OOP)]()

## I. Kiến thức lập trình cơ bản
### 1. Xuất dữ liệu
**Cú pháp:**
```java
System.out.println();
```

**Ví dụ:**

```java
class Main {
    public static void main(String[] args) {
 
        System.out.println("Hello, World!");
    }
}
```
**Kết quả:**

```Hello, World!```
### 2. Nhập dữ liệu đầu vào từ bàn phím
**Nhận lớp Scanner:**
```java
import java.util.Scanner;
```
**Tạo đối tượng của lớp Scanner:**
```java
Scanner input = new Scanner(System.in);
```
**Nhận đầu vào từ người dùng:**

- Nhận dữ liệu đầu vào là kiểu số nguyên
```java
int age = input.nextInt();
```

- Nhận dữ liệu đầu vào là kiểu số thực
```java
int age = input.nextDouble();
```

- Nhận dữ liệu đầu vào là kiểu chuỗi (lấy toàn bộ dòng văn bản làm đầu vào)
```java
int age = input.nextLine();
```

- Nhận dữ liệu đầu vào là kiểu chuỗi (lấy dòng văn bản cho đến khi gặp khoảng trắng)
```java
int age = input.next();
```

**Đóng Scanner:**
```java
input.close();
```
### 3. Mảng
- **Mảng 1 chiều**

**Tạo mảng có giá trị:**
```java
int[] age = {24, 23, 18, 19, 20};
```

hoặc

```java
int numbers[] = {24, 23, 18, 19, 20};

```
**Tạo mảng bằng cách xác định kích thước:**
```java
int[] numbers = new int[4];
```

hoặc

```java
int numbers[] = new int[4];
```
- **Mảng 2 chiều**

**Tạo mảng 2 chiều có giá trị:**
```java
int[][] data = { {2, 3, 5}, {7, 14, 21}, {1, 3, 5} };
```

hoặc 

```java
int data[][] = { {2, 3, 5}, {7, 14, 21}, {1, 3, 5} };
```
**Tạo mảng 2 chiều bằng cách xác định kích thước:**
```java
int[][] data = new int[3][4];
```
hoặc

```java
int data[][] = new int[3][4];
```

- **Kích thước mảng:**
```java
numbers.length
```
### 4. Vòng lặp for-each
**Cú pháp:**
```java
int numbers[] = {24, 23};

for (int number : numbers) {
  System.out.println(number);
}
```

trong đó:
- ```for``` - cú pháp của vòng lặp
- ```numbers``` - tên mảng
- ```int number``` - biến tạm thời. Bạn có thể đặt bất kỳ tên nào cho biến này.

**Kết quả:**
```
24
23
```
### 5. Phương thức
**Tạo phương thức:**
```java
returnType methodName() {
    // your code
}
```

trong đó:
- ```returnType``` - đại diện cho kiểu dữ liệu được phương thức trả về (ví dụ: ```int``` nghĩa là trả về số nguyên, ```double``` nghĩa là trả về số dấu phẩy động, v.v.).
- ```methodName()``` - tên phương thức
- ```{...}``` - phần thân của phương thức

**Gọi phương thức:**
```java
Main obj = new Main();
```

Ở đây, phương thức nằm trong lớp ```Main```, vì vậy ta đã tạo một đối tượng có tên là ```obj``` của lớp.

**Ví dụ:**
```java
class Main {
  
    void greet() {
        System.out.println("Hello");
        System.out.println("How do you do?");
    }
  
    public static void main(String[] args) {
        
        // create object of Main
        Main obj = new Main();
        
        // call the method
        obj.greet();
  
    }
}
```
### 6. Chuỗi
| Phương thức | Mô tả |
| :--- | :--- |
| ```length()``` | tìm độ dài của chuỗi |
| ```charAt()``` | lấy ký tự một chuỗi |
| ```concat()``` | nối hai chuỗi |
| ```equals()``` | so sánh hai chuỗi |
| ```toLowerCase()``` | chuyển đổi chuỗi thành chữ thường |
| ```toUpperCase()``` | chuyển đổi chuỗi thành chữ hoa |

| Toán tử | Mô tả |
| :--- | :--- |
| ```+``` | nối hai chuỗi |

