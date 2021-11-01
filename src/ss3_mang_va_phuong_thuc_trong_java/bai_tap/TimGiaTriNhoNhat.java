package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng : ");
        int doDai = scanner.nextInt();
        int[] arr = new int[doDai];
        for (int i = 0; i < doDai; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < doDai; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
