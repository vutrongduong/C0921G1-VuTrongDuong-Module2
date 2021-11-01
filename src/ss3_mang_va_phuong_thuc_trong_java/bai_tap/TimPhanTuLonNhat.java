package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận: ");
        int x = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int y = scanner.nextInt();
        int [][] arr = new int[x][y];
        int max=arr[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Nhập số vào ma trận");
                arr[i][j] = scanner.nextInt();
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trongn mảng là: "+max);
    }
}
