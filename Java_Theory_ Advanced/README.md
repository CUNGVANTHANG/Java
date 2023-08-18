# Java Theory Advanced (Java Collections)
## Mục lục
- [I. Java Collections](#i-java-collections)
  - [1. ArrayList](#1-arraylist)
  - [2. LinkedList](#2-linkedlist)
  - [3. HashSet](#3-hashset)
  - [4. HashMap](#4-hashmap)
- [II. Xử lý ngoại lệ](#ii-xử-lý-ngoại-lệ)
- [III. Xử lý file](#iii-xử-lý-file)
  - [1. Tạo file](#1-tạo-file)
  - [2. Đọc file](#2-đọc-file)
  - [3. Ghi nội dung vào file](#3-ghi-nội-dung-vào-file)
  - [4. Xóa file](#4-xóa-file)
  - [5. Thư mục](#5-thư-mục)
  - [6. Xử lý file](#6-xử-lý-file)
- [IV. Các chủ đề bổ sung]()

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

**1. Các kiểu ngoại lệ:**

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

**2. Xử lý ngoại lệ**

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

**3. Khối finally trong Java**

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