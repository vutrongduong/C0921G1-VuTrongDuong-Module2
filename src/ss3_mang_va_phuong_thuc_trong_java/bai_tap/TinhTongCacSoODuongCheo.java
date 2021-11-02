package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của ma trận: ");
        int x = scanner.nextInt();
        int[][] arr = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Nhập số vào ma trận");
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = arr[0][0];
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i + 1][i + 1];
            System.out.println(arr[i+1][i+1]);
        }
        System.out.println("Tổng các số ở đường chéo chình của ma trận vuông là: "+sum);
    }
}



