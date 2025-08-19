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

- [1. Thuật toán sắp xếp nổi bọt (Bubble Sort](#1-thuật-toán-sắp-xếp-nổi-bọt-bubble-sort)
- [2. Thuật toán sắp xếp chọn (Selection Sort)](#2-thuật-toán-sắp-xếp-chọn-selection-sort)
- [3. Thuật toán sắp xếp chèn (Insertion Sort)](#3-thuật-toán-sắp-xếp-chèn-insertion-sort)
- [4. Thuật toán sắp xếp trộn (Merge Sort)](#4-thuật-toán-sắp-xếp-trộn-merge-sort)
- [5. Thuật toán sắp xếp nhanh (Quick Sort)](#5-thuật-toán-sắp-xếp-nhanh-quick-sort)
- [6. Thuật toán sắp xếp đếm (Counting Sort)](#6-thuật-toán-sắp-xếp-đếm-couting-sort)
- [7. Thuật toán sắp xếp theo cơ số (Radix Sort)](#7-thuật-toán-sắp-xếp-theo-cơ-số-radix-sort)
- [8. Thuật toán sắp xếp theo khối (Bucket Sort)](#8-thuật-toán-sắp-xếp-theo-khối-bucket-sort)
- [9. Thuật toán sắp xếp Shell Sort](#9-thuật-toán-sắp-xếp-shell-sort)

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

Khi xóa một nút, ta chỉ cần nối nút nằm ở phía trước nút cần xóa này với nút nằm ở đằng sau nút cần xóa.

#### 6. Hiển thị danh sách

<img width="600" alt="image" src="https://github.com/user-attachments/assets/ec219ce5-e6df-4ef1-ae44-d190e72f6233" />

Khi hiển thị danh sách, ta chỉ việc duyệt qua từng nút trong danh sách và in ra dữ liệu của mỗi nút đó.

#### 7. Thao tác tìm kiếm nút trong danh sách

<img width="600" alt="image" src="https://github.com/user-attachments/assets/57dfbbf0-ff02-494d-88fb-62721d7279d5" />

Khi tìm một đơn vị dữ liệu trong một nút, ta chỉ cần duyệt qua từng nút và kiểm tra xem dữ liệu đó có phải là dữ liệu cần tìm hay không, nếu là dữ liệu cần tìm, ta sẽ dừng lại và lấy dữ liệu ra từ nút đó.

#### 8. Thay đổi giá trị dữ liệu của một nút trong danh sách

<img width="600" alt="image" src="https://github.com/user-attachments/assets/a42a76e2-3813-4382-81fc-12170978af04" />

Khi tìm một đơn vị dữ liệu trong một nút, ta chỉ cần duyệt qua từng phần tử và kiểm tra xem dữ liệu đó có phải là cần cập nhật hay không, nếu là dữ liệu cần tìm, ta sẽ dừng lại và thay đổi dữ liệu mới trong từ phần tử đó. Nếu không, ta sẽ tiếp tục duyệt qua toàn bộ danh sách cho đến khi tìm thấy, và nếu duyệt phần cuối của danh sách có giá trị là `NULL`, tức là giá trị dữ liệu cần thay đổi không được lưu trong danh sách.

### 2. Sự khác biệt giữa danh sách liên kết đơn và mảng
[:arrow_up: Mục lục](#mục-lục)

#### 1. Nhắc lại về mảng

Cấu trúc dữ liệu mảng có các đặc điểm sau:
- Truy cập ngẫu nhiên (Thời gian tìm kiếm nhanh).
- Bộ nhớ cần cấp cho một phần tử ít hơn.
- Thời gian xóa và thêm phần tử chậm hơn.
- Kích thước cố định.
- Sử dụng bộ nhớ không hiệu quả.
- Các phần tử nằm trên một vùng bộ nhớ bao gồm các ô chứa dữ liệu liền nhau.

#### 2. Danh sách liên kết

Danh sách liên kết có các đặc điểm sau:
- Thời gian thêm và xóa phần tử nhanh hơn.
- Kích thước động.
- Sử dụng hiệu quả bộ nhớ.
- Thời gian tìm kiếm chậm hơn so với mảng.
- Tốn nhiều bộ nhớ hơn cho một phần tử. Các phần tử trong danh sách liên kết nằm trên các phân vùng bộ nhớ khác nhau, do đó, các phần tử trong danh sách liên kết cần chứa một con trỏ để trỏ tới các phần tử đằng sau nó.

Khi một danh sách liên kết được sinh ra, nó không cần 7 byte bộ nhớ tất cả nằm ở cùng một phân vùng. Một byte có thể tồn tại ở một phân vùng nào đó, trong khi byte tiếp theo có thể được lưu trữ ở một phân vùng khác trong bộ nhớ. Danh sách liên kết không cần chiếm một khối bộ nhớ, thay vào đó, bộ nhớ mà chúng sử dụng có thể nằm rải rác ở các phân vùng khác nhau.

#### 3. So sánh giữa danh sách liên kết và mảng

<img src="https://github.com/CUNGVANTHANG/Java_Back-end/assets/96326479/b217e40f-3a77-4d93-b806-ec7bb52b2634" width="600px">

| | |
| :--: | :--: |
| Mảng	| Danh sách liên kết |
| Dữ liệu chỉ có thể được lưu trữ trong các khối bộ nhớ liền nhau, nên kích thước của nó không thể thay đổi trong thời gian thực thi.	| Mỗi nút trỏ đến nút tiếp theo để dữ liệu có thể tồn tại ở các địa chỉ không liền kề nhau, cho phép kích thước có thể thay đổi trong thời gian thực thi. |
| Việc xáo trộn một mảng sẽ phức tạp hơn và chiếm nhiều bộ nhớ hơn.	| Việc xáo trộn danh sách liên kết chỉ là vấn đề thay đổi các nút trong danh sách, do đó sẽ dễ dàng hơn. |
| Mảng cho phép việc truy cập các phần tử một cách ngẫu nhiên bằng cách sử dụng chỉ số. |	Danh sách liên kết chỉ cho phép truy cập các phần tử theo thứ tự từ đầu đến cuối. |
| Kích thước của một mảng được biết trước hoặc được tạo lại khi nó cần phát triển lớn hơn. Bởi vì không gian bộ nhớ được phân bổ cho mảng trong thời gian biên dịch, tức là kích thước của nó được cố định khi ta khai báo nó. |	Danh sách liên kết phát triển một cách tự nhiên, theo thứ tự được thêm dữ liệu. Không gian bộ nhớ được phân bổ cho danh sách liên kết trong thời gian thực thi, tức là kích thước của nó có thể tăng hoặc giảm trong khi chương trình đang thực thi. |
| Một mảng sẽ giả định rằng mọi phần tử đều có cùng kích thước vì các phần tử của mảng phải có cùng kiểu dữ liệu. |	Dễ dàng lưu trữ dữ liệu có kích thước khác nhau trong danh sách liên kết. |
| Mảng có kiểu mảng một chiều, mảng hai chiều hoặc mảng đa chiều. |	Danh sách liên kết có kiểu danh sách liên kết đơn, đôi hoặc vòng. |

## IV. Ngăn xếp và hàng đợi
[:arrow_up: Mục lục](#mục-lục)

## V. Thuật toán sắp xếp
[:arrow_up: Mục lục](#mục-lục)

### 1. Thuật toán sắp xếp nổi bọt (Bubble Sort)
[:arrow_up: Mục lục](#mục-lục)

Tham khảo ở đây: https://visualgo.net/en/sorting

Sắp xếp nổi bọt hay Bubble Sort là một thuật toán so sánh các phần tử liền kề và hoán đổi vị trí của chúng nếu chúng không tuân theo thứ tự được chỉ định. Thứ tự có thể tăng dần hoặc giảm dần.

Cách thức hoạt động của thuật toán:

- Bắt đầu từ chỉ số đầu tiên, ta sẽ so sánh phần tử đầu tiên và phần tử thứ hai. Nếu phần tử đầu tiên lớn hơn phần tử thứ hai, chúng sẽ được hoán đổi.
- Bây giờ, ta sẽ so sánh phần tử thứ hai và phần tử thứ ba. Hoàn đổi chúng nếu chúng không theo thứ tự.
- Quá trình trên cứ tiếp tục cho đến phần tử cuối cùng.

<img width="300" alt="image" src="https://github.com/user-attachments/assets/17538e22-d91d-41e4-bebf-1804f200513d" />

- Quá trình tương tự diễn ra cho các lần lặp lại còn lại. Sau mỗi lần lặp, phần tử lớn nhất trong số các phần tử chưa được sắp xếp sẽ được đặt ở cuối.
- Trong mỗi lần lặp, việc so sánh diễn ra cho đến phần tử chưa được sắp xếp cuối cùng.
- Mảng được sắp xếp khi tất cả các phần tử chưa được sắp xếp được đặt đúng vị trí của chúng.

<img width="300" alt="image" src="https://github.com/user-attachments/assets/ab29785c-1bec-4300-8222-44af94fc322b" />

<img width="300" alt="image" src="https://github.com/user-attachments/assets/1a27ea21-fc1e-4086-b9c0-b9be38e7f302" />

<img width="300" alt="image" src="https://github.com/user-attachments/assets/a478c3ae-b3b2-4cab-b9b6-f7455ebe2c37" />

Thuật toán của sắp xếp nổi bọt như sau:

```
Bublesort (Mảng cần sắp xếp)
  Sử dụng vòng lặp for với i = 1 cho tới chỉ số của phần tử chưa được sắp xếp cuối cùng -1
    Nếu phần tử bên trái > phần tử bên phải
      Hoán đổi hai phần tử này cho nhau
Kết thúc hàm
```

| | |
| :--: | :--: |
| Độ phức tạp | Thời gian	|
| Trường hợp tốt nhất | O(n) |
| Trường hợp xấu nhất |	O(n^2) |
| Trường hợp trung bình |	O(n^2) |
| Độ phức tạp không gian |	O(1) |

```java
  static void bubbleSort(int array[]) {
    int size = array.length;
    
    // Vòng lặp để truy cập từng phần tử mảng
    for (int i = 0; i < size - 1; i++)
    
      // Vòng lặp để so sánh các phần tử mảng
      for (int j = 0; j < size - i - 1; j++)

        // So sánh hai phần tử liền kề, thay đổi > thành < để sắp xếp theo thứ tự giảm dần
        if (array[j] > array[j + 1]) {

          // swap xảy ra nếu các phần tử không theo thứ tự dự định
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }
```

### 2. Thuật toán sắp xếp chọn (Selection Sort)
[:arrow_up: Mục lục](#mục-lục)

Cách hoạt động của thuật toán sắp xếp chọn:

**Bước 1**: Giả sử ta có mảng như hình bên dưới. Ta sẽ đặt phần tử đầu tiên làm phần tử nhỏ nhất và gán nó vào một biến có tên là `min`.

<img width="300" alt="image" src="https://github.com/user-attachments/assets/842ed2c0-02f8-447e-aea0-54ab2598f953" />

**Bước 2**: So sánh phần tử nhỏ nhất này với phần tử thứ hai. Nếu phần tử thứ hai nhỏ hơn phần tử `min`, ta sẽ gán phần tử thứ hai làm phần tử nhỏ nhất cho biến `min`.

So sánh phần tử nhỏ nhất với phần tử thứ ba. Một lần nữa, nếu phần tử thứ ba nhỏ hơn, thì ta sẽ gán giá trị nhỏ nhất cho phần tử thứ ba, nếu không thì không làm gì cả. Quá trình tiếp tục cho đến phần tử cuối cùng.

<img width="300" alt="image" src="https://github.com/user-attachments/assets/3a2307cd-b509-4f06-86eb-2edef9bdf22e" />

**Bước 3**: Sau mỗi lần lặp lại, giá trị nhỏ nhất được đặt ở phía trước danh sách chưa được sắp xếp.

<img width="300" alt="image" src="https://github.com/user-attachments/assets/ebeeea2b-1f6b-4b07-9d13-485a692dc37d" />

**Bước 4:** Đối với mỗi lần lặp, chỉ số sẽ bắt đầu từ phần tử chưa được sắp xếp đầu tiên. Bước 1 đến bước 3 được lặp lại cho đến khi tất cả các phần tử được đặt đúng vị trí của chúng.

<img width="300" alt="image" src="https://github.com/user-attachments/assets/4ca0e4ca-39cb-46fd-9e8e-aa66a6006189" />

<img width="300" alt="image" src="https://github.com/user-attachments/assets/5d7563ee-5d2b-4a8e-9c29-dafd2f0c928b" />

<img width="300" alt="image" src="https://github.com/user-attachments/assets/3fc9d26d-f880-4d59-9de6-46e92d5aa09d" />

<img width="300" alt="image" src="https://github.com/user-attachments/assets/3e7f8d48-7a54-49f8-b6f6-ee41ab18266f" />

Kết quả ta được một mảng các giá trị đã được sắp xếp theo thứ tự từ bé đến lớn.

<img width="300" alt="image" src="https://github.com/user-attachments/assets/aa7ac138-f345-4e8e-b8d2-7684043c2d89" />

Đoạn giả mã cho thuật toán sắp xếp lựa chọn như sau:

```
Selection Sort (mảng, kích thước)
   Lặp lại (kích thước - 1) lần
   Đặt phần tử không được sắp xếp đầu tiên làm phần tử nhỏ nhất
   Sử dụng vòng lặp for với mỗi phần tử chưa được sắp xếp
     if phần tử < phần tử nhỏ nhất
       Đặt phần tử làm phần tử nhỏ nhất
   Hoán đổi phần tử nhỏ nhất với vị trí không được sắp xếp đầu tiên
Kết thúc hàm
```

| | |
| :--: | :--: |
| Độ phức tạp | Thời gian	|
| Trường hợp tốt nhất | 	O(n^2) |
| Trường hợp xấu nhất |	O(n^2) |
| Trường hợp trung bình |	O(n^2) |
| Độ phức tạp không gian |	O(1) |

```java
static void selectionSort(int array[]) {
    int size = array.length;

    // loop để di chuyển ranh giới của mảng chưa sắp xếp
    for (int i = 0; i < size - 1; i++) {

        // giả định phần tử nhỏ nhất ở vị trí i
        int minIndex = i;

        // tìm phần tử nhỏ nhất trong mảng chưa sắp xếp
        for (int j = i + 1; j < size; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }

        // đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên của mảng chưa sắp xếp
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
    }
}
```

### 3. Thuật toán sắp xếp chèn (Insertion Sort)
[:arrow_up: Mục lục](#mục-lục)

### 4. Thuật toán sắp xếp trộn (Merge Sort)
[:arrow_up: Mục lục](#mục-lục)

### 5. Thuật toán sắp xếp nhanh (Quick Sort)
[:arrow_up: Mục lục](#mục-lục)

### 6. Thuật toán sắp xếp đếm (Counting Sort)
[:arrow_up: Mục lục](#mục-lục)

### 7. Thuật toán sắp xếp theo cơ số (Radix Sort)
[:arrow_up: Mục lục](#mục-lục)

### 8. Thuật toán sắp xếp theo khối (Bucket Sort)
[:arrow_up: Mục lục](#mục-lục)

### 9. Thuật toán sắp xếp Shell Sort
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
