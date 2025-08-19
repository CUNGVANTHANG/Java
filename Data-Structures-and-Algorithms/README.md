# DATA STRUCTURES AND ALGORITHMS

## Mục lục

<details>
  <summary>I. Đệ quy</summary>
  
  - [1. Phân biệt Đệ quy và Vòng lặp](#1-phân-biệt-đệ-quy-và-vòng-lặp)
  - [2. Các dạng đệ quy](#2-các-dạng-đệ-quy)
  - [3. Các bài toán thường gặp](#3-các-bài-toán-thường-gặp)
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
[:arrow_up: Mục lục](#mục-lục)

| | Đệ quy | Vòng lặp
| :---: | :---: | :---: |
| Ưu điểm | Thực hiện các bài toán phức tạp (Chiến lược chia để trị )| Sử dụng bộ nhớ ít |
| Nhược điểm | Sử dụng nhiều bộ nhớ | Phức tạp trong bảo trì |

### 2. Các dạng đệ quy
[:arrow_up: Mục lục](#mục-lục)

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
[:arrow_up: Mục lục](#mục-lục)

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
[:arrow_up: Mục lục](#mục-lục)

## III. Danh sách liên kết
[:arrow_up: Mục lục](#mục-lục)

### 1. Danh sách liên kết
[:arrow_up: Mục lục](#mục-lục)

Để hiểu về danh sách liên kết, trước tiên, ta cùng bắt đầu với khái niệm **node**

Node (nút) có thể được coi là một phần tử, nhưng chứa nhiều thông tin hơn một mẩu dữ liệu như số nguyên hoặc chuỗi. Nút là một khái niệm trừu tượng - giả sử bạn có mảng `[1, 2, 3]`. Bạn có thể coi mỗi phần tử là một nút với hai phần thông tin: thành phần thứ nhất là một giá trị số nguyên và thành phần thứ hai là chỉ số tương ứng của nó. Chẳng hạn, phần tử thứ hai sẽ có dạng:

```
data: 2
index: 1
```

Danh sách liên kết là tập hợp các nút, trong đó mỗi nút chứa hai thành phần:

- Giá trị dữ liệu được lưu trữ trong nút.
- Phần tử tiếp theo (Con trỏ Next): Mỗi phần tử của danh sách chứa một liên kết đến phần tử tiếp theo.

<img width="600" alt="image" src="https://github.com/user-attachments/assets/d6031bc4-667f-4a52-9f12-3181367049fb" />

Theo minh họa ở trên, ta có:

- Danh sách chứa một phần tử liên kết ban đầu được gọi là phần tử đầu tiên.
- Mỗi phần tử mang (các) trường dữ liệu và một trường liên kết Next để liên kết với phần tử tiếp theo.
- Liên kết của nút cuối cùng sẽ có giá trị là NULL để đánh dấu phần tử cuối cùng của danh sách.

_Ví dụ:_

```java
public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode (int val) {
            this.val = val;
        }
    }
    
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next = two;
        two.next = three;
        ListNode head = one;
        
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
    }
}
```

Ta gọi nút số `1` là nút đầu (`head`) vì nó là nút bắt đầu của danh sách liên kết. Thông thường, bạn sẽ cần giữ tham chiếu đến nút `head`. Nguyên nhân là do nút `head` là nút duy nhất mà từ đó bạn có thể tiếp cận được tất cả các phần tử khác trong danh sách liên kết, vì vậy bằng cách duy trì tham chiếu đến phần tử đó, bạn sẽ không bao giờ "mất" bất kỳ phần tử nào.

#### Cơ chế hoạt động của danh sách liên kết

#### 1. Phép gán (=)

```java
ListNode ptr = head;
head = head.next;
head = null;
```

Sau đoạn code này, `ptr` sẽ trỏ đến nút `head` ban đầu và `ptr` sẽ trỏ đến nút tiếp theo. `head` cũng sẽ trỏ đến `head` ban đầu, giống như `ptr`. Tất cả các phép gán là độc lập với nhau.

#### 2. Chuỗi `.next`

Nếu bạn có nhiều `.next`, chẳng hạn như `head.next.next`, mọi thứ trước `.next` cuối cùng đều đề cập đến một nút. Ví dụ: cho danh sách liên kết `1 -> 2 -> 3`, nếu bạn trỏ `head` đến nút đầu tiên và thực hiện `head.next.next`, thì thực ra bạn đang đề cập đến `2.next`, vì `head.next` là 2. Bạn sẽ sớm thấy rằng đây là một kỹ thuật rất hữu ích để xóa nút.

#### 3. Duyệt danh sách

Việc duyệt qua danh sách liên kết có thể được thực hiện với một vòng lặp while đơn giản. Dưới đây là code để thực hiện thao tác này. Ví dụ: hãy tính tổng tất cả các giá trị trong danh sách liên kết số nguyên:

```java
int getSum(ListNode head) {
    int ans = 0;
    while (head != null) {
        ans += head.val;
        head = head.next;
    }

    return ans;
}
```

tương tự ta có thể viết nó dưới dạng đệ quy

```java
int getSum(ListNode head) {
    if (head == null) {
        return 0;
    }

    return head.val + getSum(head.next);
}
```

#### 4. Chèn nút vào trong danh sách

<img width="600" alt="image" src="https://github.com/user-attachments/assets/e84b6652-8cfe-49df-845f-2aa3ae1556f3" />

Khi chèn thêm một nút, ta chỉ cần nối nút mới này với nút nằm ở đằng sau, và sau đó liên kết nút phía trước vị trí cần chèn với nút mới được tạo.

#### 5. Xóa nút khỏi danh sách

<img width="600" alt="image" src="https://github.com/user-attachments/assets/77e694f5-84d3-46b0-8aeb-d64dc41eaf0d" />


### 2. Sự khác biệt giữa danh sách liên kết đơn và mảng
[:arrow_up: Mục lục](#mục-lục)

<img src="https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/b217e40f-3a77-4d93-b806-ec7bb52b2634" width="600px">

## IV. Ngăn xếp và hàng đợi
[:arrow_up: Mục lục](#mục-lục)

## V. Thuật toán sắp xếp
[:arrow_up: Mục lục](#mục-lục)

## VI. Thuật toán tìm kiếm
[:arrow_up: Mục lục](#mục-lục)

## VII. Bảng băm và tập hợp
[:arrow_up: Mục lục](#mục-lục)

## VIII. Cấu trúc cây và đồ thị
[:arrow_up: Mục lục](#mục-lục)

## IX. Hàng đợi ưu tiên (Heaps)
[:arrow_up: Mục lục](#mục-lục)

## X. Tìm kiếm nhị phân
[:arrow_up: Mục lục](#mục-lục)

## XI. Các thuật toán tìm kiếm chuỗi ký tự
[:arrow_up: Mục lục](#mục-lục)

## XII. Giải thuật tham lam (Greedy Algorithms)
[:arrow_up: Mục lục](#mục-lục)

## XIII. Thuật toán quay lui
[:arrow_up: Mục lục](#mục-lục)

## XIV. Quy hoạch động
[:arrow_up: Mục lục](#mục-lục)
