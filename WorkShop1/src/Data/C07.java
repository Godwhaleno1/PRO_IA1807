package Data;

import java.util.Scanner;

public class C07 {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập một số nguyên dương: ");
            n = scanner.nextInt();
        } while (n <= 0);

        // Khai báo và khởi tạo một biến String để lưu kết quả
        String result = "";

        // Chuyển đổi số nguyên dương sang cơ số 11
        while (n > 0) {
            // Lấy phần dư của n khi chia cho 11
            int remainder = n % 11;

            // Nếu phần dư bằng 10, thì kí hiệu là A
            if (remainder == 10) {
                result = "A" + result;
            } else {
                // Nếu không, thì kí hiệu là số thập phân tương ứng
                result = remainder + result;
            }

            // Cập nhật n bằng phần nguyên của n khi chia cho 11
            n = n / 11;
        }

        // In kết quả ra màn hình
        System.out.println("Số đó dưới dạng cơ số 11 là: " + result);
    }

}
