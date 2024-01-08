package Data;

import java.util.*;

public class C10 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextDouble();
        }
        double max = -99999;
        double max2 = 0;
        int index1, index2;
        index1 = index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index1 = i;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < max) {
                max2 = arr[j];
                index2 = j;
            }
        }
        System.out.println(max + " " + max2 + " " + index1 + " " + index2);
    }
}
