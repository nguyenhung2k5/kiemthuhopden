public class ThucHanh03 {

    public static double tinhChuViHCN(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai lon hon 0");
        }
        return 2 * (a + b);
    }

    public static double tinhDienTichHCN(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai lon hon 0");
        }
        return a * b;
    }

    public static String giaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("He so a phai khac 0 doi voi phuong trinh bac 2");
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "Phuong trinh vo nghiem";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Phuong trinh co nghiem kep x1 = x2 = " + x;
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2;
        }
    }

    public static int tinhSoNgayCuaThang(int thang, int nam) {
        if (thang < 1 || thang > 12) {
            throw new IllegalArgumentException("Thang phai tu 1 den 12");
        }
        if (nam < 1) {
            throw new IllegalArgumentException("Nam khong hop le");
        }

        switch (thang) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                boolean isNamNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
                return isNamNhuan ? 29 : 28;
            default:
                return 31;
        }
    }

    public static boolean isSoNguyenTo(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int tinhTongDanDau(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n phai lon hon hoac bang 1");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    public static int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Khong co UCLN cho ca hai so bang 0");
        }
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long tinhGiaiThua(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Khong co giai thua cho so am");
        }
        long gt = 1;
        for (int i = 2; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }

    public static long tinhTongGiaiThua(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n phai lon hon hoac bang 1");
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += tinhGiaiThua(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("============== ISSUE 1: TEST DU LIEU HOP LE ==============");
        System.out.println("Bai 1 - Chu vi HCN (3, 4): " + tinhChuViHCN(3, 4));
        System.out.println("Bai 2 - Dien tich HCN (3, 4): " + tinhDienTichHCN(3, 4));
        System.out.println("Bai 3 - Giai PT bac 2 (1, -3, 2): " + giaiPhuongTrinhBac2(1, -3, 2));
        System.out.println("Bai 4 - Ngay cua thang 2/2024: " + tinhSoNgayCuaThang(2, 2024));
        System.out.println("Bai 5 - So 7 co phai so nguyen to? " + isSoNguyenTo(7));
        System.out.println("Bai 6 - Tong S = 1 - 2 + 3 - 4 + 5: " + tinhTongDanDau(5));
        System.out.println("Bai 7 - UCLN cua 12 va 18: " + timUCLN(12, 18));
        System.out.println("Bai 8 - Tong S = 1! + ... + 4!: " + tinhTongGiaiThua(4));

        System.out.println("\n============== ISSUE 2: TEST DU LIEU KHONG HOP LE ==============");

        try {
            System.out.print("Bai 1 - Chu vi voi canh am (-3, 4): ");
            tinhChuViHCN(-3, 4);
        } catch (Exception e) {
            System.out.println("Loi -> " + e.getMessage());
        }

        try {
            System.out.print("Bai 2 - Dien tich voi canh am (3, -4): ");
            tinhDienTichHCN(3, -4);
        } catch (Exception e) {
            System.out.println("Loi -> " + e.getMessage());
        }

        try {
            System.out.print("Bai 3 - PT bac 2 voi a=0 (0, 5, 2): ");
            giaiPhuongTrinhBac2(0, 5, 2);
        } catch (Exception e) {
            System.out.println("Loi -> " + e.getMessage());
        }

        try {
            System.out.print("Bai 4 - So ngay cua thang 13: ");
            tinhSoNgayCuaThang(13, 2023);
        } catch (Exception e) {
            System.out.println("Loi -> " + e.getMessage());
        }

        System.out.println("Bai 5 - So -5 co phai so nguyen to? " + isSoNguyenTo(-5) + " (Tra ve false hop ly)");

        try {
            System.out.print("Bai 6 - Tong dan dau voi n=0: ");
            tinhTongDanDau(0);
        } catch (Exception e) {
            System.out.println("Loi -> " + e.getMessage());
        }

        try {
            System.out.print("Bai 7 - UCLN cua 0 va 0: ");
            timUCLN(0, 0);
        } catch (Exception e) {
            System.out.println("Loi -> " + e.getMessage());
        }

        try {
            System.out.print("Bai 8 - Tong giai thua voi n=-2: ");
            tinhTongGiaiThua(-2);
        } catch (Exception e) {
            System.out.println("Loi -> " + e.getMessage());
        }
    }
}