package Data;

import java.util.Scanner;

public class C09 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextDouble();
        }
        System.out.print("Nhập giá trị của x: ");
        double x = sc.nextDouble();
        double[] arr2 = new double[n + 1];
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (x <= arr[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            index = n;
        }
        arr2[index] = x;
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        for (int i = index + 1; i < n + 1; i++) {
            arr2[i] = arr[i - 1];
        }
        System.out.println("Dãy số sau khi chèn x là:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
