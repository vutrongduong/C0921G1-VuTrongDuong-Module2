package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận: ");
        int x = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Nhập số vào ma trận");
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = arr[0][0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[j].length - 1; j++) {
                if (i == j) {
                    sum += arr[i + 1][j + 1];
                }
            }
        }
        System.out.println("Tổng các số ở đường chéo chình của ma trận vuông là: "+sum);
    }
}
