package Data;

import java.util.*;

public class C06 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextDouble();
        }
        System.out.println("Nhập giá trị của biến x: ");
        double x = sc.nextDouble();
        double p = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            p = p * x + arr[i];
        }
        System.out.println("Giá trị của đa thức là: " + p);
    }

}
