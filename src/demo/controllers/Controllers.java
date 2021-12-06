package demo.controllers;

import demo.service.TaiKhoanNganHangService;
import demo.service.impl.TaiKhoanNganHangServiceimpl;

import java.util.Scanner;

public class Controllers {
    Scanner scanner = new Scanner(System.in);
    TaiKhoanNganHangService taiKhoanThanhToanService = new TaiKhoanNganHangServiceimpl();

    public void menu() {
        while (true) {
            try {
                while (true) {
                    System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG –\n" +
                            "Chọn chức năng theo số (để tiếp tục):\n" +
                            "1. Thêm mới\n" +
                            "2. Xóa\n" +
                            "3. Xem danh sách các tài khoản ngân hàng\n" +
                            "4. Tìm kiếm\n" +
                            "5. Thoát\n");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            taiKhoanThanhToanService.add();
                            break;
                        case 2:
                            taiKhoanThanhToanService.delete();
                            break;
                        case 3:
                            taiKhoanThanhToanService.display();
                            break;
                        case 4:
                            taiKhoanThanhToanService.search();
                            break;
                        case 5:
                            System.exit(0);
                        default:
                            System.out.println("Nhập từ 1 đến 5");
                    }

                }
            }catch (Exception e){
                e.getStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Controllers controllers = new Controllers();
        controllers.menu();
    }
}
