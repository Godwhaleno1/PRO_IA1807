package Data;

import java.util.*;

public class C04 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextDouble();
        }
        int coutOdd, coutEven;
        coutOdd = coutEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                coutEven++;
            } else {
                coutOdd++;
            }
        }
        System.out.println("số lẻ " + coutOdd);
        System.out.println("Số chẵn " + coutEven);
    }

}
