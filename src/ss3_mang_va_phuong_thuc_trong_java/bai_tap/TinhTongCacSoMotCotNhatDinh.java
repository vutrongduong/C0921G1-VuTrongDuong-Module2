package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoMotCotNhatDinh {
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
        System.out.println("Nhập cột cần tính ");
        int cot = scanner.nextInt();
        int sum=0;
        for (int i = 0; i < x; i++) {
                sum +=arr[i][cot];
            }
        System.out.println("Tổng các số ở cột "+cot+" là: "+sum);
        }
    }

