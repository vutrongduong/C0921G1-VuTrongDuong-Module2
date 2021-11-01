package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = "codegym";
        System.out.println("Nhập ký tự cần kiểm tra: ");
        char kyTu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == chuoi.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự là: "+count);
    }
}


