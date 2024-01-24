# Database
## Mục lục
- [Database](#database)
  - [Mục lục](#mục-lục)
  - [1. Tổng quan về cơ sở dữ liệu](#1-tổng-quan-về-cơ-sở-dữ-liệu)
  - [2. Truy vấn dữ liệu trong một bảng](#2-truy-vấn-dữ-liệu-trong-một-bảng)

## 1. Tổng quan về cơ sở dữ liệu

| Cú pháp | Ý nghĩa |
| :---: | :---: | 
| `SELECT` | Xem dữ liệu từ một hoặc nhiều bảng |
| `INSERT` | Thêm mới dữ liệu |
| `UPDATE` | Chỉnh sửa thông tin dữ liệu |
| `DELETE` | Xóa dữ liệu |

> `SELECT .... FROM .... WHERE ...;`

`SELECT` có ý nghĩa là hiển thị thông tin dữ liệu. Ở đây câu này có nghĩa là "Hiển thị dữ liệu" lên màn hình. Còn nếu áp dụng cả FROM và WHERE thì câu lệnh sẽ là :"Hiển thị dữ liệu ... từ ... thỏa mãn điều kiện ..."

## 2. Truy vấn dữ liệu trong một bảng

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