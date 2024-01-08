package Data;

import java.util.Scanner;

public class C12 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = 0;
        int index = 0;
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                check = 1;
                index = i;
                break;
            }
        }
        if (check == 1) {
            System.out.println("Mảng chưa đã được sắp xếp");
        } else {
            System.out.println("Mảng đã được sắp xếp");
            System.out.println("Nhập giá trị của x: ");
            double x = sc.nextDouble();
            // Thực hiện tìm kiếm nhị phân xem x có xuất hiện trong dãy không
            int left = 0; // Chỉ số trái
            int right = n - 1; // Chỉ số phải
            int mid = -1; // Chỉ số giữa
            int index2 = -1; // Chỉ số của x trong mảng a

            // Vòng lặp tìm kiếm nhị phân
            while (left <= right) {
                // Tính chỉ số giữa
                mid = (left + right) / 2;

                // Nếu x bằng phần tử ở vị trí giữa
                if (x == arr[mid]) {
                    // Đặt index bằng mid
                    index = mid;
                    // Thoát khỏi vòng lặp
                    break;
                } else if (x < arr[mid]) { // Nếu x nhỏ hơn phần tử ở vị trí giữa
                    // Đặt right bằng mid - 1
                    right = mid - 1;
                } else { // Nếu x lớn hơn phần tử ở vị trí giữa
                    // Đặt left bằng mid + 1
                    left = mid + 1;
                }
            }

            // Nếu index khác -1, tức là x xuất hiện trong mảng a
            if (index != -1) {
                // In kết quả ra màn hình
                System.out.println("x xuất hiện trong dãy số.");
                System.out.println("Vị trí đầu tiên xuất hiện x là: " + (index + 1));
            } else { // Nếu index bằng -1, tức là x không xuất hiện trong mảng a
                // In kết quả ra màn hình
                System.out.println("x không xuất hiện trong dãy số.");
            }
        }
    }
}
