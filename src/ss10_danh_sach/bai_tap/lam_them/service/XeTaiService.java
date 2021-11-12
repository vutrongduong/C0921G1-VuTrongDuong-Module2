package ss10_danh_sach.bai_tap.lam_them.service;

import ss10_danh_sach.bai_tap.lam_them.model.OTo;
import ss10_danh_sach.bai_tap.lam_them.model.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IPhuongTien {
    List<XeTai> xeTaiList = new ArrayList<>();
    HangSanXuatService hangSanXuatService = new HangSanXuatService();

    {
        xeTaiList.add(new XeTai("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3));
        xeTaiList.add(new XeTai("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9));
        xeTaiList.add(new XeTai("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12));
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
        System.out.println("Tải trọng");
        int taiTrong = Integer.parseInt(scanner.nextLine());
        xeTaiList.add(new XeTai(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, taiTrong));
    }

    @Override
    public void display() {
        for (XeTai xetai : xeTaiList) {
            System.out.println(xetai);
        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                xeTaiList.remove(xeTaiList.get(i));
            }
        }
    }

    @Override
    public boolean check(String bienKiemSoat) {
        for (XeTai xeTai : xeTaiList) {
            if (bienKiemSoat.equals(xeTai.getBienKiemSoat())) {
                return true;
            }
        }
        return false;
    }
}

