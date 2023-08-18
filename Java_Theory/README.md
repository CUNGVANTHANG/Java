# Java Theory (Java core & Java OOP basic)
## MỤC LỤC
- [I. Kiến thức lập trình cơ bản](#i-kiến-thức-lập-trình-cơ-bản)
  - [1. Xuất dữ liệu](#1-xuất-dữ-liệu)
  - [2. Nhập dữ liệu đầu vào từ bàn phím](#2-nhập-dữ-liệu-đầu-vào-từ-bàn-phím)
  - [3. Mảng](#3-mảng)
  - [4. Vòng lặp for-each](#4-vòng-lặp-for-each)
  - [5. Phương thức](#5-phương-thức)
  - [6. Chuỗi](#6-chuỗi)
- [II. Kiến thức lập trình hướng đối tượng OOP](#ii-kiến-thức-lập-trình-hướng-đối-tượng-oop)
  - [1. Tính đóng gói](#1-tính-kế-thừa)
  - [2. Tính trừu tượng](#2-tính-trừu-tượng)
  - [3. Tính đa hình](#3-tính-đa-hình)
  - [4. Tính đóng gói](#4-tính-đóng-gói)
  - [5. Toán tử instanceof](#5-toán-tử-instanceof)
  - [6. Từ khóa static](#6-từ-khóa-static)
  - [7. Từ khóa final](#7-từ-khóa-final)

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

## II. Kiến thức lập trình hướng đối tượng OOP
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

Chúng ta biết rằng **trường private không thể được truy cập từ bên ngoài lớp**. Tuy nhiên, nếu cần truy cập chúng, chúng ta có thể sử dụng các phương thức **getter và setter**.

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

Tính kế thừa cho phép một lớp (lớp con) kế thừa các trường và phương thức từ một lớp khác (lớp cha).

- **extends**
```java
//parent class
class Animal {
    void eat() {
        System.out.println("I can eat.");
    }
}

// the Dog class is derived from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("I can bark.");
    }
}
```

Ở đây, chúng ta đã sử dụng **từ khóa ```extends``` để kế thừa tất cả các trường và phương thức** của lớp ```Animal``` trong lớp ```Dog```.

- **Ghi đè phương thức:**
```java
class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}
 
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark Bark");
    }
}
 
class Main {
    public static void main(String[] args) {
 
        Dog dog1 = new Dog();
        dog1.makeSound();
    }
}
 
// Output: Bark Bark
```

Chúng ta biết rằng khi một phương thức xuất hiện trong cả lớp cha và lớp con, phương thức trong lớp con sẽ ghi đè phương thức trong lớp cha.

Tuy nhiên, giả sử chúng ta cũng muốn truy cập phương thức của lớp Animal thì phải làm như thế nào?

Khi đó, chúng ta có thể sử dụng từ khóa ```super```. **Từ khóa ```super``` cho phép ta truy cập phương thức của lớp cha từ lớp con**.

- **super**
```java
class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}
 
class Dog extends Animal {
    void makeSound() {
        super.makeSound();
        System.out.println("Bark Bark");
    }
}
 
class Main {
    public static void main(String[] args) {
 
        Dog dog1 = new Dog();
        dog1.makeSound();
    }
}

// Output: Animal Sound
// Output: Bark Bark
```

Một ví dụ khác:

```super``` trong hàm khởi tạo:

```java
Dog() {
    super();
    System.out.println("I am a dog");
}
```

**Lưu ý: ```super()``` phải là câu lệnh đầu tiên bên trong hàm khởi tạo của lớp con khi gọi hàm khởi tạo của lớp cha**

### 2. Tính trừu tượng
[:arrow_up: Mục lục](#mục-lục)

Tính trừu tượng là một trong những khái niệm quan trọng trong lập trình hướng đối tượng. Nó cho phép ta quản lý độ phức tạp của chương trình bằng cách ẩn các chi tiết không cần thiết và chỉ hiển thị thông tin cần thiết.

- **abstract**

Trong Java, chúng ta cũng có thể tạo các phương thức không có phần thân hàm. Những phương thức này được gọi là phương thức trừu tượng.

Chúng ta sử dụng **từ khóa ```abstract``` để tạo các phương thức trừu tượng**. Ví dụ:
```java
abstract void makeSound();
```
```makeSound()``` là một phương thức trừu tượng. Phần thân của phương thức trừu tượng được thay thế bằng ;

Chúng ta sử dụng **từ khóa ```abstract``` để tạo lớp trừu tượng**. Ví dụ: 
```java
abstract class Polygon {
    // code inside the class
}
```

**Chúng ta không thể tạo các đối tượng của lớp trừu tượng**, vậy làm thế nào để truy cập các phương thức bên trong lớp?
Trong Java, chúng ta phải **kế thừa ```extends``` lớp trừu tượng để sử dụng nó**. Ví dụ:
```java
abstract class Polygon {

    // abstract method 
    abstract void getArea();

    // non-abstract method
    public void printSides() {
        System.out.println("Print sides of Polygon.");
    }
}

class Rectangle extends Polygon {

}
```

- **interface**
Lớp trừu tượng có thể bao gồm cả phương thức trừu tượng và không trừu tượng.

Trong Java, chúng ta cũng có thể tạo một lớp hoàn toàn trừu tượng gọi là interface. **Một interface chỉ chứa các phương thức trừu tượng.**

```java
interface Animal {

    abstract public void play(); 
    abstract public void makeSound();
}
```

Cũng giống như lớp trừu tượng, **chúng ta không thể tạo các đối tượng của interface**. Để sử dụng interface, các lớp khác phải triển khai interface đó. Chúng ta sử dụng **từ khóa ```implements``` để triển khai interface**. Ví dụ:

```java
interface Animal {
 
    abstract public void play(); 
    abstract public void makeSound();
}
 
class Dog implements Animal {
 
    // implement play()
    public void play() {
        System.out.println("I play ball fetch");
    }
 
    // implement makeSound()
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
```

### 3. Tính đa hình
[:arrow_up: Mục lục](#mục-lục)

Đa hình là một khái niệm quan trọng khác của lập trình hướng đối tượng. Đa hình chỉ đơn giản là có nhiều hình thái khác nhau. Tức là cùng một thực thể (phương thức hoặc toán tử) có thể thực hiện các thao tác khác nhau trong những tình huống khác nhau.

Chúng ta đã sử dụng toán tử ```+``` để thực hiện hai thao tác khác nhau:

- 5 + 1 - cộng hai số
- "Hello " + "World" - nối hai chuỗi
  
Ở đây, toán tử ```+``` có hai dạng khác nhau. Đó là một ví dụ về **Tính đa hình**.

- **Tính đa hình với Ghi đè phương thức**
```java
// makeSound() in the superclass
class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}
 
// makeSound() in the subclass
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof Woof");
    }
}
```

Trên ví dụ trên, chúng ta có thể sử dụng cùng một phương thức ```makeSound()``` để thực hiện hai tác vụ khác nhau. ```makeSound()``` thể hiện tính đa hình

- **Tính đa hình với nạp chồng phương thức**
```java
// method with no parameter
void display() {....}

// method with a single parameter
void display(int number) {...}

// method with string parameter
void display(String name) {...}

// method with two parameters
void display(String name, int age) {...}
```

Chúng ta có hai cách để thực hiện nạp chồng phương thức.

  - Số lượng tham số khác nhau
  - Các tham số có kiểu dữ liệu khác nhau

### 4. Tính đóng gói
[:arrow_up: Mục lục](#mục-lục)

Tính đóng gói là một khái niệm cốt lõi khác của lập trình hướng đối tượng. Đóng gói có nghĩa là gộp các trường và phương thức lại với nhau bên trong một lớp.

```java
class Rectangle {

    // fields to calculate area
    int length;
    int breadth;

    // method to calculate area
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}
```

Bạn có thể thấy phương thức ```computeArea()``` sử dụng các trường ```length``` và ```breadth``` để tính diện tích hình chữ nhật. Cả hai trường này đều xuất hiện trong cùng một lớp.

- **Ẩn dữ liệu**
```java
class Rectangle {
 
    // fields to calculate area
    private int length;
    private int breadth;
}
```

Các lớp khác sẽ không thể truy cập trực tiếp vào các trường ```length```và ```breadth```. Bằng cách đặt các trường này ở phạm vi ```private```, chúng ta đã hạn chế truy cập không được cấp quyền từ bên ngoài lớp.

### 5. Toán tử instanceof
[:arrow_up: Mục lục](#mục-lục)

**Để kiểm tra xem một đối tượng có phải là thể hiện (đối tượng) của một lớp cụ thể hay không, chúng ta sử dụng toán tử ```instanceof```**. Hãy xem một ví dụ:

```java
class Main {
    public static void main(String[] args) {
        
        // create an object of the Main class
        Main obj = new Main();
        
        // check if obj if the object of the Main class
        boolean result = obj instanceof Main;
        System.out.println(result);    // true
    }
}
```

### 6. Từ khóa static
[:arrow_up: Mục lục](#mục-lục)

```java
class Animal {
 
    // method 
    static void display() {
        System.out.println("I am an animal.");
    }
    
    // main method
     public static void main(String[] args) {
         
         // access the method of Animal class
         display();
    }
}
 
// Output: I am an animal.
```

Chúng ta có thể **truy cập trực tiếp phương thức ```display()``` mà không cần sử dụng đối tượng của lớp**. Đó là bởi vì ta đã xác định phương thức là **```static```**.

- **Truy cập các trường/phương thức static từ các lớp khác**

```java
class Animal {
 
    // static method
    static void display() {
        System.out.println("I am an animal.");
    }
 
}
 
class Main {
 
    // main method
    public static void main(String[] args) {
 
        // access the method of Animal class
        Animal.display();
    }
}
 
// Output
// I am an animal.
```

### 7. Từ khóa final
[:arrow_up: Mục lục](#mục-lục)

Trong Java, chúng ta sử dụng **từ khóa ```final``` với biến, phương thức và lớp để áp dụng một số ràng buộc**. Ví dụ: nếu sử dụng ```final``` với:

- **Biến** - chúng ta không thể thay đổi giá trị của biến
- **Phương thức** - chúng ta không thể thực hiện ghi đè phương thức
- **Lớp** - chúng ta không thể kế thừa lớp

```java
class Main {
    public static void main(String[] args) {
        
        // create final variable
        final int number = 34;
        System.out.println("Number Value: " + number);
        
        // change the value of the final variable
        number = 24;
        System.out.println("Updated Number: " + number);
    }
}
```
```
error: cannot assign a value to final variable number
number = 24;
^
```

Thông báo lỗi cho biết chúng ta không được phép thay đổi giá trị của biến ```final```.

Biến có giá trị không thể thay đổi được gọi là **hằng số**. Do đó, chúng ta sử dụng **từ khóa ```final``` để tạo hằng số** trong Java.
