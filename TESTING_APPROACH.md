# Phương Pháp Kiểm Thử Hộp Đen - Chi Tiết

## Giới Thiệu Kiểm Thử Hộp Đen (Black-box Testing)

Kiểm thử hộp đen là phương pháp kiểm thử mà không cần xem mã nguồn. Tester chỉ quan tâm đến:

- Đầu vào (input): giá trị và yêu cầu
- Đầu ra (output): kết quả mong đợi
- Không cần biết chi tiết cách thức hoạt động bên trong

### Các Kỹ Thuật Dùng Trong Bài Này:

1. **Phân tích giá trị biên (Boundary Value Analysis)**: Kiểm thử ở ranh giới
2. **Phân vùng tương đương (Equivalent Partitioning)**: Chia dữ liệu thành nhóm
3. **Kiểm thử trạng thái ngoại lệ (Exception Testing)**: Kiểm thử khi dữ liệu sai

---

## BÀI 1: Tính Chu Vi Hình Chữ Nhật

### Định Nghĩa:

- Input: chiều dài (a), chiều rộng (b) - đều > 0
- Output: chu vi = 2 × (a + b)

### Kỹ Thuật Áp Dụng: Boundary Value Analysis + Equivalent Partitioning

#### Phân Vùng Tương Đương:

| Phân Vùng                 | Đặc Điểm         | Test Case  |
| ------------------------- | ---------------- | ---------- |
| Giá trị hợp lệ thường     | a > 0, b > 0     | (3, 4)     |
| Giá trị nhỏ               | a, b gần 0       | (0.1, 0.1) |
| Giá trị lớn               | a, b lớn         | (100, 100) |
| Giá trị âm (không hợp lệ) | a < 0 hoặc b < 0 | (-3, 4)    |
| Giá trị 0 (ranh giới)     | a = 0 hoặc b = 0 | (3, 0)     |

#### Đầu Ra Mong Đợi Từng Phân Vùng:

- Hợp lệ: Tính được chu vi chính xác
- Không hợp lệ: Ném ngoại lệ IllegalArgumentException

#### Kỹ Thuật Test:

1. **Test giá trị hợp lệ**: Kiểm tra xem tính toán chính xác không
2. **Test giá trị âm**: Kiểm tra xem có ném ngoại lệ không
3. **Test giá trị 0**: Kiểm tra ranh giới

---

## BÀI 2: Tính Diện Tích Hình Chữ Nhật

### Định Nghĩa:

- Input: chiều dài (a), chiều rộng (b) - đều > 0
- Output: diện tích = a × b

### Kỹ Thuật Áp Dụng: Boundary Value Analysis + Equivalent Partitioning

Tương tự bài 1:

- Hợp lệ: a > 0, b > 0
- Không hợp lệ: a ≤ 0 hoặc b ≤ 0

#### Test Case:

| Input   | Mong Đợi  | Ý Nghĩa               |
| ------- | --------- | --------------------- |
| (3, 4)  | 12        | Giá trị hợp lệ thường |
| (2, 2)  | 4         | Hình vuông            |
| (3, -4) | Exception | Giá trị âm            |
| (0, 4)  | Exception | Ranh giới 0           |

---

## BÀI 3: Giải Phương Trình Bậc 2

### Định Nghĩa:

- Input: a, b, c (phương trình: ax² + bx + c = 0)
- Output: Vô nghiệm, 1 nghiệm kép, hoặc 2 nghiệm phân biệt
- Điều Kiện: a ≠ 0 (còn không phải phương trình bậc 2)

### Kỹ Thuật Áp Dụng: Equivalent Partitioning + Exception Testing

#### Phân Vùng:

| Trường Hợp   | Delta     | Kết Quả            | Test Case  |
| ------------ | --------- | ------------------ | ---------- |
| Hợp lệ 1     | Delta > 0 | 2 nghiệm phân biệt | (1, -3, 2) |
| Hợp lệ 2     | Delta = 0 | 1 nghiệm kép       | (1, -2, 1) |
| Hợp lệ 3     | Delta < 0 | Vô nghiệm          | (1, 0, 1)  |
| Không hợp lệ | a = 0     | Exception          | (0, 5, 2)  |

#### Ý Nghĩa Kỹ Thuật:

- **3 phân vùng chính**: tương ứng với 3 trường hợp Delta
- **Test ranh giới Delta**: Kiểm tra a = 0 (không phải bậc 2)
- **Test ngoại lệ**: Kiểm thử khi a = 0

---

## BÀI 4: Tính Số Ngày Của Một Tháng

### Định Nghĩa:

- Input: tháng (1-12), năm (≥1)
- Output: Số ngày trong tháng đó

### Kỹ Thuật Áp Dụng: Boundary Value Analysis + Equivalent Partitioning

#### Phân Vùng Tháng:

| Nhóm       | Tháng                 | Số Ngày    | Test Case |
| ---------- | --------------------- | ---------- | --------- |
| 30 ngày    | 4, 6, 9, 11           | 30         | 4         |
| 31 ngày    | 1, 3, 5, 7, 8, 10, 12 | 31         | 1         |
| 28/29 ngày | 2                     | 28 hoặc 29 | 2         |

#### Ranh Giới Tháng:

| Test         | Tháng | Kết Quả Mong Đợi |
| ------------ | ----- | ---------------- |
| Hợp lệ       | 1, 12 | Thành công       |
| Không hợp lệ | 0, 13 | Exception        |

#### Ranh Giới Năm:

- Năm nhuận: (năm % 4 == 0 && năm % 100 != 0) || (năm % 400 == 0)
- Tháng 2 năm 2024: 29 ngày (năm nhuận)
- Tháng 2 năm 2023: 28 ngày (năm thường)

---

## BÀI 5: Kiểm Tra Số Nguyên Tố

### Định Nghĩa:

- Input: n (số nguyên)
- Output: true (là số nguyên tố), false (không là)

### Kỹ Thuật Áp Dụng: Boundary Value Analysis + Equivalent Partitioning

#### Phân Vùng:

| Trường Hợp              | Giá Trị        | Kết Quả Mong Đợi |
| ----------------------- | -------------- | ---------------- |
| Số nguyên tố            | 2, 3, 5, 7, 11 | true             |
| Không phải số nguyên tố | 4, 6, 8, 9, 10 | false            |
| Ranh giới 0             | 0              | false            |
| Ranh giới 1             | 1              | false            |
| Giá trị âm              | -5             | false            |

#### Ý Nghĩa Test:

- Test các số nguyên tố nhỏ (2, 3, 5, 7)
- Test các số hợp số nhỏ (4, 6, 9)
- Test ranh giới (0, 1)
- Test giá trị âm (không phải số nguyên tố)

---

## BÀI 6: Tính Tổng S = 1 - 2 + 3 - 4 + ... ± n

### Định Nghĩa:

- Input: n (số nguyên ≥ 1)
- Output: Tổng theo công thức đan dấu

### Kỹ Thuật Áp Dụng: Boundary Value Analysis + Equivalent Partitioning

#### Phân Vùng:

| Trường Hợp     | n   | Công Thức Tính    | Kết Quả Mong Đợi |
| -------------- | --- | ----------------- | ---------------- |
| Ranh giới nhỏ  | 1   | 1                 | 1                |
| Ranh giới      | 2   | 1 - 2             | -1               |
| Giá trị thường | 5   | 1 - 2 + 3 - 4 + 5 | 3                |
| Không hợp lệ   | 0   | (không có)        | Exception        |
| Không hợp lệ   | -2  | (không có)        | Exception        |

#### Ý Nghĩa Test:

- Test ranh giới n = 1, 2 (nếu là lẻ: tổng dương, nếu là chẵn: tổng âm)
- Test giá trị n > 2
- Test n ≤ 0 (exception)

---

## BÀI 7: Tìm ƯCLN Của a Và b

### Định Nghĩa:

- Input: a, b (số nguyên)
- Output: ƯCLN(a, b)
- Điều Kiện: Không thể ƯCLN(0, 0)

### Kỹ Thuật Áp Dụng: Boundary Value Analysis

#### Phân Vùng:

| Trường Hợp              | a   | b   | ƯCLN Mong Đợi              |
| ----------------------- | --- | --- | -------------------------- |
| Hợp lệ                  | 12  | 18  | 6                          |
| Số nguyên tố            | 7   | 5   | 1                          |
| Một số bằng 0           | 12  | 0   | 12                         |
| Cả hai 0 (không hợp lệ) | 0   | 0   | Exception                  |
| Giá trị âm              | -12 | 18  | 6 (dùng giá trị tuyệt đối) |

#### Ý Nghĩa Test:

- Test ƯCLN hợp lệ (12, 18) = 6
- Test 2 số có ƯCLN = 1
- Test 1 số = 0 (không hợp lệ ban đầu, nhưng có thể xử lý)
- Test (0, 0) - exception
- Test giá trị âm (dùng giá trị tuyệt đối)

---

## BÀI 8: Tính Tổng S = 1! + 2! + 3! + ... + n!

### Định Nghĩa:

- Input: n (số nguyên ≥ 1)
- Output: Tổng giai thừa

### Kỹ Thuật Áp Dụng: Boundary Value Analysis + Equivalent Partitioning

#### Phân Vùng:

| Trường Hợp     | n   | Tổng Mong Đợi      | Kết Quả   |
| -------------- | --- | ------------------ | --------- |
| Ranh giới nhỏ  | 1   | 1! = 1             | 1         |
| Giá trị nhỏ    | 3   | 1! + 2! + 3! = 9   | 9         |
| Giá trị thường | 4   | 1! + ... + 4! = 33 | 33        |
| Không hợp lệ   | 0   | (không có)         | Exception |
| Không hợp lệ   | -2  | (không có)         | Exception |

#### Ý Nghĩa Test:

- Test ranh giới n = 1
- Test n = 2, 3, 4 (tăng dần)
- Test n ≤ 0 (exception)

---

## Tổng Kết Phương Pháp Kiểm Thử

### Các Kỹ Thuật Dùng:

1. **Boundary Value Analysis (BVA)**:
   - Test ở ranh giới: giá trị nhỏ nhất, lớn nhất, ngoài phạm vi
   - Ví dụ: n = 0, 1, 2; a = 0, 1, lớn

2. **Equivalent Partitioning**:
   - Chia dữ liệu thành nhóm có cùng hành vi
   - Ví dụ: số dương, số âm, số 0

3. **Exception Testing**:
   - Kiểm thử khi dữ liệu không hợp lệ
   - Ví dụ: a ≤ 0 trong tính chu vi

### Tổng Số Test Case:

- ISSUE 1 (Hợp Lệ): 18 test case
- ISSUE 2 (Không Hợp Lệ): 14 test case
- Tổng cộng: 32 test case

### Kỹ Thuật Này Giúp:

✅ Phát hiện bug ở ranh giới (boundary bugs)
✅ Đạt được code coverage cao
✅ Kiểm thử toàn diện mà không cần xem code
✅ Có thể thi hành nhanh và tiết kiệm chi phí
