package ss17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_ra_file_nhi_phan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SanPhamService sanPhamService = new SanPhamService();
        int choice;
        while (true) {
            System.out.println("1. add\n" +
                    "2. display\n" +
                    "3. search\n" +
                    "4. exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    sanPhamService.add();
                    break;
                case 2:
                    sanPhamService.display();
                    break;
                case 3:
                    sanPhamService.display();
                    sanPhamService.search();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
