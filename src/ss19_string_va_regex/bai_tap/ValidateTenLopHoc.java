package ss19_string_va_regex.bai_tap;

import java.util.Scanner;

public class ValidateTenLopHoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp học cần kiểm tra");
        String nhap = scanner.nextLine();
        String regex = "^[C|A|P]\\d{4}([G, H, I, K, L, M])$";
        while (!nhap.matches(regex)) {
            System.out.println("Tên lớp học không hợp lệ, nhập lại");
            nhap = scanner.nextLine();
            nhap.matches(regex);
        }
        System.out.println("Nhập thành công !!!");
    }
}
