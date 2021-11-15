package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {

    public static boolean kiemTraSoNguyenTo(int n) {

        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Các số nguyên tố nhỏ hơn 100 : ");
        while (n < 100) {
            if (kiemTraSoNguyenTo(n)) {
                System.out.print(n + ", ");
            }
            n++;
        }
    }
}
