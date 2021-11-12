package ss10_danh_sach.bai_tap.lam_them.service;

import ss10_danh_sach.bai_tap.lam_them.model.HangSanXuat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangSanXuatService {
    List<HangSanXuat> hangSanXuatList = new ArrayList<>();

    {
        hangSanXuatList.add(new HangSanXuat("HSX-001", "Yamaha", "Nhật Bản"));
        hangSanXuatList.add(new HangSanXuat("HSX-002", "Honda", "Nhật Bản"));
        hangSanXuatList.add(new HangSanXuat("HSX-003", "Dongfeng", "Trung Quốc"));
        hangSanXuatList.add(new HangSanXuat("HSX-004", "Huyndai", "Hàn Quốc"));
        hangSanXuatList.add(new HangSanXuat("HSX-005", "Ford", "Mỹ"));
        hangSanXuatList.add(new HangSanXuat("HSX-006", "Toyota", "Nhật Bản"));
        hangSanXuatList.add(new HangSanXuat("HSX-006", "Hino", "Nhật Bản"));
    }

    public void display() {
        for (int i = 0; i < hangSanXuatList.size(); i++) {
            System.out.println(i + ". " + hangSanXuatList.get(i));
        }
    }

    public String getTenHang(int id) {
        return (hangSanXuatList.get(id)).getTenHang();
    }
}
