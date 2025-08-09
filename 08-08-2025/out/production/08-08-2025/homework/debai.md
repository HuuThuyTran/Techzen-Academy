Huu Thuy
tranhuuthuy_3004
Online

Minh Quân — 7/23/2025 10:04 AM
Nhóm 1 (bàn đầu)
B1: Xác định và phân tích yêu câu
B2: Xác định cấu trúc
Thuộc tính:
Tên
Điểm toán
Điểm văn
Phương thức:
input();
output();
calculateAverageScore() ((Điểm toán + điểm văn) / 2)
B3: Viết class Student
B4: Viết class StudentManager sử dụng
Phương thức:
addStudent();
displayAllStudent();

tùn — 7/23/2025 10:22 AM
Image
Yến Như — 7/23/2025 10:24 AM
# Quản lý thông tin sinh viên
## B1: Phân tích yêu cầu đề bài

#### Viết chương trình cho phép nhập thông tin học sinh, bao gồm:
+ Tên HS
+ Điểm Toán
+ Điểm Văn
+ Tính điểm trung bình
+ In ra kết quả
#### Mục tiêu sử dụng
+ Lớp
+ Đối tượng
+ Thuộc tính
+ Phương thức

## B2: Viết class Student

#### Thuộc tính
* Tên (String name)
* Điểm toán (double math)
* Điểm văn (double literature)
#### Phương thức:
* void input(): Nhập tên(String), điểm văn(double), điểm toán(double) với điều kiện kiểm tra:
    * điểm toán và văn nhập vào (>= 0 và <=10)
    * tên không chứa kí tự số và kí tự đặc biệt.
* void output(): in ra Tên, Điểm Văn, Điểm toán, Điểm trung bình
* double calculateAverageScore(): Tính trung bình của điểm toán và văn.
## B3: Viết class StudentManager
* Tạo Arrayslist<Student> students để lưu danh sách sinh viên.
* Tạo biến số lượng sinh viên người dùng muốn nhập vào.
* Sử dụng vòng lặp for để gọi hàm input/output để nhập và in ra thông tin.
  quangminh0810 — 7/23/2025 11:07 AM
  Nhóm2
  package OOP_Demo;

import java.util.Scanner;

public class Student {
String name;
Expand
Student.java
2 KB
package OOP_Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager  {
Expand
StudentManager.java
2 KB
Minh Quân — 7/23/2025 11:08 AM
Nhóm 1
GitHub
Techzen_Fullstack/OOP/src/buoi_1/sang at develop · WuangNyH/Techze...
Contribute to WuangNyH/Techzen_Fullstack development by creating an account on GitHub.
Contribute to WuangNyH/Techzen_Fullstack development by creating an account on GitHub.
Ttung — 7/23/2025 11:12 AM
Nhóm 3
import java.util.Scanner;

public class Student {
String name;
float toan;
float van;
Expand
Student.java
1 KB
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
ArrayList<Student> students = new ArrayList<Student>();
Expand
Main.java
1 KB
Minh Quân — 7/23/2025 11:26 AM
Chưa tuân thủ code convention
Chưa validate dữ liệu
Output hơi rối, mỗi sinh viên nên cách ra 1 khoảng trắng
Tên hơi thiếu ý nghĩa
Chưa format dữ liệu lúc in ra

Yến Như — 7/23/2025 11:26 AM
Image
tùn — 7/23/2025 11:26 AM
Image
thienhh — 7/23/2025 11:43 AM
Anh gửi bài tập hôm nay
Image
Image
thienhh — 7/24/2025 1:58 PM
@here
Đã có 5 bạn nộp bài tập OOP Class & Object, các bạn còn lại nhớ nộp bài trong chiều nay giúp anh
Trần Vũ Lâm
just slid into the server. — 7/24/2025 2:47 PM
thienhh — 7/25/2025 11:48 AM
Attachment file type: acrobat
bai_tap_nhom_sang_static.pdf
117.64 KB
quangminh0810 — 7/25/2025 12:00 PM
---quản lý giảng viên
--thuộc tính class--
id int         //Int id
họ tên string
tuổi int
môn string
Expand
Bai25_7.txt
1 KB
tùn — 7/25/2025 12:03 PM
Image
Trần Vũ Lâm — 7/26/2025 12:04 PM
các bạn nộp bài về nhà gửi trực tiếp cho mình với nhé
để mình tiện review giúp các bạn nhé
thienhh — 7/26/2025 12:05 PM
@here
Welcome,
Nguyễn Quang Minh
. We hope you brought pizza. — 7/28/2025 9:07 AM
thienhh — 7/28/2025 10:38 AM
Code bài 04 Kế thừa
Forwarded
Attachment file type: archive
ss4_inheritance.zip
5.01 KB
Trần Vũ Lâm — 7/28/2025 11:13 AM
Image
thienhh — 7/29/2025 2:44 PM
@here
Mọi người nhớ nộp bài tập trong chiều nay cho @Trần Vũ Lâm giúp anh nhé.
Hiện tại chỉ mới có 1 bạn nộp bài thôi.
thienhh — 7/30/2025 8:22 AM
Tài liệu bài Đa hình hôm nay
Attachment file type: acrobat
Bài 05 Đa hình.pdf
502.35 KB
# Bài tập Set trong Java

### a. Loại bỏ phần tử trùng lặp

Viết chương trình nhận vào một mảng các số nguyên. Sử dụng Set để loại bỏ các phần tử trùng nhau, và sau đó in ra danh
sách các phần tử duy nhất trong mảng.
Expand
bai_tap_09_set_map.md
2 KB
Bài tập Ứng dụng quản lý điện thoại
Sử dụng Comparable hoặc Compator cho việc sắp xếp
﻿
# Bài tập Set trong Java

### a. Loại bỏ phần tử trùng lặp

Viết chương trình nhận vào một mảng các số nguyên. Sử dụng Set để loại bỏ các phần tử trùng nhau, và sau đó in ra danh
sách các phần tử duy nhất trong mảng.

### b. Tính tổng các phần tử không trùng

Viết chương trình nhận vào một mảng các số nguyên. Dùng Set để loại bỏ phần tử trùng lặp, sau đó tính và in ra tổng các
phần tử duy nhất đó.

### c. Tìm phần tử chung của hai mảng

Viết chương trình nhận vào hai mảng các số nguyên. Sử dụng hai Set để tìm và in ra danh sách các phần tử xuất hiện trong
cả hai mảng.

### d. Tìm giá trị lớn nhất và nhỏ nhất

Viết chương trình nhận vào một mảng các số nguyên. Dùng Set để loại bỏ phần tử trùng lặp, sau đó tìm và in ra phần tử
lớn nhất và nhỏ nhất trong tập hợp.

---

# Bài tập luyện tập với Map trong Java

### a. Đếm số lần xuất hiện của từng từ

Viết chương trình nhận vào một chuỗi văn bản. Sử dụng Map để đếm số lần xuất hiện của mỗi từ trong văn bản và in kết quả
ra màn hình.

### b. Kiểm tra tên duy nhất và tên trùng

##### Viết chương trình nhận vào một danh sách các tên. Dùng Map để kiểm tra:

* Những tên nào chỉ xuất hiện một lần (duy nhất)

* Những tên nào xuất hiện nhiều lần