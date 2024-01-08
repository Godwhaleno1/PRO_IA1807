package Data;

import java.util.*;

public class C02 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextDouble();
        }
        double x = sc.nextDouble();
        int cout = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                cout++;
            }
        }
        System.out.println("số lần xuất hiện của số x trong dãy trên: " + cout);
    }

}
