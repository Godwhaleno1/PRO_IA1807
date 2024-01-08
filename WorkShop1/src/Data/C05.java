package Data;

import java.util.*;

public class C05 {

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
            System.out.println("Vị trí phần tử đầu tiên làm mất tính chất được sắp của dãy là: " + (index + 1));
        } else {
            System.out.println("Mảng đã được sắp xếp");
        }
    }

}
