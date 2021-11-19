package ss10_danh_sach.bai_tap.lam_them.model;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuat {
    String maSanXuat;
    String tenHang;
    String tenQuocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String maSanXuat, String tenHang, String tenQuocGia) {
        this.maSanXuat = maSanXuat;
        this.tenHang = tenHang;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaSanXuat() {
        return maSanXuat;
    }

    public void setMaSanXuat(String maSanXuat) {
        this.maSanXuat = maSanXuat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    @Override
    public String toString() {
        return
                "maSanXuat='" + maSanXuat + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", tenQuocGia='" + tenQuocGia;
    }
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
