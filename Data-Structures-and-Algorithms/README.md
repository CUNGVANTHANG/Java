# DATA STRUCTURES AND ALGORITHMS

## Mục lục
- [DATA STRUCTURES AND ALGORITHMS](#data-structures-and-algorithms)
  - [Mục lục](#mục-lục)

<details>
  <summary>1. Đệ quy</summary>
  
  - [a. Phân biệt Đệ quy và Vòng lặp](#a-phân-biệt-đệ-quy-và-vòng-lặp)
  - [b. Các dạng đệ quy](#b-các-dạng-đệ-quy)
</details>

<details>
  <summary>2. Mảng và chuỗi ký tự</summary>
  
  - [a. Mảng và chuỗi ký tự](#a-mảng-và-chuỗi-ký-tự)
  - [b. Kỹ thuật](#b-các-dạng-đệ-quy)
</details>

  - [3. Danh sách liên kết](#3-danh-sách-liên-kết)
  - [4. Ngăn xếp và hàng đợi](#4-ngăn-xếp-và-hàng-đợi)
  - [5. Thuật toán sắp xếp](#5-thuật-toán-sắp-xếp)
  - [6. Thuật toán tìm kiếm](#6-thuật-toán-tìm-kiếm)
  - [7. Bảng băm và tập hợp](#7-bảng-băm-và-tập-hợp)
  - [8. Cấu trúc cây và đồ thị](#8-cấu-trúc-cây-và-đồ-thị)
  - [9. Hàng đợi ưu tiên (Heaps)](#9-hàng-đợi-ưu-tiên-heaps)
  - [10. Tìm kiếm nhị phân](#10-tìm-kiếm-nhị-phân)
  - [11. Các thuật toán tìm kiếm chuỗi ký tự](#11-các-thuật-toán-tìm-kiếm-chuỗi-ký-tự)
  - [12. Giải thuật tham lam (Greedy Algorithms)](#12-giải-thuật-tham-lam-greedy-algorithms)
  - [13. Thuật toán quay lui](#13-thuật-toán-quay-lui)
  - [14. Quy hoạch động](#14-quy-hoạch-động)


# Phương thức được sử dụng

| Phương thức | Ý nghĩa | Cách dùng |
| :---: | :---: | :---: | 


## 1. Đệ quy
[:arrow_up: Mục lục](#mục-lục)
### a. Phân biệt Đệ quy và Vòng lặp

| | Đệ quy | Vòng lặp
| :---: | :---: | :---: |
| Ưu điểm | Thực hiện các bài toán phức tạp (Chiến lược chia để trị )| Sử dụng bộ nhớ ít |
| Nhược điểm | Sử dụng nhiều bộ nhớ | Phức tạp trong bảo trì |

### b. Các dạng đệ quy

1. Đệ quy trực tiếp
   
```java
static int func(int n){
  // some code...
  func(n-1);  //Gọi đệ quy
  // some code...
}
``` 

2. Đệ quy gián tiếp

```java
static int func1(int z)
{
  // some code...
  func2(z-1);
  // some code...
}

static int func2(int y)
{
  // some code...
  func1(y-2);
  // some code...
}
```

## 2. Mảng và chuỗi ký tự
[:arrow_up: Mục lục](#mục-lục)
### a. Mảng và chuỗi ký tự

**1. Mảng**

Mảng trong các ngôn ngữ lập trình tương đối giống nhau. Chú ý: Python sử dụng *danh sách* thay vì mảng như các ngôn ngữ khác

**2. Chuỗi ký tự**

Phân biệt chuỗi ký tự được sử dụng trong các ngôn ngữ:

- Dữ liệu có thể thay đổi được (Mutable): Bạn có thể dễ dàng thay đổi giá trị cho nó.
- Dữ liệu bất biến (Immutable): Nếu bạn muốn thay đổi một thứ gì đó thuộc dạng dữ liệu bất biến, bạn sẽ cần phải khởi tạo lại toàn bộ giá trị của nó.

*Ví dụ:*

Ngôn ngữ Java, Python sử dụng Immutable, tức là ta không thể sửa đổi các phần tử trong chuỗi mà chỉ có thể tạo hoặc gán lại chuỗi mới.

Ngôn ngữ C/C++ sử dụng Mutable, chuỗi có thể thay đổi được.

**3. Các thao tác cơ bản**

Mảng và chuỗi ký tự thường hỗ trợ thực hiện các thao tác cơ bản sau:

- Duyệt từng phần tử trong mảng (**Traverse**): Truy cập và lấy giá trị của từng phần tử của mảng.
- Chèn phần tử vào mảng(**Insert**): Thêm một phần tử tại chỉ số đã cho.
- Xóa phần tử khỏi mảng (**Delete**): Xóa một phần tử tại chỉ số đã cho.
- Tìm kiếm phần tử bất kỳ (**Search**): Tìm kiếm một phần tử bằng cách sử dụng chỉ số đã cho hoặc theo giá trị của phần tử cần tìm kiếm.
- Cập nhật giá trị của phần tử (**Update**): Cập nhật giá trị một phần tử tại chỉ số nhất định.

### 2. Kỹ thuật 

## 3. Danh sách liên kết

![image](https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/b217e40f-3a77-4d93-b806-ec7bb52b2634)


## 4. Ngăn xếp và hàng đợi


## 5. Thuật toán sắp xếp


## 6. Thuật toán tìm kiếm


## 7. Bảng băm và tập hợp


## 8. Cấu trúc cây và đồ thị


## 9. Hàng đợi ưu tiên (Heaps)


## 10. Tìm kiếm nhị phân


## 11. Các thuật toán tìm kiếm chuỗi ký tự


## 12. Giải thuật tham lam (Greedy Algorithms)


## 13. Thuật toán quay lui


## 14. Quy hoạch động
