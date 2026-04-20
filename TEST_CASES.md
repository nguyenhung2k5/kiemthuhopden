# Danh Sách Test Cases - Kiểm Thử Hộp Đen

## Bài 1: Tính Chu Vi Hình Chữ Nhật

**Điều Kiện Ngõ Vào:**

- Chiều dài (a): số thực > 0
- Chiều rộng (b): số thực > 0

**Điều Kiện Đầu Ra:**

- Chu vi = 2 × (a + b)

### Test Cases - Dữ Liệu Hợp Lệ (ISSUE 1)

| STT | Chiều Dài (a) | Chiều Rộng (b) | Chu Vi Mong Đợi | Kết Quả |
| --- | ------------- | -------------- | --------------- | ------- |
| 1   | 3             | 4              | 14.0            | PASS    |
| 2   | 5.5           | 2.5            | 16.0            | PASS    |
| 3   | 0.1           | 0.1            | 0.4             | PASS    |
| 4   | 100           | 100            | 400.0           | PASS    |

### Test Cases - Dữ Liệu Không Hợp Lệ (ISSUE 2)

| STT | Chiều Dài (a) | Chiều Rộng (b) | Trạng Thái Mong Đợi      | Kết Quả |
| --- | ------------- | -------------- | ------------------------ | ------- |
| 1   | -3            | 4              | IllegalArgumentException | PASS    |
| 2   | 3             | 0              | IllegalArgumentException | PASS    |
| 3   | -5            | -8             | IllegalArgumentException | PASS    |

---

## Bài 2: Tính Diện Tích Hình Chữ Nhật

**Điều Kiện Ngõ Vào:**

- Chiều dài (a): số thực > 0
- Chiều rộng (b): số thực > 0

**Điều Kiện Đầu Ra:**

- Diện tích = a × b

### Test Cases - Dữ Liệu Hợp Lệ (ISSUE 1)

| STT | Chiều Dài (a) | Chiều Rộng (b) | Diện Tích Mong Đợi | Kết Quả |
| --- | ------------- | -------------- | ------------------ | ------- |
| 1   | 3             | 4              | 12.0               | PASS    |
| 2   | 2             | 2              | 4.0                | PASS    |

### Test Cases - Dữ Liệu Không Hợp Lệ (ISSUE 2)

| STT | Chiều Dài (a) | Chiều Rộng (b) | Trạng Thái Mong Đợi      | Kết Quả |
| --- | ------------- | -------------- | ------------------------ | ------- |
| 1   | 3             | -4             | IllegalArgumentException | PASS    |

---

## Bài 3: Giải Phương Trình Bậc 2

**Điều Kiện Ngõ Vào:**

- Hệ số a: số thực, a ≠ 0
- Hệ số b: số thực
- Hệ số c: số thực

**Điều Kiện Đầu Ra:**

- Delta = b² - 4ac
- Nếu Delta < 0: vô nghiệm
- Nếu Delta = 0: 1 nghiệm kép x = -b/(2a)
- Nếu Delta > 0: 2 nghiệm phân biệt x₁, x₂

### Test Cases - Dữ Liệu Hợp Lệ (ISSUE 1)

| STT | a   | b   | c   | Delta | Kết Quả Mong Đợi         | Kết Quả |
| --- | --- | --- | --- | ----- | ------------------------ | ------- |
| 1   | 1   | -3  | 2   | 1     | 2 nghiệm: x1=2.0, x2=1.0 | PASS    |
| 2   | 1   | -2  | 1   | 0     | 1 nghiệm kép: x=1.0      | PASS    |
| 3   | 1   | 0   | 1   | -4    | Phương trình vô nghiệm   | PASS    |

### Test Cases - Dữ Liệu Không Hợp Lệ (ISSUE 2)

| STT | a   | b   | c   | Trạng Thái Mong Đợi      | Kết Quả |
| --- | --- | --- | --- | ------------------------ | ------- |
| 1   | 0   | 5   | 2   | IllegalArgumentException | PASS    |

---

## Bài 4: Tính Số Ngày Của Một Tháng

**Điều Kiện Ngõ Vào:**

- Tháng: 1-12
- Năm: năm hợp lệ

**Điều Kiện Đầu Ra:**

- Tháng 4, 6, 9, 11: 30 ngày
- Tháng 2: 28 (năm thường) hoặc 29 (năm nhuận)
- Tháng khác: 31 ngày

### Test Cases - Dữ Liệu Hợp Lệ (ISSUE 1)

| STT | Tháng | Năm  | Số Ngày Mong Đợi | Kết Quả |
| --- | ----- | ---- | ---------------- | ------- |
| 1   | 2     | 2024 | 29 (năm nhuận)   | PASS    |
| 2   | 2     | 2023 | 28 (năm thường)  | PASS    |
| 3   | 4     | 2024 | 30               | PASS    |
| 4   | 1     | 2024 | 31               | PASS    |

### Test Cases - Dữ Liệu Không Hợp Lệ (ISSUE 2)

| STT | Tháng | Năm  | Trạng Thái Mong Đợi      | Kết Quả |
| --- | ----- | ---- | ------------------------ | ------- |
| 1   | 13    | 2023 | IllegalArgumentException | PASS    |
| 2   | 0     | 2023 | IllegalArgumentException | PASS    |

---

## Bài 5: Kiểm Tra Số Nguyên Tố

**Điều Kiện Ngõ Vào:**

- n: số nguyên ≥ 0

**Điều Kiện Đầu Ra:**

- true: nếu n là số nguyên tố
- false: nếu n không phải số nguyên tố

### Test Cases - Dữ Liệu Hợp Lệ (ISSUE 1)

| STT | n   | Kết Quả Mong Đợi | Kết Quả |
| --- | --- | ---------------- | ------- |
| 1   | 7   | true             | PASS    |
| 2   | 4   | false            | PASS    |
| 3   | 2   | true             | PASS    |
| 4   | 1   | false            | PASS    |
| 5   | 0   | false            | PASS    |

### Test Cases - Dữ Liệu Không Hợp Lệ (ISSUE 2)

| STT | n   | Kết Quả Mong Đợi | Kết Quả |
| --- | --- | ---------------- | ------- |
| 1   | -5  | false            | PASS    |

---

## Bài 6: Tính Tổng S = 1 - 2 + 3 - 4 + ... ± n

**Điều Kiện Ngõ Vào:**

- n: số nguyên ≥ 1

**Điều Kiện Đầu Ra:**

- Tổng S theo công thức (1 - 2 + 3 - 4 + ...)

### Test Cases - Dữ Liệu Hợp Lệ (ISSUE 1)

| STT | n   | S Mong Đợi    | Kết Quả |
| --- | --- | ------------- | ------- |
| 1   | 5   | 3 (1-2+3-4+5) | PASS    |
| 2   | 1   | 1             | PASS    |
| 3   | 2   | -1 (1-2)      | PASS    |

### Test Cases - Dữ Liệu Không Hợp Lệ (ISSUE 2)

| STT | n   | Trạng Thái Mong Đợi      | Kết Quả |
| --- | --- | ------------------------ | ------- |
| 1   | 0   | IllegalArgumentException | PASS    |
| 2   | -2  | IllegalArgumentException | PASS    |

---

## Bài 7: Tìm ƯCLN Của a Và b

**Điều Kiện Ngõ Vào:**

- a, b: số nguyên (có thể âm)

**Điều Kiện Đầu Ra:**

- ƯCLN(a, b)

### Test Cases - Dữ Liệu Hợp Lệ (ISSUE 1)

| STT | a   | b   | ƯCLN Mong Đợi | Kết Quả |
| --- | --- | --- | ------------- | ------- |
| 1   | 12  | 18  | 6             | PASS    |
| 2   | 7   | 5   | 1             | PASS    |
| 3   | 100 | 50  | 50            | PASS    |

### Test Cases - Dữ Liệu Không Hợp Lệ (ISSUE 2)

| STT | a   | b   | Trạng Thái Mong Đợi      | Kết Quả |
| --- | --- | --- | ------------------------ | ------- |
| 1   | 0   | 0   | IllegalArgumentException | PASS    |

---

## Bài 8: Tính Tổng S = 1! + 2! + 3! + ... + n!

**Điều Kiện Ngõ Vào:**

- n: số nguyên ≥ 1

**Điều Kiện Đầu Ra:**

- Tổng giai thừa

### Test Cases - Dữ Liệu Hợp Lệ (ISSUE 1)

| STT | n   | S Mong Đợi    | Kết Quả |
| --- | --- | ------------- | ------- |
| 1   | 4   | 33 (1+2+6+24) | PASS    |
| 2   | 1   | 1             | PASS    |
| 3   | 3   | 9 (1+2+6)     | PASS    |

### Test Cases - Dữ Liệu Không Hợp Lệ (ISSUE 2)

| STT | n   | Trạng Thái Mong Đợi      | Kết Quả |
| --- | --- | ------------------------ | ------- |
| 1   | -2  | IllegalArgumentException | PASS    |
| 2   | 0   | IllegalArgumentException | PASS    |

---

## Tổng Kết Kiểm Thử

- Tổng số test case: 32
- Test case hợp lệ (ISSUE 1): 18
- Test case không hợp lệ (ISSUE 2): 14
- Kỹ thuật kiểm thử: Black-box testing, Boundary Value Analysis, Equivalent Partitioning
