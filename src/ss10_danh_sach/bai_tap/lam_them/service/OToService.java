package ss10_danh_sach.bai_tap.lam_them.service;

import ss10_danh_sach.bai_tap.lam_them.model.OTo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OToService implements IPhuongTien {
    List<OTo> oToList = new ArrayList<>();
    HangSanXuatService hangSanXuatService = new HangSanXuatService();

    {
        oToList.add(new OTo("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", 5, "Du lịch"));
        oToList.add(new OTo("43B-453.88", "Huyndai", 2020, "Nguyễn Văn B", 45, "Xe  khách"));
        oToList.add(new OTo("43B-453.89", "Ford", 2020, "Nguyễn Văn C", 16, "Xe  khách"));
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Chọn hãng: ");
        hangSanXuatService.display();
        int choice = Integer.parseInt(scanner.nextLine());
        String tenHang = hangSanXuatService.getTenHang(choice);
        System.out.println("Năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Số chổ ngồi: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu xe: ");
        String kieuXe = scanner.nextLine();
        oToList.add(new OTo(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, soChoNgoi, kieuXe));
    }

    @Override
    public void display() {
        for (OTo oto : oToList) {
            System.out.println(oto);
        }
    }

    @Override
    public boolean check(String bienKiemSoat) {
        for (OTo oTo : oToList) {
            if (bienKiemSoat.equals(oTo.getBienKiemSoat())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < oToList.size(); i++) {
            if (oToList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                oToList.remove(oToList.get(i));
            }
        }
    }
}


