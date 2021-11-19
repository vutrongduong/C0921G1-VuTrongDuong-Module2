package ss10_danh_sach.bai_tap.lam_them.service.impl;


import ss10_danh_sach.bai_tap.lam_them.model.XeMay;
import ss10_danh_sach.bai_tap.lam_them.model.HangSanXuat;
import ss10_danh_sach.bai_tap.lam_them.service.IPhuongTien;
import ss10_danh_sach.bai_tap.lam_them.service.XeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayimpl implements XeMayService {
    List<XeMay> xeMayList = new ArrayList<>();
    HangSanXuat hangSanXuat = new HangSanXuat();

    {
        xeMayList.add(new XeMay("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100));
        xeMayList.add(new XeMay("43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150));
        xeMayList.add(new XeMay("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 50));
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Chọn hãng: ");
        hangSanXuat.display();
        int choice = Integer.parseInt(scanner.nextLine());
        String tenHang = hangSanXuat.getTenHang(choice);
        System.out.println("Năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Công xuất");
        int congXuat = Integer.parseInt(scanner.nextLine());
        xeMayList.add(new XeMay(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, congXuat));
    }

    @Override
    public void display() {
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                xeMayList.remove(xeMayList.get(i));
            }
        }
    }

    @Override
    public boolean check(String bienKiemSoat) {
        for (XeMay xeMay : xeMayList) {
            if (bienKiemSoat.equals(xeMay.getBienKiemSoat())) {
                return true;
            }
        }
        return false;
    }
}

