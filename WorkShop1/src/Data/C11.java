package Data;

import java.util.Scanner;

public class C11 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = Double.parseDouble(sc.nextLine());
        }
        double[] arr2 = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("arr2[%d] = ", i);
            arr2[i] = Double.parseDouble(sc.nextLine());
        }
        double[] arr3 = new double[n + n];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr[i];
        }
        int check = 0;
        for (int i = n; i < n + n; i++) {
            arr3[i] = arr2[check];
            check += 1;
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < n + n - 1 - i; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    double t = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < n + n; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

}
