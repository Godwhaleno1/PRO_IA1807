package Data;

import java.util.*;

public class C08 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("thứ tự tăng dần của mảnrg là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
