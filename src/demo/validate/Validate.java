package demo.validate;

import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static long checkSo(String so) {
        String regex = "^\\d+$";
        while (!so.matches(regex)) {
            System.err.println("Dữ liệu không hợp lệ , phải là số dương ");
            so = scanner.nextLine();
        }
        return Long.parseLong(so);
    }
}
