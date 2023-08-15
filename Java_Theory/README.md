# Java Theory
## MỤC LỤC
- [I. Kiến thức lập trình cơ bản](#i-kiến-thức-lập-trình-cơ-bản)
  - [1. Xuất dữ liệu](#1-xuất-dữ-liệu)
  - [2. Nhập dữ liệu đầu vào từ bàn phím](#2-nhập-dữ-liệu-đầu-vào-từ-bàn-phím)
  - [3. Mảng](#3-mảng)
  - [4. Vòng lặp for-each](#4-vòng-lặp-for-each)
  - [5. Phương thức](#5-phương-thức)
  - [6. Chuỗi](#6-chuỗi)
- [II. Kiến thức lập trình hướng đối tượng (OOP)]()

## I. Kiến thức lập trình cơ bản
### 1. Xuất dữ liệu
[:arrow_up: Mục lục](#mục-lục)

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
[:arrow_up: Mục lục](#mục-lục)

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
[:arrow_up: Mục lục](#mục-lục)

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
[:arrow_up: Mục lục](#mục-lục)

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
[:arrow_up: Mục lục](#mục-lục)

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
[:arrow_up: Mục lục](#mục-lục)

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

## II. Kiến thức lập trình hướng đối tượng (OOP)
[:arrow_up: Mục lục](#mục-lục)

- **Tạo lớp:**
```java
class Student {
    // add fields
    String name;

    // constructor
    Student(String name) {
        ...
    }
 
    // method
    void checkName() {
        ...
    }
}
```

- **Tạo đối tượng:**
```java
Student obj = new Student(name);
```

- **Gọi đối tượng:**
```java
obj.checkName();
```

- **this**

```this``` dùng để tham chiếu đến đối tượng hiện tại.

Ví dụ:
```java
class Student {
    
    String name;
    
    void displayName() {
        System.out.println("Name using this: " + this.name);
    }
    
    public static void main(String[] args) {
        
        // create two objects
        Student student1 = new Student();
        Student student2 = new Student();
        
        // method call with the student1 object
        student1.name = "Rosie";
        student1.displayName();
        
        // method call with the student2 object
        student2.name = "Ramsey";
        student2.displayName();
        
    }
}
```

trong đó:

```student1.displayName()``` - ```this``` tham chiếu đến đối tượng hiện tại là ```student1```

```student2.displayName()``` - ```this``` tham chiếu đến đối tượng hiện tại là ```student2```

- **public**

```public``` cho phép truy cập từ các lớp khác

- **private**

```private``` ngăn truy cập từ các lớp khác

Chúng ta biết rằng trường private không thể được truy cập từ bên ngoài lớp. Tuy nhiên, nếu cần truy cập chúng, chúng ta có thể sử dụng các phương thức getter và setter.

- **setter**

Phương thức setter - cho phép thiết lập giá trị của trường

```java
public void setName(String name) {    
    this.name = name;
}
```

- **getter**

Phương thức getter - cho phép lấy giá trị của trường

```java
public String getName() {
    
    return name;
}
```

### 1. Tính kế thừa
[:arrow_up: Mục lục](#mục-lục)

```java
//parent class
class Animal {
    void eat() {
        System.out.println("I can eat.");
    }
}

//the Dog class is derived from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("I can bark.");
    }
}
```

Ở đây, chúng ta đã sử dụng từ khóa ```extends``` để kế thừa tất cả các trường và phương thức của lớp ```Animal``` trong lớp ```Dog```.

**Ghi đè phương thức:**
