# Bài Thực Hành: Kiểm Thử Hộp Đen

## Mô Tả Bài Tập

Bài thực hành này yêu cầu sử dụng ChatGPT để hỗ trợ xây dựng các hàm và thiết kế kiểm thử cho 8 bài toán sau, sau đó đưa toàn bộ mã nguồn lên GitHub repo:

1. Tính chu vi hình chữ nhật
2. Tính diện tích hình chữ nhật
3. Giải phương trình bậc 2
4. Tính số ngày của một tháng
5. Kiểm tra n có phải là số nguyên tố hay không
6. Tính tổng S = 1 - 2 + 3 - 4 + ... ± n
7. Tìm ƯCLN của a và b
8. Tính tổng S = 1! + 2! + 3! + ... + n! (có sử dụng hàm tính giai thừa)

## Yêu Cầu Thực Hiện

### Thiết Kế Kiểm Thử

- Với mỗi bài toán, xác định đầu vào, đầu ra mong đợi và các trường hợp kiểm thử
- Thiết kế test case dựa trên các kỹ thuật kiểm thử:
  - Phân tích giá trị biên (Boundary Value Analysis)
  - Dữ liệu hợp lệ (valid data)
  - Dữ liệu không hợp lệ (invalid data)

### Kiểm Thử Hộp Đen

- Ngoài các test case dữ liệu được dùng, cần xây dựng thêm các kiểm thử hộp đen
- Danh sách test case trang chi tiết trong file `TEST_CASES.md`

### Yêu Cầu GitHub

- Tạo Issue 1: Thiết kế và viết các ca kiểm thử hộp đen cho trường hợp dữ liệu hợp lệ
- Tạo Issue 2: Thiết kế và viết các ca kiểm thử hộp đen cho trường hợp dữ liệu không hợp lệ
- Làm quyết từng Issue và tạo commit tương ứng cho mỗi Issue đã hoàn thành

## Yêu Cầu Môi Trường

- Java JDK (khuyến nghị JDK 17+)

## Cách Biên Dịch Và Chạy

Mở terminal tại thư mục project, sau đó chạy:

```bash
javac ThucHanh03.java
java ThucHanh03
```

## Đầu Ra Chương Trình

Chương trình in 2 phần:

- **ISSUE 1**: Test dữ liệu hợp lệ - Kiểm thử các giá trị đúng
- **ISSUE 2**: Test dữ liệu không hợp lệ - Kiểm thử các giá trị sai và catch ngoại lệ

Nếu biên dịch và chạy thành công, terminal sẽ hiển thị kết quả cho cả 8 bài test.

## Yêu Cầu Nộp Bài

Sau khi hoàn thành, em thực hiện:

- Nộp link GitHub repo
- Repo cần có:
  - Mã nguồn chương trình (`ThucHanh03.java`)
  - Danh sách test case chi tiết (`TEST_CASES.md`)
  - Kết quả chạy kiểm thử (output chạy chương trình)
  - Mô tả cách áp dụng kiểm thử hộp đen cho từng bài (`TESTING_APPROACH.md`)

## Quy Trình Làm Việc GitHub

1. Tạo Issue 1 và Issue 2 trên GitHub
2. Tạo branch cho mỗi Issue
3. Commit và push code theo từng Issue
4. Đóng Issue và merge branch khi hoàn thành

# Bài thực hành: Kiểm thử hộp đen

## Mô tả bài tập

Bài thực hành này yêu cầu sử dụng ChatGPT để hỗ trợ xây dựng các hàm và thiết kế kiểm thử cho 8 bài toán sau, sau đó đưa toàn bộ mã nguồn lên GitHub repo:

1. Tính chu vi hình chữ nhật
2. Tính diện tích hình chữ nhật
3. Giải phương trình bậc 2
4. Tính số ngày của một tháng
5. Kiểm tra n có phải là số nguyên tố hay không
6. Tính tổng S = 1 - 2 + 3 - 4 + ... ± n
7. Tìm ƯCLN của a và b
8. Tính tổng S = 1! + 2! + 3! + ... + n! (có sử dụng hàm tính giai thừa)

## Yêu cầu thực hiện

### Thiết kế kiểm thử

- Với mỗi bài toán, xác định đầu vào, đầu ra mong đợi và các trường hợp kiểm thử
- Thiết kế test case dựa trên các kỹ thuật kiểm thử:
  - Phân tích giá trị biên (Boundary Value Analysis)
  - Dữ liệu hợp lệ (valid data)
  - Dữ liệu không hợp lệ (invalid data)

### Kiểm thử hộp đen

- Ngoài các test case dữ liệu được dùng, cần xây dựng thêm các kiểm thử hộp đen
- Danh sách test case trang chi tiết trong file `TEST_CASES.md`

### Yêu cầu GitHub

- Tạo Issue 1: Thiết kế và viết các ca kiểm thử hộp đen cho trường hợp dữ liệu hợp lệ
- Tạo Issue 2: Thiết kế và viết các ca kiểm thử hộp đen cho trường hợp dữ liệu không hợp lệ
- Làm quyết từng issue và tạo commit tương ứng cho mỗi issue đã hoàn thành

## Yêu cầu môi trường

- Java JDK (khuyến nghị JDK 17+)

## Cách biên dịch và chạy

Mở terminal tại thư mục project, sau đó chạy:

    javac ThucHanh03.java
    java ThucHanh03

## Đầu ra chương trình

Chương trình in 2 phần:

- **ISSUE 1**: Test dữ liệu hợp lệ - Kiểm thử các giá trị đúng
- **ISSUE 2**: Test dữ liệu không hợp lệ - Kiểm thử các giá trị sai và catch ngoại lệ

Nếu biên dịch và chạy thành công, terminal sẽ hiển thị kết quả cho cả 8 bài test.

## Yêu cầu nộp bài

Sau khi hoàn thành, em thực hiện:

- Nộp link GitHub repo
- Repo cần có:
  - Mã nguồn chương trình (`ThucHanh03.java`)
  - Danh sách test case chi tiết (`TEST_CASES.md`)
  - Kết quả chạy kiểm thử (output chạy chương trình)
  - Mô tả cách áp dụng kiểm thử hộp đen cho từng bài (`TESTING_APPROACH.md`)

## Quy trình làm việc GitHub

1. Tạo Issue 1 và Issue 2 trên GitHub
2. Tạo branch cho mỗi Issue
3. Commit và push code theo từng Issue
4. Đóng Issue và merge branch khi hoàn thành
