package ss2.bai_tap;

import java.util.Scanner;

public class HienThiCacSoNhoHon100 {

    public static boolean snt(int n) {

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
        while (n < 100) {
            if (snt(n)) {
                System.out.println(n);
            }
            n++;
        }
    }
}
