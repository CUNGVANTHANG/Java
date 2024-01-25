# Database
## Mục lục
- [Database](#database)
  - [Mục lục](#mục-lục)
  - [I. Tổng quan về cơ sở dữ liệu](#i-tổng-quan-về-cơ-sở-dữ-liệu)
  - [II. Truy vấn dữ liệu trong một bảng `SELECT ...,...,... FROM ... WHERE ...`](#ii-truy-vấn-dữ-liệu-trong-một-bảng-select--from--where)
    - [1. Toán tử `OR, AND, BETWEEN, NOT`](#1-toán-tử-or-and-between-not)
    - [2. Kết hợp nhiều điều kiện bằng cách sử dụng dấu ngoặc `()`](#2-kết-hợp-nhiều-điều-kiện-bằng-cách-sử-dụng-dấu-ngoặc-)
    - [3. Dữ liệu văn bản sử dụng dấu nháy đơn `''`](#3-dữ-liệu-văn-bản-sử-dụng-dấu-nháy-đơn-)
    - [4. Ký hiệu phần trăm `%, LIKE`](#4-ký-hiệu-phần-trăm--like)
    - [5. Ký hiệu gạch dưới `_, LIKE`](#5-ký-hiệu-gạch-dưới-_-like)
    - [6. Tìm các giá trị `IS NOT NULL, IS NULL`](#6-tìm-các-giá-trị-is-not-null-is-null)
  - [III. Truy vấn dữ liệu từ nhiều bảng `SELECT ...,...,... FROM ...,...,... WHERE ...`](#iii-truy-vấn-dữ-liệu-từ-nhiều-bảng-select--from--where-)

## I. Tổng quan về cơ sở dữ liệu
[:arrow_up: Mục lục](#mục-lục)

| Cú pháp | Ý nghĩa |
| :---: | :---: | 
| `SELECT` | Xem dữ liệu từ một hoặc nhiều bảng |
| `INSERT` | Thêm mới dữ liệu |
| `UPDATE` | Chỉnh sửa thông tin dữ liệu |
| `DELETE` | Xóa dữ liệu |

> `SELECT .... FROM .... WHERE ...;`

`SELECT` có ý nghĩa là hiển thị thông tin dữ liệu. Ở đây câu này có nghĩa là "Hiển thị dữ liệu" lên màn hình. Còn nếu áp dụng cả FROM và WHERE thì câu lệnh sẽ là :"Hiển thị dữ liệu ... từ ... thỏa mãn điều kiện ..."

## II. Truy vấn dữ liệu trong một bảng `SELECT ...,...,... FROM ... WHERE...`
[:arrow_up: Mục lục](#mục-lục)

> `SELECT * FROM ...;`

`*` có nghĩa là tất cả. Ở đây câu này có nghĩa là "Hiển thị **tất cả các cột** từ bảng ..."

> `SELECT ... FROM ...;`

Ở đây câu này có nghĩa là "Hiển thị cột ... từ bảng ..."

> `SELECT ..., ... FROM ...;`

Ở đây câu này có nghĩa là "Hiển thị cột ..., ... từ bảng ..."

> `SELECT ... FROM ... WHERE ...;`

Ở đây câu này có nghĩa là "Hiển thị cột ... từ bảng ... thỏa mãn điều kiện ..."

*Ví dụ:*

```sql
SELECT * FROM xe WHERE nam_san_xuat = 2022;

-- Nghĩa là 'hiển thị tẩt cả cột' trong bảng 'xe' thỏa mãn điều kiện các hàng trong cột `nam_san_xuat = 2022`
```

### 1. Toán tử `OR, AND, BETWEEN, NOT`
[:arrow_up: Mục lục](#mục-lục)

| Toán tử | Ý nghĩa |
| `OR` | hoặc |
| `AND` | và (đến) |
| `BETWEEN` | từ |
| `NOT` | phủ định |

*Ví dụ:*

```sql
-- Toán tử OR
SELECT id, name FROM user WHERE age > 50 OR height < 185;

-- Toán tử AND
SELECT id, name FROM user WHERE age <= 70 AND age >= 13;

-- Toán tử BETWEEN
-- Bản chất:
SELECT id, name FROM user WHERE age <= 70 AND age >= 13;

-- Sử dụng toán tử:
SELECT id, name FROM user WHERE age BETWEEN 13 AND 70;

-- Toán tử NOT
SELECT * FROM user WHERE age NOT BETWEEN 20 AND 30;
```

### 2. Kết hợp nhiều điều kiện bằng cách sử dụng dấu ngoặc `()`
[:arrow_up: Mục lục](#mục-lục)

```sql
SELECT
  id,
  name
FROM user
WHERE (age > 70 OR age < 13)
  AND (height >= 180);
```

### 3. Dữ liệu văn bản sử dụng dấu nháy đơn `''`
[:arrow_up: Mục lục](#mục-lục)

```sql
SELECT age
FROM user
WHERE name = 'Smith';
```

### 4. Ký hiệu phần trăm `%, LIKE`
[:arrow_up: Mục lục](#mục-lục)

`LIKE` cho phép sử dụng ký hiệu phần trăm `%`. Dấu `%` được áp dụng trong ví dụ **so khớp với bất kỳ số lượng ký tự** không xác định nào (từ 0 đến nhiều ký tự).

*Ví dụ:*

```sql
-- Hiển thị tất cả cột trong bảng user thỏa mãn name bắt đầu bằng chữ A
SELECT *
FROM user
WHERE name LIKE 'A%';

-- Hiển thị tất cả cột trong bảng user thỏa mãn name kết thúc bằng chữ A
SELECT *
FROM user
WHERE name LIKE '%A';

-- Hiển thị tất cả cột trong bảng user thỏa mãn name bắt đầu hoặc kết thúc bằng chữ A
SELECT *
FROM user
WHERE name LIKE '%A%';
```

### 5. Ký hiệu gạch dưới `_, LIKE`
[:arrow_up: Mục lục](#mục-lục)

Ký hiệu gạch dưới `_` dùng để **khớp chính xác một ký tự**. 

*Ví dụ:*

```sql
-- Tìm một cô gái có tên là Catherine? hay là Katherine? khi chưa biết chính xác
SELECT *
FROM user
WHERE name LIKE '_atherine';
```

### 6. Tìm các giá trị `IS NOT NULL, IS NULL`
[:arrow_up: Mục lục](#mục-lục)

*Ví dụ 1: Tìm giá trị không NULL*

```sql
SELECT id
FROM user
WHERE middle_name IS NOT NULL;
```

Chương trình này chỉ chọn những người dùng có tên đệm, tức là cột `middle_name` đã được điền giá trị (nghĩa là giá trị không NULL).

*Ví dụ 2: Tìm giá trị NULL*

```sql
SELECT id
FROM user
WHERE middle_name IS NULL;
```

Truy vấn này sẽ trả về chỉ những người dùng không có tên đệm, tức là `middle_name` không được cung cấp trong cơ sở dữ liệu (nghĩa là giá trị NULL)

*Ví dụ 3: So sánh với NULL*

Nếu bạn đặt điều kiện trên một cột cụ thể, ví dụ như `AGE < 70`, các hàng mà `age` là `NULL` sẽ luôn bị loại khỏi kết quả.

`NULL` không bao giờ bằng `0`. Nên vì thế biểu thức `NULL = NULL` sẽ không bao giờ đúng trong SQL


## III. Truy vấn dữ liệu từ nhiều bảng `SELECT ...,...,... FROM ...,...,... WHERE ...`

### 1. Tham chiếu đến các cột cụ thể `.`

Bằng cách cung cấp tên của bảng và cột, được phân tách bằng dấu chấm `.`

_Ví dụ:_

```sql
-- Dùng để xem xét các tổ hợp mà id trong person giống owner_id trong car
SELECT *
FROM person, car
WHERE person.id = car.owner_id;
```

### 2. Cấu trúc kết hợp bảng `JOIN ... ON`

Sử dụng `JOIN` để kết hợp các bảng

_Ví dụ:_

```sql
-- Kết hợp bảng person và car, ta sử dụng JOIN giữa tên hai bảng. Ngoài ra, ta cũng có thể đặt điều kiện kết hợp các bảng bằng ON. Sau từ khóa ON chúng ta có thể đặt điều kiện để chỉ kết hợp những hàng có id trong person giống owner_id trong car.
SELECT *
FROM person
JOIN car
  ON person.id = car.owner_id;
```

### 3. Trích xuất cột cụ thể `.`

_Ví dụ:_

```sql
-- Hiển thị một vài cột trong kết quả đầu ra. Chúng ta chỉ muốn biết mẫu xe và tên chủ sở hữu. Vì có nhiều hơn một bảng, chúng ta đặt tên bảng trước tên cột và phân tách chúng bằng dấu chấm .
SELECT
  person.name,
  car.model
FROM person
JOIN car
  ON person.id = car.owner_id;
```

### 4. Đổi tên cột `AS`

_Ví dụ:_

```sql
-- Đổi tên cột person.id và car.id thành person_id và car_id tương ứng.
SELECT
  person.id AS person_id,
  car.id AS car_id
FROM person
JOIN car
  ON person.id = car.owner_id;
```

_Chú ý:_ Tên mới chỉ là **bí danh**, nghĩa là nó là tên tạm thời và **không thay đổi tên thực tế trong cơ sở dữ liệu**. Nó chỉ ảnh hưởng đến cách cột được **hiển thị trong kết quả của truy vấn**. Kỹ thuật này thường được sử dụng khi có một vài cột có cùng tên từ các bảng khác nhau.

