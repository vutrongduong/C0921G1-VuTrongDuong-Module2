package ss3.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập X");
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("index_del: " + i);
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}




