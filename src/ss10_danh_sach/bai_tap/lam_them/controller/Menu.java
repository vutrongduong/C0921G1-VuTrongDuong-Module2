package ss10_danh_sach.bai_tap.lam_them.controller;


import ss10_danh_sach.bai_tap.lam_them.service.IPhuongTien;
import ss10_danh_sach.bai_tap.lam_them.service.OToService;
import ss10_danh_sach.bai_tap.lam_them.service.XeMayService;
import ss10_danh_sach.bai_tap.lam_them.service.XeTaiService;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        IPhuongTien xetai = new XeTaiService();
        IPhuongTien oto = new OToService();
        IPhuongTien xemay = new XeMayService();
        int choice;
        int choice1;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Thêm xe tải,\n" +
                            "  2. Thêm ôtô, \n" +
                            "3. Thêm  xe máy");
                    choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            xetai.add();
                            break;
                        case 2:
                            oto.add();
                            break;
                        case 3:
                            xemay.add();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Hiện thị xe tải.\n" +
                            "2. Hiện thị ôtô. \n" +
                            "3. Hiện  xe máy.");
                    choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            xetai.display();
                            break;
                        case 2:
                            oto.display();
                            break;
                        case 3:
                            xemay.display();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào biển kiểm soát: ");
                    String bienKiemSoat = scanner.nextLine();
                    if (oto.check(bienKiemSoat) || xemay.check(bienKiemSoat) || xetai.check(bienKiemSoat)) {
                        System.out.println("1.Yes\n2.No");
                        int choice2 = Integer.parseInt(scanner.nextLine());
                        if (choice2 == 1) {
                            if (oto.check(bienKiemSoat)) {
                                oto.delete(bienKiemSoat);
                            } else if (xemay.check(bienKiemSoat)) {
                                xemay.delete(bienKiemSoat);
                            } else {
                                xetai.delete(bienKiemSoat);
                            }
                            System.out.println("Xóa thành công");
                            System.out.println("Ấn enter để quay trở lại màn hình chính");
                            String enter = scanner.nextLine();
                            if (enter.equals("")) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}

