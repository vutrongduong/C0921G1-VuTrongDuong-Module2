package ss19_string_va_regex.bai_tap;

import java.util.Scanner;

public class ValidateSoDienThoai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String regex = "^(\\S\\d{2}\\S)-(\\S[0]\\d{9}\\S)$";
        String regex = "^(\\S\\d{2}\\S)-(\\S[0]\\d{9}\\S)$";
        System.out.println("Nhập số điện thoại");
        String sdt = scanner.nextLine();
        while (!sdt.matches(regex)) {
            System.out.println("Số điện thoại không hợp lệ , Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)");
            sdt = scanner.nextLine();
            sdt.matches(regex);
        }
        System.out.println("Nhập thành công");
    }
}
