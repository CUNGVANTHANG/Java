# Java Theory (Java core & Java OOP basic)
## MỤC LỤC
- [Java Theory (Java core \& Java OOP basic)](#java-theory-java-core--java-oop-basic)
  - [MỤC LỤC](#mục-lục)
  - [I. Kiến thức lập trình cơ bản](#i-kiến-thức-lập-trình-cơ-bản)
    - [1. Xuất dữ liệu](#1-xuất-dữ-liệu)
    - [2. Nhập dữ liệu đầu vào từ bàn phím](#2-nhập-dữ-liệu-đầu-vào-từ-bàn-phím)
    - [3. Mảng](#3-mảng)
    - [4. Vòng lặp for-each](#4-vòng-lặp-for-each)
    - [5. Phương thức](#5-phương-thức)
    - [6. Chuỗi ký tự](#6-chuỗi-ký-tự)
  - [II. Kiến thức lập trình hướng đối tượng OOP](#ii-kiến-thức-lập-trình-hướng-đối-tượng-oop)
    - [1. Tính kế thừa](#1-tính-kế-thừa)
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
### 6. Chuỗi ký tự
[:arrow_up: Mục lục](#mục-lục)

Các phương thức xử lý chuỗi trong Java thường là phương thức trả về giá trị.

STT | Phương thức | Mô tả | Cách dùng |
| :---:| :--- | :---: | :---:
| 1 | ```length``` | tìm độ dài của chuỗi | `public int length()`
| 2 | ```charAt``` | lấy ký tự một chuỗi | `public char charAt(int index)`
| 3 | ```concat``` | nối hai chuỗi | `public String concat(String anotherString)` |
| 4 | ```equals``` | so sánh hai chuỗi | `public boolean equals(Object anotherObject)` |
| 5 | ```toLowerCase``` | chuyển đổi chuỗi thành chữ thường | `public String toLowerCase()` |
| 6 | ```toUpperCase``` | chuyển đổi chuỗi thành chữ hoa | `public String toLowerCase()` | 
| 7 | `compareTo` | so sánh các chuỗi cho trước với chuỗi hiện tại theo thứ tự từ điển | `public int compareTo(String anotherString)` |
| 8 | `contains` | tìm kiếm chuỗi ký tự trong chuỗi này | `public boolean contains(CharSequence sequence)` |
| 9 | `endsWith` | kiểm tra nếu chuỗi này kết thúc với hậu tố nhất định | `public boolean endsWith(String suffix)` |
| 10 | `equalsIgnoreCase` | so sánh hai chuỗi không phân biệt chữ hoa và chữ thường | `public boolean equals(Object anotherObject)` | 
| 11 | `format` | sử dụng giống hàm sprintf() trong C và printf() trong Java. | `public static String format(String format, Object... args)` |
| 12 | `getBytes` | trả về mảng byte | `public byte[] getBytes()` |
| 13 | `getChars` | sao chép nội dung của chuỗi thành mảng Char cụ thể | `public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)` | 
| 14 | `indexOf` | trả về chỉ số của giá trị ký tự đã cho hoặc chuỗi con | `int indexOf(int ch)` |
| 15 | `intern` | trả về chuỗi từ Pool chứa hằng số chuỗi khi nó được tạo bởi từ khóa new | `public String intern()` |
| 16 | `isEmpty` | kiểm tra chuỗi rỗng | `public boolean isEmpty()` |
| 17 | `join` | trả về một chuỗi được nối với nhau bởi dấu phân tách | `public static String join(CharSequence delimiter, CharSequence... elements)` |
| 18 | `lastIndexOf` | trả vể chỉ số cuối của ký tự hoặc chuỗi con | `int lastIndexOf(int ch)` |
| 19 | `replace` | thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới | `public String replace(char oldChar, char newChar)` | 
| 20 | `replaceAll` | thay thế tất cả các chuỗi ký tự phù hợp với regex (biểu thức chính quy) | `public String replaceAll(String regex, String replacement)` | 
| 21 | `split` | tách chuỗi này theo biểu thức chính quy(regular expression) và trả về mảng chuỗi | `public String split(String regex)` |
| 22 | `startsWith` | kiểm tra tiền tố của chuỗi có khớp với giá trị tiền tố đã nhập không | `public boolean startsWith(String prefix)` | 
| 23 | `subString` | trả về chuỗi con của một chuỗi | `public String substring(int startIndex, int endIndex)` |
| 24 | `toCharArray` | chuyển đổi chuỗi thành các mảng ký tự | `public char[] toCharArray()` |
| 25 | `trim` | xóa khoảng trẳng ở đầu và cuối chuỗi | `public String trim()` |
| 26 | `valueOf` | chuyển đối kiểu dữ liệu khác thành chuỗi | `public String valueOf(value)`

> [Tham khảo tại đây](https://viettuts.vn/java-string)

| Toán tử | Mô tả |
| :--- | :--- |
| ```+``` | nối hai chuỗi |

**Phân biệt chuỗi với ký tự:**
- `""` đại diện cho chuỗi
- `''` đại diện cho ký tự

**Chú ý:** *Nếu gán biến kiểu dữ liệu ký tự vào biến kiểu chuỗi sẽ sinh ra lỗi*

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

Lưu ý: Nếu bạn dùng từ khóa **private** để **khai báo constructor thì bạn sẽ không thể khởi tạo** được đối tượng của lớp này. 

- **Phạm vi truy cập (Access Modifier) của 4 loại:** `public, private, default, protected`

| Phạm vi truy cập	| Truy cập bên trong class?	| Truy cập bên trong package?	| Truy cập bên ngoài package bởi class con? |	Truy cập bên ngoài class và không thuộc class con? |
| :--: | :--: | :--: | :--: | :--: |
| `private` |	X |		|  |	  |
| `default` |	X	| X |	 |	 |
| `protected` |	X	| X |	X	|  |
| `public` |	X | 	X	 | X |	X |

- **Sơ đồ lớp:**

![image](https://github.com/CUNGVANTHANG/Java/assets/96326479/c6fb97cb-77f8-462b-8ce6-d49517324960)

Trong sơ đồ lớp, bạn có thể mô tả phạm vi truy cập của các thuộc tính, phương thức bằng cách đặt các ký tự `-`, `~`, `#`, `+` trước các thuộc tính và phương thức.

Ký tự `-` sẽ tương ứng với phạm vi truy cập `private`.

Ký tự `~` sẽ tương ứng với phạm vi truy cập `default`.

Ký tự `#` sẽ tương ứng với phạm vi truy cập `protected`.

Ký tự `+` sẽ tương ứng với phạm vi truy cập `public`.

_Ví dụ:_

![image](https://github.com/CUNGVANTHANG/Java/assets/96326479/32778d2f-e425-4416-aee0-eabd959e4409)

```java
public class Student {
	private String name;
	private int age;

	public Student() {

	}

	public void getInformation() {

	}

	public void display() {

	}
}
```

- **Lưu ý:** rằng việc khai báo và sử dụng **mảng các đối tượng không giống với khai báo và sử dụng mảng các kiểu dữ liệu nguyên thủy** như int, double, String, ...

- **Khai báo và sử dụng mảng các đối tượng**

```java
// Khai báo mảng students với n phần tử
Student[] students = new Student[n];
for (int i = 0; i < n; i++) {
	// Khởi tạo các phần tử trong mảng students
	students[i] = new Student();
}
```

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

**Biến static** là biến mà bạn có thể sử dụng mà không cần phải khởi tạo đối tượng

Ngoài việc sử dụng mà không cần phải khởi tạo đối tượng thì biến static còn có đặc điểm nữa là biến static được **chia sẻ bởi tất cả các đối tượng trong chương trình (giá trị của biến static là giống nhau ở tất cả các đối tượng)**. 

```java
class Counter {
    int count; // Không có từ khóa static

    public Counter() {
        count++;
        System.out.println(count);
    }
}

class Entry {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 1
        Counter c3 = new Counter(); // 1
    }
}
```

Kết quả này chắc bạn cũng đoán được (do **count là thuộc tính riêng của mỗi đối tượng nên kết quả sẽ là 3 số 1**). Nhưng nếu biến count là biến static thì tất cả các đối tượng này đều sẽ dùng **chung 1 biến count**:

```java
class Counter {
    static int count; // Có từ khóa static

    public Counter() {
        count++;
        System.out.println(count);
    }
}

class Entry {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 2
        Counter c3 = new Counter(); // 3
    }
}
```

Chính vì 2 tính chất này nên biến static sẽ thường được dùng để **lưu thông tin chung cho tất cả các đối tượng và lưu các hằng số**

_Lưu ý:_ biến được khai báo với từ khóa static không được coi là thuộc tính do nó không thuộc đối tượng nào.

**Phương thức static** cũng được khai báo với từ khóa static và được sử dụng mà không cần tạo ra báo đối tượng. 

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

Một số tính chất của phương thức static:

- Phương thức static có để được gọi mà không cần phải khởi tạo đối tượng.
- Trong cùng một lớp, phương thức static chỉ có thể gọi tới phương thức static khác, không thể gọi tới phương thức không phải là static.
- Trong cùng một lớp, phương thức static không thể gọi tới các thuộc tính không phải là static.

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
