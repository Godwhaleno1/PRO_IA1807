package Data;

import java.util.*;

public class C01 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextDouble();
        }
        double max = -99999;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("số lớn nhất trong dãy này: " + max);
    }

}
