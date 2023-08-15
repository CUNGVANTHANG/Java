# Java Theory Advanced
## Mục lục
- [I. Java Collections](#i-java-collections)
  - [1. ArrayList](#1-arraylist)
  - [2. LinkedList](#2-linkedlist)
  - [3. HashSet](#3-hashset)
  - [4. HashMap]()
- [II. Xử lý ngoại lệ]()

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

