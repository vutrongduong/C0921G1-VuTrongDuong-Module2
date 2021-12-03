package demo.controllers;

import demo.models.TaiKhoanThanhToan;
import demo.service.Service;
import demo.service.TaiKhoanThanhToanService;
import demo.service.impl.TaiKhoanNganHangServiceimpl;

import java.util.Scanner;

public class Controllers {
    Scanner scanner = new Scanner(System.in);
    TaiKhoanThanhToanService taiKhoanThanhToanService =new TaiKhoanNganHangServiceimpl();

    public void menu() {
        while (true) {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG –\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các tài khoản ngân hàng\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    taiKhoanThanhToanService.add();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                   System.exit(0);
            }

        }
    }

    public static void main(String[] args) {
        Controllers controllers =new Controllers();
        controllers.menu();
    }
}
