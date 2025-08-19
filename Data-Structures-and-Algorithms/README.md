# DATA STRUCTURES AND ALGORITHMS

## Mục lục

<details>
  <summary>I. Đệ quy</summary>
  
  - [1. Phân biệt Đệ quy và Vòng lặp](#1-phân-biệt-đệ-quy-và-vòng-lặp)
  - [2. Các dạng đệ quy](#2-các-dạng-đệ-quy)
</details>

<details>
  <summary>II. Mảng và chuỗi ký tự</summary>
  
  - [1. Mảng và chuỗi ký tự](#1-mảng-và-chuỗi-ký-tự)
  - [2. Kỹ thuật](#2-kỹ-thuật)
</details>

<details>
  <summary>III. Danh sách liên kết</summary>
  
</details>

<details>
  <summary>IV. Ngăn xếp và hàng đợi</summary>
  
</details>

<details>
  <summary>V. Thuật toán sắp xếp</summary>
  
</details>

<details>
  <summary>VI. Thuật toán tìm kiếm</summary>
  
</details>

<details>
  <summary>VII. Bảng băm và tập hợp</summary>
  
</details>

<details>
  <summary>VIII. Cấu trúc cây và đồ thị</summary>
  
</details>

<details>
  <summary>IX. Hàng đợi ưu tiên (Heaps)</summary>
  
</details>

<details>
  <summary>X. Tìm kiếm nhị phân</summary>
  
</details>

<details>
  <summary>XI. Các thuật toán tìm kiếm chuỗi ký tự</summary>
  
</details>

<details>
  <summary>XII. Giải thuật tham lam (Greedy Algorithms)</summary>
  
</details>

<details>
  <summary>XIII. Thuật toán quay lui</summary>
  
</details>

<details>
  <summary>XIV. Quy hoạch động</summary>
  
</details>


## I. Đệ quy
[:arrow_up: Mục lục](#mục-lục)
### 1. Phân biệt Đệ quy và Vòng lặp

| | Đệ quy | Vòng lặp
| :---: | :---: | :---: |
| Ưu điểm | Thực hiện các bài toán phức tạp (Chiến lược chia để trị )| Sử dụng bộ nhớ ít |
| Nhược điểm | Sử dụng nhiều bộ nhớ | Phức tạp trong bảo trì |

### 2. Các dạng đệ quy

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

## II. Mảng và chuỗi ký tự
[:arrow_up: Mục lục](#mục-lục)
### 1. Mảng và chuỗi ký tự

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

## III. Danh sách liên kết

<img src="https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/b217e40f-3a77-4d93-b806-ec7bb52b2634" width="300px">

## IV. Ngăn xếp và hàng đợi


## V. Thuật toán sắp xếp


## VI. Thuật toán tìm kiếm


## VII. Bảng băm và tập hợp


## VIII. Cấu trúc cây và đồ thị


## IX. Hàng đợi ưu tiên (Heaps)


## X. Tìm kiếm nhị phân


## XI. Các thuật toán tìm kiếm chuỗi ký tự


## XII. Giải thuật tham lam (Greedy Algorithms)


## XIII. Thuật toán quay lui


## XIV. Quy hoạch động
