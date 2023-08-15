# Java Theory
## MỤC LỤC
- [I. Chapter 1]()
  - [1. Xuất dữ liệu]()
  - [2. Nhập dữ liệu đầu vào từ bàn phím]()

## Chapter 1
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
```java
int age = input.nextInt();
```
**Đóng Scanner:**
```java
input.close();
```
