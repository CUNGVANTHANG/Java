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
    - [8. Mối quan hệ giữa các đối tượng](#8-mối-quan-hệ-giữa-các-đối-tượng)

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

**Lưu ý: ```super()``` phải là câu lệnh đầu tiên bên trong hàm khởi tạo của lớp con khi gọi hàm khởi tạo của lớp cha**

```java
class Person {
    private String name;
    private int dob;

    public Person(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getDob() {
        return dob;
    }
}

class Student extends Person {
    private double GPA;

    public Student(String name, int dob, double GPA) {
        // Gọi tới constructor 2 tham số của lớp cha
        super(name, dob);
        this.GPA = GPA;
    }

    public void setGpa(double GPA) {
        this.GPA = GPA;
    }

    public double getGpa() {
        return GPA;
    }
}

public class Entry {
    public static void main(String[] args) {
        Student s = new Student("Hai", 1999, 8.8);
        System.out.println("Name: " + s.getName());
        System.out.println("Date of birth: " + s.getDob());
        System.out.println("GPA: " + s.getGpa());
    }
}
```

_Lưu ý:_ Khi một lớp con được tạo, constructor của lớp cha sẽ được gọi trước constructor của lớp con. Nếu constructor của lớp con không gọi `super()`, Java sẽ tự động thêm một lời gọi `super()` mặc định tới constructor không tham số của lớp cha. 

```java
class A {

    public A() {
        System.out.print("A");
    }
}

class B extends A {

    public B() {
        System.out.print("B");
    }
}

class C extends B {

    public C() {
        System.out.print("C");
    }
}

public class Quiz {

    public static void main(String[] args) {
        C c = new C(); // ABC
    }
}
```

c khởi tạo => gọi super đến class cha B => gọi super đến class cha C

```java
class B extends A {
    public B() {
        super(); // Gọi constructor của lớp cha A
        System.out.print("B");
    }
}

class C extends B {
    public C() {
        super(); // Gọi constructor của lớp cha B
        System.out.print("C");
    }
}
```

- **`toString()` là phương thức ghi đè từ lớp Object**

Trong thực tế bạn sẽ sử dụng phương thức `toString()` rất nhiều. Ví dụ khi bạn gọi hàm `System.out.println()` với một đối tượng thì chương trình sẽ hiển thị phương thức `toString()` của đối tượng đó

```java
public class Student {
    private String name;
    private String address;
    private double gpa;

    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", address: " + address + ", GPA: " + gpa;
    }
}

public class Entry {
    public static void main(String[] args) {
 	Student s = new Student("Kien", "Ha Noi", 6.6);
 	System.out.println(s);	// Name: Kien, addres: Ha Noi, GPA: 6.6
    }
}
```

Có thể thấy ta có thể in kết quả ra mà không cần gọi phương thức.

**- Trong Java, có 3 kiểu kế thừa là **đơn kế thừa**, **kế thừa nhiều cấp** và **kế thừa thứ bậc**:**

<img src="https://github.com/CUNGVANTHANG/Java/assets/96326479/c04ea1f6-f31d-4ce7-9a17-3bd7160e4b81" style="width: 500px">

Về bản chất, khi **một lớp không kế thừa lớp nào thì lớp đó sẽ được kế thừa trực tiếp từ lớp Object** giống như đơn kế thừa. Nhưng nếu **lớp đó có kế thừa từ một lớp khác lớp Object thì lớp đó sẽ không được kế thừa trực tiếp từ lớp Object nữa mà là theo kế thừa nhiều cấp**

<img src="https://github.com/CUNGVANTHANG/Java/assets/96326479/b6651e61-b40f-4a6a-a33b-bdd9b4546f51" style="width: 300px">

**- Toán tử `==` là **toán tử so sánh địa chỉ** nơi đối tượng được cấp phát**

```java
class Student{
    public String name;
    public String address;

    public Student(String name, String address) {
	this.name = name;
	this.address = address;
    }
}

public class Entry {
    public static void main(String[] args) {
	Student s1 = new Student("Viet", "Bac Ninh");
	Student s2 = new Student("Viet", "Bac Ninh");
	System.out.println(s1 == s2); // false
    }
}
```

Rõ ràng bạn không thể sử dụng toán tử `==` vì đây là toán tử so sánh địa chỉ nơi đối tượng được cấp phát, thay vào đó bạn phải tự viết phương thức để so sánh hoặc sử dụng phương thức `equals()` mà lớp `Object` đã cung cấp sẵn, bạn chỉ cần ghi đè lại phương thức này giống như chương trình sau

```java
class Student {
    public int id;
    public String name;
    public String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Student) obj).id;
    }
}

public class Entry {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "Viet", "Bac Ninh");
        Student s2 = new Student(1000, "Viet", "Bac Ninh");
        System.out.println(s1.equals(s2)); // true
    }
}
```

- **Up-casting và down-casting trong Java**

<img src="https://github.com/CUNGVANTHANG/Java/assets/96326479/57e4568d-707e-4050-9a71-4ae3beee2689" style="width: 300px;">

**Up-casting:** Khi biến của lớp cha tham chiếu tới đối tượng của lớp con (đối tượng của lớp con bị chuyển kiểu dữ liệu về lớp cha), thì đó được gọi là up-casting

_Ví dụ:_

```java
class Animal {
    public void sound() {
        System.out.println("some sound");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("meow meow");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("woof woof");
    }
}

public class Entry {
    public static void main(String[] args) {
        // Up-casting
        Animal animal1 = new Cat();
        animal1.sound();
        // Up-casting
        Animal animal2 = new Dog();
        animal2.sound();
    }
}
```

_Kết quả:_

```
meow meow
woof woof
```

Có thể thấy đối tượng thuộc lớp **Cat** và lớp **Dog** đã được **gán cho biến thuộc lớp Animal** (chuyển kiểu về lớp Animal), đó chính là **up-casting**

_Lưu ý:_ Khi biến của **lớp cha tham chiếu tới đối tượng của lớp con** thì biến này **chỉ có thể gọi tới các thuộc tính và phương thức có ở lớp cha** và **nếu lớp con ghi đè thì phương thức được gọi sẽ ở lớp con**.

<img src="https://github.com/CUNGVANTHANG/Java/assets/96326479/d4653ae3-42f7-44d5-a4cb-49cf3bf07c28" style="height: 500px;">

Chương trình này sẽ báo lỗi do phương thức `play()` không có ở lớp cha

Nếu thay `animal.play()` thành `animal.sound()` thì chương trình sẽ hiển thị ra "**woof woof**" thay vì "**some sound**" (do lớp con ghi đè phương thức `sound()` từ lớp cha).

> **Để gọi tới được phương thức `play()`, bạn cần thực hiện **down-casting**.**

**Down-casting**: chuyển từ lớp cha sang lớp con.

_Ví dụ:_ Bạn có thể gọi tới phương thức `play()` từ biến animal giống như sau

```java
class Animal {
    public void sound() {
        System.out.println("some sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("woof woof");
    }

    public void play() {
        System.out.println("The dog is playing");
    }
}

public class Entry {
    public static void main(String[] args) {
        Animal animal = new Dog();
        // Down-casting
        ((Dog) animal).play();
    }
}
```

_Kết quả:_

```
The dog is playing
```

Hoặc bạn cũng có thể thực hiện **down-casting** giống như sau:

```java
Animal animal = new Dog();
Dog dog = (Dog)animal;
dog.play();
```

### 2. Tính trừu tượng
[:arrow_up: Mục lục](#mục-lục)

Tính trừu tượng là một trong những khái niệm quan trọng trong lập trình hướng đối tượng. Nó cho phép ta quản lý độ phức tạp của chương trình bằng cách ẩn các chi tiết không cần thiết và chỉ hiển thị thông tin cần thiết.

_Ví dụ 1:_ Khi bạn đi **rút tiền ở cây ATM** thì bạn **không cần quan tâm** tới cách mà **cây ATM hoạt động hay các thành phần** có trong cây ATM, cái mà bạn **quan tâm** duy nhất đó là **tính năng rút tiền**. Trong trường hợp này các **thông tin không cần thiết** của cây ATM đã được **ẩn đi**, đó chính là tính trừu tượng.

_Ví dụ 2:_ Tương tự trong lập trình cũng vậy, khi **sử dụng một đối tượng** bạn chỉ cần **quan tâm** tới các **phương thức cần thiết** và chỉ cần biết phương thức đó được dùng để làm gì chứ **không cần quan tâm tới source code và các phương thức khác**.

- **Variable hiding**

**Variable hiding** xảy ra khi lớp con khai báo thuộc tính có **tên giống tên** thuộc tính ở lớp cha, lúc này **thuộc tính của lớp cha sẽ không bị lớp con ghi đè** mà bị **lớp con ẩn đi**

```java
class SuperClass {
    int x = 10;
}

class SubClass extends SuperClass {
    int x = 20;
}

public class Entry {
    public static void main(String[] args) {
        SuperClass a = new SubClass();
        System.out.println(a.x); // 10
    }
}
```

Trong ví dụ trên thuộc tính x ở lớp con và thuộc tính x ở lớp cha là **2 thuộc tính tồn tại độc lập**. Do không bị ghi đè nên khi sử dụng **up-casting** thì thuộc tính được gọi vẫn là thuộc tính ở lớp cha

Muốn gọi tới được **thuộc tính của lớp con** bạn phải sử dụng **down-casting** giống như sau

```java
class SuperClass {
    int x = 10;
}

class SubClass extends SuperClass {
    int x = 20;
}

public class Entry {
    public static void main(String[] args) {
        SuperClass a = new SubClass();
        System.out.println(a.x); // 10
	System.out.println(((SubClass)a).x); // 20
    }
}
```

- **abstract**

Trong Java, chúng ta cũng có thể tạo các phương thức không có phần thân hàm. Những phương thức này được gọi là phương thức trừu tượng.

Chúng ta sử dụng **từ khóa ```abstract``` để tạo các phương thức trừu tượng**. 

_Ví dụ:_

```java
abstract void makeSound();
```

```makeSound()``` là một phương thức trừu tượng. Phần thân của phương thức trừu tượng được thay thế bằng `;`

Chúng ta sử dụng **từ khóa ```abstract``` để tạo lớp trừu tượng**. 

_Ví dụ:_

```java
abstract class Polygon {
    // code inside the class
}
```

**Chúng ta không thể tạo các đối tượng của lớp trừu tượng**, vậy làm thế nào để truy cập các phương thức bên trong lớp?

Trong Java, chúng ta phải **kế thừa ```extends``` lớp trừu tượng để sử dụng nó**.

_Ví dụ:_

```java
abstract class Polygon {

    // abstract method
    // Phương thức trừu tượng là phương thức mà chỉ có phần khai báo, không có phần thân. 
    abstract void getArea();

    // non-abstract method
    public void printSides() {
        System.out.println("Print sides of Polygon.");
    }
}

class Rectangle extends Polygon {
    // Phải ghi đè phương thức trừu tượng getArea(), nếu không sẽ lỗi
    public void getArea() {
        
    }
}
```

**Lớp trừu tượng** (**abstract**) có thể bao gồm cả **phương thức trừu tượng** và **không trừu tượng**. **Phương thức trừu tượng** là phương thức mà chỉ có phần khai báo, không có phần thân. 

_Lưu ý:_ **1 lớp chỉ có thể kế thừa 1 lớp abstract**

- **interface**

Trong Java, chúng ta cũng có thể tạo **một lớp hoàn toàn trừu tượng** gọi là interface. **Một interface chỉ chứa các phương thức trừu tượng.**

```java
interface Animal {
    public abstract void play();
    public abstract void makeSound();
}
```

hoặc như này

```java
interface IAnimal{
    int N = 4;
    void move();
    void sound();
}
```

thì trình biên dịch sẽ tự hiểu là 

```java
interface IAnimal {
    public static final int N = 4;
    public abstract void move();
    public abstract void sound();
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

Một lớp có thể kế thừa nhiều **interface**. Do bản chất **interface** chỉ chứa các **phương thức rỗng** nên Java cho phép **một lớp kế thừa nhiều interface**.

```java
interface IFlyable {
    void fly();
}

interface IEatable {
    void eat();
}

class Bird implements IFlyable, IEatable {
    @Override
    public void fly() {
        System.out.println("Bird flying");
    }

    @Override
    public void eat() {
        System.out.println("Bird eats");
    }
}

public class Entry {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat(); // Bird eats
        bird.fly(); // Bird flying
    }
}
```

Khi nhìn vào **interface** thì thứ duy nhất mà bạn nhìn thấy đó là các **phương thức trừu tượng (các tính năng)**, do đó **sử dụng interface** được coi là **trừu tượng hoàn toàn**.

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

- **Tính đa hình với nạp chồng phương thức (Overloading)**
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

Chúng ta có hai cách để thực hiện nạp chồng phương thức (Overloading).

  - Số lượng tham số khác nhau
  - Các tham số có kiểu dữ liệu khác nhau

_Ví dụ:_

```java
class Math {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}

class Entry {
    public static void main(String[] args) {
        System.out.println(Math.add(2, 4)); 
        System.out.println(Math.add(3.5, 4.3)); // Nạp chồng phương thức
    }
}
```

Nghĩa là ta có thể sử dụng phương thức đó với nhiều kiểu tham số khác nhau. Giúp code trở nên gọn gàng, dễ đọc hơn thay vì tạo nhiều phương thức với tên khác nhau như này.

### 4. Tính đóng gói
[:arrow_up: Mục lục](#mục-lục)

Tính đóng gói là một khái niệm cốt lõi khác của lập trình hướng đối tượng. Đóng gói có nghĩa là gộp các trường và phương thức lại với nhau bên trong một lớp.

Tính đóng là kỹ thuật giúp bạn che giấu được những thông tin bên trong đối tượng. Mục đích chính của tính đóng gói là **giúp hạn chế các lỗi khi phát triển chương trình**.

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

Bạn có thể thấy phương thức ```calculateArea()``` sử dụng các trường ```length``` và ```breadth``` để tính diện tích hình chữ nhật. Cả hai trường này đều xuất hiện trong cùng một lớp.

- **Ẩn dữ liệu**
```java
class Rectangle {
 
    // fields to calculate area
    private int length;
    private int breadth;
}
```

Các lớp khác sẽ không thể truy cập trực tiếp vào các trường ```length```và ```breadth```. Bằng cách đặt các trường này ở phạm vi ```private```, chúng ta đã hạn chế truy cập không được cấp quyền từ bên ngoài lớp.

*Ví dụ:*

```java
class Student {
	private String name;
	private int age;
	private double gpa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
```

Với cách làm này thông tin của đối tượng đã được ẩn đi, bạn chỉ có thể **giao tiếp với đối tượng thông qua các phương thức**.

Điều này cũng giống với thực tế. Ví dụ khi bạn gặp một người lạ thì bạn không thể biết được các thuộc tính của người này (số điện thoại, sở thích, ...), kể cả khi bạn hỏi thì người này cũng chưa chắc đã trả lời cho bạn đúng sự thật (**giống như phương thức không trả về giá trị thực thuộc tính mà trả về một giá trị khác**).

Các lợi ích chính mà tính đóng gói đem lại:

- Hạn chế được các truy xuất không hợp lệ tới các thuộc tính của đối tượng.
- Giúp cho trạng thái của các đối tượng luôn đúng. Ví dụ nếu thuộc tính gpa của lớp `Student` là `public` thì sẽ rất khó kiểm soát được giá trị, bạn có thể thay đổi `gpa` thành bất kỳ giá trị nào. Ngược lại, nếu bạn để thuộc tính gpa là `private` và cung cấp hàm `setGpa()` giống như sau:

```java
public void setGpa(double gpa) {
	if(gpa >= 0 && gpa <= 4) {
		this.gpa = gpa;
	}else {
		System.out.println("gpa is invalid");
	}
}​
```

thì lúc này giá trị của thuộc tính gpa sẽ luôn được đảm bảo là không âm và nhỏ hơn hoặc bằng 4 (do muốn thay đổi gpa thì phải thông qua hàm `setGpa()`).
- Giúp ẩn đi những thông tin không cần thiết về đối tượng.

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

### 8. Mối quan hệ giữa các đối tượng
[:arrow_up: Mục lục](#mục-lục)

**1. Quan hệ phụ thuộc**

Quan hệ phụ thuộc là quan hệ mà **đối tượng của lớp này sử dụng đối tượng của lớp kia**.

```java
class ClassA{
     public void myMethod(ClassB b) {
	b.doWork();
     }
}
```

Trong trường hợp trên lớp **ClassA sẽ phụ thuộc vào lớp ClassB**, nếu lớp **ClassB thay đổi thì có thể lớp ClassA sẽ phải thay đổi** theo.

Biểu diễn như sau:

<img src="https://github.com/CUNGVANTHANG/Java/assets/96326479/c9ce1071-e099-482b-894c-8b1b866681c1" style="width: 300px">

**2. Quan hệ kết hợp (Association)**

Quan hệ kết hợp xảy ra khi một **đối tượng có thuộc tính là một đối tượng khác**.

```java
class Employee {
    private String name;
    private Manager manager;

    public Employee(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getManagerName() {
        return manager.getName();
    }

    public String getName() {
        return name;
    }
}

class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

Trong đoạn code trên lớp **Employee có thuộc tính là đối tượng thuộc lớp Manager**, do đó hai lớp này có **quan hệ kết hợp**. Quan hệ kết hợp được chia làm 2 loại là **quan hệ thu nạp** (Aggregation) và **quan hệ hợp thành** (Composition)

- **Quan hệ thu nạp (Aggregation)**

Quan hệ thu nạp xảy ra khi một **đối tượng có thuộc tính là một đối tượng khác** và **2 đối tượng này có thể tồn tại độc lập**.

```java
public class ClassA {       
    ClassB b;
    public void setB(ClassB b){
    	this.b = b;
     }
}
```

Có thể thấy **đối tượng của ClassB tồn tại độc lập với đối tượng của ClassA** (ClassA không tạo ra đối tượng của ClassB).

Biểu diễn như sau:

<img src="https://github.com/CUNGVANTHANG/Java/assets/96326479/f897411c-8391-48b2-b0a5-ba7ee01afd6b" style="width: 300px">

- **Quan hệ hợp thành (Composition)**

Quan hệ hợp thành xảy ra khi **đối tượng của lớp ClassB là 1 phần trong đối tượng của lớp ClassA**, khi **đối tượng của lớp ClassA bị hủy thì đối tượng của ClassB cũng bị hủy** theo  

_Ví dụ:_ Mối quan hệ giữa File và Folder, **một Folder sẽ có nhiều File** và nếu **Folder bị hủy thì File cũng bị hủy theo**. Quan hệ hợp thành này sẽ được biểu diễn dưới sơ đồ lớp như sau:

<img src="https://github.com/CUNGVANTHANG/Java/assets/96326479/8c1f6c3c-47c7-43d1-9fc4-7ef23a7a8ea7" style="width: 300px">

Số 1 và ký tự * thể hiện rằng **1 Folder sẽ có nhiều File**. Nếu nói tới code thì khi một đối tượng được tạo ra trong một đối tượng khác thì đó là quan hệ hợp thành

```java
public class ClassA{
     private ClassB b;
     public ClassA() {
	b = new ClsasB();
     }
}
```
