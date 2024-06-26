# Java Theory Advanced (Java Collections)
## Mục lục
- [I. Java Collections](#i-java-collections)
  - [1. ArrayList](#1-arraylist)
  - [2. LinkedList](#2-linkedlist)
  - [3. HashSet](#3-hashset)
  - [4. HashMap](#4-hashmap)
  - [5. Thuật toán về Java Collections](#5-thuật-toán-về-java-collections)
- [II. Xử lý ngoại lệ](#ii-xử-lý-ngoại-lệ)
  - [1. Các kiểu ngoại lệ](#1-các-kiểu-ngoại-lệ)
  - [2. Xử lý ngoại lệ try, catch](#2-xử-lý-ngoại-lệ-try-catch)
  - [3. Khối finally trong Java](#3-khối-finally-trong-java)
  - [4. Khai báo ngoại lệ throw, throws](#4-khai-báo-ngoại-lệ-throw-throws)
- [III. Xử lý file](#iii-xử-lý-file)
  - [1. Tạo file](#1-tạo-file)
  - [2. Đọc file](#2-đọc-file)
  - [3. Ghi nội dung vào file](#3-ghi-nội-dung-vào-file)
  - [4. Xóa file](#4-xóa-file)
  - [5. Thư mục](#5-thư-mục)
  - [6. Xử lý file](#6-xử-lý-file)
- [IV. Các chủ đề bổ sung](#iv-các-chủ-đề-bổ-sung)
  - [1. Gói](#1-gói)
  - [2. Annotation](#2-annotation)
  - [3. Lớp lồng nhau](#3-lớp-lồng-nhau)
  - [4. Lớp Generics](#4-lớp-generics)
  - [5. Biểu thức Lambda](#5-biểu-thức-lambda)
  - [6. Autoboxing và Unboxing](#6-autoboxing-và-unboxing)
  - [7. Enum](#7-enum)

## I. Java Collections
Framework Collections cung cấp nhiều lớp và interface để triển khai những kiểu cấu trúc dữ liệu khác nhau.

### 1. ArrayList
[:arrow_up: Mục lục](#mục-lục)

Arraylist còn được gọi là **mảng động**.

- **1.1. Tạo ArrayList**

**Bước 1:** Nhập gói ```ArrayList```
```java
import java.util.ArrayList;
```

**Bước 2:** Tạo đối tượng của lớp ```ArrayList```
```java
ArrayList<Data_types> names = new ArrayList<>();
```
Data_types ~ ```Integer```, ```String```, ```Double```

- **1.2. Các thao tác với ArrayList**
  
| Phương thức | Mô tả |
| :--- | :--- |
| ```add()``` | Thêm phần tử vào ArrayList |
| ```get()``` | Truy cập phần tử của ArrayList |
| ```set()``` | Thay đổi phần tử của ArrayList |
| ```remove()``` | Xóa phần tử của ArrayList |
| ```size()``` | Kích thước của ArrayList |

### 2. LinkedList
[:arrow_up: Mục lục](#mục-lục)

![image](https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/9fc0d2ea-d734-4a68-9b02-c25ea5211fa0)

Mỗi phần tử của danh sách liên kết được gọi là một nút và bao gồm 3 trường:

- **Prev** - Lưu trữ địa chỉ của phần tử trước đó. Bằng null đối với phần tử đầu tiên
- **Next** - Lưu trữ địa chỉ của phần tử tiếp theo. Bằng null đối với phần tử cuối cùng
- **Data** - Lưu trữ dữ liệu của nút

Tạo danh sách liên kết bằng cách sử dụng lớp ```LinkedList```.

- **2.1. Tạo LinkedList**
  
**Bước 1:** Nhập gói ```LinkedList```
```java
import java.util.LinkedList;
```

**Bước 2:** Tạo đối tượng của lớp ```LinkedList```.
```java
LinkedList<Data_types> names = new LinkedList<>();
```
Data_types ~ ```Integer```, ```String```, ```Double```

- **2.2. Các thao tác với LinkedList**
  
| Phương thức | Mô tả |
| :--- | :--- |
| ```add()``` | Thêm phần tử vào LinkedList |
| ```get()``` | Truy cập phần tử của LinkedList |
| ```set()``` | Thay đổi phần tử của LinkedList |
| ```remove()``` | Xóa phần tử của LinkedList |
| ```size()``` | Kích thước của LinkedList |

- **2.3. Queue (Hàng đợi)**

![image](https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/7c729d89-79a9-4cd2-a4e2-bd9ca2b9d391)

Trong cấu trúc dữ liệu hàng đợi, các phần tử được
- **Thêm vào cuối hàng (rear)**
- **Xóa từ đầu hàng**

Để sử dụng LinkedList làm Queue (Hàng đợi), chúng ta sử dụng 2 phương thức sau:

| Phương thức | Mô tả |
| :--- | :--- |
| ```poll()``` | Loại bỏ phần tử từ phía trước |
| ```offer()``` | Thêm phần tử vào phía sau |

- **2.4. Dequeue (Hàng đợi 2 đầu)**

![image](https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/96aefbf5-fc61-43d0-8273-32c5109dea58)

Chúng ta có thể **thêm và xóa các phần tử ở cả phía trước và phía sau**.

Để sử dụng LinkedList làm Dequeue (Hàng đợi 2 đầu), chúng ta sử dụng 4 phương thức sau:

| Phương thức | Mô tả |
| :--- | :--- |
| ```addFirst()``` | Thêm phần tử vào đầu Dequeue |
| ```addLast()``` | Thêm phần tử vào cuối Dequeue |
| ```removeFirst()``` | Xóa phần tử đầu tiên của Dequeue |
| ```removeLast()``` | Xóa phần tử cuối cùng của Dequeue |

### 3. HashSet
[:arrow_up: Mục lục](#mục-lục)

<img src="https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/0e037865-a30f-4318-91e0-e63f9a3f96ef" height="200px">


Nếu chúng ta cần lưu trữ các phần tử duy nhất thì tốt hơn là sử dụng ```HashSet``` bởi vì không giống như ```ArrayList``` và ```LinkedList```, **```HashSet``` không chứa các giá trị trùng lặp**.

- **3.1. Tạo HashSet**

**Bước 1:** Nhập gói HashSet
```java
import java.util.HashSet;
```

**Bước 2:** Tạo đối tượng của lớp ```HashSet```
```java
HashSet<Data_types> names = new HashSet<>();
```
Data_types ~ ```Integer```, ```String```, ```Double```

- **3.2. Cách thao tác với tập hợp**

**Phép hợp** của hai tập hợp là một tập hợp bao gồm tất cả các phần tử của cả hai tập hợp.

**Phép giao** của hai tập hợp là một tập hợp bao gồm các phần tử chung cả hai tập hợp.

**Phép hiệu** của tập hợp A và B là một tập hợp bao gồm các phần tử thuộc A nhưng không thuộc B

| Phương thức | Mô tả |
| :--- | :--- |
| ```addAll()``` | Thực hiện **Phép hợp** của 2 HashSet |
| ```retainAll()``` | Thực hiện **Phép giao** của 2 HashSet |
| ```removeAll()``` | Thực hiện **Phép hiệu** của 2 HashSet |

### 4. HashMap
[:arrow_up: Mục lục](#mục-lục)

Tương tự như arraylist và linkedlist, hashmap cũng được dùng để lưu trữ nhiều phần tử. Tuy nhiên, mỗi phần tử của hashmap là một cặp **khóa/giá trị**.

Trong đó:
- `khóa` - mã định danh duy nhất được liên kết với từng giá trị
- `giá trị` - dữ liệu thực tế được truy cập bằng khóa

**4.1. Tạo HashMap**

**Bước 1:** Nhập gói HashMap

```java
import java.util.HashMap;
```

**Bước 2:** Tạo đối tượng của lớp HashMap

```java
HashMap<Integer, String> students = new HashMap<>();
```

Ở trên, chúng ta đã tạo một `HashMap` có tên là `students`. Trong đó:

`Integer` - đại diện cho kiểu dữ liệu của khóa

`String` - đại diện cho kiểu dữ liệu của giá trị

![image](https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/e31b04e4-22cd-4d2d-b6cc-26e2437e974a)

**4.2. Các thao tác với HashMap**

| Phương thức | Mô tả |
| :--- | :--- |
| `put(key, value)` | Thêm phần tử vào HashMap |
| `get(key)` | Truy cập phần tử của HashMap |
| `replace(key, value)` | Thay đổi phần tử của HashMap |
| `remove(key)` | Xóa phần tử khỏi của HashMap |

**1. Lặp qua HashMap ta sử dụng vòng lặp for-each:**

**Bước 1:** Truy cập tất cả các khóa của HashMap

```java
for (Integer key : students.keySet()) {
    ...
}
```
`student.keySet()` trả về tất cả các khóa của HashMap. Vòng lặp for sau đó lần lượt lặp qua tất cả các khóa.

**Bước 2:** Truy cập các giá trị bằng khóa

```java
// get the value of key using get()
System.out.println(key + ": " + students.get(key));
```
Bên trong vòng lặp:

- `key` - in khóa của HashMap

- `get(key)` - in giá trị được liên kết với khóa

**2. Lấy khóa của HashMap sử dụng giá trị:**

Chúng ta có thể lấy khóa cho một giá trị nhất định trong hashmap.

Giả sử, chúng ta có hashmap sau.
```
{1=One, 2=Two, 3=Three}
```

Và chúng ta cần khóa của giá trị `Three`. Để làm điều đó, chúng ta sử dụng phương thức `getValue()`.

**Bước 1:** 

```java
import java.util.Map.Entry;
```

**Bước 2:** Ví dụ 
```java
import java.util.HashMap;
import java.util.Map.Entry;
 
class Main {
    public static void main(String[] args) {
 
        // create a hashmap
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
 
        // value whose key is to be searched
        String value = "Three";
 
        // print collection view
        System.out.println("Collection view: " + numbers.entrySet());
 
        // iterate each entry of hashmap
        for (Entry<Integer, String> entry : numbers.entrySet()) {
            
            // if give value is equal to value from entry
            // print the corresponding key
            if (entry.getValue() == value) {
                System.out.println("The key for value " + value + " is " + entry.getKey());
                break;
            }
        }
    }
}
```
Đầu ra

```
Collection view: [1=One, 2=Two, 3=Three]
The key for value Three is 3
```

Trong ví dụ trên, chúng ta đã tạo một hashmap có tên là numbers. Ở đây, chúng ta muốn lấy khóa cho giá trị `Three`. Để ý dòng

```java
Entry<String, Integer> entry : numbers.entrySet()
```

Ở đây, phương thức `entrySet()` trả về chế độ xem tập hợp các mục nhập (cặp khóa/giá trị).

- `entry.getValue()` - nhận giá trị từ mục nhập
- `entry.getKey()` - lấy khóa từ mục nhập

**3. Tạo hashmap từ một hashmap khác**

```java
student2.putAll(student);
```
Phương thức `putAll()` thêm tất cả các phần tử từ HashMap `student` vào `student2`.

### 5. Thuật toán về Java Collections
[:arrow_up: Mục lục](#mục-lục)

**Bước 1:** Nhập gói `java.util.Collections`.

```java
import java.util.Collections;
```
Ví dụ: 

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

| Phương thức | Mô tả |
| :--- | :--- |
| `Collections.sort(numbers)` | Sắp xếp tất cả các phần tử của arraylist |
| `Collections.shuffle(numbers)` | Xóa trộn tất cả các phần tử của arraylist |
| `Collections.binarySearch(numbers, element_to_search_for)` | Tìm kiếm phần tử (element) trong arraylist, trả về vị trí index của phần tử (element) đó |
| `Collections.max(numbers)` | Tìm phần tử lớn nhất trong arraylist |
| `Collections.min(numbers)` | Tìm phần tử nhỏ nhất trong arraylist |
| `Collections.reverse(numbers)` | Đảo ngược vị trí của các phần tử trong arraylist |
| `Collections.swap(numbers, i, j)` | Hoán đổi vị trí của 2 phần tử i, j trong arraylist |
| `Collections.fill(numbers, value)` | Điền vào các phần tử với giá trị (value) chỉ định |
| `Collections.copy(dest, src)` | Sao chép một collection (src - file nguồn) sang collection (dest - file đích) khác |

## II. Xử lý ngoại lệ
[:arrow_up: Mục lục](#mục-lục)

### 1. Các kiểu ngoại lệ
[:arrow_up: Mục lục](#mục-lục)

- **ArithmeticException**

Ngoại lệ này xảy ra khi ta chia một số cho 0. Ví dụ:

```java
class Main {
 
    public static void main(String[] args) {
        //   Arithmetic Exception
        int result = 5 / 0;
        System.out.println(result);
    }
}
```

- **ArrayIndexOutOfBoundsException**

Ngoại lệ này xảy ra khi ta cố truy cập một phần tử có chỉ mục không tồn tại trong mảng. Ví dụ:

```java
class Main {
 
    public static void main(String[] args) {
 
        int array[] = { 1, 2 };
        System.out.println(array[2]);
    }
}
```

- **NullPointerException**

Ngoại lệ này xảy ra khi một tham chiếu đến một đối tượng không được khởi tạo và bạn cố gắng truy cập đến phương thức hoặc thuộc tính của nó.

```java
class Main {
 
    public static void main(String[] args) {
 
        String str = null;
        System.out.println(str.length());
    }
}
```

Trong ví dụ này, biến `str` được gán giá trị `null`, vì vậy khi gọi phương thức `length()` của nó sẽ ném ra `NullPointerException` vì không thể gọi phương thức của một đối tượng `null`.

- **FileNotFoundException**

 Nó xảy ra khi một ứng dụng hoặc chương trình Java cố gắng mở một tệp tin nhưng không tìm thấy tệp tin đó tại đường dẫn được chỉ định.

 ```java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            // Mở một FileInputStream để một tệp tin không tồn tại
            FileInputStream fileInputStream = new FileInputStream(new File("khong-tim-thay.txt"));
        } catch (FileNotFoundException e) {
            // Xử lý ngoại lệ FileNotFoundException
            System.out.println("Không tìm thấy tệp tin.");
            e.printStackTrace();
        }
    }
}
```

Trong ví dụ này, chương trình cố gắng mở một `FileInputStream` cho một tệp tin có tên `khong-tim-thay.txt`, nhưng tệp tin này không tồn tại. Do đó, ngoại lệ `FileNotFoundException` sẽ được ném ra và chương trình sẽ xử lý ngoại lệ này.

- **IOException**

Nó đại diện cho một lỗi xảy ra trong quá trình thao tác với dữ liệu trên hệ thống tệp tin hoặc qua mạng. Nó là lớp cha chung cho các ngoại lệ xảy ra khi có vấn đề liên quan đến đọc hoặc ghi dữ liệu từ một nguồn hoặc đích nào đó.

Ví dụ, khi bạn cố gắng đọc dữ liệu từ một tệp tin, nếu tệp tin không tồn tại, bạn sẽ gặp `FileNotFoundException`, một dạng con của `IOException`. Tương tự, khi bạn cố gắng đọc hoặc ghi dữ liệu qua mạng và kết nối bị mất, bạn có thể gặp phải `IOException`.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Mở một BufferedReader để đọc từ tệp tin
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            
            // Đọc dữ liệu từ tệp tin
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Đóng BufferedReader sau khi hoàn thành
            reader.close();
        } catch (IOException e) {
            // Xử lý ngoại lệ IOException
            System.out.println("Đã xảy ra lỗi khi đọc tệp tin.");
            e.printStackTrace();
        }
    }
}
```

Trong ví dụ này, chương trình cố gắng mở một `BufferedReader` để đọc từ tệp tin `input.txt`. Nếu tệp tin không tồn tại hoặc có bất kỳ vấn đề nào khác xảy ra khi đọc từ tệp tin, ngoại lệ `IOException` sẽ được ném ra và chương trình sẽ xử lý nó.

### 2. Xử lý ngoại lệ try, catch
[:arrow_up: Mục lục](#mục-lục)

Xử lý ngoại lệ là quá trình phản hồi các ngoại lệ theo cách tùy chỉnh trong quá trình thực thi chương trình.

Để xử lý ngoại lệ trong Java, chúng ta sử dụng khối `try...catch`. Cú pháp là:

```java
try {
    // code that may cause exception
}
catch (Exception e){
    //  code to run when exception occurs
}
```

Chúng ta cũng có thể in ngoại lệ trực tiếp thay vì thông báo tùy chỉnh.

```java
catch (Exception e) {
    System.out.println(e);
}
```

Đầu ra:

```
java.lang.ArithmeticException: / by zero
```

Ở đây, chúng ta đã in `e` thay vì một thông báo tùy chỉnh. Nó chỉ đơn giản trả về ngoại lệ.

### 3. Khối finally trong Java
[:arrow_up: Mục lục](#mục-lục)

Câu lệnh `try` có thể chứa khối `finally` tùy chọn được thực thi bất kể ngoại lệ xảy ra hay không. Ví dụ:

```java
class Main {
 
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        }
 
        catch (Exception e) {
            System.out.println("Wrong denominator");
        }
 
        finally {
            System.out.println("Always printed");
        }
    }
}
```

```
Wrong denominator
Always printed
```

Cách chương trình hoạt động:

- Câu lệnh bên trong khối `try` đưa ra một ngoại lệ.
- Do đó, khối `catch` được thực thi.
- Sau đó, khối `finally`` được thực thi.

Nếu khối try không đưa ra bất kỳ ngoại lệ nào thì khối `catch` sẽ bị bỏ qua. Tuy nhiên, khối `finally` vẫn được thực thi.

Khối `finally` được sử dụng để thực hiện các thao tác dọn dẹp cần được thực thi trong mọi trường hợp.

### 4. Khai báo ngoại lệ throw, throws
[:arrow_up: Mục lục](#mục-lục)

Phân biệt từ khóa `throw` và `throws`

| **STT** | **`throw`** | **`throws`** |
| :--- | :--- | :--- |
| 1 | Từ khóa throw trong java được sử dụng để ném ra một ngoại lệ rõ ràng. | Từ khóa throws trong java được sử dụng để khai báo một ngoại lệ. |
| 2 | Ngoại lệ checked không được truyền ra nếu chỉ sử dụng từ khóa throw. | Ngoại lệ checked được truyền ra ngay cả khi chỉ sử dụng từ khóa throws |
| 3 | Sau throw là một instance. | Sau throws là một hoặc nhiều class. |
| 4 | Throw được sử dụng trong phương thức. | Throws được khai báo ngay sau dấu đóng ngoặc đơn của phương thức. |
| 5 | Bạn không thể throw nhiều exceptions. | Bạn có thể khai báo nhiều exceptions, Ví dụ: public void method()throws IOException,SQLException. |

*Ví dụ:*

```java
public class DevideByZeroException extends Exception{
    float x;
    float y;

    DevideByZeroException(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage() {
        return "Exception / zero ("+x+"/"+y+")";
    }
}

public class Calculator {
    // Dùng để khai báo cho người dùng biết có khả năng gặp lỗi nên phải try...catch
    public static float divide(float x, float y) throws DevideByZeroException {
        if (y == 0) {
            throw new DevideByZeroException(x, y);
        }
        return x/y;
    }

    public static float plus(float x, float y) {
        return x + y;
    }
}

public class Test {
    public static void main(String[] args) {
        float sum;
        try {
            sum = Calculator.divide(5, 0); // Có khả năng gặp lỗi nên phải thêm try..catch
            System.out.println("Sum: " + sum);
        } catch(DevideByZeroException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

```

## III. Xử lý file

Làm việc với file bằng cách sử dụng khối `try...catch`.

### 1. Tạo file
[:arrow_up: Mục lục](#mục-lục)

Chúng ta sử dụng phương thức `createNewFile()` để tạo một file mới.

**Bước 1:** Nhập lớp File

```java
import java.io.File;
```

**Bước 2:** Tạo một đối tượng thuộc lớp File

```java
File file = new File("newFile.txt");
```

Trong đó:

- `File` - Lớp file
- `file` - đối tượng của lớp file
- `newFile.txt` - tên file cần tạo

**Bước 3:** Tạo file

```java
boolean value = file.createNewFile();
```

Không có file nào tên là `newFile.txt` trong thư mục làm việc hiện tại, vì vậy `file.createNewFile()` tạo file và trả về `true`.

Tuy nhiên, nếu `newFile.txt`đã tồn tại, `file.createNewFile()` sẽ không tạo bất kỳ file nào. Do đó, nó trả về `false`.

### 2. Đọc file
[:arrow_up: Mục lục](#mục-lục)

**Bước 1:** Nhập lớp FileReader

```java
import java.io.FileReader;
```

**Bước 2:** Sử dụng lớp `FileReader` để đọc nội dung của file.

```java
FileReader input = new FileReader("message.txt");
```

`message.txt` là tên file cần đọc, nằm trong thư mục làm việc hiện tại.

**Bước 3:** Sử dụng phương thức `read()` để đọc nội dung file

```java
input.read(contents);
```

**Bước 4:** Đóng file

```java
input.close();
```

### 3. Ghi nội dung vào file
[:arrow_up: Mục lục](#mục-lục)

- **1. Ghi nội dung vào file không tồn tại**

**Bước 1:** Nhập lớp FileWriter

```java
import java.io.FileWriter;
```

**Bước 2:** Tạo đối tượng `output` của lớp `FileWriter`.

```java
FileWriter output = new FileWriter("java.txt");
```

**Bước 3:** Gọi phương thức `write()` để ghi nội dung vào `java.txt`.

```java
output.write(data);
```

- **2. Ghi nội dung vào file có sẵn**

Sử dụng các 3 bước như trên

Vì file `java.txt` đã tồn tại trước đó nên chương trình này sẽ xóa tất cả nội dung cũ của file và nội dung mới được ghi vào file `java.txt`.

### 4. Xóa file
[:arrow_up: Mục lục](#mục-lục)

Chúng ta sử dụng phương thức `delete()` của lớp File để xóa một file. Ví dụ:

```java
File file = new File("message.txt"); // Tạo file

boolean value = file.delete(); // Xóa file
```

Phương thức `delete()` trả về:

- `true` nếu `message.txt` bị xóa
- `false` nếu `message.txt` không tồn tại

### 5. Thư mục
[:arrow_up: Mục lục](#mục-lục)

- **1. Tạo thư mục mới**

**Bước 1:** Nhập lớp File

```java
import java.io.File;
```

**Bước 2:** Tạo một đối tượng `file` thuộc lớp `File`.

```java
File file = new File("movies");
```

**Bước 3:** Sử dụng phương thức `mkdir()` của lớp `File`

```java
boolean value = file.mkdir();
```

`file.mkdir()` tạo một thư mục mới tên là `movies` trong thư mục hiện tại.

Phương thức `mkdir()` trả về:

- `false` nếu thư mục đã có sẵn
- `true` nếu thư mục không tồn tại

mkdir có nghĩa là make directory (tạo thư mục).

- **2. Tạo thư mục con**

```java
// create a file object
File file = new File("movies/John Wick");

// create a directory
boolean value = file.mkdir();
```

Code này tạo một thư mục có tên **John Wick** bên trong thư mục **movies**.

*Lưu ý:* Nếu thư mục mẹ (**movies**) không tồn tại, phương thức `mkdir()` không thể tạo thư mục con (**John Wick**).

### 6. Xử lý file
[:arrow_up: Mục lục](#mục-lục)

- **1. Sao chép một file sang file khác**

**Bước 1:** Đọc nội dung file cần sao chép

```java
FileReader copy = new FileReader("message.txt");
copy.read(contents);
```

**Bước 2:** Ghi nội dung vào file

```java
FileWriter paste = new FileWriter("output.txt");
paste.write(contents);
```

- **2. Liệt kê tất cả các file trong một thư mục**

Sử dụng phương thức `list()` của lớp `File` để liệt kê tất cả các file và thư mục con của một thư mục.

```java
 // creates a file object
File file = new File("directory/test"); // Thư mục muốn kiểm tra

// returns an array of all files
String[] fileList = file.list();
```

- **3. Đổi tên file**

Chúng ta sử dụng phương thức `renameTo()` để đổi tên file.

```java
File oldFile = new File("input.txt");

// create an object that contains the new name of file
File newFile = new File("newName.txt");

// change the name of file
boolean value = oldFile.renameTo(newFile);
```

Phương thức `renameTo()` trả về `true` nếu tên file được đổi thành công. Nếu không, nó trả về `false`.

## IV. Các chủ đề bổ sung
### 1. Gói
[:arrow_up: Mục lục](#mục-lục)

- **Gói do người dùng định nghĩa**

Cho đến nay, chúng ta đã học và sử dụng nhiều gói tích hợp của Java trong chương trình. Ví dụ:

```java
// to take input value
import java.util.Scanner;

// to use the ArrayList class
import java.util.ArrayList;
```

Các gói này cung cấp các phương thức để thực hiện những tác vụ khác nhau trong chương trình.

Trong Java, chúng ta cũng có thể tạo các gói tùy chỉnh, đây gọi là **gói do người dùng định nghĩa**.

- **Tạo gói:**

Chúng ta sử dụng từ khóa package để tạo một gói trong Java.

```java
package packageName;
```

Ví dụ:

<img src="https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/01aa8b18-cf7c-405d-916c-80f5311b0147" height="200px">

```java
package programiz;

public class Teacher {
    
    public void getTeacherInfo(int id, String name) {
      
        System.out.println(id);
        System.out.println(name);
    }
}
```

```java
package programiz;

public class Student {
    
    public void getStudentInfo(int id, String name) {
        
        System.out.println(id);
        System.out.println(name);
    }
}
```

-  **Nhập gói do người dùng xác định**

Bây giờ, để sử dụng các trường phương thức của `Teacher.java` và `Student.java` trong một file java khác (bên ngoài gói), chúng ta phải nhập lớp `Student` và `Teacher` từ gói `programiz`.

```java
import programiz.Teacher;
import programiz.Student;

class Main {
    
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        System.out.println("Teacher info");
        t1.getTeacherInfo(1, "Bruce");
        
        Student s1 = new Student();
        System.out.println("Student info");
        s1.getStudentInfo(11, "Peter");
    }
}
```

Trong chương trình trên, câu lệnh:

```java
import programiz.Teacher;
```

nhập lớp `Teacher` của gói `programiz` vào Lớp `Main`. Bây giờ, chúng ta có thể tạo các đối tượng và sử dụng các phương thức cũng như các trường của lớp `Teacher` trong lớp `Main`.

```java
Teacher t1 = new Teacher();
System.out.println("Teacher info");
t1.getTeacherInfo(1, "Bruce");
```

### 2. Annotation
[:arrow_up: Mục lục](#mục-lục)

Annotation trong Java cung cấp thông tin bổ sung về chương trình mà Java có thể sử dụng.

Annotation bắt đầu bằng `@`. Cú pháp là:

```java
@AnnotationName
```

Trong quá trình kế thừa, chúng ta biết rằng nếu một phương thức xuất hiện trong cả lớp cha và lớp con, phương thức trong lớp con sẽ ghi đè phương thức của lớp cha.

Để chỉ định phương thức ghi đè, chúng ta sử dụng annotation `@Override`. Ví dụ:

```java
class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}
 
class Dog extends Animal {
 
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}
 
class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
```

Ở trên, chúng ta đã ghi đè phương thức `displayInfo()` của lớp `Animal` trong lớp `Dog`.

Annotation `@Override` được sử dụng ở trên `displayInfo()` của `Dog` để chỉ định rằng đó là phương thức được ghi đè.

Khi chúng ta sử dụng `@Override`, phương thức sẽ được ghi đè từ lớp cha. Nếu không, chúng ta sẽ nhận được lỗi.

### 3. Lớp lồng nhau
[:arrow_up: Mục lục](#mục-lục)

```java
// outer class
class CPU {

    // nested class
    class Processor {

        void display() {
            System.out.println("Processor");
        }

    }
}
```

Để truy cập các trường và phương thức của lớp lồng nhau:

**Bước 1:** Chúng ta phải tạo một đối tượng thuộc lớp ngoài

```java
CPU cpu = new CPU();
```

**Bước 2:** Tạo một đối tượng của lớp trong bằng cách sử dụng đối tượng của lớp ngoài

```java
CPU.Processor p1 = cpu.new Processor();
```

Vì `Processor` nằm trong lớp `CPU` nên lớp `Processor` được tham chiếu thành `CPU.Processor` thay vì chỉ `Processor`.

### 4. Lớp Generics
[:arrow_up: Mục lục](#mục-lục)

Java Generics cho phép ta tạo một phương thức/lớp duy nhất hoạt động với các kiểu dữ liệu (đối tượng) khác nhau.

Khi làm việc với tập hợp, chúng ta thấy rằng lớp `ArrayList` có thể được sử dụng với nhiều kiểu dữ liệu khác nhau như: `String`, `Integer`, `Double`, v.v.

```java
ArrayList<String> ArrayList1 = new ArrayList<>();
ArrayList<Integer> ArrayList2 = new ArrayList<>();
```

Đó là bởi vì `ArrayList` là một lớp `generics`. Vì vậy, nó có thể hoạt động với các kiểu dữ liệu khác nhau.

Lưu ý: `Generics` không hoạt động với các kiểu dữ liệu (`int`, `float`, `char`, v.v.).

- **Tạo lớp Generics**

Chúng ta cũng có thể tạo lớp generics của riêng mình được sử dụng với bất kỳ kiểu dữ liệu nào.

```java
// create a generics class
class MyClass<T> {

    public MyClass(T data) {
        System.out.println("Data: " + data);
    }
}
````

Trong đó:

- `MyClass` - tên của lớp `generics`
- `T` - tham số kiểu cho biết kiểu dữ liệu

Bây giờ, chúng ta có thể sử dụng bất kỳ kiểu dữ liệu nào với `MyClass`.

```java
public class Main {
    public static void main(String[] args) {
        // Tạo một thể hiện của MyClass với kiểu dữ liệu Integer
        MyClass<Integer> intObj = new MyClass<>(42); // Đầu ra: Data: 42

        // Tạo một thể hiện của MyClass với kiểu dữ liệu String
        MyClass<String> stringObj = new MyClass<>("Xin chào, Generics!"); // Đầu ra: Data: Xin chào, Generics!
    }
}
```

- **Phương thức Generics**

Chúng ta cũng có thể tạo các phương thức generics. Phương thức generics có thể được sử dụng với bất kỳ kiểu dữ liệu nào.

```java
public <T> void display(T data) {
    …
    …
}
```

`<T>` giữa `public` và `void` có nghĩa là phương thức này là một phương thức `Generics`. Hãy xem một ví dụ:

```java
class Main {
 
    // create a generics method
    public <T> void display(T data) {
 
        System.out.println("Data: " + data);
    }
 
    public static void main(String[] args) {
        Main obj = new Main();
 
        // generics method working with String
        obj.<String>display("Java");
 
        // generics method working with integer
        obj.<Integer>display(25);
    }
}
```

*Cách thức hoạt động của phương thức Generics:*

```java
// call method with String data
obj.<String>display("Java");
```

Chúng ta có thể gọi phương thức `generics` bằng cách đặt kiểu bên trong dấu ngoặc nhọn `<>` trước tên phương thức.

Ở đây, kiểu `T` là `String`, vì vậy ta truyền giá trị `String` "Java" cho phương thức `display`.

- **Tại sao cần sử dụng Generics?**

1. Tái sử dụng code

```java
public void display(int data) {
    System.out.println(data);
}
```

Chúng ta chỉ có thể truyền dữ liệu `int` cho phương thức này. Nếu muốn truyền dữ liệu `String`, chúng ta sẽ phải tạo một phương thức khác cho nó.

Tuy nhiên, với `Generics`, chúng ta chỉ cần sử dụng một phương thức và có thể truyền bất kỳ kiểu dữ liệu nào ta muốn.

```java
public <T> void display(T data) {
 
    System.out.println(data);
}
```

2. Kiểm tra kiểu

```java
MyClass<String> stringObj = new MyClass<>("Hello");
```

Code này sẽ chỉ hoạt động với dữ liệu `String`. Nếu cố truyền một giá trị khác String thì chúng ta sẽ gặp lỗi.

3. Sử dụng với Collections

Collections trong Java cũng sử dụng khái niệm Generics.

```java
// creating a String type ArrayList
ArrayList<String> list1 = new ArrayList<>();

// creating a Integer type ArrayList
ArrayList<Integer> list2 = new ArrayList<>();
```

Ở đây, chúng ta đã sử dụng cùng một lớp `ArrayList` để làm việc với các kiểu dữ liệu khác nhau.

Tương tự như `ArrayList`, các collection khác (`LinkedList`, `HashSet`, `HashMap`, v.v.) cũng là các lớp `generics` trong Java.

### 5. Biểu thức Lambda
[:arrow_up: Mục lục](#mục-lục)

- **1. Functional Interface**

Nếu **interface chứa một và chỉ một phương thức trừu tượng** (phương thức không có phần thân) thì đó là một **functional interface**.

```java
interface AddNumber{  
    void add();
}
```

Ở đây, `interface AddNumber` chỉ có một phương thức trừu tượng `add()`. Do đó, nó là một `functional interface`.

Chúng ta cũng có thể sử dụng chú thích `@FunctionalInterface` để biểu thị một `interface` là `functional interface`.

```java
@FunctionalInterface  
interface AddNumber{  
    void add(); 
}
```

Chú thích `@FunctionalInterface` chỉ cho phép có một phương thức trừu tượng.

- **2. Triển khai functional interface**

Chương trình khi không có biểu thức `lambda`:

```java
@FunctionalInterface
interface AddNumber {
    void add();
}
 
class Main {
    public static void main(String[] args) {
 
        AddNumber ref = new AddNumber() {
            public void add() {
                System.out.println(4 + 5);
            }
        };
        ref.add();    // 9
    }
}
```
Trong đó:

```java
AddNumber ref = new AddNumber() {
      
    public void add() {
        
        System.out.println(4 + 5);       
    }
};
```

Như bạn biết, chúng ta phải triển khai một interface để sử dụng nó.

Code này tạo một lớp ẩn danh (lớp không có tên) triển khai interface `AddNumber`. Lớp này cung cấp triển khai của phương thức `add()`.

```java
ref.add();
```

Chúng ta có thể truy cập phương thức `add()` bằng cách sử dụng đối tượng `ref` của lớp ẩn danh.

- **3. Biểu thức Lambda**

Biểu thức lambda giống các phương thức thông thường nhưng khác ở chỗ nó không có tên.

Ví dụ:

```java
public void add() {
    System.out.println(4 + 5)
}
```
Chúng ta có thể thay thế phương thức này bằng biểu thức lambda:

```java
() -> System.out.println(4 + 5);
```

*Cú pháp của biểu thức lambda là:*

```java
() -> lambda body
```

Trong đó: 

- `->` - toán tử mũi tên hoặc toán tử lambda
- `lambda body` - code bên trong phần thân phương thức được giữ bên trong lambda body

- **4. Các loại Lambda Body**

**Phần thân chứa một biểu thức đơn**

```java
() -> System.out.println("You Rock.");
```

**Phần thân chứa một khối lệnh**

```java
() -> {
    int x = 1;
    int y = 2;
    System.out.println(x + y);
};
```

Loại này được gọi là thân khối. Nó chứa khối lệnh bên trong dấu ngoặc nhọn `{}` và kết thúc bằng dấu chấm phẩy `;`.

**Biểu thức Lambda với tham số**

```java
AddNumbers obj = (x, y) -> {
  System.out.println(x + y);
};
```

**Biểu thức Lambda với return**

```java
AddNumbers obj = (x, y) -> {
  return x + y;
};
```

### 6. Autoboxing và Unboxing
[:arrow_up: Mục lục](#mục-lục)

- **1. Lớp Wrapper**

| Kiểu dữ liệu nguyên thủy | Lớp Wrapper |
| :--- | :--- |
| `int` | `Integer` |
| `float` | `Float` |
| `double` | `Double` |
| `boolean` | `Boolean` |
| `char` | `Character` |

- **2. Autoboxing**

**Autoboxing** là quá trình chuyển đổi kiểu nguyên thủy thành đối tượng lớp wrapper tương ứng. Kiểu chuyển đổi này diễn ra tự động, do đó có tên là **autoboxing**.

Ví dụ: 

```java
class Main {
    public static void main(String[] args) {
 
        int x = 25;
 
        // autoboxing
        Integer xObj = x;
 
        System.out.println(xObj); // 25
 
    }
}
```

Ở đây, chúng ta có kiểu dữ liệu nguyên thủy `x` với giá trị **25**. Chúng ta đã gán `x` cho đối tượng của lớp wrapper `Integer`.

```java
Integer xObj = x;
```

Trong trường hợp này, kiểu dữ liệu nguyên thủy được tự động chuyển thành đối tượng `Integer`.

- **3. Unboxing**

Trái ngược với autoboxing, **unboxing** là quá trình tự động chuyển đổi đối tượng của lớp wrapper thành kiểu nguyên thủy tương ứng.

Ví dụ:

```java
class Main {
    public static void main(String[] args) {
 
        // assign value to Integer object
        Integer xObj = new Integer(25);
 
        // unboxing
        int x = xObj;
 
        System.out.println(x); // 25
 
    }
}
```

Ở đây, chúng ta đã tạo một đối tượng kiểu Integer với giá trị **25**. Sau đó, chúng ta gán đối tượng cho kiểu nguyên thủy `int`.

```java
int x = xObj;
```

Ở đây, đối tượng của lớp `wrapper` sẽ tự động được chuyển thành kiểu nguyên thủy.

### 7. Enum
[:arrow_up: Mục lục](#mục-lục)

enum hoặc enumeration là một lớp đặc biệt được dùng để định nghĩa một tập hợp các giá trị không đổi (không thể thay đổi) cố định.

- **Tạo enum**

Chúng ta tạo enum bằng cách sử dụng từ khóa `enum`.

```java
enum Size {
    SMALL, MEDIUM, LARGE
}
```

Ở đây, chúng ta có một `enum` tên `Size`. Nó chứa các giá trị không đổi: `SMALL`, `MEDIUM` và `LARGE`. Các giá trị được phân tách bằng dấu phẩy.

Ví dụ:

```java
// create enum
enum Size {

   // enum constants
   SMALL, MEDIUM, LARGE
}

class Main {
   public static void main(String[] args) {

       // access enum
       System.out.println(Size.SMALL); // SMALL
       System.out.println(Size.MEDIUM); // MEDIUM
       System.out.println(Size.LARGE); // LARGE
   }
}
```

Ở đây, chúng ta đã tạo một enum kiểu `Size`.

Chúng ta sử dụng tên của enum cùng với toán tử `.` và giá trị hằng để truy cập hằng số enum. Tức là `Size.SMALL` sẽ truy cập hằng số `SMALL`.

- **Biến enum**

```java
// enum of type Size
enum Size {
    SMALL, MEDIUM, LARGE
}
 
class Main {
    public static void main(String[] args) {
 
        // enum variable
        Size pizzaSize;
 
        // assign enum constant
        pizzaSize = Size.SMALL;
 
        System.out.println(pizzaSize); // SMALL
    }
}
```

Trong ví dụ trên:

```java
Size pizzaSize;
```

`pizzaSize` là một biến kiểu enum `Size`.

Chúng ta chỉ có thể gán các giá trị không đổi của enum `Size` cho `pizzaSize`. Điều này ngăn ta gán giá trị ngẫu nhiên cho biến `pizzaSize`.

- **Lớp enum**

```java
enum Size {
 
    // enum constants
    SMALL, MEDIUM, LARGE;
 
    // enum method
    public String getSize() {
 
        // this refers to current object
        switch (this) {
        case SMALL:
            return "small";
        case MEDIUM:
            return "medium";
        case LARGE:
            return "large";
        default:
            return null;
        }
    }
}
 
class Main {
    public static void main(String[] args) {
 
        // call getSize()
        System.out.println("Pizza size is " + Size.SMALL.getSize()); // Pizza size is small
    }
}
```

Chúng ta tạo một lớp enum tên là `Size` với ba hằng số. Java tự động tạo các đối tượng của mỗi hằng số enum.

Bên trong lớp enum, chúng ta tạo một phương thức tên là `getSize()`. Phương thức sử dụng câu lệnh `switch` để trả về kích thước.

Để ý lệnh gọi phương thức `getSize()`:

```java
Size.SMALL.getSize();
```

Ở đây, `Size.SMALL` là một đối tượng enum được sử dụng để gọi phương thức `getSize()`. Do đó, `this` bên trong phương thức tham chiếu đến đối tượng `Size.SMALL`.

- **Các phương thức của lớp enum**

| Phương thức | Mô tả |
| :--- | :--- |
| `ordinal()` | Trả về vị trí của hằng số enum |
| `toString()` | Trả về dạng biểu diễn chuỗi của hằng số enum |
| `values()` | Trả về một mảng kiểu enum chứa tất cả hằng số enum |

**1. Phương thức ordinal()**

```java
enum Size {
    SMALL, MEDIUM, LARGE;
}
class Main {
    public static void main(String[] args) {
 
        // returns the position of constants
        System.out.println(Size.SMALL.ordinal()); // 0
        System.out.println(Size.MEDIUM.ordinal()); // 1
        System.out.println(Size.LARGE.ordinal()); // 2
    }
}
```

**2. Phương thức toString()**

```java
enum Size {
    SMALL, MEDIUM, LARGE;
}
 
class Main {
    public static void main(String[] args) {
 
        String pizzaSize;
 
        // string representation
        pizzaSize = Size.MEDIUM.toString();
 
        System.out.println(pizzaSize); // MEDIUM
    }
}
```

Chúng ta có thể gán giá trị của hằng số `MEDIUM` cho `pizzaSize` có kiểu `String` vì ta đã chuyển đổi nó thành kiểu `String` bằng phương thức `toString()`.

**3. Phương thức value()**

```java
enum Size {
    SMALL, MEDIUM, LARGE;
}
 
class Main {
    public static void main(String[] args) {
 
        // get enum constants in an array
        Size[] constants = Size.values();
 
        System.out.println("Array Elements:");
        for (Size constant : constants) {
            System.out.println(constant);
        }
    }
}
```

```
Array Elements:
SMALL
MEDIUM
LARGE
```
